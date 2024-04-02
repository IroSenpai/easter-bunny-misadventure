/**
 * Клас BushHide, който представлява стратегия за скриване на яйце под храст.
 */
public class BushHide implements HideStrategy{

    /**
     * Метод за скриване на яйце под храст.
     */
    @Override
    public void hide(){
        System.out.println("... and hid the egg there");
        System.out.println();
    }

    /**
     * Метод за изпълнение на допълнително действие преди скриването на яйцето под храст.
     */
    @Override
    public void performsAction() {
        System.out.println("The Easter Bunny found a bush ...");
    }

}
