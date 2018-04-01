public class Samsung implements Phone
{
    @Override
    public void call() {
        System.out.println("Call Samsung.");
    }

    @Override
    public void end(){
        System.out.println("End Samsung.");
    }

    @Override
    public void text(){
        System.out.println("Text Samsung");
    }
}
