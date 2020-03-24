package NickZelada;

import NickZelada.OrderedList;
import java.util.*;
import java.io.*;

/**
 * This is the test class in which it would read the file and print
 * out everything based on how it should be.
 * @author Nick Zelada
 * @version November 12, 2018
 */
public class Test {
/**
 * The main method would ask the user for the name of the file in which, they
 * would like to print. From there it would print the digits from the list 
 * based on the string word that belongs with the value. From there it would
 * call the method to act upon that behavior requested.
 * 
 * The filename I used was ordlist.txt
 * 
 * @param args the parameter of args
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the filename: ");
        //String filename = input.next();
        OrderedList<Integer> OrdNum = new OrderedList<Integer>();

//        try {
//            Scanner file = new Scanner(new File(filename));
//            while (file.hasNextLine()) {
//                String line = file.nextLine().trim();
//                if (line.isEmpty()) {
//                    continue;
//                }
//
//                System.out.println(line);
//
//                String[] tokens = line.split("\\s");
//
//                if (tokens[0].equalsIgnoreCase("INSERT")) {
//                   OrdNum.insert(Integer.parseInt(tokens[1]));
//                } else if (tokens[0].equalsIgnoreCase("DELETE")) {
//
//                    if (!OrdNum.delete(Integer.parseInt(tokens[1]))) {
//                        System.out.println("Could not delete " + tokens[1]);
//                    }
//
//                } else if (tokens[0].equalsIgnoreCase("CLEAR")) {
//                    OrdNum.clear();
//                } else if (tokens[0].equalsIgnoreCase("REVERSE")) {
//                    OrdNum.reverse();
//                } else {
//                    System.out.println("Unknown command " + tokens[0]);
//                }
//
//                System.out.println("List: " + OrdNum );
//
//            }
//
//            file.close();
//
//        } catch (FileNotFoundException e) {
//
//            System.out.println(e.getMessage());
//
//        }
    OrdNum.insert(1) ;
    OrdNum.insert(8) ;
    OrdNum.insert(9) ;
    OrdNum.insert(2) ;
    OrdNum.insert(77) ;
    OrdNum.insert(5) ;
    
    System.out.println(OrdNum.toString());
    
    
    }
}


