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


@EJB UserControllerLocal users;
    /** Creates a new instance of VisitorBean */
    public UserBean() {
    }

   

    public List<User> getComments() {
        return users.list();
    }

    public String submit() {
        User u = new User();
      
        users.add(u);
        return "index.xhtml";
    }

    public String delete(User u) {
        users.delete(u);
        return "index.xhtml";
    }

}
