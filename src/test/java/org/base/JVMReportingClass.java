package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportingClass {
	public static void jvmReporter(String json) {
		File file = new File("D:\\Users\\gnanas\\eclipse-workspace\\CucumberPractice\\target");
		Configuration configuration = new Configuration(file, "CucumberPractice");
		configuration.addClassifications("Browser-type", "Chrome");
		configuration.addClassifications("Platform", "Windows 10");
		configuration.addClassifications("Sprint No", "25");
		configuration.addClassifications("Environment", "QA");
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
	}

}
