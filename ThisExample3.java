package ThisKeyword;

// this() to invoke current class constructor

class ThisExample30 {

    ThisExample30(){
        System.out.println("Line 1");
    }
    ThisExample30(int a){
        this();
        System.out.println(a);
    }

}

public class ThisExample3{

    public static void main(String[] args) {
        ThisExample30 e1 = new ThisExample30(100);
    }
}
