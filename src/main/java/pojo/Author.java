package pojo;

/**
 * Created by robert.szostakowski on 2015-01-29.
 */
public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String url;

    public Author(int id, String firstName, String lastName, String url) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}
