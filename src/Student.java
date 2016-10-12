import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private static ArrayList<Student> allStudents = new ArrayList<>();
    private int id;
    private Name name;
    private Address permanentAddress;
    private Address currentAddress;
    private Address diplomaAddress;
    private PhoneNumber phone;

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }

    public Student(int id, Name name, Address permanentAddress, Address currentAddress, Address diplomaAddress, PhoneNumber phone) {
        this.phone = phone;
        this.id = id;
        this.name = name;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.diplomaAddress = diplomaAddress;

        allStudents.add(this);
    }


    public static class Name{
        private ArrayList<String> firstnames;
        private String lastname;

        public Name(ArrayList<String> firstnames, String lastname){
            this.firstnames = firstnames;
            this.lastname = lastname;
        }
    }

    public static class PhoneNumber{
        private String mobile;
        private String land;

        public PhoneNumber(String mobile, String land){
            this.mobile = mobile;
            this.land = land;
        }

        public String getMobile(){
            return this.mobile;
        }

        public String getLand(){
            return this.land;
        }
    }

    public static class Address{
        private String postBox;
        private String line1;
        private String line2;
        private String city;
        private String country;
        private String postalCode;

        public Address(String postBox, String line1, String line2, String city, String country, String postalCode){
            this.postBox = postBox;
            this.postalCode = postalCode;
            this.line1 = line1;
            this.line2 = line2;
            this.city = city;
            this.country = country;
            this.postalCode = postalCode;
        }

        public String getPostBox() {
            return postBox;
        }

        public String getLine1() {
            return line1;
        }

        public String getLine2() {
            return line2;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }
}
