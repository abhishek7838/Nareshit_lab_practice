package day54.labHospitalExa;

import java.util.List;

public class Hospital
{
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatment;
	private String contactPerson;
	private String contactNumber;
	private String location;
	public Hospital(String hospitalName, List<String> listOfTreatment, String contactPerson, String contactNumber,
			String location)
	{
		
		this.hospitalName = hospitalName;
		this.listOfTreatment = listOfTreatment;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}
	public int getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public List<String> getListOfTreatment() {
		return listOfTreatment;
	}
	public void setListOfTreatment(List<String> listOfTreatment) {
		this.listOfTreatment = listOfTreatment;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "[ hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatment="
				+ listOfTreatment + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
	
	

}
