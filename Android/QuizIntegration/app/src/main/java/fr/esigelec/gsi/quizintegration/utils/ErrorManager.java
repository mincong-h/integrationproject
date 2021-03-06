package fr.esigelec.gsi.quizintegration.utils;

/**
 * Created by Kevin-Giroux on 13/01/2016. ${PACKAGE_NAME} for the project QuizIntegration
 */
public class ErrorManager {

    public enum ERROR{
        DO_GET_FORBIDDEN,
        USER_NOT_FOUND,
        PASS_INCORRECT,
        MISSING_ARG,
        DB_INSERT_FAIL,
        QUIZ_NOT_FOUND,
        CHOICE_SAVE,
        INCORRECT_VALUE,
        BAD_REQUEST,
        NOTHING
    }


    public ErrorManager(){

    }

    private ERROR getError(int errorCode){
        switch(errorCode){
            case 1 :
                return ERROR.DO_GET_FORBIDDEN;
            case 2 :
                return ERROR.USER_NOT_FOUND;
            case 3 :
                return ERROR.PASS_INCORRECT;
            case 4 :
                return ERROR.MISSING_ARG;
            case 5 :
                return ERROR.DB_INSERT_FAIL;
            case 6 :
                return ERROR.QUIZ_NOT_FOUND;
            case 7 :
                return ERROR.CHOICE_SAVE;
            case 8 :
                return ERROR.INCORRECT_VALUE;
            case 9 :
                return ERROR.BAD_REQUEST;
            default :
                return ERROR.NOTHING;
        }
    }

    public String errorManager(int errorCode){
        ERROR error = getError(errorCode);
        switch (error){
            case DO_GET_FORBIDDEN :
                return "GET METHOD NOT ALLOWED";
            case USER_NOT_FOUND :
                return "USER NOT FOUND";
            case PASS_INCORRECT :
                return "PASSWORD INCORRECT";
            case MISSING_ARG :
                return "MISSING ARG";
            case DB_INSERT_FAIL :
                return "INSERT DB FAIL";
            case QUIZ_NOT_FOUND :
                return "QUIZ NOT FOUND";
            case CHOICE_SAVE :
                return "CHOICE SAVE";
            case INCORRECT_VALUE:
                return "AN ERROR OCCURED";
            case BAD_REQUEST:
                return "AN ERROR OCCURED";
            default :
                return "NOTHING";
        }
    }
}
