package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.CV;

import java.io.IOException;
import java.util.List;

public interface CVService {
    Result add(CV cv) throws IOException;
    DataResult<List<CV>> findByJobSeekerId(int jobSeekerId);
}
