import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyRelativeXpath 
{
	
	List<WebElement>row,columns;
	
	@Test
	public void ShowRelativeXpath()
	{
		System.setProperty("webdriver.chrome.driver", "e:\\Browsers\\Latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		row=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[6]"));
		
		
	
		for(int i=0;i<row.size();i++)
		{
			columns= row.get(i).findElements(By.tagName("td"));
			
			
			
			for(int j=0;j<columns.size();j++)
			{
				WebElement element=row.get(i).findElement(By.xpath("//table[@id='customers']//tbody/tr["+(i+6)+"]//td["+(j+1)+"]"));
				System.out.println(element.getText());
			}
			
			   
		}
		
	}

}
