package entities;

public class User {
    private int id;
    private String nationalNumber;
    private String firstName;
    private String lastName;
    private int birthdayYear;

    public User() {
    }


    public User(int id, String nationalNumber, String firstName, String lastName, int birthdayYear) {
        this.setId(id);
        this.setNationalNumber(nationalNumber);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthdayYear(birthdayYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
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

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }
}
