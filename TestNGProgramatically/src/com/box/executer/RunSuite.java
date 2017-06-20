/**
Script Name:		RunSuite
Author Name:		QASource
Test Case ID:		 -
Script Scenario:	This class is used to execute whole framework step by step from start to create report.
 **/
//Declaration of executor package.
package com.box.executer;

//Required imports
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;

//RunSuite (in box.com)  class 
public class RunSuite {

	public static List<String> testSuites = new ArrayList<String>();
	private final static Class<?>[] TEST_CLASSES = new Class[]{};
	ArrayList<String> suiteNameArray = new ArrayList<String>();
	public static boolean reExecution = false;
	String reExecutedString="", suite="";
	//start time for framework to start executing 
	public static final long frameworkStartTime = System.currentTimeMillis();

	/**
	 * Main Function to run framework.
	 * First, it deletes screenshot folder if present by calling execShellCmd function.
	 * Then, it deletes testng-failed.xml if present by calling execShellCmd function.
	 * Then, it verifies whether config directory is present or not.
	 * Then, it load config properties file by calling loadProperties function.
	 * Then, it loads testsuite list by calling returnSuites function. 
	 * Then, each suite is run one by one with its failed cases re-executed.
	 * Then at last, HTML report is generated.
	 **/
	public static void main(String args[]) throws IOException{ 
		

		RunSuite run = new RunSuite();

		File configDir = new File("testngSuites");
		run.returnSuites();
			
			File[] testSuiteFiles = configDir.listFiles();
			
			if(testSuites.size()>0)
				testSuites.removeAll(testSuites);
			
			for(String name:run.suiteNameArray){
				File testFile = new File("testngSuites\\"+name+".xml");
					
				testSuites.add(testFile.getAbsolutePath());
			}
			run.runTestngSuite(testSuites);
			
			
			
//			for(String name:run.suiteNameArray){
////				String directory = System.getProperty("user.dir");
//				File testFile = new File("testngSuites\\"+name+".xml");
//				for (File file : testSuiteFiles){
//					String fileName = file.getName();
//					System.out.println(fileName);
////					FrameworkUtilities.reExecutionString="";
//					if (file.equals(testFile) && file.isFile() && fileName.endsWith(".xml")) {
//						if(testSuites.size()>0)
//							testSuites.removeAll(testSuites);
//							
//						testSuites.add(testFile.getAbsolutePath());
//						
//							run.runTestngSuite(testSuites);
//					}
//				}
//			}

	}
	/**
	 * Function to load the test-suites list.
	 * It gets the property "suite" from config.properties.
	 * If suite-name contains "," then it splits into separate names.
	 * After adding names in the list, the list is returned. 
	 **/
	public void returnSuites(){
		suite = "testng1,testng2";          // {testng1 testng2}
		if(suite.indexOf(",")>0){
			suiteNameArray.addAll(Arrays.asList(suite.split(",")));
		}
		else{
			suiteNameArray.add(suite);
		}
	}
	
	/**
	 * Function to run testng test-suites.
	 * suites added in test suites list are executed one  by one.
	 * Results are saved in "TestResults" folder. 
	 **/
	public void runTestngSuite(List<String> suites){
		TestNG testng = new TestNG();
		testng.setVerbose(0);
		if (suites != null && !suites.isEmpty()) {
			System.out.println(suites);

			testng.setTestSuites(suites);
//			TEST_CLASSES[0] = BoxLoginLogoutParameterised.class;
//			testng.setTestClasses(TEST_CLASSES);
//			XmlClass c1 = new XmlClass();
//			c1.setClass(BoxLoginLogoutParameterised.class);
			

		} else {
			testng.setDefaultSuiteName("Suite");          
			testng.setTestClasses(TEST_CLASSES);
		}
//		TestListenerAdapter tla = new TestListenerAdapter();
//
//		testng.addListener(tla);

//		testng.setParallel("classes");
//		testng.setOutputDirectory("TestResults" + File.separatorChar +"test-reports");
		System.out.println("------------------------------------");
		testng.run();
	}

}
