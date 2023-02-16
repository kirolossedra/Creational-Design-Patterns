/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorymethod;

import java.util.Scanner;

/**
 *
 * @author sedra
 */
public class FactoryMethod {
    

    public static void main(String[] args) {
        System.out.println("Please Select which Configuration Are you dealing with type Windows or Web");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.

String str= sc.nextLine(); //reads string.
Dialog dialog;
if(str.equals( "Windows")){
    dialog = new WindowsDialog();
    Button button = dialog.createButton();
    button.render();
    
}
else{
     dialog = new WebDialog();
    Button button = dialog.createButton();
    button.render();
    
    
}
    }
}
