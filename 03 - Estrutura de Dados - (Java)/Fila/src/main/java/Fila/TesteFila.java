package Fila;

public class TesteFila {

    public static void main(String[] args) {
    Queue myQueue = new Queue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);


    System.out.println(myQueue.dequeue().value);
    System.out.println(myQueue.dequeue().value);
    System.out.println(myQueue.dequeue().value);

//    myQueue.getFirst();
//    myQueue.getLast();
//    myQueue.getLength();
//    myQueue.print();



//    myQueue.getFirst();
//    myQueue.getLast();
//    myQueue.getLength();
//
//    myQueue.print();
    }

}
