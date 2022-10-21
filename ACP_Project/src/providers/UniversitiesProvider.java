package providers;

import university_information.University;

import java.util.HashMap;

public class UniversitiesProvider {
    public static HashMap<String, University> UNIVERSITIES = new HashMap<String, University>();

    public static void addTest(String location, University university){
        UNIVERSITIES.put("Hawler", new University("un_1", "Salahaddin"));
        UNIVERSITIES.put("Hawler", new University("un_2", "Hwlery Pzishky"));
        UNIVERSITIES.put("Sulaimany", new University("un_3", "PolyTechnique"));
        UNIVERSITIES.put(location, university);
    }
}
