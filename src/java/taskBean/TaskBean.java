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

    private int priority;
    private String title;
    private String optionalNote;
    private boolean completionFlag;

    
    

@EJB TaskControllerLocal tasks;
    /** Creates a new instance of VisitorBean */
    public TaskBean() {
    }

   public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionalNote() {
        return optionalNote;
    }

    public void setOptionalNote(String optionalNote) {
        this.optionalNote = optionalNote;
    }

    public boolean isCompletionFlag() {
        return completionFlag;
    }

    public void setCompletionFlag(boolean completionFlag) {
        this.completionFlag = completionFlag;
    }

    public List<Task> getTasks() {
        return tasks.list();
    }

    public String submit() {
        Task t = new Task();
      
        t.setPriority(getPriority());
        t.setTitle(getTitle());
        t.setOptionalNote(getOptionalNote());
        t.setDueDate(new Date());
        tasks.add(t);
        return "index.xhtml";
    }

    public String delete(Task c) {
        tasks.delete(c);
        return "index.xhtml";
    }

}
