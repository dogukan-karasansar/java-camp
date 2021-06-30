package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
    Result update(SystemPersonnel systemPersonnel);
}
