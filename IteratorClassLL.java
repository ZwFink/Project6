
package p6_Package;


/**
 * Class provides data storage with iterator managemeng.
 * @author Zane Fink
 */
public class IteratorClassLL {


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
     * Node data structure for linked list
     */
    private class NodeClass
    {

       protected NodeClass nextNode;
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
