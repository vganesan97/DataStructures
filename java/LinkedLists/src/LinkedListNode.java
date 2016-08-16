/**
 * Created by vishaalganesan on 8/15/16.
 */
public class LinkedListNode
{
    //each node can contain any type of object or primitive
    //each node needs a pointer to the next node
    //last node points to null

    //constructing a linked list of integers

    int item;
    LinkedListNode next;

    public LinkedListNode(int item, LinkedListNode next)
    {
        this.item=item;
        this.next=null;
    }

}
