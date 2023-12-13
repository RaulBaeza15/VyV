import com.bst.BST;
import com.bst.Node;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.FileReader;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
public class TestSearch {
    BST arbol;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        arbol = new BST();
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown(){

    }
    @Test
    public void testSuma() {
        // Definir tus variables de prueba



        assertDoesNotThrow(() -> {
            arbol = new BST();


            arbol.insert(8,true);

        });
        Node num =arbol.search(8);
        System.out.println(num);
        int num1 = 2;
        int num2 = 3;

        // Ejecutar la operación que estás probando
        int resultado = num1+ num2;

        // Afirmar que el resultado es el esperado
        assertEquals(5, resultado);
    }
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Test Caja negra - search.csv",numLinesToSkip = 1)
    void testCSV(int id, int valueToSearch,int profundidad,boolean EstaONo,int salidaEsperada ){
        //Id,Content,Profundidad,Está/no,SalidaEsperada
        arbol = new BST();
        
        for (int i = 0; i < profundidad-1; i++) {
            try {
                // Suponiendo que 'arbol' es una instancia de la clase que tiene el método insert
                arbol.insert(i, true);
                // Código adicional después de la inserción, si es necesario
            } catch (Exception e) {
                // Manejo de la excepción
                System.err.println("Ha ocurrido una excepción: " + e.getMessage());

            }

        }



    }
}
