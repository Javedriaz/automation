package Training.Automation;

import org.testng.annotations.Test;

public class Group {
@Test(groups= {"Function"})

  public void test1() {
	System.out.println("This belong function");
  }
@Test(groups= {"Regression","Sdanit"})
	
public void test2() {
	System.out.println("This is belong Regressionand Sdanit");
	
}
@Test(groups= {"Regression"})
public void  test3() {
	System.out.println("This is Regression");
}
@Test (groups= {"Sdanit"})
public void test4() {
	System.out.println("This is Sdanit");
}
}
