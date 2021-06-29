package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.ApplicationService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.Applitaion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/application")
@CrossOrigin
public class ApplicationController {
    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/getApplications")
    private DataResult<List<Applitaion>> getApplications(@RequestParam int jobAdvertisementId) {
        return this.applicationService.findByJobAdvertisement(jobAdvertisementId);
    }

    @PostMapping("/add")
    private Result add(@RequestBody Applitaion applitaion) {
        return this.applicationService.add(applitaion);
    }
}
