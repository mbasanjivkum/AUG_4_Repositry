package KKKK;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class tngg 
{
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  System.out.println("Hello");
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
