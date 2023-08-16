class a {
    int a;
    public int maddy() {
    return 3;
}
public void meth2(){
    System.out.println("I am method 2 of class a");
}
}
class b extends a{
    int c;
    public int laddu(){
        return 10;
    }
    public void meth2(){
        System.out.println("I am mehtod 2 of class b ");
    }
}

public class ps {
    public static void main(String args[]) {
        a obj = new a();
        obj.meth2();
        b sp = new b();
        sp.meth2();


    }
}