package com.jj.utils;

public class ResponseUtil {

	public static ResponseInfo getSuccessResponse() {
		return getResponseInfo(ResponseConstants.SUCCESS.getRetCode(),
				ResponseConstants.SUCCESS.getRetMsg(),null);
	}
	
	public static ResponseInfo getSuccessResponse(Object data){
		return getResponseInfo(ResponseConstants.SUCCESS.getRetCode(),
				ResponseConstants.SUCCESS.getRetMsg(),data);
	}
	
	public static ResponseInfo getFailedResponse() {
		return getResponseInfo(ResponseConstants.FAILED.getRetCode(),
				ResponseConstants.FAILED.getRetMsg(),null);		
	}

	public static ResponseInfo getFailedResponse(Object data) {
		return getResponseInfo(ResponseConstants.FAILED.getRetCode(),
				ResponseConstants.FAILED.getRetMsg(),data);		
	}
	
	public static ResponseInfo getResponse(int retCode, String retMsg, Object data) {
		return getResponseInfo(retCode, retMsg, data);
	}
	
	private static ResponseInfo getResponseInfo(int retCode, String retMsg, Object data) {
		return new ResponseInfo(retCode, retMsg, data);
	}


	public static class ResponseInfo{
		
		private int retCode;
		
		private String retMsg;
		
		private Object data;
		
		private ResponseInfo() {
			
		}
		
		private ResponseInfo(int retCode, String retMsg ,Object data) {
			this.retCode = retCode;
			this.retMsg = retMsg;
			this.data = data;			
		}
		
		public int getRetCode() {
			return retCode;
		}
		
		public void setRetCode(int retCode) {
			this.retCode = retCode;
		}
		

		public String getRetMsg() {
			return retMsg;
		}
		
		public void setRetMsg(String retMsg) {
			this.retMsg = retMsg;
		}
		
		public Object getData() {
			return data;
		}
		
		public void setData(Object data) {
			this.data = data;
		}
	}
	
	public static enum ResponseConstants {
		
		SUCCESS(200,"success."),
		
		FAILED(300,"failed.");
		
		private int retCode;
		
		private String retMsg;
		
		private  ResponseConstants(int retCode, String retMsg) {
			this.retCode = retCode;
			this.retMsg = retMsg;
		}
		
		
		public int getRetCode() {
			return retCode;
		}
		
		public void setRetCode(int retCode){
			this.retCode = retCode;
		}
		
		public String getRetMsg() {
			return retMsg;
		}
		
		
		public void setRetMsg(String retMsg){
			this.retMsg =retMsg;
		}		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
