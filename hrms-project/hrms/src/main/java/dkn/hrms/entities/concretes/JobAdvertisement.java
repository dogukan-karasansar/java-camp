package dkn.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "minimum_salary")
    private double minimumSalary;
    @Column(name = "maximum_salary")
    private double maximumSalary;
    @Column(name = "number_of_openposition")
    private int numberOfOpenPosition;
    @Column(name = "application_deadline")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applicationDeadline;
    @Column(name = "activated", columnDefinition = "boolean default false")
    private boolean activated;
    @Column(name = "type_of_work")
    private String typeOfWork;
    @Column(name =  "runtime")
    private String runtime;
    /*@Column(name = "employer_id")
    private int employerId;
    @Column(name = "job_position_id")
    private int jobPositionId;
    @Column(name = "city_id")
    private int cityId;*/

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

}
