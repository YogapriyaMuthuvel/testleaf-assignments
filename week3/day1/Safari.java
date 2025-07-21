package week3.day1;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader mode enabled");
	}
	
	public void fullScreenMode() {
		System.out.println("Fullscreen mode enabled");
	}
	
	public static void main(String[] args) {
		Safari option2 = new Safari();
		 option2.readerMode();
		 option2.fullScreenMode();
		 option2.openURL();
		 option2.closeBrowser();
		 option2.navigateBack();
	}

}
