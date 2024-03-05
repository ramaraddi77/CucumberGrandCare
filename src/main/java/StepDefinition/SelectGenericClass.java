package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectGenericClass
{
	public static Select selectgenericmethod(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}
	public static void selectbyindex(WebElement ele,int index)
	{
		selectgenericmethod(ele).selectByIndex(1);
	}
}
