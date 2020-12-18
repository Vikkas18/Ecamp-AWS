package com.ipru.tcs.cloud.ecamp.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipru.tcs.cloud.db.utils.GenericDAO;
import com.ipru.tcs.cloud.rdbms.entity.campaignrecord.CampaignRecordStatusEntity;
import com.ipru.tcs.cloud.utils.UtilsException;

@Component
public class UpdateDBUtility {
	
	@Autowired
	GenericDAO genericDao;
	
	static final String DATE_PATTERN = "yyyy-MM-dd";
	
	public CampaignRecordStatusEntity updateCampaignRecordStatusToRetryTechError(Long campaignRecordId, String serviceName) throws UtilsException {
		CampaignRecordStatusEntity[] campaignRecordStatusEntityArray = 
				genericDao.findByField(Constants.CAMPAIGN_RECORD_ENTITY, "recordid", 
							Long.toString(campaignRecordId), CampaignRecordStatusEntity.class);
		
		CampaignRecordStatusEntity campaignRecordStatusEntity = campaignRecordStatusEntityArray[0];
		campaignRecordStatusEntity.setStatus(Constants.RETRY);
		campaignRecordStatusEntity.setSubstatus(0);  	// Not sure till now
		campaignRecordStatusEntity.setRemarks("Technical Error");
		
		// GenericDao call to update DB
		CampaignRecordStatusEntity campaignRecordStatusEntityResponse = 
										genericDao.save(Constants.CAMPAIGN_RECORD_ENTITY, campaignRecordStatusEntity);
		
		return campaignRecordStatusEntityResponse;
	}
}
