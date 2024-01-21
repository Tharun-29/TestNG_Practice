package test;



import org.testng.annotations.Test;

public class secondPractice {
  
	//Second Test Class to Understand about TestNG XMl Config
  
	@Test(enabled = true)
	public void goodMorning(){
		System.out.println("Hello Good Morning !");
	}
	
	@Test(groups = "Reg",dependsOnMethods = "goodNight")
	public void goodAfternoon() {
		System.out.println("Hello Good Afternoon !");
	}
	
	@Test(dependsOnMethods ="goodMorning")
	public void goodNight() {
		System.out.println("Hello Good Night");
		assert(false);
	}
}
