package managers;

import entities.Campaign;

public class CampaignManager {
    public void add(Campaign campaign) {
        Campaign campaigns = new Campaign();
        campaigns.setId(campaign.getId());
        campaigns.setName(campaign.getName());
        campaigns.setPercentOfDiscount(campaign.getPercentOfDiscount());
        System.out.println(campaigns.getName() + " Kampanyası Sisteme Eklendi");
    }

    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " Kampanyası Sistemden Silindi");
    }

    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " Kampanyası Güncellendi");
    }

}
