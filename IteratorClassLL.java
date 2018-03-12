
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

    /**
     * Character value representing a space
     */
    private static final char SPACE = ' ';

    /**
     * Character value representing a bar
     */
    private static final char BAR = '|';

    public IteratorClassLL()
    {
        headRef = null;
        cursorRef = null;
    }

    /**
    * Copy constructor
     * <p> copies IteratorClass object into this object
     * @param copied Iterator class object to be copied
     */
    public IteratorClassLL( IteratorClassLL copied )
    {
        // go through all the other's nodes
        cursorRef = copied.cursorRef;
        headRef = copied.headRef;

           NodeClass newNode = new NodeClass(
                                    copied.headRef.value );
        while( newNode.nextNode != null )
        {
           // TODO finish this method
        }
    }

    /**
     * Inserts item after iterator location in list
     * <p> Iterator reference points at inserted item after completion
     * @param newVal Value to be inserted into list
     */
    public void insertAfterIterator( int newVal )
    {
       NodeClass newNode = new NodeClass( newVal );
       if( cursorRef != null )
       {
           newNode.nextNode = cursorRef.nextNode;
           cursorRef.nextNode = newNode;
       }
       else
       {
           headRef = newNode;
           cursorRef = newNode;
       }
       cursorRef = newNode;
    }

    /**
     * Inserts item prior to iterator location in list
     * <p> Iterator reference points at inserted item after completion
     * @param newVal Value to be inserted into list
     */
    public void insertPriorToIterator( int newVal )
    {
        if( !isAtBeginning() )
        {
            movePrevious();
            insertAfterIterator( newVal );
        }
        else
        {
            NodeClass newNode = new NodeClass( newVal );
            if( headRef != null )
            {
                newNode.nextNode = headRef;
            }

            headRef = newNode;
            cursorRef = newNode;
        }

    }

    /**
     * Move iterator to the next location if not currently at end
     */
    public void moveNext()
    {
       if( !( isAtEnd() ) )
       {
           cursorRef = cursorRef.nextNode;
       }
    }

    /**
     * Checks for iterator at beginning of list
     * @return Boolean result of test
     */
    public boolean isAtEnd()
    {
        return cursorRef.nextNode == null;
    }

    /**
     * Checks for iterator at beginning of list
     * @return Boolean result of test
     */
    public boolean isAtBeginning()
    {
       return cursorRef == headRef;
    }

    /**
     * Checks for empty list
     * @return Boolean result of test
     */
    public boolean isEmpty()
    {
       return headRef == null;
    }

    /**
     * Sets iterator to the beginning of list
     */
    public void setToBeginning()
    {
       cursorRef = headRef;
    }

    /**
     * Sets cursor to end of list using recursion
     */
    public void setToEnd()
    {
       setToEndHelper( cursorRef );
    }

    /**
     * Sets cursor to end of list using recursion
     * @param workingRef Current reference
     */
    private void setToEndHelper( NodeClass workingRef )
    {
       if( workingRef == null ||
           workingRef.nextNode == null )
       {
          cursorRef = workingRef;
       }
       else
       {
           setToEndHelper( workingRef.nextNode );
       }
    }

    /**
     * Move iterator cursor to previous location if not currently at beginning
     */
    public void movePrevious()
    {
       if( !isAtBeginning() )
       {
           movePreviousHelper( headRef );
       }
    }

    /**
     * Helper method uses recursion to move iterator cursor to previous item
     * @param workingRef
     */
    public void movePreviousHelper( NodeClass workingRef )
    {
       if( workingRef.nextNode == cursorRef )
       {
           cursorRef = workingRef;
       }
       else
       {
           movePreviousHelper( workingRef.nextNode );
       }
    }

    /**
     * Gets value at current location of iterator
     * @return Value if successful, FAILED_ACCESS if list is empty
     */
    public int retrieveAtCurrent()
    {
        if( cursorRef == null )
        {
            return FAILED_ACCESS;
        }
        return cursorRef.value;
    }

    /**
     * Removes and returns value from list at current iterator location
     * <p> Note if cursor is not initially at beginning, sets cursor to previous node
     * @return Value if successful, FAILED_ACCESS if list is empty
     */
    public int removeAtCurrent()
    {
       int returnInt = retrieveAtCurrent();

       if( cursorRef == null )
       {
           return returnInt;
       }

       if( isAtBeginning() )
       {
           cursorRef.nextNode = null;
       }
       else if( isAtEnd() )
       {
          if( headRef.nextNode == null )
          {
              headRef = null;
              cursorRef = null;
          }
          else
          {
              movePrevious();
              cursorRef.nextNode = null;
          }
       }
       else
       {
           movePrevious();
           NodeClass temp = cursorRef.nextNode.nextNode;
           cursorRef.nextNode = temp;
       }
       return returnInt;
    }

    /**
     * Provides array data as a string, including indicatino of current
     * element, using recursive toStringHelper method
     * <p> Note: no spaces at beginning or end of string
     * @return String result of reported array
     */
    public String toString()
    {
        return toStringHelper( headRef );
    }

    /**
     * Recursive helper method that creates string from data
     * with cursor indicator at appropriate location and no space at end of the string
     * @param workingRef NodeClass reference used for recursion
     * @return String containing list of members as specified
     */
    private String toStringHelper( NodeClass workingRef )
    {
        String returnString = "";
        if( workingRef == cursorRef )
        {
           returnString += BAR;
        }

        returnString += workingRef.value;

         if( workingRef == cursorRef )
        {
           returnString += BAR;
        }

        if( workingRef.nextNode != null )
        {
            returnString += SPACE + toStringHelper( workingRef.nextNode );
        }

        return returnString;
    }

    /**
     * Clears iterator list
     */
    public void clear()
    {
        // TODO make sure this is correct
        headRef = null;
        cursorRef = null;
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
