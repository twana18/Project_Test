package providers;

import university_information.College;

import java.util.HashMap;

public class CollegesProvider {
    public static HashMap<String, College> COLLEGES = new HashMap<String, College>();

    public static void addCollege(String universityID, String collegeID, String collegeName){
        COLLEGES.put("un_1", new College("col_1", "Engineering"));
        COLLEGES.put("un_1", new College("col_2", "Science"));
        COLLEGES.put(universityID, new College(collegeID,collegeName));
    }

    private static College getCollege(String collegeID){
        final College[] col = new College[1];
        COLLEGES.values().stream().toList().forEach(college -> {
            if(college.id() == collegeID){
                col[0] = college;
            }
        });
        return col[0];
    }

    public static void removeCollege(String universityID, String collegeID){
        try {
            COLLEGES.remove(universityID, getCollege(collegeID));
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Not found any College");
        }
    }
}
