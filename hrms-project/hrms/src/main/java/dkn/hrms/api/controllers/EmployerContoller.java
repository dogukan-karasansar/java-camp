package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.EmployerService;
import dkn.hrms.business.abstracts.JobPositionService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.entities.concretes.Employer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employer")
public class EmployerContoller {
    private EmployerService employerService;

    public EmployerContoller(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }
}
