package doddapaneni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Akhila/Desktop/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.navigate().to("http://www.ebay.com/");
		Driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys("Electronics");
		Driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
		Driver.findElement(By.xpath(".//*[@id='item465403ed14']/h3/a")).click();
		Driver.findElement(By.xpath(".//*[@id='isCartBtn_btn']")).click();
	    Driver.findElement(By.xpath(".//*[@id='ptcBtnBottom']")).click();
	    
		
	}

}
