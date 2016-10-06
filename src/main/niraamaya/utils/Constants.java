package niraamaya.utils;


public interface Constants {

    String APP_DIRECTORY = System.getProperty("user.dir");


    interface Paths {
        String STUDENT_DETAILS_PATH = APP_DIRECTORY+"/src/main/niraamaya/database/Student_Details/";
        String LOGIN_DETAILS_PATH = APP_DIRECTORY+"/src/main/niraamaya/database/Login_Details/";

    }

    interface FileNames {
        String VALID_STUDENT_DETAILS = Paths.STUDENT_DETAILS_PATH+"ValidDetails.json";
        String INVALID_STUDENT_DETAILS = Paths.STUDENT_DETAILS_PATH+"InvalidDetails.json";
        String VALID_LOGIN_DETAILS = Paths.LOGIN_DETAILS_PATH+"LoginDetails.json";
    }
}
