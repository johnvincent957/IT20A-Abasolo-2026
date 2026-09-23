/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acvtivity9;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class activity9 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num= 1;
        
        while (num != 0){
        System.out.println("Enter a number : ");
        num = scan.nextInt();
        if (num==0){
        break;
    }
        if(num%2==0){
            System.out.println("The number is " + num + "is EVEN");
            
        }else{
            System.out.println("The number is " + num + "is OOD");
        }
       
        
     
           
       
        
    }
    
}
