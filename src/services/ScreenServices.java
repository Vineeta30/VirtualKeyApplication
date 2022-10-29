package services;
import screens.FileOptions;
import screens.Screen;
import screens.welcomeScreen;
//import entities.Directory;
public class ScreenServices {
	public static welcomeScreen WelcomeScreen = new welcomeScreen();
    public static FileOptions FileOptionsScreen = new FileOptions();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
}
