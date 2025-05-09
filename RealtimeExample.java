package StreamApi;

import javax.net.ssl.ManagerFactoryParameters;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;

    }
}
public class RealtimeExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        System.out.println("================================================");
        //1///grouping input elements and count no of male and female.
        Map<String ,Long> noOfMF=employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getGender(),Collectors.counting()));
        System.out.println("no of male and female= "+noOfMF);

        //2.print all department list.
        System.out.println("================================================");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(e-> System.out.println("List of unique name of department " +e));

        System.out.println("================================================");
      Map<String,Double> avg= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avg);

//        double age=employeeList.stream().collect(Collectors.averagingInt(emp->emp.getAge()));//Employee::getAge
//        System.out.println(avg);
        System.out.println("================================================");
        Optional<Employee> gettingHighestSalary=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee gettingInfo=gettingHighestSalary.get();
        System.out.println("details of highest paid employee");
        System.out.println("ID : "+gettingInfo.getId());

        System.out.println("Name : "+gettingInfo.getName());

        System.out.println("Age : "+gettingInfo.getAge());

        System.out.println("Gender : "+gettingInfo.getGender());

        System.out.println("Department : "+gettingInfo.getDepartment());

        System.out.println("Year Of Joining : "+gettingInfo.getYearOfJoining());

        System.out.println("Salary : "+gettingInfo.getSalary());

        System.out.println("================================================");

        System.out.println("Employee Name Which have salary greater than 2015");
        employeeList.stream()
                .filter(e->e.getYearOfJoining()>2015)
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("================================================");

        Optional<Employee> countingYoungestEmployee=employeeList.stream()
                .filter(e->e.getGender()=="Male" && e.getDepartment()== "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));
        //System.out.println(countingYoungestEmployee);
        Employee gettingDataOfEmployee=countingYoungestEmployee.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+gettingDataOfEmployee.getId());

        System.out.println("Name : "+gettingDataOfEmployee.getName());

        System.out.println("Age : "+gettingDataOfEmployee.getAge());

        System.out.println("Year Of Joining : "+gettingDataOfEmployee.getYearOfJoining());

        System.out.println("Salary : "+gettingDataOfEmployee.getSalary());
        System.out.println("================================================");

        Optional<Employee> experience=employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst();
        Employee gettingHighestExperience=experience.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+gettingHighestExperience.getId());

        System.out.println("Name : "+gettingHighestExperience.getName());

        System.out.println("Age : "+gettingHighestExperience.getAge());

        System.out.println("Year Of Joining : "+gettingHighestExperience.getYearOfJoining());

        System.out.println("Salary : "+gettingHighestExperience.getSalary());

        System.out.println("=============================================");

        Map<String,Double> averageSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(" the average salary of each department "+averageSalary);

        System.out.println("=============================================");

        Map<String,Long> ListEmployee=employeeList.stream().filter(e->e.getDepartment()== "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("the no of male and female present in sales and marketing department "+ListEmployee);

        System.out.println("=============================================");

        Map<String,Double> employeeSalaryAvg=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("What is the average salary of male and female employees "+employeeSalaryAvg);

        System.out.println("=============================================");

        Map<String, List<Employee>> employeeListByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("----"+employeeListByDepartment);
    }
}