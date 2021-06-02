package dkn.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cv")
@NoArgsConstructor
@AllArgsConstructor
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "github_address")
    private String githubAddress;

    @Column(name = "linkedin_address")
    private String linkedinAddress;

    @Column(name = "job_know")
    private String jobKnow;

    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "cv")
    private List<School> schools;

    @OneToMany(mappedBy = "cv")
    private List<Experience> experiences;

    @OneToMany(mappedBy = "cv")
    private List<Language> languages;

    @OneToOne()
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
    private JobSeeker jobSeeker;
}
