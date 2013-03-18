package uk.ac.sussex.todolist;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratmenevse
 */
public class Comment {
    private String name;
    private String comment;
    private Date creationDate;

    public Comment(String name, String comment, Date creationDate) {
        this.name = name;
        this.comment = comment;
        this.creationDate = creationDate;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public void printObj(){
        System.out.println(name+" "+comment+ " "+creationDate);
    }
       
}