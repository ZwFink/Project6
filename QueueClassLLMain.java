package p6_Package;

public class QueueClassLLMain
{
    public static void main( String [] args )
    {
        QueueClassLL que = new QueueClassLL();

        for( int index = 0; index < 5; index++ )
        {
            que.enqueue( index );
        }

        QueueClassLL que2 = new QueueClassLL( que );

        System.out.println( que );
        System.out.println( que2 );

        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();

        System.out.println(que.peekFront());
        System.out.println( que );


    }
}
