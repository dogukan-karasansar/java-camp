package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.ExperienceService;
import dkn.hrms.entities.concretes.Experience;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "api/experience")
public class ExperienceController {
    private ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/get-reversed-all")
    public DataResult<List<Experience>> getReversedAll() {
        return this.experienceService.getReversedAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Experience experience) {
        return this.experienceService.add(experience);
    }
}
