package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.LanguageService;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.LanguageDao;
import dkn.hrms.entities.concretes.Language;
import org.springframework.stereotype.Service;

@Service
public class LanguageManager implements LanguageService {
    private LanguageDao languageDao;

    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(Language language) {
        this.languageDao.save(language);
        return new SuccessResult("");
    }
}
