package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.CityService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.dataAccess.abstracts.CityDao;
import dkn.hrms.entities.concretes.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Datalar Listelendi");
    }
}
