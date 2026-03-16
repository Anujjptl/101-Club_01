import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */

public class Club
{
    // Define any necessary fields here ...
    ArrayList<Membership>members; //ArrayList<Data Type>collection 
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<>(); 
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member) //variable 
    {
            members.add(member); //collection.add(variable)
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size(); //return collection.size
    }
    
    public int joinedInMonth(int month)
    {
    if (month < 1 || month > 12) {
        System.out.println("Error: month must be between 1 and 12.");
        return 0;
    }

    int count = 0;
    for (Membership m : members) {
        if (m.getMonth() == month) {
            count++;
        }
    }
    return count;
    }

    
    
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored
    * in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
   public ArrayList<Membership> purge(int month, int year)
    {
    ArrayList<Membership> removed = new ArrayList<>();

    if (month < 1 || month > 12) {
        System.out.println("Error: month must be between 1 and 12.");
        return removed;  // empty list
    }

    Iterator<Membership> it = members.iterator();
    while (it.hasNext()) {
        Membership m = it.next();
        if (m.getMonth() == month && m.getYear() == year) {
            it.remove();       // remove from club
            removed.add(m);    // add to return list
        }
    }

    return removed;
    }

}
