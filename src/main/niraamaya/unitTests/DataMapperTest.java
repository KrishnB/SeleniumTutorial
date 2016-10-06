package niraamaya.unitTests;



import niraamaya.entities.Credentials;
import niraamaya.entities.StudentDetails;
import niraamaya.utils.Constants;
import niraamaya.utils.DataMapper;
import com.sun.tools.javac.code.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;


public class DataMapperTest {


    @Test
    public void studentDetailsTest() throws FileNotFoundException {

        DataMapper dataMapper = new DataMapper();
        StudentDetails studentDetails = dataMapper.map(Constants.FileNames.VALID_STUDENT_DETAILS, StudentDetails.class);

        Assert.assertEquals(studentDetails.getFirstName(),"Arun");


    }


    @Test
    public void loginDetailsTest() throws FileNotFoundException {

        DataMapper dataMapper = new DataMapper();
        Credentials credentials = dataMapper.map(Constants.FileNames.VALID_LOGIN_DETAILS, Credentials.class);

        Assert.assertEquals(credentials.getUsername(),"krisnanandb@gmail.com");


    }
}
