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

}
