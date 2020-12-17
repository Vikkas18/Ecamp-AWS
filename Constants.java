package com.ipru.tcs.cloud.ecamp.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Constants {
	
//	000 - New
//	100 - Transit
//	200 - sent
//	300 - delivered
//  400 - Evaluated
//	500 - Processing
//	700 - Failed
//	800 - Retry
//	900 - Not to Send   
//	101 - Evaluated
//	102 - Enqueuing
//	112 - Enqueue Failed	
	
	//Statuses and Substatuses
	public static final int TRANSIT = 100;
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
	
	
	// predefined Strings
	
	public static final int SUCCESS_CODE=200;
	public static final String INPUT_DATA_ERROR_CODE="401";
	public static final int EXCEPTION_CODE=500;
	public static final String SUCCESS_MESSAGE="SUCCESS";
	public static final String FAILURE_MESSAGE="FAILURE";
	public static final String APIGEE_SERVICE_FAILURE="APIGEE SERVICE FAILURE";
	public static final String VALIDATION_FAILURE ="403";
	public static final String POLICY_NUMBER = "POLICY_NUMBER";
	public static final String CLIENT_ID = "CLIENT_ID";
	public static final String RESPONSE_TYPE = "response";
	public static final String MESSAGE="message";
	public static final String MESSAGES="messages";
	public static final String ACTION="action";
	public static final String ERROR="error";
	public static final String TYPE="type";
	public static final String ERR_CODE="ErrCode";
	public static final String ERR_MSG="ErrMsg";
	public static final String INTENTS_KEY = "intents";
		
	//Netcore Pepipost events
	public static final String NETCORE_PEPIPOST_STATUS_SENT = "sent";
	public static final String NETCORE_PEPIPOST_STATUS_OPENED = "opened";
	public static final String NETCORE_PEPIPOST_STATUS_CLICKED = "clicked";
	public static final String NETCORE_PEPIPOST_STATUS_BOUNCED = "bounced";
	public static final String NETCORE_PEPIPOST_STATUS_DROPPED = "dropped";
	public static final String NETCORE_PEPIPOST_STATUS_INVALID = "invalid";
	public static final String NETCORE_PEPIPOST_STATUS_UNSUBSCRIBED = "unsubscribed";
	public static final String NETCORE_PEPIPOST_STATUS_SPAM = "spam";
		
	//Vendors
	public static final String IBANK_SMTP = "ibanksmtp";
	public static final String NETCORE_PEPIPOST = "netcore_pepipost";
	


	
	public static String getDate(String pattern) {
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		String currentDate=dateFormat.format(date);
		return currentDate;
	}
	public static String getTime(String pattern) {
		DateFormat timeFormat = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		String currentTime=timeFormat.format(date);
		return currentTime;
	}
}
