package Entities;

public class Student  extends User {
    private String address;
    private String imagePath;

    public Student(int id, String firstName, String lastName, String email, String password, String address, String imagePath) {
        super(id, firstName, lastName, email, password);
        this.address = address;
        this.imagePath = imagePath;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
