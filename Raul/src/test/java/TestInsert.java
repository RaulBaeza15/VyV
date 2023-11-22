import com.bst.BST;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;

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

    // TEST	3	: Rango 	-2501	, Profundidad	2	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException3(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=2;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	4	: Rango 	-2501	, Profundidad	25	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException4(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=25;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	5	: Rango 	-2501	, Profundidad	49	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException5(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=49;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	6	: Rango 	-2501	, Profundidad	50	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException6(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=50;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	7	: Rango 	-2501	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException7(){
        Integer valueToInsert = -2501;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	8	: Rango 	-2500	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException8(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	9	: Rango 	-2500	, Profundidad	1	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException9(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=1;

        assertDoesNotThrow(() -> {


            arbol = new BST();

            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	10	: Rango 	-2500	, Profundidad	2	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException10(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=2;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {


            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	11	: Rango 	-2500	, Profundidad	25	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException11(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=25;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	12	: Rango 	-2500	, Profundidad	49	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException12(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=49;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	13	: Rango 	-2500	, Profundidad	50	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException13(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=50;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	14	: Rango 	-2500	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException14(){
        Integer valueToInsert = -2500;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	15	: Rango 	-2499	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException15(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	16	: Rango 	-2499	, Profundidad	1	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException16(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=1;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	17	: Rango 	-2499	, Profundidad	2	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException17(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=2;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	18	: Rango 	-2499	, Profundidad	25	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException18(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=25;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	19	: Rango 	-2499	, Profundidad	49	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException19(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=49;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	20	: Rango 	-2499	, Profundidad	50	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException20(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=50;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	21	: Rango 	-2499	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException21(){
        Integer valueToInsert = -2499;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	22	: Rango 	0	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException22(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	23	: Rango 	0	, Profundidad	1	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException23(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=1;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	24	: Rango 	0	, Profundidad	2	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException24(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=2;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0+100; i < profundidad-1+100; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	25	: Rango 	0	, Profundidad	25	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException25(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=25;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0+100; i < profundidad-1+100; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	26	: Rango 	0	, Profundidad	49	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException26(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=49;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0+100; i < profundidad-1+100; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	27	: Rango 	0	, Profundidad	50	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException27(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=50;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0+100; i < profundidad-1+100; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	28	: Rango 	0	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException28(){
        Integer valueToInsert = 0;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	29	: Rango 	2498	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException29(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	30	: Rango 	2498	, Profundidad	1	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException30(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=1;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	31	: Rango 	2498	, Profundidad	2	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException31(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=2;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	32	: Rango 	2498	, Profundidad	25	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException32(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=25;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	33	: Rango 	2498	, Profundidad	49	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException33(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=49;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	34	: Rango 	2498	, Profundidad	50	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException34(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=50;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	35	: Rango 	2498	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException35(){
        Integer valueToInsert = 2498;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	36	: Rango 	2499	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException36(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	37	: Rango 	2499	, Profundidad	1	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException37(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=1;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	38	: Rango 	2499	, Profundidad	2	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException38(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=2;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	39	: Rango 	2499	, Profundidad	25	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException39(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=25;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	40	: Rango 	2499	, Profundidad	49	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException40(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=49;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	41	: Rango 	2499	, Profundidad	50	, Expected 	Bien
    @org.junit.jupiter.api.Test
    void casoPruebaInsertNotException41(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=50;
        arbol = new BST(1);
        assertDoesNotThrow(() -> {

            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	42	: Rango 	2499	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException42(){
        Integer valueToInsert = 2499;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	43	: Rango 	2500	, Profundidad	0	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException43(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=0;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	44	: Rango 	2500	, Profundidad	1	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException44(){
        Integer valueToInsert = 2500;
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
    // TEST	45	: Rango 	2500	, Profundidad	2	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException45(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=2;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	46	: Rango 	2500	, Profundidad	25	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException46(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=25;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	47	: Rango 	2500	, Profundidad	49	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException47(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=49;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	48	: Rango 	2500	, Profundidad	50	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException48(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=50;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }
    // TEST	49	: Rango 	2500	, Profundidad	51	, Expected 	Exception
    @org.junit.jupiter.api.Test
    void casoPruebaInsertException49(){
        Integer valueToInsert = 2500;
        boolean  recursive= true;
        int profundidad=51;
        assertThrows(Exception.class, () -> {
            arbol = new BST();
            for (int i = 0; i < profundidad-1; i++) {
                arbol.insert(i,recursive);
            }

            arbol.insert(valueToInsert,recursive);

        });
    }


}
