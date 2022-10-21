package providers;

import university_information.College;

import java.util.HashMap;

public class CollegesProvider {
    public static HashMap<String, College> COLLEGES = new HashMap<String, College>();

    public static void addTest(String universityID, College college){
        COLLEGES.put("un_1", new College("col_1", "Engineering"));
        COLLEGES.put("un_1", new College("col_2", "Science"));
        COLLEGES.put(universityID, college);
    }
}
