package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.Language;

public interface LanguageService {

    Result add(Language language);

}
