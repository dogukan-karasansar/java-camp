package dkn.hrms.core.utilities.adapters.concretes;


import dkn.hrms.core.utilities.adapters.abstracts.MernisService;
import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.entities.concretes.User;
import dkn.hrms.mernisService.ICRKPSPublicSoap;
import org.springframework.stereotype.Service;

@Service
public class MernisAdapter implements MernisService {
   private ICRKPSPublicSoap publicSoap = new ICRKPSPublicSoap();

    @Override
    public boolean checkMernis(JobSeeker jobSeeker) {
        try {
            publicSoap.TCKimlikNoDogrula(Long.valueOf(jobSeeker.getNationalIdentity()), jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getBirthdayDate().getYear());
            jobSeeker.setMernisVerified(true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
