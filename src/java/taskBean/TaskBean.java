/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package taskBean;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import taskEJB.Task;
import taskEJB.TaskControllerLocal;

/**
 *
 * @author muratmenevse
 */
@Named(value="task")
@SessionScoped
public class TaskBean implements Serializable {


@EJB TaskControllerLocal tasks;
    /** Creates a new instance of VisitorBean */
    public TaskBean() {
    }

   

    public List<Task> getComments() {
        return tasks.list();
    }

    public String submit() {
        Task t = new Task();
      
        t.setDueDate(new Date());
        tasks.add(t);
        return "index.xhtml";
    }

    public String delete(Task c) {
        tasks.delete(c);
        return "index.xhtml";
    }

}
