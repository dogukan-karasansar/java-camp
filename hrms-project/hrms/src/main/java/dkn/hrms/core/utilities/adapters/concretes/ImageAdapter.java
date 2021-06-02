package dkn.hrms.core.utilities.adapters.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import dkn.hrms.core.utilities.adapters.abstracts.ImageAdapterService;
import dkn.hrms.entities.concretes.CV;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ImageAdapter implements ImageAdapterService {

    @Override
    public void addCvImage(CV cv) throws IOException {
        Map config = new HashMap();
        config.put("cloud_name", "dgbytpbmp");
        config.put("api_key", "989512684354212");
        config.put("api_secret", "chi4V3d04TlcLwW8CSCwriXMU7c");
        Cloudinary cloudinary = new Cloudinary(config);

        File file = new File(cv.getImageUrl());
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        cv.setImageUrl(uploadResult.toString());
    }
}
