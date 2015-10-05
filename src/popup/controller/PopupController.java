package popup.controller;

import popup.view.PopupDisplay;

public class PopupController {

	PopupDisplay popUp;
	
	boolean continueOn;
	
	int userConfirm;
	String userAge;
	String userName;
	
	public PopupController()
	{
		popUp = new PopupDisplay();
		continueOn = true;
	}
	
	public void start()
	{
			userConfirm = popUp.getUserConfirm("Hello there, are you ready to start?");
			
			if(userConfirm == popUp.yesOption())
			{
				getUserAge();
			}
			else if(userConfirm == popUp.noOption())
			{
				System.exit(0);
			}
			else
			{
				System.exit(0);
			}
		
	}
	
	public void getUserAge()
	{
		while(continueOn == true)
		{
			userAge = popUp.getUserInput("Enter your age.");
			userConfirm = popUp.getUserConfirm("Is " + userAge + " correct?");
			
			if(userConfirm == popUp.yesOption())
			{
				getUserName();
			}
			
			else if(userConfirm == popUp.noOption())
			{
				continueOn = true;
			}
			
			else
			{
				System.exit(0);
			}
		}
	}
	
	public void getUserName()
	{
		while(continueOn == true)
		{
			userName = popUp.getUserInput("Enter your name.");
			userConfirm = popUp.getUserConfirm("Is " + userName + " correct?");
			
			if(userConfirm == popUp.yesOption())
			{
				//More Steps
			}
			
			else if(userConfirm == popUp.noOption())
			{
				continueOn = true;
			}
			
			else
			{
				System.exit(0);
			}
		}
	}
}
