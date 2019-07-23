import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * Created by vishaalganesan on 8/15/16.
 */
public class LinkedListNode
{
    //each node can contain any type of object or primitive
    //each node needs a pointer to the next node
    //last node points to null
ddddddd

    Object data;
    LinkedListNode next;

    //two constructors

    //single node which points to null
    public LinkedListNode(Object val)
    {
        data=val;
        next=null;
    }

    //node which points to another node
    public LinkedListNode(Object val, LinkedListNode nextnode)
    {
        data=val;
        next=nextnode;
    }

    public Object getData()
    {
        return data;
    }

    public LinkedListNode getNext()
    {
        return next;
    }

    public void setNext(LinkedListNode nextval)
    {
        next=nextval;
    }
}
