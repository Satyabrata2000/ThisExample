package ThisKeyword;

class ThisExample {

    int rollno;
    String name;
    float fee;

    ThisExample(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }
}

public class ThisExample1{

    public static void main(String[] args) {

        ThisExample E1 = new ThisExample(200, "John", (float) 500.4);
        ThisExample E2 = new ThisExample(300, "Brian", (float) 500.7);

        E1.display();
        E2.display();
    }
}
