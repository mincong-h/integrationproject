package fr.esigelec.quiz.util;

import org.json.JSONObject;

public class AndroidHelper {
	// KEY
	private static final String KEY_ERR_CODE = "err_code";
	private static final String KEY_ERR_MSG = "err_msg";
	
	// ERROR CODE
	private static final int DO_GET_FORBIDDEN = 1;
	private static final int USER_NOT_FOUND = 2;
	private static final int PASS_INCORRECT = 3;
	private static final int MISSING_ARG = 4;
	private static final int DB_INSERT_FAIL = 5;
	private static final int QUIZ_NOT_FOUND = 6;
	private static final int TIME_OUT = 7;
	
	//SUCCESS CODE 
	private static final int CHOICE_SAVE = -1;
	
	public static JSONObject DoGetForbiddenException() {
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE, DO_GET_FORBIDDEN);
		json.put(KEY_ERR_MSG, "Please use POST method.");
		return json;
	}
	
	public static JSONObject UserNotFoundException() {
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE, USER_NOT_FOUND);
		json.put(KEY_ERR_MSG, "User not found.");
		return json;
	}
	
	public static JSONObject PassIncorrectException() {
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE, PASS_INCORRECT);
		json.put(KEY_ERR_MSG, "User found but your password is wrong.");
		return json;
	}
	
	public static JSONObject MissingArgException() {
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE, MISSING_ARG);
		json.put(KEY_ERR_MSG, "Argument(s) missing. We didn't get enough arguments (parameters) to complete your request.");
		return json;
	}
	
	public static JSONObject DatabaseInsertFail(){
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE,DB_INSERT_FAIL);
		json.put(KEY_ERR_MSG, "Fail to insert data into database");
		return json;
	}
	
	public static JSONObject QuizNotFoundExeception(){
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE,QUIZ_NOT_FOUND);
		json.put(KEY_ERR_MSG, "Quizz not found.");
		return json;
	}
	
	public static JSONObject TimeOutExeception(){
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE,TIME_OUT);
		json.put(KEY_ERR_MSG, "Time out connection.");
		return json;
	}
	
	
	public static JSONObject ChoiceSaveSuccess(){
		JSONObject json = new JSONObject();
		json.put(KEY_ERR_CODE,CHOICE_SAVE);
		json.put(KEY_ERR_MSG, "choice correctly save into database");
		return json;
	}
}
