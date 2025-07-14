package week2.day1;

public class Browser {
	public String lanuchBrowser(String browserName) {
		System.out.println(browserName+" " +"Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser name = new Browser();
		String browserName=name.lanuchBrowser("chrome");
		name.loadUrl();
		
	}

}
