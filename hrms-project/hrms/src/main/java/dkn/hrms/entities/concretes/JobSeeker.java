package dkn.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_seekers")
public class JobSeeker {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    private String birthdayDate;
    @Column(name = "national_indentity")
    private String nationalIdentity;
    @Column(name = "mernis_verified")
    private boolean mernisVerified;

    public JobSeeker() {
    }

    public JobSeeker(int id, int userId, String firstName, String lastName, String birthdayDate, String nationalIdentity, boolean mernisVerified) {
        setId(id);
        setUserId(userId);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthdayDate(birthdayDate);
        setNationalIdentity(nationalIdentity);
        setMernisVerified(mernisVerified);
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

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public boolean isMernisVerified() {
        return mernisVerified;
    }

    public void setMernisVerified(boolean mernisVerified) {
        this.mernisVerified = mernisVerified;
    }
}
