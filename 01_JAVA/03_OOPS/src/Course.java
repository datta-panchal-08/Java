public class Course {

    String name;
    int duration;

    // Default Constructor
//    Course(){
//        System.out.println("Constructor Called..");
//    }

    Course(String name,int duration){
        System.out.println("Course Name is : "+name+" and Duration is : "+duration+"+hrs");
        this.name = name;// Initialized local name
        this.duration = duration;
        System.out.println("Parameterized Constructor Called..");
    }

    static void main(String[] args) {
      System.out.println("Before Object Creation...");
      Course c = new Course("Full Stack Java",20);
//      c.name = "Full Stack Java";
//        System.out.println("After Object Creation..");
//      c.teach(c);

      Course c2 = new Course("Devops",30);
//      c2.name = "Devops";
//      c2.teach(c2);

      Course c3 = new Course("DSA",40);
    }

    void teach(Course c){
        System.out.println("We are teaching you "+ c.name);
    }

}
