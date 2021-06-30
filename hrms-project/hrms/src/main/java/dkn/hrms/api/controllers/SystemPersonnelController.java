package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.SystemPersonnelService;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.SystemPersonnel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/system-personnel")
@CrossOrigin
public class SystemPersonnelController {
    private SystemPersonnelService personnelService;

    public SystemPersonnelController(SystemPersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @PutMapping("update-personnel")
    private Result update(@RequestBody SystemPersonnel systemPersonnel){
        return this.personnelService.update(systemPersonnel);
    }
}
