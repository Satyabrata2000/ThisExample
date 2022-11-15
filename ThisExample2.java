package ThisKeyword;

class ThisExample20 {

    void m() {
        System.out.println("1");

    }

    void n() {
        System.out.println("2");
        this.m();
    }
}

public class ThisExample2 {

    public static void main(String[] args) {

        ThisExample20 e1 = new ThisExample20();
        e1.m();
        e1.n();
    }
}
