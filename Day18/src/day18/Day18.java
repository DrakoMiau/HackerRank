package day18;

import java.util.LinkedList;
import java.util.Scanner;

public class Day18 {
    LinkedList queue;
    LinkedList stack;
    
    public Day18(){
        queue = new LinkedList();
        stack = new LinkedList();
    }
    //enqueuing an item at last position
    
    public void pushCharacter(char c){
        stack.addLast(c);
    }
    
    public void enqueueCharacter(char ch){
        queue.addLast(ch);
    }
    
    public char dequeue(){
        return (char) queue.remove(0);
    }    
    
    public char popCharacter(){
        return (char) stack.remove(stack.size()-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] s = input.toCharArray();
        
        Day18 p = new Day18();
        
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }        
        boolean isPalindrome = true;
        
        for (int i = 0; i < s.length; i++) {
            if (p.popCharacter() != p.dequeue()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
