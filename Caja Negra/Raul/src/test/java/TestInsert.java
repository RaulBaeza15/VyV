import com.bst.BST;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class TestInsert {
    BST arbol;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        arbol = new BST();
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown(){

    }
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Test Caja negra - Insert.csv",numLinesToSkip = 1)
    void testCSV(int id, int valueToInsert,int profundidad,boolean recursive,boolean exception1,boolean exception2 ){


        if(exception1){
            assertThrows(Exception.class, () -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }

                arbol.insert(valueToInsert,recursive);

            },"Inserta a pesar de Rango: " +valueToInsert);
        }
        else if(exception2){
            assertThrows(Exception.class, () -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }

                arbol.insert(valueToInsert,recursive);

            }, "Inserta a pesar de profundidad: " +profundidad );
        }
        else{
            assertDoesNotThrow(() -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }

                arbol.insert(valueToInsert,recursive);
            },"No insert con profundidad: "+profundidad+", rango: "+valueToInsert);
        }

    }

}
