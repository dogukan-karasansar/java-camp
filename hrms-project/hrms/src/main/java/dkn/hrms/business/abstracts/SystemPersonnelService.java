package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    DataResult<List<SystemPersonnel>> update(SystemPersonnel systemPersonnel);
}
