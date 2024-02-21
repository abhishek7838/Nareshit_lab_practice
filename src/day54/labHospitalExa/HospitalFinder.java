package day54.labHospitalExa;

import java.util.ArrayList;

import java.util.Map;
import java.util.Scanner;

public class HospitalFinder {

	public static void main(String[] args)
	{
		System.out.println("Hospital relative Example: ");
		Scanner sc=new Scanner(System.in);
		HospitalService hospitalService=new HospitalService();
		ArrayList<String> al=new ArrayList<String>();
		al.add("karan");
		al.add("rahul");
		al.add("samir");
		int hospitalNumber=hospitalService.addHospital("Sharda-Hospital",al, "Delhi","+91-2738126","Hydrabaad");
		System.out.println("Adding hospital : "+hospitalNumber);
		Hospital h=hospitalService.getHospitalDetails(100);
		System.out.println("Hospital : "+h);
		Map<String,Integer> mapHospital=hospitalService.getHospitals();
		System.out.println("Map-Hospital: "+mapHospital);
		sc.close();
		
	

	}

}
