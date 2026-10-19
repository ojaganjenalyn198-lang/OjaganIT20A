
package Midterm;

public class stackLinkedlist {
    
    private class Node {
        int data;
        Node next;
        
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    
    public stackLinkedlist() {
        top = null;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push (int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + "pushed into the stack. ");
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.println("Stack elements");
        
        while (current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
        
    public static void main(String[] args){
        stackLinkedlist stack = new stackLinkedlist();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();
        
        stack.display();
                
        System.out.println("Top Element: " + stack.peek());
        System.out.println();
        
        System.out.println("Remove: " + stack.pop());
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        stack.display();
    }
}

