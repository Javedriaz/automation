package Training.Automation;

import org.testng.annotations.Test;

import Combo.Super_Class;
import PageClassesMethods.Home;
import PageClassesMethods.Orders;

public class Amazon_2 extends Super_Class {
  @Test
  public void f() {
	  Orders R=new Orders(driver);
	  R.orderclick();
	  R.EmailFieldKeys();
	  R.Continue();
	  R.passfieldkeys();
	  R.Signin();
  }
}
