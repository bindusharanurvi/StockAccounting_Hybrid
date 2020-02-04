package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil  {

	public static String getValueForKey(String Key)throws Exception{
	Properties pr = new Properties();
	FileInputStream fis = new FileInputStream("D:\\bindukworkspace\\StockAccounting_Hybrid\\PropertiesFile\\Environment.properties");
	pr.load(fis);
	return pr.getProperty(Key);
	}
}

