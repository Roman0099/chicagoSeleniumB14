package framework;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test1() throws IOException {
     //  1 Create the path of the file
        String path = "test.properties";



//   properties object
        Properties properties = new Properties();
//        3)Open the file using FileInputStream
        FileInputStream file = new FileInputStream(path);
//        4) Load the properties file into the properties object
        properties.load(file);
//        5)Read the values using getProperty() method
        System.out.println("name");
        System.out.println("username");
        System.out.println("password");
    }


}
