package com.felipewesley.app;

public class CifraDeCesar {
	
	private Integer giro = 0; 
	private String str;
	
	public Integer getGiro() {
		return giro;
	}
	
	public void setGiro(Integer giro) {
		this.giro = giro;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str; 
	}
	
	public String cifrar() {
		
		byte[] strToBytes = this.getStr().getBytes(); 
		
		for(int i = 0 ; i < strToBytes.length ; i++) {
			System.out.println(strToBytes[i]); 
			strToBytes[i] += this.getGiro(); 
		}
		
		String strCifrado = new String(strToBytes); 
		this.setStr(strCifrado); 
		
		return strCifrado; 
		
	}
	
	public String decifrar() {
		
		byte[] strToBytes = this.getStr().getBytes(); 
		
		for(int i = 0 ; i < strToBytes.length ; i++) {
			System.out.println(strToBytes[i]); 
			strToBytes[i] -= this.getGiro(); 
		}
		
		String strDecifrado = new String(strToBytes); 
		this.setStr(strDecifrado); 
		
		return strDecifrado;
	}
	
	
}
