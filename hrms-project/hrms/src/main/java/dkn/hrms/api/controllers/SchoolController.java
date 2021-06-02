package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.SchoolService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.School;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/schools")
public class SchoolController {
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/get-reversed-sorted")
    public DataResult<List<School>> getReversedAll() {
        return this.schoolService.getReversedAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody School school) {
        return this.schoolService.add(school);
    }
}
