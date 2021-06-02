package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.CVService;
import dkn.hrms.business.abstracts.ExperienceService;
import dkn.hrms.business.abstracts.LanguageService;
import dkn.hrms.business.abstracts.SchoolService;
import dkn.hrms.core.utilities.adapters.abstracts.ImageAdapterService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.CVDao;
import dkn.hrms.entities.concretes.CV;
import dkn.hrms.entities.concretes.Experience;
import dkn.hrms.entities.concretes.Language;
import dkn.hrms.entities.concretes.School;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CVManager implements CVService {
    private CVDao cvDao;
    private LanguageService languageService;
    private SchoolService schoolService;
    private ExperienceService experienceService;
    private ImageAdapterService imageAdapterService;

    public CVManager(CVDao cvDao, LanguageService languageService, SchoolService schoolService, ExperienceService experienceService, ImageAdapterService imageAdapterService) {
        this.cvDao = cvDao;
        this.languageService = languageService;
        this.schoolService = schoolService;
        this.experienceService = experienceService;
        this.imageAdapterService = imageAdapterService;
    }

    @Override
    public Result add(CV cv) {
        try {
            imageAdapterService.addCvImage(cv);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.cvDao.save(cv);
        for(Language launguage : cv.getLanguages()) {
            launguage.setCv(cv);
            languageService.add(launguage);
        }
        for(School school : cv.getSchools()) {
            school.setCv(cv);
            schoolService.add(school);
        }
        for(Experience experience : cv.getExperiences()) {
            experience.setCv(cv);
            experienceService.add(experience);
        }
        return new SuccessResult("CV Eklendi");
    }

    @Override
    public DataResult<List<CV>> findByJobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<List<CV>>(this.cvDao.findByJobSeekerId(jobSeekerId));
    }
}
