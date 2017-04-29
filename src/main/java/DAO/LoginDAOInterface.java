/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.User;

/**
 *
 * @author marwen
 */
public interface LoginDAOInterface {

    Boolean signIn(String username, String password);

    Boolean signUp(User user);

}
