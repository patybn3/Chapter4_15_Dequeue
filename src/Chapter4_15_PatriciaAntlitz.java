/* Problem Set 4 - 15 Chapter 4 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 10/07/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * newList object is created from the DeQue.java.
 * This is a simple main class, no user intake is necessary. All values are given by the program as a test
*/

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter4_15_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        DeQue newList = new DeQue();

        System.out.println("Numbers on This List:");
        for(int i = 0; i < 10; i++)
        {
            //enqueue method will received numbers from 0 - 9
            newList.addToEnd(i);
        }
        newList.toString(); // print list

        System.out.println("\nQueue Size: " + newList.size()); //print size

        //adding to the front
        newList.addToFront(93);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        newList.addToFront(57);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        //adding to the end
        System.out.println("\nAdding to The End:");
        newList.addToEnd(15);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        //removing
        newList.removeFirstElement();
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        newList.removeLastElement();
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());


    }
}
