
package p6_Package;


/**
 * Class provides data storage with iterator managemeng.
 * @author Zane Fink
 */
public class IteratorClassLL {


    /**
     * Iterator head reference
     */
    NodeClass headRef;

    /**
     * Iterator cursor reference
     */
    NodeClass cursorRef;

    /**
     * Provides constant -999999 for access failure messaging
     */
    public static final int FAILED_ACCESS = -999999;
    /**
     * Default constructor
     */
    public IteratorClassLL()
    {

    }

    /**
    * Copy constructor
     * <p> copies IteratorClass object into this object
     * @param copied Iterator class object to be copied
     */
    public IteratorClassLL( IteratorClassLL copied )
    {

    }

    /**
     * Inserts item after iterator location in list
     * <p> Iterator reference points at inserted item after completion
     * @param newVal Value to be inserted into list
     */
    public void insertAfterIterator( int newVal )
    {
       NodeClass newNode = new NodeClass( newVal );
       cursorRef.nextNode = newNode;
       cursorRef = newNode;
    }


    /**
     * Node data structure for linked list
     */
    private class NodeClass
    {

        /**
         * Reference to the next node
         */
       protected NodeClass nextNode;
        /**
         * Integer value held by the node
         */
       private int value;

        /**
         * Initialization constructor for NodeClass
         * @param inVal data value for Node class object
         */
       private NodeClass( int inVal )
       {
          value = inVal;
       }
    }
}
