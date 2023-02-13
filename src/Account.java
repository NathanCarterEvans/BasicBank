/**
 * @author NathanCarterEvans
 * 
 */

public class Account {

     //TODO make user name and pin
     //TODO needs a valut with money
    private int USER_ID;
    private int PASSWORD_HASH = 0;

    public Account(int USER_ID){
        this.USER_ID = USER_ID;
    }

    public int GetUserID(){
        return USER_ID;
    }

    public void UpdateUserName(String uname){
        
    }

    public void UpdatePasswordHash(String password){
        PASSWORD_HASH = PasswordEncryption.Encrypt(password);
    } 

    public boolean getPasswordHash(int PasswordHash_COMPARE){
        
        if(PasswordHash_COMPARE == PASSWORD_HASH){
            return true;
        }
        return false;
        
    }

}
