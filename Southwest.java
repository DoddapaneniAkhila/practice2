package doddapaneni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Southwest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Akhila/Desktop/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.southwest.com/");
		 Driver.findElement(By.xpath("//*[@id='air-city-departure']")).sendKeys("DFW");
		 Driver.findElement(By.xpath("//*[@id='air-city-arrival']")).sendKeys("ATL");
		 Driver.findElement(By.xpath("//*[@id='booking-form--flight-panel']/div[2]/div[2]/div[1]/a/span[1]")).click();
		 Driver.findElement(By.xpath("//*[@id='air-date-departure']")).click();
		 Driver.findElement(By.xpath("//*[@id='air-date-return']")).click();
		 Driver.findElement(By.xpath("//*[@id='jb-booking-form-submit-button']")).click();
		 Driver.findElement(By.xpath("//*[@id='Out1C']")).click();
		 Driver.findElement(By.xpath("//*[@id='In1C']")).click();
		 Driver.findElement(By.xpath("//*[@id='priceItinerarySubmit']")).click();
		 Driver.findElement(By.xpath("//*[@id='priceSubmitButton']")).click();
		 
		 
		 }

}
