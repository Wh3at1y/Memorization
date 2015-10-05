package popup.view;

import javax.swing.JOptionPane;

public class PopupDisplay {

	
	public String getUserInput(String input)
	{
		String userInput = "";
		
			userInput = JOptionPane.showInputDialog(input);
		
		return userInput;
	}
	
	public int getUserConfirm(String input)
	{
		
			return JOptionPane.showConfirmDialog(null, input);
		
	}
	
	public int yesOption()
	{
		int yes = 0;
		
			yes = JOptionPane.YES_OPTION;
			
		return yes;
	}
	
	public int noOption()
	{
		int no = 0;
			
			no = JOptionPane.NO_OPTION;
			
		return no;
	}
	
	public void showSomething(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
}
