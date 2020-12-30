package com.ipru.tcs.cloud.ecamp.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Constants {
	//Statuses and Substatuses
	public static final int NEW = 000;
	public static final int TRANSIT = 500;
	public static final int SENT = 200;
	public static final int DELIVERED = 300;
	public static final int RETRY = 800;
	public static final int NOT_TO_SEND = 900;
	public static final int READ = 310;
	public static final int NAVIGATE = 320;
	public static final int SYSTEM_ISSUE = 801;
	public static final int GATEWAY_ISSUE = 802;
	public static final int TIME_WINDOW_LAPSE = 803;
	public static final int DND = 901;
	public static final int MAX_ATTEMPT_REACHED = 902;
	public static final int BOUNCE = 903;
	public static final int FAILED = 700;
	public static final int PROCESSING = 500;
	public static final int ENQUEUE_FAILD = 112;
	public static final int EVALUATED = 101;
	public static final int ENQUEUEING = 101;
		
	//Netcore Pepipost events
	public static final String NETCORE_PEPIPOST_STATUS_SENT = "sent";
	public static final String NETCORE_PEPIPOST_STATUS_OPENED = "opened";
	public static final String NETCORE_PEPIPOST_STATUS_CLICKED = "clicked";
	public static final String NETCORE_PEPIPOST_STATUS_BOUNCED = "bounced";
	public static final String NETCORE_PEPIPOST_STATUS_DROPPED = "dropped";
	public static final String NETCORE_PEPIPOST_STATUS_INVALID = "invalid";
	public static final String NETCORE_PEPIPOST_STATUS_UNSUBSCRIBED = "unsubscribed";
	public static final String NETCORE_PEPIPOST_STATUS_SPAM = "spam";
	
	//IBank SMTP events
	public static final String IBANK_SMTP_STATUS_READ = "read";
	public static final String IBANK_SMTP_STATUS_NAVIGATE = "navigate";
		
	//Vendors
	public static final String IBANK_SMTP = "ibank_smtp";
	public static final String NETCORE_PEPIPOST = "netcore_pepipost";
	
	//Entities
	public static final String CAMPAIGN_RECORD_ENTITY = "campaignrecord";
	public static final String CAMPAIGN_DEFINITION_ENTITY = "campaigndefinition";
	public static final String CAMPAIGN_TEMPLATE_ENTITY = "campaigntemplate";
	public static final String RETRY__ENTITY = "retry";
	public static final String RETRYSCHEDULERSERVICE = "RetrySchedulerService";
	
	//Services
	public static final String EMAIL_SERVICE = "emailservice";
	public static final String IBANK_STATUS_SERVICE = "ibankstatusservice";
	public static final String NETCORE_PEPIPOST_STATUS_SERVICE = "netcorepepipoststatusservice";

	//LoadDistibutionService Statuses
	public static final String LOADDISTRIBUTION_SUCCESS_STATUS ="Processing";
	public static final String LOADDISTRIBUTION_SUCCESS_SUBSTATUS ="QueueAssigned";
	public static final String LOADDISTRIBUTION_FAILURE_STATUS ="Failed";
	public static final String LOADDISTRIBUTION_FALIURE_SUBSTATUS ="Invalid Input paramters";
	public static final String LOADDISTRIBUTION_FALIURE1_SUBSTATUS ="InvalidProcessingCategory";
	public static final String LOADDISTRIBUTION_FALIURE2_SUBSTATUS ="No_Recordswith_preference1";
	public static final String LOADDISTRIBUTION_RETRY_SUBSTATUS ="TechError";
	public static final String LOADDISTRIBUTION_RETRY_STATUS ="Retry";
	public static final String LOADDISTRIBUTION_REMARK ="loadbalancer";
	public static final String CONFIGURATIONTAG ="TAG";
	public static final String VERY_HIGH_VOLUME ="VERYHIGHVOLUME";
	public static final String HIGH_VOLUME ="HIGHVOLUME";
	public static final String MODARATE_VOLUME ="MODARATEVOLUME";
	public static final String LOW_VOLUME ="LOWVOLUME";
	
	// Get Current Date
	public static String getDate(String pattern) {
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		String currentDate=dateFormat.format(date);
		return currentDate;
	}
	// Get Current Time
	public static String getTime(String pattern) {
		DateFormat timeFormat = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		String currentTime=timeFormat.format(date);
		return currentTime;
	}
}
