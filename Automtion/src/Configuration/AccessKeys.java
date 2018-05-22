package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AccessKeys {
	Properties prop;

	 AccessKeys() throws Exception
	 {
		File src = new File("./Configuration/PropertyFile.properties");
		FileInputStream fis = new FileInputStream(src);
	
		prop = new Properties();
		prop.load(fis);
	}
	public String getDriver()
	{
		String driver =prop.getProperty("driver");
		return driver;
	}
	public String getURL()
	{
		String url =prop.getProperty("url");
		return url;
	}
}
