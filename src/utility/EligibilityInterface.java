package utility;

import model.User;

//PROGRESSION 3
interface EligibilityInterface<string>{
	boolean checkUser(User user);
	boolean checkQuizAnswer(string points);
}