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
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Test Insert - Insert.csv",numLinesToSkip = 1)
    void testCSV(int id, int valueToInsert,int profundidad,boolean recursive,boolean exception1,boolean exception2 ){


        if(exception1){
            assertThrows(Exception.class, () -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }
                System.out.println(arbol.depth());
                arbol.insert(valueToInsert,recursive);

            });
        }
        else if(exception2){
            assertThrows(Exception.class, () -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }
                System.out.println(arbol.depth());
                arbol.insert(valueToInsert,recursive);

            });
        }
        else{
            assertDoesNotThrow(() -> {
                arbol = new BST();
                for (int i = 0; i < profundidad-1; i++) {
                    arbol.insert(i,recursive);
                }
                System.out.println(arbol.depth());
                arbol.insert(valueToInsert,recursive);
            });
        }





    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertException(){
        Integer valueToInsert = -2501;
        assertThrows(Exception.class, () -> {
            throw new Exception("This is an example exception.");
        });
    }

    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException(){
        arbol = new BST(1);
        assertDoesNotThrow(() -> {
            //throw new Exception("This is an example exception.");
        });
    }

    // TEST	1	: Rango 	-2501	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException1(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }
            System.out.println(arbol.depth());
            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	2	: Rango 	-2501	, Profundidad	1	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException2(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=1;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }




}
