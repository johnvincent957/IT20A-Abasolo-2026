
package MIDTERM;


public class stackArray {
    private int[] stack;
    private int top;
    private int capacity;
    
    public stackArray (int capacity){
        this.capacity = capacity;
        this.stack = new int [capacity];
        this.top = -1;
        
    }
    private static void main(String[] args) {
        stackArray stack = new stackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("peek: " + stack.peek());
        System.out.println("empty: " + stack.isEmpty());
        System.out.println("full? " + stack.isFull());
        
        
    }
    
    private void push(int value) {
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        
        top ++;
        stack[top] = value;
        System.out.println("pushed at " + top + ": " + value);
    }
    
    public int peek(){

    
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else {
        }
        int value = stack[top];
        top--;
        return value;
    }
    public boolean isEmpty(){
        return top == -1;  
    }
     public boolean isFull(){
        return top == capacity -1;
     }
    
    
}