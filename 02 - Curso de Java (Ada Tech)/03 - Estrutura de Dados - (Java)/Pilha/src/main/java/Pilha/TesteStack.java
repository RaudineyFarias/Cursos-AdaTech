package Pilha;

import Pilha.Stack;

public class TesteStack {


    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);

        System.out.println(myStack.pop() == null);




    }

}




//        myStack.push(5);
//        myStack.print();
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.print();
