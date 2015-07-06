mport java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
//import java.util.HashSet;
import java.util.List;
import java.util.Map;
//import java.util.Random;


import com.google.common.collect.ImmutableMap;
//import com.google.gwt.thirdparty.guava.common.collect.ImmutableMap;

public class Constants { 
	//GH Dataset:
    public static final String DATASET_DIRECTORY_GH_MySQL = "C:\\2-Study\\Influentials\\Data Set\\MySQL-20150401\\SQL";
    public static final String DATASET_EXTERNAL_DIRECTORY_GH_MySQL = "E:\\Influentials\\DataSet\\MySQL-20150401\\SQL";
    public static final String DATASET_DIRECTORY_GH_TSV = "C:\\2-Study\\Influentials\\Data Set\\MySQL-20150401\\TSV";
    public static final String DATASET_EXTERNAL_DIRECTORY_GH_TSV = "E:\\Influentials\\DataSet\\MySQL-20150401\\TSV";
    

		double a = 0.0000004;
		System.out.println(highPrecisionFloatFormatter.format(0.0000004));
		System.out.println(Constants.highPrecisionFloatFormatter.format(a));
	}

}
//Iterating:
//	for (Map.Entry<String, List<String>> entry : Constants.USEFUL_FIELDS_IN_JSON_FILES.entrySet())
//		System.out.println(entry.getKey() + "    ------>    " + entry.getValue());

