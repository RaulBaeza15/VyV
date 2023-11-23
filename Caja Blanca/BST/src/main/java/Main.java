import com.bst.BST;
import com.bst.Node;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws DepthException, BetweenLevelException {
        BST bst = new BST();
        bst.insert(125, true);
        bst.insert(500, true);
        bst.insert(50, true);
        bst.insert(-250, true);

        bst.insert(-125, false);
        bst.insert(100, false);
        bst.insert(350, true);
        bst.insert(700, true);
        bst.insert(1000, true);
        bst.insert(600, true);
        bst.insert(400, true);
        bst.insert(1250, true);

        System.out.println(bst.toList());
        System.out.println(bst.search(1250));

        Iterator it = bst.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }



    }
}
