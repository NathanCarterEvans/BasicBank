import java.util.ArrayList;

/**
 * @author NathanCarterEvans
 * This class is used to look up, make, and manage users. This is implemented as an extra form of security.
 * Only the Bank class can accses this.
 */
public class UserManager {


    private static final int TOTAL_USERS_TO_LEASE = 5;
    

    private static ArrayList<Account> basicUsers = new ArrayList<Account>(); //Tracks bassicUsers. Non
    private static int currentIndexForBasicUsers =0;
    
    public static int MakeNewUser(){
        /*
         * Error Code list **ALL INTS ARE NEGATIVE**
         * 1: No error
         * 
         * 20: Space error
         * 21: Index out of range
         * 22: Out of users to lease
         * 
         */

        if(currentIndexForBasicUsers >= TOTAL_USERS_TO_LEASE){
            return -22;//No more useres to lease
        }
        

        //___________Makes New Useres and updates Index___________\\
        Account newAccount = new Account(currentIndexForBasicUsers++);
        basicUsers.add(newAccount);

        
        return newAccount.GetUserID();
    }

    public static Account getAccountFromID(int id){
        return basicUsers.get(id);
    }

    public static int getCurrentIndexForBasicUseres(){
        return currentIndexForBasicUsers;
    }

    public static int getUserIDfromUname(String Uname){
        //IF -1 USER NOT FOUND
        int USER_ID = -1;
        //TODO fix this

        return USER_ID;
    }

    public static void CLEARACCOUNTS(){
        basicUsers = new ArrayList<Account>();
    }

    public static void Update_Password(int id, String Password){
        basicUsers.get(id).UpdatePasswordHash(Password);
    }
}
