/**
 * Главният клас EasterMisadventureMain, който демонстрира използването на шаблоните за проектиране:
 * Singleton, Factory, Decorator и Strategy в "Премеждията на Великденският заек"
 */
public class EasterMisadventureMain {
    public static void main(String[] args) {
        // Създаване на инстанция на Великденският заек
        EasterBunny easterBunny = EasterBunny.getInstance();

        // Създаване на торба за яйца
        EggBag eggBag = new EggBag();

        // Произвеждане и декориране на първото яйце
        Egg egg1 = eggBag.produceEgg("CHICKEN_EGG");
        egg1 = new ColorDecorator(egg1, "red").decorate();
        egg1 = new StickerDecorator(egg1, "White Rabbit").decorate();

        // Задаване на стратегия за скриване и скриване на първото яйце
        easterBunny.setHideStrategy(new BasketHide());
        easterBunny.hide();

        // Произвеждане и декориране на второто яйце
        Egg egg2 = eggBag.produceEgg("OSTRICH_EGG");
        egg2 = new ColorDecorator(egg2, "Yellow").decorate();
        egg2 = new StickerDecorator(egg2, "Rainbow").decorate();
        egg2 = new StickerDecorator(egg2, "Cloud").decorate();

        // Задаване на нова стратегия за скриване и скриване на второто яйце
        easterBunny.setHideStrategy(new BushHide());
        easterBunny.hide();

        // Произвеждане и декориране на третото яйце
        Egg egg3 = eggBag.produceEgg("DINOSAUR_EGG");
        egg3 = new ColorDecorator(egg3, "Green").decorate();
        egg3 = new StickerDecorator(egg3, "Eyes").decorate();
        egg3 = new StickerDecorator(egg3, "Teeth").decorate();

        // Задаване на нова стратегия за скриване и скриване на третото яйце
        easterBunny.setHideStrategy(new ForestHide());
        easterBunny.hide();

        // Произвеждане и декориране на четвъртото яйце
        Egg egg4 = eggBag.produceEgg("OSTRICH_EGG");
        egg4 = new ColorDecorator(egg4, "Pink").decorate();
        egg4 = new StickerDecorator(egg4, "Cherry").decorate();

        // Задаване на нова стратегия за скриване и скриване на четвъртото яйце
        easterBunny.setHideStrategy(new BushHide());
        easterBunny.hide();
    }
}
