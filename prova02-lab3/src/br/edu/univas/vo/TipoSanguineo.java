package br.edu.univas.vo;

public enum TipoSanguineo {
	
	APOSITIVO ("A+"),
	ANEGATIVO ("A-"),
	BPOSITIVO ("B+"),
	BNEGATIVO ("B-"),
	ABPOSITIVO ("AB+"),
	ABNEGATIVO ("AB-"),
	OPOSITIVO ("O+"),
	ONEGATIVO ("O-");
	
	private String tipo;
	
	TipoSanguineo (String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	
	
	

}
