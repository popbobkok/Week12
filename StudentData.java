
public class StudentData {

    public static void main(String[] args) {
        // Student object include name,age,gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        // Write the equal statement to test the objects below
        // name
        System.out.println("\n" + std01.name.equals(std02.name));
        System.out.println(std01.name.equals(std03.name));
        System.out.println(std02.name.equals(std04.name));
        System.out.println(std01.name.equals(std04.name));

        // age
        System.out.println("\n" + std01.check_age(std02));
        System.out.println(std03.check_age(std04));
        System.out.println(std01.check_age(std03));

        // gpa

        System.out.println("\n" + std01.check_gpa(std03));
        System.out.println(std02.check_gpa(std04));
        System.out.println(std02.check_gpa(std03));

    }

}
