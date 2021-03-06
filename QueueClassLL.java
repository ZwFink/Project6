package p6_Package;


/**
 * Class manages data in queue form, using IteratorClass
 * @author Zane Fink
 */
public class QueueClassLL
{
   /**
    * queue data managed by IteratorClass object
    */
   IteratorClassLL queueData;

    /**
     * Default constructor
     */
   public QueueClassLL()
   {
      queueData = new IteratorClassLL();
   }

    /**
     * Copies a queueClass object
     * @param copied QueueClass object to be copied
     */
   public QueueClassLL( QueueClassLL copied )
   {
       queueData = new IteratorClassLL( copied.queueData );
   }

    /**
     * Enqueues data to queue
     * @param value integer data to be enqueued
     */
   public void enqueue( int value )
   {
      queueData.setToBeginning();
      queueData.insertPriorToIterator( value );
   }
    /**
     * Dequeues data from queue
     * @return Integer value to be removed from queue
     */
   public int dequeue()
   {
      queueData.setToEnd();
      return queueData.removeAtCurrent();
   }

    /**
     * Views data at front of queue
     * @return Integer value found at front of queue
     */
   public int peekFront()
   {
       queueData.setToEnd();
       return queueData.retrieveAtCurrent();
   }

    /**
     * Clears queue data
     */
   public void clear()
   {
       queueData.clear();
   }

    /**
     * Provides array data as string
     * @return String representation of queue object
     */
   public String toString()
   {
       return queueData.toString();
   }
}
