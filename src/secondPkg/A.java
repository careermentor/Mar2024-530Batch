package secondPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public void a1()
	{
		System.out.println("this is test");
		
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.cssSelector("[type='text']"));
		
	}
	
	public static void main(String[] args) {
		A b = new A();
		b.a1();
	}

}
