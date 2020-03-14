package BaseClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
public static void generatejvmreport(String jsonFile) {
	
File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
Configuration con=new Configuration(loc,"Adactin Automation");
con.addClassifications("OS", "Windows 10");
con.addClassifications("Browser name", "Chrome");
con.addClassifications("Version", "1.4.65");
con.addClassifications("Tester name", "marcellin");
con.addClassifications("Sprint", "20");
List<String>l=new ArrayList<String>();
l.add(jsonFile);
ReportBuilder builder=new ReportBuilder(l,con);
builder.generateReports();

}
}
