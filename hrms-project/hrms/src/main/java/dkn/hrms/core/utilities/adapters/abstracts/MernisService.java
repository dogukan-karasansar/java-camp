package dkn.hrms.core.utilities.adapters.abstracts;

import dkn.hrms.entities.concretes.JobSeeker;

public interface MernisService {
    boolean checkMernis(JobSeeker jobSeeker);
}
