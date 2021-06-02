package dkn.hrms.core.utilities.adapters.abstracts;


import dkn.hrms.entities.concretes.CV;

import java.io.IOException;

public interface ImageAdapterService {
    void addCvImage(CV cv) throws IOException;
}
