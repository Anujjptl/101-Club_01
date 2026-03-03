import java.util.ArrayList;
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
}
