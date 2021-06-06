package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.JobAdvertisementService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.JobAdvertisement;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/job-advertisement")
@CrossOrigin

public class JobAdvertisementController {
    private JobAdvertisementService jobAdvertisementService;

    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/activated-job-advertisements")
    public DataResult<List<JobAdvertisement>> findByActivatedTrue() {
        return this.jobAdvertisementService.findByActivatedTrue();
    }

    @GetMapping("/getall-application-deadline")
    public DataResult<List<JobAdvertisement>> getAllDeadline() {
        return this.jobAdvertisementService.getAllDeadline();
    }

    @GetMapping("/geta-employer-job-advertisements")
    public DataResult<List<JobAdvertisement>> findByJobAdvertisementEmployer(@RequestParam int employerId) {
        return this.jobAdvertisementService.findByJobAdvertisementEmployer(employerId);
    }

    @PutMapping("update")
    public Result update(@RequestBody JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.update(jobAdvertisement);
    }
}
