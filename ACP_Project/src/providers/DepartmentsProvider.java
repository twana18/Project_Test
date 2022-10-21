package providers;

import Enums.SchoolStudyType;
import university_information.Department;

import java.util.HashMap;

public class DepartmentsProvider {
    public static HashMap<String, Department> DEPARTMENTSforZansty = new HashMap<String, Department>();
    public static HashMap<String, Department> DEPARTMENTSforWezhaiy = new HashMap<String, Department>();
    public static HashMap<String, Department> DEPARTMENTSforAyny = new HashMap<String, Department>();

    public static void addTest(String collegeID, Department department){
        DEPARTMENTSforZansty.put("col_1", new Department("dept_1", "Software",
                SchoolStudyType.Zansty, 40));
        DEPARTMENTSforZansty.put("col_2", new Department("dept_2","Chemistry",
                SchoolStudyType.Zansty, 60));
        DEPARTMENTSforZansty.put(collegeID, department);
    }
    
}
