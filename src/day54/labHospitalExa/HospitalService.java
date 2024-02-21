package day54.labHospitalExa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService
{
	private int hospitalCode=100;
	private List<Hospital> hospitals=new ArrayList<Hospital>();
	public int addHospital(String hospitalName, List<String> listOfTreatment, String contactPerson, String contactNumber,String location)
	{
		Hospital hospital=new Hospital(hospitalName,listOfTreatment,contactPerson,contactNumber,location);
		hospital.setHospitalCode(hospitalCode);
		hospitals.add(hospital);
		return hospitalCode++;
	}
	public Map<String,Integer>getHospitals()
	{
		Map<String,Integer> hptl=new HashMap<String,Integer>();
		for(Hospital h:hospitals)
		{
			hptl.put(h.getHospitalName(), h.getHospitalCode());
		}
		return hptl;	
	}
	public Hospital getHospitalDetails(int code)
	{
		for(Hospital hospital:hospitals)
		{
			if(hospital.getHospitalCode()==code)
			{
				return hospital;
			}
			
		}
		return null;
	}
}








