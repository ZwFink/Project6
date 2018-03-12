package p6_Package;

/**
 * Class manages data in stack form, using IteratorClass
 * @author Zane Fink
 */
public class StackClassLL
{

    protected IteratorClassLL stackData;
    /**
     * Default constructor
     */
    public StackClassLL()
    {
        stackData = new IteratorClassLL();
    }

    public StackClassLL( StackClassLL copied )
    {

    }

    /**
     * Places a value on the stack
     * @param value Integer value to be placed on stack
     */
    public void push( int value )
    {
       stackData.setToEnd();
       stackData.insertAfterIterator( value );
    }

    /**
     * Removes a value from the top of the stack
     * @return Integer value from the top of the stack
     */
    public int pop()
    {
       stackData.setToEnd();
       return stackData.removeAtCurrent();
    }

    /**
     * Provides array data as a string
     * @return string representation of object
     */
    public String toString()
    {
        return stackData.toString();
    }
}
