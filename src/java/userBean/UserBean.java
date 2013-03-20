/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import userEJB.User;
import userEJB.UserControllerLocal;

/**
 *
 * @author muratmenevse
 */
@Named(value="user")
@SessionScoped
public class UserBean implements Serializable {

    private String username;
    private String password;
    

@EJB UserControllerLocal users;
    /** Creates a new instance of VisitorBean */
    public UserBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users.list();
    }

    public String submit() {
        User u = new User();
        u.setUsername(getUsername());
        u.setPassword(getPassword());
        u.setCreationTime(new Date());
        users.add(u);
        return "index.xhtml";
    }

    public String delete(User u) {
        users.delete(u);
        return "index.xhtml";
    }

}