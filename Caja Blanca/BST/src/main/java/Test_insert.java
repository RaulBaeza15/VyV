import com.bst.BST;
import com.bst.Node;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.FileReader;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
public class Test_insert {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "TestCB - Insert.csv",numLinesToSkip = 1)
    void testCSV(String ruta, String root, boolean recursive){
        BST arbol = new BST();
        arbol.depth();
        if (false){
            System.out.println("hola");
        }


    }
}
