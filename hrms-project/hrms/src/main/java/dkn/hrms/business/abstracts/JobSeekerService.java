package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
}
