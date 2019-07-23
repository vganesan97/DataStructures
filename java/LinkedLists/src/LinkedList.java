/**
 * Created by vishaalganesan on 8/15/16.
 */

public class LinkedList
{
    //starting node
    pubdddddddlic LinkedListNode head;

    public LinkedList()
    {

    }

    public String toString()
    {
        String s="";

        if (head!=null)
        {
            LinkedListNode current=head.getNext();

            while(current!=null)
            {
                s+=current.getData().toString();
                current=current.getNext();
            }
        }

        return s;
    }

    public void addNode(Object data)
    {
        if (head==null)
        {
            LinkedListNode node=new LinkedListNode(data);
        }
        //temp node to store data that we are adding
        LinkedListNode temp= new LinkedListNode(data);
        LinkedListNode current=head;

        if (current!=null)
        {
            while (current.getNext()!=null)
            {
                //traverse to end of list
                current=current.next;
            }

            current.setNext(temp);
        }

    }
}
