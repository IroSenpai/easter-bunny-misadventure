/**
 * Този клас е наследник на класа Egg и представя динозавърско яйце.
 */
public class DinosaurEgg extends Egg {

    /**
     * Метод за подготовка на яйцето.
     * Индикация за подготвено динозавърското яйце се извежда в конзолата.
     */
    @Override
    public void prepare() {
        System.out.println("Dinosaur Egg has been prepared");
    }

}
