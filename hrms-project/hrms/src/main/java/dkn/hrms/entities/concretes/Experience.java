package dkn.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dkn.hrms.entities.concretes.CV;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "experience")
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "business_name")
    private String businessName;
    @Column(name = "position")
    private String position;
    @Column(name = "begin_experience_year")
    private String beginExperienceYear;
    @Column(name = "end_experience_year", nullable = true)
    private String endExperienceYear;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cv_id")
    private CV cv;
}
