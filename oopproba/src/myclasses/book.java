/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class book {
    author[] authors;
    String caption;
    public book(){
    }
    public void setAuthors(author[] authors) {
        this.authors = authors;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public author[] getAuthors() {
        return authors;
    }

    public String getCaption() {
        return caption;
    }
    

    @Override
    public String toString() {
        return "book{" + "authors=" + Arrays.toString(authors) 
                + ", caption=" + caption 
                + '}';
    }
    
}
