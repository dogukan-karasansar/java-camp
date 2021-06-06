package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.CVService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.CV;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(name = "api/cv")
@CrossOrigin

public class CVController {
    private CVService cvService;

    public CVController(CVService cvService) {
        this.cvService = cvService;
    }

    @PostMapping(name = "/add")
    public Result add(@RequestBody CV cv) throws IOException {
        return this.cvService.add(cv);
    }

    @GetMapping("/get-seeker-cv")
    public DataResult<List<CV>> findByJobSeekerId(@RequestParam int jobSeekerId) {
        return this.cvService.findByJobSeekerId(jobSeekerId);
    }
}
