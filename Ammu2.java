package doddapaneni;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ammu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Akhila/Desktop/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.southwest.com/");
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a[1]")).click();
	    Driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("amanichowdary28");
	    Driver.findElement(By.xpath("//*[@id='password']")).sendKeys("amaniamani@");
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/input")).click();
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[2]/a")).click();
	    Driver.findElement(By.xpath("//*[@id='needPassword_firstName']")).sendKeys("Amani");
	    Driver.findElement(By.xpath("//*[@id='needPassword_lastName']")).sendKeys("doddapaneni");
	    Driver.findElement(By.xpath("//*[@id='needPassword_emailAddress']")).sendKeys("amanichowdary28@gmail.com");
	    Driver.findElement(By.xpath("//*[@id='needPassword_submit']")).click();
	    
	    
	    
	    
	}
}
