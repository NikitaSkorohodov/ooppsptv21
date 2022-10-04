/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproba;
import myclasses.author;
import myclasses.book;
/**
 *
 * @author user
 */
public class Oopproba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        author author1 = new author();
        author1.setFirstname("Ale4ksandr");
        author1.setLastname("Pushkin");
        book book1 =new book();
        book1.setCaption("jev");
        author[] authors= new author[1];
        authors[0]=author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
    }
    
}
