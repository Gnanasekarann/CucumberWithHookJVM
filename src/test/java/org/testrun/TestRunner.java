package org.testrun;

import org.base.JVMReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},
tags= "@Login",
glue= {"org.stepdef"}, 
dryRun=true, 
plugin= {"pretty", "html:target/webreport", "json:target/report.json"}, 
monochrome=true, snippets=SnippetType.CAMELCASE)

public class TestRunner {
	
	System.out.println("Completed");
		System.out.println("By Gnanasekaran");
	
@AfterClass
public static void report() {
	JVMReportingClass.jvmReporter("D:\\Users\\gnanas\\eclipse-workspace\\CucumberPractice\\target\\report.json");
	


}

}
