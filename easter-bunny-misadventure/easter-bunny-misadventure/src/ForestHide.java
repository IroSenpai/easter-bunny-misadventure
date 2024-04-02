/**
 * Клас ForestHide, който представлява стратегия за скриване на яйце в гората.
 */
public class ForestHide implements HideStrategy {

    /**
     * Метод за скриване на яйце в гората.
     */
    @Override
    public void hide(){
        System.out.println("... and hid the egg there");
        System.out.println();
    }

    /**
     * Метод за изпълнение на допълнително действие преди скриването на яйцето в гората.
     */
    @Override
    public void performsAction() {
        System.out.println("The Easter Bunny went deep into the forest ...");
    }
}
