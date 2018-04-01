public class TestPhone
{

    public static void main(String[] args){

        IPhone iPhone = new IPhone();

        Samsung samsung = new Samsung();

        //test IPhone
        iPhone.call();
        iPhone.end();
        iPhone.text();

        //test Samsung
        samsung.call();
        samsung.end();
        samsung.text();
    }
}
