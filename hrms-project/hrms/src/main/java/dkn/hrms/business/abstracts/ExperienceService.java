package dkn.hrms.business.abstracts;

import dkn.hrms.entities.concretes.Experience;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;

import java.util.List;

public interface ExperienceService {
    DataResult<List<Experience>> getReversedAll();
    Result add(Experience experience);
}
