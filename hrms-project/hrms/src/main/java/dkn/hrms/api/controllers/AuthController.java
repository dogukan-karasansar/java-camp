package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.AuthService;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.Employer;
import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.core.entities.concretes.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@CrossOrigin
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register-employer")
    Result addEmployer(@RequestBody User user, Employer employer, String r_pass) {
        return this.authService.employerRegister(user, employer, r_pass);
    }

    @PostMapping("/register-jobseeker")
    Result addJobSeeker(@RequestBody User user, JobSeeker JobSeeker, String r_pass) {
        return this.authService.jobSeekerRegister(user, JobSeeker, r_pass);
    }
}
