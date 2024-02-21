package day56may;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentData {

	public static void main(String[] args) 
	{
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(103,"abhi","java",2000f));
		st.add(new Student(109,"karan","Spring",5000f));
		st.add(new Student(107,"rahul","devops",1500f));
		st.add(new Student(105,"sonu","python",3400f));
		st.add(new Student(101,"puneet","sql",2500f));
		st.add(new Student(102,"anshu","c++",2300f));
		Collections.sort(st,(st1,st2)->
		{
			return st1.sId-st2.sId;
		});
		for(Student s:st)
		{
			System.out.println(s.sId+" "+s.sName+" "+s.course+" "+s.price);
		}
		

	}

}
