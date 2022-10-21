package providers;

import university_information.University;

import java.util.HashMap;
import java.util.List;

public class UniversitiesProvider {
    public static HashMap<String, University> UNIVERSITIES = new HashMap<String, University>();

    public static void addUnversity(String location, String universityID, String universityName){
        UNIVERSITIES.put("un_1", new University("un_1", "Salahaddin", "Hawler"));
        UNIVERSITIES.put("un_2", new University("un_2", "Hwlery Pzishky", "Hawler"));
        UNIVERSITIES.put("un_3", new University("un_3", "PolyTechnique", "Hawler"));
        UNIVERSITIES.put(universityID, new University(universityID, universityName, location));
    }

    private static University getUniversity(String universityID){
        final University[] un = new University[1];
        UNIVERSITIES.values().stream().toList().forEach(university -> {
            if(university.id() == universityID){
                un[0] = university;
            }
        });
        return un[0];
    }

    public static void removeUniversity(String location, String universityID){
        try {
            UNIVERSITIES.remove(location, getUniversity(universityID));
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Not found any University");
        }
    }
}
