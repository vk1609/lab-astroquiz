package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if (( user.getAge()>=18  && user.getAge()<= 35) && ( user.getHeight()>=155 && user.getHeight()<=170) &&( 55<= user.getWeight() && user.getWeight() <= 90) && ( user.getCountry().equals("ProGrad")))
		return true;
		else 
			return false;
	}
	

	

	@Override
	public boolean checkQuizAnswer(Object points) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean BasicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	

	}
	
