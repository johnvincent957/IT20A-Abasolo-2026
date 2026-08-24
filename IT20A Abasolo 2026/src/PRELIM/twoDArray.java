
package PRELIM;

public class twoDArray {
    
public static void main(String[] args) {
    
        int marks[][] = {
                         
            {66,90,41},
            {62,43,98},
            {9,10,16}
                
        };
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    
        
}
}
