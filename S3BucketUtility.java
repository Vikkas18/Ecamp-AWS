package com.ipru.tcs.cloud.ecamp.Constants;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ipru.tcs.cloud.utils.UtilsException;
import com.ipru.tcs.cloud.utils.storage.StorageService;
import com.ipru.tcs.cloud.utils.storage.StoredObject;
import com.ipru.tcs.cloud.utils.storage.StoredObjectInfo;

@Component
public class S3BucketUtility {
	
	@Autowired
	StorageService strgSrv;
	
	// To get data from S3 bucket
		public ResponseEntity<byte[]> getTemplateFromS3(String key, String bucket) throws UtilsException {
			StoredObjectInfo objInfo = new StoredObjectInfo();
			objInfo.setKey(key);
			objInfo.setLocation(bucket);
			StoredObject obj = strgSrv.retrieve(objInfo);
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.CONTENT_TYPE, objInfo.getContentType());
			headers.add(HttpHeaders.CONTENT_LENGTH, Long.toString(objInfo.getContentLength()));
			headers.add(HttpHeaders.ACCEPT_RANGES, "bytes");
			String contentDisposition = null;
			if(objInfo.isFile()) {
				if(objInfo.getFileName() != null && !objInfo.getFileName().trim().isEmpty()) {
					contentDisposition = String.format("attachment; filename=\"%s\"",objInfo.getFileName().trim());
				}
				else {
					contentDisposition = "attachment";
				}
			}
			else {
				contentDisposition="inline";
			}
			headers.add(HttpHeaders.CONTENT_DISPOSITION,contentDisposition);
			byte[] body;
			try {
				body = IOUtils.toByteArray(obj.getObjStream());
			} 
			catch (IOException e) {
				e.printStackTrace();
				throw new UtilsException(e);
			}
			
			ResponseEntity<byte[]> result = new ResponseEntity<byte[]>(body,headers,HttpStatus.OK);
			try {
				obj.getObjStream().close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
}
