package dkn.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "web_sites")
    private String webSites;

    public Employer() {}

    public Employer(int id, int userId, String companyName, String phone, String webSites) {
        this.setId(id);
        this.setUserId(userId);
        this.setCompanyName(companyName);
        this.setPhone(phone);
        this.setWebSites(webSites);
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebSites() {
        return webSites;
    }

    public void setWebSites(String webSites) {
        this.webSites = webSites;
    }
}
