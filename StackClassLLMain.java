package p6_Package;

public class StackClassLLMain
{
    public static void main( String[] args )
    {
        StackClassLL stack = new StackClassLL();

        stack.push( 1 );
        stack.push( 2 );
        stack.push( 3 );

        System.out.println( stack.toString() );
        stack.pop();
        System.out.println( stack.toString() );
        StackClassLL stack2 = new StackClassLL( stack );
        System.out.println( stack.toString() );
    }
}
