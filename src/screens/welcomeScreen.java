package screens;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;
import services.DirectoryServices;
import services.ScreenServices;

public class welcomeScreen implements Screen{
		
	private String welcomeText = "Welcome to VirtualKey!";
    private String developerText = "Developer: Vinita Prasad";
	private ArrayList<String> options = new ArrayList<>();
	
	public welcomeScreen() {
		options.add("1. Show Files");
		options.add("2. Show File Options Menu");
		options.add("3. Quit");
	}
	public void intro() {
		System.out.println(welcomeText);
		System.out.println(developerText);
		System.out.println("\n");
		Show();
	}
	
	public void Show() {
    	System.out.println("Main Menu");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }
	public void NavigateOption(int option) {
		 switch(option) {

         case 1: // Show Files in Directory
             this.ShowFiles();
             
             this.Show();
             
             break;
             
         case 2: // Show File Options menu
         	ScreenServices.setCurrentScreen(ScreenServices.FileOptionsScreen);
             ScreenServices.getCurrentScreen().Show();
             ScreenServices.getCurrentScreen().GetUserInput();
             
             this.Show();
             
             break;
             
         default:
             System.out.println("Invalid Option");
             break;
     }
	}
	   public void ShowFiles() {

	        //TODO: Get the files from the Directory
	    	
	    	//Finished TODO Task

	        System.out.println("List of Files: ");
	    	DirectoryServices.PrintFiles();

	    }
	    
	    private int getOption() {
	        Scanner in = new Scanner(System.in);

	        int returnOption = 0;
	        try {
	            returnOption = in.nextInt();
	        }
	        catch (InputMismatchException ex) {

	        }
	        return returnOption;

	    }
}
