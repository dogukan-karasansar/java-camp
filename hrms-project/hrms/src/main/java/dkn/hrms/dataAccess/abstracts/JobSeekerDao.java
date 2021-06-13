package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
    JobSeeker findByUserId(int id);
}
