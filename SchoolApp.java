package com.school.app;

import com.school.management.School;
import com.school.staff.Principal;

public class SchoolApp {
	public static void main(String [] args) {
		School school=new School();
		school.setName("Kranthi High School");
		school.setLocation("Bapunagar");
		
		Principal principal=new Principal();
		principal.setPrincipalName("Rmaesh");
		principal.setExperienceYears(45);
		
		school.showSchoolInfo();
		System.out.println();
		principal.showPrincipalInfo();
		
	}

}
