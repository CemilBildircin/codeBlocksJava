package Custom_Classes;

public class UseEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan Ivankovich",
                "Teacher");
        employee1.salary = 89000 ;
        employee1.id = "IvIv987321";
//        System.out.println(employee1);

        System.out.println("---------");
        Employee employee2 = new Employee("Divan Divanovich",
                "DD123789", "Chef",99000);
//        System.out.println(employee2);
        System.out.println(employee2);

        employee2.goToMeeting();

    }
}
