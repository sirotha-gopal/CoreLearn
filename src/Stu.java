public class Stu {
    int rollNo;
    int houseNumber;
    String name ="gopal";
    String city;
    char section;
    float bankBalance;
    String shirtKapda;
    String pantKapda;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    String tailor(String shirtKapda,String pantKapda){
        String stichedKapda = shirtKapda +" "+pantKapda;
        return stichedKapda;
    }

    public static void main(String[] args) {
        Stu student1 = new Stu();
        student1.setName("aayu");
        student1.setRollNo(1);

        Stu student2 = new Stu();
        student2.setRollNo(2);
        student2.setName("anmol");

        int a =1;
        String name ="gopal";
        float i = 1.2f;
        char c = 'a';

        Stu stu3 = new Stu();

        String stiched = stu3.tailor("shirt","pant");
        System.out.println(stiched);
        System.out.println(stu3.tailor("shirt","pant"));


    }

}


