package com.mohs10.ActionDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.*;

import com.mohs10.base.StartBrowser;
public class videohandling  extends StartBrowser{
	

	    public static void videoplayPause() throws FindFailed {
	      
	        Screen screen = new Screen();

	        try {
	            // Wait for the video player to load (adjust the wait time as needed)
	            screen.wait("Screenshot_20230124_051006.png", 10);

	            // Click the play button to start the video
	            screen.click("Screenshot_20230124_051006.png");

	            // Wait for a few seconds for the video to play
	            Thread.sleep(5000);

	            // Click the play button again to pause the video
	            screen.click("Screenshot_20230124_051006.png");
	        } catch (FindFailed e) {
	            e.printStackTrace();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        Screen s = new Screen();

	        Pattern p = new Pattern("C:\\Users\\Mohs10 Technologies\\Pictures\\Screenshots\\UFT-Dragndrop.png");

	        System.out.println("UfT dragndrop image is found");

	        Pattern p1 = new Pattern("C:\\Users\\Mohs10 Technologies\\Pictures\\Screenshots\\Drag_Drop.png");

	        System.out.println("Drag drop file is found");

	        s.type("d",Key.WIN);

	        s.dragDrop(p,p1);



	 

	    }

	 

	
	    }
	    
	



