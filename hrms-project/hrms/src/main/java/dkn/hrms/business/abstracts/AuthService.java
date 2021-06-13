package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.Employer;
import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.core.entities.concretes.User;

public interface AuthService<T> {
    Result employerRegister(User user, Employer employer, String r_pass);
    Result jobSeekerRegister(User user, JobSeeker jobSeeker, String r_pass);
    DataResult<T> loginUser(String email, String password);
}
