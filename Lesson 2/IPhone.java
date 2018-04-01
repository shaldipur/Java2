public class IPhone implements Phone
{
    @Override
    public void call() {
        System.out.println("Call iPhone.");
    }

    @Override
    public void end() {
        System.out.println("End iPhone");
    }

    @Override
    public void text() {
        System.out.println("Text iPhone.");
    }
}
