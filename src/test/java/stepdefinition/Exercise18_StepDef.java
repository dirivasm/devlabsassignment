package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Exercise18_StepDef {

	@Given("Some random text for scenario A")
	public void some_random_text_for_scenario_a() {
	    System.out.println("SCENARIO A");
	}

	@Given("Some random text for scenario B")
	public void some_random_text_for_scenario_b() {
		  System.out.println("SCENARIO B");
	}

	@Given("Some random text for scenario C")
	public void some_random_text_for_scenario_c() {
		  System.out.println("SCENARIO C");
	}

	@Given("Some random text for scenario D")
	public void some_random_text_for_scenario_d() {
		  System.out.println("SCENARIO D");
	}
	
	@Then("print text")
	public void print_text() {
		  System.out.println("Print Text");
	}
	
}
