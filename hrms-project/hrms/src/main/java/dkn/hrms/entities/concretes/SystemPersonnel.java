package dkn.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "system_personnels")
public class SystemPersonnel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "user_İd")
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public SystemPersonnel() {}

    public SystemPersonnel(int id, int userId, String firstName, String lastName) {
        this.setId(id);
        this.setUserId(userId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
}
