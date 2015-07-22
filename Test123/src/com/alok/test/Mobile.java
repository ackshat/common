package com.alok.test;

public class Mobile implements Comparable<Mobile> {

	private String brand;
	private String model;
	private Boolean isScrathProof;
	private Float processorFreqInHertz;
	private Float ramSizeInGB;
	private Float fronCameraResolution;
	private Float rearCameraResolution;
	private Float batteryBackupInhours;
	private Float batterCapacityInMah;
	private Float screenSizeInInches;
	
	public Mobile(){
		
	}
	
	
	public Mobile(String brand, String model, Boolean isScrathProof,
			Float processorFreqInHertz, Float ramSizeInGB,
			Float fronCameraResolution, Float rearCameraResolution,
			Float batteryBackupInhours, Float batterCapacityInMah,
			Float screenSizeInInches) {
		super();
		this.brand = brand;
		this.model = model;
		this.isScrathProof = isScrathProof;
		this.processorFreqInHertz = processorFreqInHertz;
		this.ramSizeInGB = ramSizeInGB;
		this.fronCameraResolution = fronCameraResolution;
		this.rearCameraResolution = rearCameraResolution;
		this.batteryBackupInhours = batteryBackupInhours;
		this.batterCapacityInMah = batterCapacityInMah;
		this.screenSizeInInches = screenSizeInInches;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Boolean isScrathProof() {
		return isScrathProof;
	}
	public void setScrathProof(Boolean isScrathProof) {
		this.isScrathProof = isScrathProof;
	}
	public Float getProcessorFreqInHertz() {
		return processorFreqInHertz;
	}
	public void setProcessorFreqInHertz(Float processorFreqInHertz) {
		this.processorFreqInHertz = processorFreqInHertz;
	}
	public Float getRamSizeInGB() {
		return ramSizeInGB;
	}
	public void setRamSizeInGB(Float ramSizeInGB) {
		this.ramSizeInGB = ramSizeInGB;
	}
	public Float getFronCameraResolution() {
		return fronCameraResolution;
	}
	public void setFronCameraResolution(Float fronCameraResolution) {
		this.fronCameraResolution = fronCameraResolution;
	}
	public Float getRearCameraResolution() {
		return rearCameraResolution;
	}
	public void setRearCameraResolution(Float rearCameraResolution) {
		this.rearCameraResolution = rearCameraResolution;
	}
	public Float getBatteryBackupInhours() {
		return batteryBackupInhours;
	}
	public void setBatteryBackupInhours(Float batteryBackupInhours) {
		this.batteryBackupInhours = batteryBackupInhours;
	}
	public Float getBatterCapacityInMah() {
		return batterCapacityInMah;
	}
	public void setBatterCapacityInMah(Float batterCapacityInMah) {
		this.batterCapacityInMah = batterCapacityInMah;
	}
	public Float getScreenSizeInInches() {
		return screenSizeInInches;
	}
	public void setScreenSizeInInches(Float screenSizeInInches) {
		this.screenSizeInInches = screenSizeInInches;
	}


	@Override
	public int compareTo(Mobile o) {

		int i = 0;
		if(this.processorFreqInHertz > o.processorFreqInHertz){
			i=1;
		}
		else if(this.processorFreqInHertz < o.processorFreqInHertz){
			i=-1;
		}
		return i;
	}
	
	
	
	
}
