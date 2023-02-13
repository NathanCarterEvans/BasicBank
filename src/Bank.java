/**
 * @author NathanCarterEvans
 * This class is in charge of being a middle man between the user and funds. 
 * This serves as a source of protection and when implemented this needs to be the most secure. 
 */
public class Bank {
    
    public static void main(String args[]){
       
    }

    public static void CreateNewUser(String UName, String Pword, int pin){
        int newUserAccountID = UserManager.MakeNewUser(); //Creates an account and stores it in newUserAccount
        UserManager.Update_Password(newUserAccountID, UName);
        

    }

    public static void LogInUser(int USER_ID){
        //TODO make log in method
    }
}