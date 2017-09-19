package Java;

/**
 *
 * @author Sean Jeske
 */
public class UserServices {
    
    private String[] userNames = {"sean", "alice"};
    private String password = "password";
    
    public  boolean loging(String userName, String password){
        boolean isValid = false;
        
        for(String user : userNames)
            if(user.equals(userName))
                if(this.password.equals(password))
                isValid = true;
            
        return isValid;
    }
}
