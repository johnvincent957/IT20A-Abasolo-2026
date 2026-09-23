/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity7;

import java.util.Scanner;

public class Activity7 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        char letter = 'i';
        System.out.print("Enter letter: ");
        letter = scan.next().charAt(0);
        
        switch (letter){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Letter " +letter + "is a vowel");
                break;
                
            default:
                System.out.println("Letter " +letter + "is a consonant");
               
        } 
   
       
    }
    
    
}
