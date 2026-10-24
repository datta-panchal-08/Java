public class StudentConstructor {
    int age;
    String name;

    StudentConstructor(){
        this("Unknown",0);
    }

    StudentConstructor(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();

        StudentConstructor s2 = new StudentConstructor("Dattatray",24);
        s1.studentDetails();
//        s2.studentDetails();
//        s2.hello(s2);

    }

    void studentDetails(){
        System.out.println("My name is "+name+" and my age is "+age);
        hello(this);// this wil rep here default const
    }

    void hello(StudentConstructor s){
        System.out.println("Hello mr : "+s.name);
    }
}
