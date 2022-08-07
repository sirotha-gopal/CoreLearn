//OOPS
        //OBJECT Classs

        //DataType
//        1,  1.2,    gopal,    true,     'a'
//       int, float,  String,   boolean,  char
//access specifiers
//public private protacted default
public class S {

        //properties
                //variable
        String studentName = "gopal";
        int stasndard = 10;
        int rollno = 1234;
        char section = 'D';
        String optSubject = "CS";

//
        void studentDetails(){
                System.out.println(studentName + " " +rollno);
        }

}

class Test{
        public static void main(String[] args) {
                new S().studentDetails();
                System.out.println(new S().stasndard);
        }
}



//new ClassName(); -> Object