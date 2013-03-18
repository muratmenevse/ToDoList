/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.sussex.todolist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author muratmenevse
 */
@Named(value = "visitor")
@SessionScoped
public class VisitorBean implements Serializable {
    
    private String name;
    private String comment;
    private Comment commentObj;
    private Date date;
    private static ArrayList<Comment> comments = new ArrayList<Comment>();
    
    
    //Comment commentObject = 

   
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    public VisitorBean() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        VisitorBean.comments = comments;
    }
    
    
    
    public String submit(){
        //this.name=
        date = new Date();
        commentObj = new Comment(name, comment, date);
        comments.add(commentObj);
        commentObj.printObj();
        
        return "index.xhtml";
        //return "table.xhtml";
        
        
    }
    
    
    public String delete(Comment c) {
        comments.remove(c);
        //comments.delete(c);
        return "index.xhtml";
    }
    
    
    
    
    
    

}
