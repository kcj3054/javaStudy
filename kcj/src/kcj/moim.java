package kcj;

public class moim {

	int maxNumberOfAttendees;
	int currentOfEnrollment;
	
	
	public boolean isEnrollmentFull() {
		if(maxNumberOfAttendees == 0)
			return false;
		else if(currentOfEnrollment < maxNumberOfAttendees)
			return false;
			else 
				return true;
	}
	
}
