package DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestData 
{
public List getColData(String colNum,int colIndex)
{
	String str="//th[text()='"+colNum+"']/../../tr[*]/td["+colIndex+"]";
	List<WebElement> lst=CommonLib.driver.findElements(By.xpath(str));
	return lst;
}

}

