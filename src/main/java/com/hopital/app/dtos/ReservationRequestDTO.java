package com.hopital.app.dtos;

public class ReservationRequestDTO {
	private int hopital_id;
	private int specialite_id;
	private String intervenant;
	
	public ReservationRequestDTO(int hopital_id, int specialite_id, String intervenant) {
		super();
		this.hopital_id = hopital_id;
		this.specialite_id = specialite_id;
		this.intervenant = intervenant;
	}
	public int getHopital_id() {
		return hopital_id;
	}
	public void setHopital_id(int hopital_id) {
		this.hopital_id = hopital_id;
	}
	public int getSpecialite_id() {
		return specialite_id;
	}
	public void setSpecialite_id(int specialite_id) {
		this.specialite_id = specialite_id;
	}
	public String getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}
	@Override
	public String toString() {
		return "ReservationDTO [hopital_id=" + hopital_id + ", specialite_id=" + specialite_id + ", intervenant="
				+ intervenant + "]";
	}
	
	public boolean valid() {
		return this.hopital_id > 0 && this.specialite_id > 0 || this.intervenant != null;
	}
	
}
