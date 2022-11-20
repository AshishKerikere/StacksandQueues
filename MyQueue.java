public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue(){
        myLinkedList = new MyLinkedList();
    }
    public void enque(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printMyQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode dequeue() {
        return myLinkedList.popLast();
    }
}
