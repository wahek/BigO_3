import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        linkedList praktice3 = new linkedList();
        praktice3.add("1");
        praktice3.add("2");
        praktice3.add("3");
        praktice3.add("4");
//        praktice3.remove();
//        System.out.println(praktice3.size());
        System.out.println(praktice3);
        linkedList reference = new linkedList();
        reference = praktice3.reference();
        System.out.println(reference);

        // System.out.println(praktice3.get(praktice3.size()-1));



    }
    class node{
       public String value;
        public Node next;
    }
}