package p6_Package;

public class IteratorClassLLMain
{
    public static void main( String[] args )
    {
        IteratorClassLL ll = new IteratorClassLL();

        for( int index = 0; index < 25; index++)
        {
            ll.insertAfterIterator( index + 1 );
        }

        ll.movePrevious();
        ll.movePrevious();
        ll.removeAtCurrent();
        ll.moveNext();
        ll.removeAtCurrent();
        System.out.println(ll);
        IteratorClassLL ll2 = new IteratorClassLL( ll );
        System.out.println(ll2);
    }
}
