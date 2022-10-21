package providers;

import Enums.SchoolStudyType;
import university_information.College;
import university_information.Department;

import java.util.HashMap;
import java.util.List;

public class DepartmentsProvider {
    public static HashMap<String, Department> DEPARTMENTSforZansty = new HashMap<String, Department>();
    public static HashMap<String, Department> DEPARTMENTSforWezhaiy = new HashMap<String, Department>();
    public static HashMap<String, Department> DEPARTMENTSforAyny = new HashMap<String, Department>();

    public static void addDepartment(String collegeID, String deptID, String deptName, SchoolStudyType type, int deptCapacity){
        DEPARTMENTSforZansty.put("col_1", new Department("dept_1", "Software",
                SchoolStudyType.Zansty, 40));
        DEPARTMENTSforZansty.put("col_2", new Department("dept_2","Chemistry",
                SchoolStudyType.Zansty, 60));
        DEPARTMENTSforZansty.put(collegeID, new Department(deptID, deptName,type,deptCapacity));
    }

    private static Department getDepartment(String deptID, List<Department> departments){
        final Department[] dept = new Department[1];
        departments.forEach(department -> {
            if(department.departmentId() == deptID){
                dept[0] = department;
            }
        });
        return dept[0];
    }

    public static void removeDepartment(String collegeID, String deptID, SchoolStudyType type){
        try {
            if (type == SchoolStudyType.Zansty){
                DEPARTMENTSforZansty.remove(collegeID, getDepartment(deptID, DEPARTMENTSforZansty.values().stream().toList()));
            }if (type == SchoolStudyType.Wezhaiy){
                DEPARTMENTSforWezhaiy.remove(collegeID, getDepartment(deptID, DEPARTMENTSforZansty.values().stream().toList()));
            }if (type == SchoolStudyType.Ayny){
                DEPARTMENTSforAyny.remove(collegeID, getDepartment(deptID, DEPARTMENTSforZansty.values().stream().toList()));
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Not found any College");
        }
    }
    
}
