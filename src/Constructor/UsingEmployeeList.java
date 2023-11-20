package Constructor;
import java.util.*;

public class UsingEmployeeList {

    public static void main(String[] args) {

        EmployeeList sdet1 = new EmployeeList("sdet01", "SDET", 5, 90_000);
        EmployeeList sdet2 = new EmployeeList("sdet02", "SDET", 7, 110_000);
        EmployeeList dev1 = new EmployeeList("DevJ01", "Junior Developer", 5, 99_000);
        EmployeeList dev2 = new EmployeeList("DevJ02", "Junior Developer", 7, 105_000);
        EmployeeList dev3 = new EmployeeList("DevJ03", "Senior Developer", 9, 125_000);
        EmployeeList dev4 = new EmployeeList("DevJ04", "Lead Developer", 15, 155_000);

        ArrayList<EmployeeList> empList = new ArrayList<>(Arrays.asList(sdet1, sdet2, dev1, dev2, dev3, dev4));
        ArrayList<EmployeeList> sdetList = new ArrayList<>();
        ArrayList<EmployeeList> devList = new ArrayList<>();
        ArrayList<EmployeeList> richSdet = new ArrayList<>();
        ArrayList<EmployeeList> richDev = new ArrayList<>();

        for (EmployeeList each : empList) {
            if (each.position.equals("SDET")) {
                sdetList.add(each);
            } else {
                devList.add(each);
            }
        }
        for (EmployeeList whoop : sdetList) {
            if (whoop.salary > 100_000) {
                richSdet.add(whoop);
            }
        }

        for (EmployeeList whoop2 : devList) {
            if (whoop2.salary > 100_000) {
                richDev.add(whoop2);
            }
        }
        System.out.println("SDET Team = " + sdetList);
        System.out.println();
        System.out.println("DEV Team = " + devList);
        System.out.println();
        System.out.println("High Salary SDET:  " + richSdet);
        System.out.println();
        System.out.println("High Salary Developer " + richDev);

    }


}
