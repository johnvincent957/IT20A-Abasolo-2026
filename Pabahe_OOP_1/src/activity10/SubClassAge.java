/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;

/**
 *
 * @author admin
 */
public class SubClassAge {
    private int age = 0;//instance variable
    
public void setAge (int age){ //(int age) fORMAL PARAMETER
    this.age = age ;  // this.age is instance , age is the formal parameter
    
}    public int getAge(){
    return age;
}
public void checker(){
    if (age < 18){
        System.out.println("MINOR");
    
}else{
        System.out.println("ADULT");
    }
}


}
