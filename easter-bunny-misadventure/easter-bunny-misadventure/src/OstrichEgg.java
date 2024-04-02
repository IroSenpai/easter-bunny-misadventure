/**
 * Този клас е наследник на класа Egg и представя щраусово яйце.
 */
public class OstrichEgg extends Egg {

    /**
     * Метод за подготовка на яйцето.
     * Индикация за подготвено щраусовото яйце се извежда в конзолата.
     */
    @Override
    public void prepare() {
        System.out.println("Ostrich Egg has been prepared");
    }

}
