import com.bst.BST;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class TestPrintBetweenLevel {
    BST arbol;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        arbol = new BST();
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown(){

    }
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Test_PrintBetweenLevel.csv",numLinesToSkip = 1)
    void testCSV(int id, int a,int b, int profundidad,boolean exception){


        if(exception){
            Exception e = assertThrows(com.exceptions.BetweenLevelException, () ->,  {
                arbol = new BST();
                int i = 0;
                while ( arbol.depth != profundidad) {
                    i ++;
                    arbol.insert(i,recursive);
                }

                List<T> lista = arbol.printBetweenLevel(a, b);

            },"Valores fuera del rango de la profundidad del arbol, a =" + a + " b= " + b +", profundidad= " + profundidad );
        }
        else {

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
