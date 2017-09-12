import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
public class Main {

	public static void main(String[] args)  throws ParseException, java.text.ParseException,IllegalArgumentException{
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		String date_s = "2011-01-18 00:00:00.0";
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = dt.parse(date_s); 
		Student s1= new Student(1,"Ravi", date, 85.3);
		Student s2= new Student(2,"teja", date, 75.4);
		Student s3= new Student(3,"new teja", date, 75.4);
		
		StudentGroup sgrp=new StudentGroup(4);
		
		Student [] stuarr= new Student[2];
		
		stuarr[0]=s1;
		stuarr[1]=s3;
		System.out.println("element"+s1);
		System.out.println("element"+s2);
		System.out.println("element"+s3);
		sgrp.setStudents(stuarr);
		System.out.println("nulll?"+sgrp.getStudent(0));
		System.out.println("nulll?"+sgrp.getStudent(1));
		System.out.println("nulll?"+sgrp.getStudent(2));
		sgrp.add(s2,1);
		
		
		System.out.println("added"+sgrp.getStudent(0));
		System.out.println("added"+sgrp.getStudent(1));
		System.out.println("added"+sgrp.getStudent(2));
		
		
		System.out.println("remo"+sgrp.getStudent(0));
		System.out.println("remo"+sgrp.getStudent(1));
		System.out.println("remo"+sgrp.getStudent(2));
		
		
		
	}

}
