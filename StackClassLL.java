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
     * Provides array data as a string
     * @return string representation of object
     */
    public String toString()
    {
        return stackData.toString();
    }
}
