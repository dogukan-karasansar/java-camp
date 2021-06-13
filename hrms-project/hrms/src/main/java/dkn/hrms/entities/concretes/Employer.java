package dkn.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dkn.hrms.core.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "web_sites")
    private String webSites;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
}
