/**
 * Този клас е наследник на класа Egg и представя кокошо яйце.
 */
public class ChickenEgg extends Egg  {

    /**
     * Метод за подготовка на яйцето.
     * Индикация за подготвено кокошо яйце се извежда в конзолата.
     */
        @Override
        public void prepare() {
        System.out.println("Chicken Egg has been prepared");
    }

}
