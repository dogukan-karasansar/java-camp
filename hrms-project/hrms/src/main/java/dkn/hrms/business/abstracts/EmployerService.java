package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
}
