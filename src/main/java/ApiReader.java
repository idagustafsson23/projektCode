

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.stream.*;

public class ApiReader {
	private String file;
	public ApiReader() {
	}
	
	public void readXml() {
		try {
		
			InputStream inputStream = new FileInputStream(this.file);
			inputStream.close();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}
}
