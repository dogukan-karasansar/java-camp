package dkn.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "schools")
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "school_name")
    private String name;
    @Column(name = "school_department")
    private String department;
    @Column(name = "begin_school_year")
    private String beginSchoolYear;
    @Column(name = "end_school_year", nullable = true)
    private String endSchoolYear;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "cv_id")
    private  CV cv;
}
