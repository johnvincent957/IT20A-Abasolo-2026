/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class activity10 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System. in);
        SubClassAge objAct10 = new SubClassAge(); //OBJECT FOR SubClass
        int age = 0;
        boolean isValid = true;//flsg variable
        while (isValid){
        System.out.print("Enter age: ");
        age = sc.nextInt();
         if ( age < 0 || age > 120){
             System.out.println("Invalid age Please input again.");
             
         }else{
             objAct10.setAge(age); //Method Call objAct10 is object
             //.setAge(age) is the method,(age)is the Actual Parameter
             objAct10.checker();
             isValid = false;
             
         }
             
        
       
}
    
    }
}
