public class MyQueueTest {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enque(myFirstNode);
        myQueue.enque(mySecondNode);
        myQueue.enque(myThirdNode);
        myQueue.printMyQueue();
        INode element = myQueue.dequeue();
        System.out.println(element.getKey());
        element = myQueue.dequeue();
        System.out.println(element.getKey());
        element = myQueue.dequeue();
        System.out.println(element.getKey());
    }
}
