import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Calendar myTime = Calendar.getInstance();
        System.out.println(myTime.get(Calendar.DAY_OF_YEAR) - 2);
    }

    static void sortByAge() {
        List<Employee> employeeList = createEmployeeList();
        employeeList.sort((e1, e2) -> e1.getAge() - e2.getAge());
        employeeList.forEach(System.out::println);

    }

    static void groupByName() {
        List<Employee> employeeList = createEmployeeList();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(employeeList);
    }

    static void reverseStr() {
        String result = "Sumanth is poor!";
        String[] splits = result.split("");

        for (int i = splits.length - 1; i >= 0; i--) {
            System.out.println(splits[i]);
        }
    }

    static void streamFoo() {
        String result = "Sumanth is poor!";
        List<String> chops = Arrays.stream(result.split("")).collect(Collectors.toList());

        Optional.ofNullable(result).ifPresent(r -> {
            System.out.println(r.toUpperCase());
        });

        chops.stream().map((c) -> c.toUpperCase()).forEach(w -> {
            System.out.println(w);
        });

    }

    static void mapTest() {
        Map<String, Integer> map = Map.of("key1", 4, "key2", 8);
        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    static void empCount() {
        List<Employee> employeeList = createEmployeeList();
        System.out.println(employeeList.stream().filter((e) -> e.getAge() > 25).count());
    }

    static void whoseMary() {
        List<Employee> employeeList = createEmployeeList();
        System.out.println(employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("Mary")).findFirst());
    }

    static void maxAge() {
        List<Employee> employeeList = createEmployeeList();
        System.out.println(employeeList.stream().mapToInt(Employee::getAge).max());
    }

    public static void switchCasePrimer(){
        int caseIndex = 0;
        switch (caseIndex) {
            case 0:
            System.out.println("ZERO");
            case 1:
            System.out.println("ZERO");
            break;
            case 2:
            System.out.println("ZERO");

        }

    }

    public static List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("John", 21);
        Employee e2 = new Employee("Martin", 19);
        Employee e3 = new Employee("Mary", 31);
        Employee e4 = new Employee("Stephan", 18);
        Employee e5 = new Employee("Gary", 26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

    private static void do_something(int i){
        System.err.println("In: " + i);
    }
}
