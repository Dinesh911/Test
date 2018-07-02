package testPkg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dineshr\\Desktop\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://store.demoqa.com/");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul/li"));
		
		System.out.println("List1::: ");
		for(WebElement lst: list)
		{
			System.out.println(lst.getText());
		}
		
		System.out.println("List2::: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("List3::: ");
		ListIterator<WebElement> listIter= list.listIterator();
		
		while(listIter.hasNext())
		{
			System.out.println(listIter.next().getText());
		}
		
		System.out.println("List 4::: ");
		Iterator<WebElement> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().getText());
		}
		
		//Set
		
		Set<String> str=new HashSet<String>();
		str.add("hello");
		str.add("hi");
		str.add("world");
			
		Iterator<String> setIter=str.iterator();
		while(setIter.hasNext())
		{
			System.out.println(setIter.next());
		}
	}

}





