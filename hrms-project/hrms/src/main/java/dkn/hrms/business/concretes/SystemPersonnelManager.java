package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.SystemPersonnelService;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.SystemPersonnelDao;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.SystemPersonnel;
import org.springframework.stereotype.Service;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {
    private SystemPersonnelDao systemPersonnelDao;
    private UserDao userDao;

    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao, UserDao userDao) {
        this.systemPersonnelDao = systemPersonnelDao;
        this.userDao = userDao;
    }

    @Override
    public Result update(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Güncelleme Başarılı");
    }
}
