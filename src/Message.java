/*
    David Persson
    2019-09-11
    Message hanterings system
 */

import java.util.Date;


public class Message {
    public String author;
    public String message;
    public Date createdAt;
    public Date updatedAt;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Message(String message){ //metoden för meddelandet
        this.message = message;
        this.author = System.getProperty("Username");
        Date createdAt = new Date();
        Date updatedAt = new Date();
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }

    public static void main(String[] args) {

        if  (args.length == 0) //Om inga argument anges så printar programmet bara menyn
            System.out.println(
                " Show message \n" +
                " Add message \n" +
                " Update message \n" +
                " Save message to file \n" +
                " Upload message from file \n" +
                " Exit");

    }
}
