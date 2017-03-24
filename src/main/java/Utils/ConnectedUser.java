/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entities.User;

/**
 *
 * @author marwen
 */
public class ConnectedUser {
    
    private static User currentUser;
    
    
    public static User getCurrentConnectedUser()
    {
        
        return currentUser;
        
    }
    
    public static void setCurrentConnectedUser(User u)
    {
        currentUser = u;
    }
    
    
    
}
