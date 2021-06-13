package dkn.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dkn.hrms.core.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})

public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdayDate;
    @Column(name = "national_indentity")
    private String nationalIdentity;
    @Column(name = "mernis_verified")
    private boolean mernisVerified;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
}
