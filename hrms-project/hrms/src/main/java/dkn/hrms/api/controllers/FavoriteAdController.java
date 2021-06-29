package dkn.hrms.api.controllers;

import dkn.hrms.business.abstracts.FavoriteAdService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.FavoriteAd;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "api/favoritead")
@CrossOrigin
public class FavoriteAdController {
    private FavoriteAdService favoriteAdService;

    public FavoriteAdController(FavoriteAdService favoriteAdService) {
        this.favoriteAdService = favoriteAdService;
    }

    @GetMapping("/get-favorites")
    private DataResult<List<FavoriteAd>> getFavorites(@RequestParam int jobSeekerId){
        return this.favoriteAdService.findByJobSeekerId(jobSeekerId);
    }

    @PostMapping("/favorite-add")
    private Result add(@RequestBody FavoriteAd favoriteAd) {
        return this.favoriteAdService.add(favoriteAd);
    }

    @GetMapping("/get-favorite")
    private Result getFavorite(@RequestParam int jobAdvertisementId, @RequestParam int jobSeekerId) {
        return this.favoriteAdService.findByJobAdvertisementIdAndJobSeekerId(jobAdvertisementId, jobSeekerId);
    }
}
