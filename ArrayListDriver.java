/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Scanner;
/**
 *@author Stephen Zoyac
 * @Date: 10/18/20
 * Fall 2020
 * Project 15.8
 * This program runs a menu for a ArrayOrderedList, which implements the 
 * ListADT, and extends the ArrayList class. The menu has 6 options, 
 * 1 to add an element on the array, 2 to remove a specific element in the array
 * 3 to see the first element in the array,4 to see the last element 
 * in the array, 5 to list all the elements of the array, and 6 to close the 
 * program. The LinkedList follows the protocol of an ordered list, meaning 
 * each element added to the array will be added based on
 * alphabetical order. This is done with the use of Comparable to compare each 
 * element. Any errors of this program will be caught, and the program will 
 * continue.
 */
public class ArrayListDriver {

    public static void main(String args[]) {
        ArrayOrderedList<String> ald = new ArrayOrderedList<String>();//array
        Scanner input = new Scanner(System.in);

        int menu = 0;
        System.out.println("List Menu Selections");//menu
        System.out.println("1.add element | 2.remove element | 3.first element |"
                + " 4.last element | 5.display | 6.Exit ");
        System.out.println();

        do {

            System.out.print("Enter your choice: ");
            menu = Integer.parseInt(input.next());
            switch (menu) {
                case 1:
                    System.out.print("Enter element: ");
                    String element = input.next();
                     ald.add(element);
                    break;
                case 2:
                    System.out.print("Enter the specific element: ");
                    element = input.next();
                    String removeE = ald.remove(element);
                    System.out.println(removeE + " Element removed");
                    break;
                case 3:

                    System.out.println("First element is " + ald.first());//first
                    break;
                case 4:
                    System.out.println("Last element is " + ald.last()); //last
                    break;
                case 5:
                    System.out.println(ald.toString());//numeric order
                    break;
                case 6:
                    System.exit(0);
            }
        } while (menu <= 6);

    }
}
