package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.School;

import java.util.List;

public interface SchoolService {
    DataResult<List<School>> getReversedAll();
    Result add(School school);
}
