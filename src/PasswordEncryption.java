public class PasswordEncryption {
    
    public static int Encrypt(String password){
        int PasswordHash = password.hashCode();
        return PasswordHash;
    }
}
