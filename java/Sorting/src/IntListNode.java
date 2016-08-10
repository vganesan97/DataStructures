/**
 * Created by vishaalganesan on 8/9/16.
 */
public class IntListNode
{
    int item;
    IntListNode p;
    IntListNode n;

    public IntListNode(int x)
    {
        this.item=x;
        this.p=this.n=null;
    }

    public IntListNode(int x, IntListNode p, IntListNode n)
    {
        this.item=x;
        this.p=p;
        this.n=n;
    }
}
