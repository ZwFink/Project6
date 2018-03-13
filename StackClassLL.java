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

    /**
     * Copies a StackClass object
     * @param copied StackClass object to be copied
     */
    public StackClassLL( StackClassLL copied )
    {
        stackData = new IteratorClassLL( copied.stackData );
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
     * Views the value on top of the stack
     * @return Integer value found on top of the stack
     */
    public int peekTop()
    {
       stackData.setToEnd();
       return stackData.retrieveAtCurrent();
    }

    /**
     * Clears stack data
     */
    public void clear()
    {
        stackData.clear();
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
