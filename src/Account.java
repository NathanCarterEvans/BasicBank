/**
 * @author NathanCarterEvans
 * 
 */

public class Account {

     //TODO make user name and pin
     //TODO needs a valut with money
    private int USER_ID;
    private String PASSWORD_HASH = "";

    public Account(int USER_ID){
        this.USER_ID = USER_ID;
    }

    public int GetUserID(){
        return USER_ID;
    }

    public void UpdatePasswordHash(String passwordHash){
        PASSWORD_HASH = passwordHash;
    } 

    public boolean getPasswordHash(String PasswordHash_COMPARE){
        
        return true;
    }

}
