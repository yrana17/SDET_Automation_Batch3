package casestudy1;

import java.util.ArrayList;
import java.util.HashMap;

public class TestDataOrganization {

	public static HashMap<String, String> hmInput;

	private static final String strUserIdKey = "UserName";
	private static String strUserIdValue;
	private static final String strPasswordKey = "Password";
	private static String strPasswordValue;
	private static final String strFilePathKey = "Organization_FilePath";
	private static String strFilePathValue;
	private static final String strCityNameKey = "City_Name";
	private static String strCityNameValue;

	private static final String strOrganizationExcelInputFilePath = "src/main/resources/TestDataOrganization.xlsx";
	private static final String strCredentialsSheetName = "Credentials";
	private static final String strOrgLocationSheetName = "Organization-Locations";
	private static final String strOrgGeneralSheetName = "Organization-General";

	public static ArrayList<HashMap<String, String>> listLocationTableDataUI;
	
	public static String getStrCityNameValue() {
		return strCityNameValue;
	}

	public static void setStrCityNameValue(String strCityNameValue) {
		TestDataOrganization.strCityNameValue = strCityNameValue;
	}

	public static String getStrcitynamekey() {
		return strCityNameKey;
	}

	private static final String strOrgLocationJsonFilePath = "src/main/resources/JsonDataOrganization.json";

	public static String getStrorglocationjsonfilepath() {
		return strOrgLocationJsonFilePath;
	}

	public static String getStrUserIdValue() {
		return strUserIdValue;
	}

	public static void setStrUserIdValue(String strUserIdValue) {
		TestDataOrganization.strUserIdValue = strUserIdValue;
	}

	public static String getStrPasswordValue() {
		return strPasswordValue;
	}

	public static void setStrPasswordValue(String strPasswordValue) {
		TestDataOrganization.strPasswordValue = strPasswordValue;
	}

	public static String getStrFilePathValue() {
		return strFilePathValue;
	}

	public static void setStrFilePathValue(String strFilePathValue) {
		TestDataOrganization.strFilePathValue = strFilePathValue;
	}

	public static String getStruseridkey() {
		return strUserIdKey;
	}

	public static String getStrpasswordkey() {
		return strPasswordKey;
	}

	public static String getStrfilepathkey() {
		return strFilePathKey;
	}

	public static String getStrorganizationexcelinputfilepath() {
		return strOrganizationExcelInputFilePath;
	}

	public static String getStrcredentialssheetname() {
		return strCredentialsSheetName;
	}

	public static String getStrorglocationsheetname() {
		return strOrgLocationSheetName;
	}

	public static String getStrorggeneralsheetname() {
		return strOrgGeneralSheetName;
	}

}
