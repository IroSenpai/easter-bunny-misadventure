/**
 * Клас BasketHide, който представлява стратегия за скриване на яйце в кошница.
 */
public class BasketHide implements HideStrategy {

    /**
     * Метод за скриване на яйце в кошница.
     */
    @Override
    public void hide(){
        System.out.println("... and hid the egg there");
        System.out.println();
    }

    /**
     * Метод за изпълнение на допълнително действие преди скриването на яйцето в кошница.
     */
    @Override
    public void performsAction() {
        System.out.println("The Easter Bunny went to get the basket ...");
    }
}
