package doddapaneni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Akhila/Desktop/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.navigate().to("https://www.facebook.com/");
		Driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("amanichowdary28@gmail.com");
		Driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Amaniamani@");
		Driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	    Driver.findElement(By.xpath(".//*[@id='loginform']/div[3]/a")).click();
	    
	}
}

