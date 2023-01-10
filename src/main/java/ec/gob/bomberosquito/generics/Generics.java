/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.gob.bomberosquito.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danielhwang
 */
public class Generics {

    public static void main(String[] args) {
//        Printer<Integer> printer = new Printer<>(12);
//        printer.print();
        Printer<Dog> printer = new Printer<>(new Dog());
        printer.print();
        shout("HELLO");
        
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        printList(myList);
        
    }
    
    private static <T> void shout (T thingToShout){
            System.out.println(thingToShout + "!!");
    }
    
    private static void printList(List<?> myList){
        System.out.println(myList);
    }
}
