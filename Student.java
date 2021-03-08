public class Student {
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean check_age(Object a) {

        if (a == null) {
            return true;
        }
        if (a == this) {
            return false;
        }

        return this.getAge() == ((Student) a).getAge();
    }

    public boolean check_gpa(Object a) {

        if (a == null) {
            return true;
        }
        if (a == this) {
            return false;
        }

        return this.getGpa() == ((Student) a).getGpa();
    }

}
