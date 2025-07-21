package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("The Incognito tab opened sucessfully");
	}
	
	public void clearCache() {
		System.out.println("The Cache cleared sucessfully");
	}
	
	public static void main(String[] args) {
		Chrome options = new Chrome();
		options.openIncognito();
		options.clearCache();
		options.openURL();
		options.closeBrowser();
		options.navigateBack();
		
	}

}
