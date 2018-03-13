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
}
