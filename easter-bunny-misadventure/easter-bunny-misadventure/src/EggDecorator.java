/**
 * Абстрактен клас, който представлява декоратор за яйца.
 * Този клас е базовият клас за всички декоратори и съдържа декорирания обект.
 */
public abstract class EggDecorator {

    protected Egg decoratedEgg; // Декорираното яйце

    /**
     * Конструктор за създаване на декоратор с декорирано яйце.
     * @param decoratedEgg Декорираното яйце
     */
    public EggDecorator(Egg decoratedEgg) {
        super();
        this.decoratedEgg = decoratedEgg;
    }

    /**
     * Абстрактен метод за декориране на яйцето.
     * @return Декорираният обект от тип Egg
     */
    public abstract Egg decorate();

}
