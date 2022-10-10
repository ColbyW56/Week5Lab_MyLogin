/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class AccountService {
    private String username1 = "abe";
    private String password1 = "password";
    private String username2 = "barb";
    private String password2 = "password";
    private boolean valid = false;
    
    public AccountService() {
        
    }
    
    public boolean login(String username, String password) {
        if (this.password1.equals(password) && this.username1.equals(username) || this.username2.equals(username)) {
            return true;
        } else {
            return false;
        }
    }
}