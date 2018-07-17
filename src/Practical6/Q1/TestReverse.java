package Practical6.Q1;

import java.util.Scanner;

public class TestReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GenericStack<Character> stack = new GenericStack<>();
        GenericQueue<Character> queue = new GenericQueue<>();

        System.out.println("Enter a string: ");
        String str = scanner.next();

        for(int i = 0; i < str.length(); i++) {
            queue.enqueue(str.charAt(i));
        }

        while(queue.getSize() > 0) {
            Character c = queue.dequeue();
            stack.push(c);
        }

        while(stack.getSize() > 0)
            System.out.println(stack.pop());
    }



}
