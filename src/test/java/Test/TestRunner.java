package Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		
		features=("Features"),
		glue = {"StepDefination.java"}
		)


public class TestRunner {

	//Please add All Step defination scenarios and then excute 
	
	
}
