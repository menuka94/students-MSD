import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student.Address permanentAddress = new Student.Address("No1","Street 1", "Lane 1", "City 1", "Country 1", "81000");
        Student.Address currentAddress = new Student.Address("No2","Street 2", "Lane 2", "City 2", "Country 1", "81000");
        Student.Address diplomaAddress = new Student.Address("No3","Street 3", "Lane 3", "City 3", "Country 1", "81000");

        Student.PhoneNumber mobile = new Student.PhoneNumber("123456789", "789456123");

        ArrayList<String> firstnames = new ArrayList<>();
        firstnames.add("Mark");
        firstnames.add("Max");
        firstnames.add("Priscilla");
        Student.Name name = new Student.Name(firstnames,"Zuckerburg");

        int id = 11122233;

        Student student = new Student(id, name, permanentAddress, currentAddress, diplomaAddress, mobile);

    }
}
