package dkn.hrms.core.utilities.adapters.abstracts;

import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.entities.concretes.User;

public interface MernisService {
    boolean checkMernis(JobSeeker jobSeeker);
}
