package com.cg.frs.dto;

public class FlatRegistrationDTO {
	
	private int ownerId;
	private String type;
	private int flatArea;
	private int flatRent;
	private int depositedAmount;
	private int registerationId; 
	public int getRegisterationId() {
		return registerationId;
	}
	public void setRegisterationId(int registerationId) {
		this.registerationId = registerationId;
	}
	@Override
	public String toString() {
		return "FlatRegistrationDTO [ownerId=" + ownerId + ", type=" + type + ", flatArea=" + flatArea + ", flatRent="
				+ flatRent + ", depositedAmount=" + depositedAmount + ", registerationId=" + registerationId + "]";
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public int getFlatRent() {
		return flatRent;
	}
	public void setFlatRent(int flatRent) {
		this.flatRent = flatRent;
	}
	public int getDepositedAmount() {
		return depositedAmount;
	}
	public void setDepositedAmount(int depositedAmount) {
		this.depositedAmount = depositedAmount;
	}
	
	

}
