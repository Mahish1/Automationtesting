package karateframe;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class cucumberparalle {
	
	
     public  void rateReport(String karateOutputPath) {
    	 File report=new File(karateOutputPath);
    	 Collection<File> jsoncollection = FileUtils.listFiles(report, new String[] {"json"}, true);
    	 List<String>  jsonFileS = new ArrayList<String>();
    	 jsoncollection.forEach(file -> jsonFileS.add(file.getAbsolutePath()));
    	 Configuration config = new Configuration(report, "karate");
    	 ReportBuilder reportBuilder = new ReportBuilder(jsonFileS, config);
    	 reportBuilder.generateReports();

}
     @Test
     void testParallel() {
         Results results = Runner.path("classpath:karateframe").tags("~@ignore").parallel(5);
         rateReport(results.getReportDir());
     } 
}
