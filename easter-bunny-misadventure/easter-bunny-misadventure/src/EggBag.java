/**
 * Клас, представящ торба с яйца.
 * Този клас може да създава и подготвя яйца от различни видове.
 */
public class EggBag {

    /**
     * Метод за създаване на яйце спрямо подадения тип.
     * @param eggType Типът на яйцето.
     * @return Създаденото яйце.
     */
    public Egg createEgg(String eggType) {
        // Проверка за типа на яйцето и създаване на съответното яйце
        if (eggType.equals(ConstantEggTypes.CHICKEN_EGG)) {
            return new ChickenEgg();
        }
        if (eggType.equals(ConstantEggTypes.OSTRICH_EGG)) {
            return new OstrichEgg();
        }
        if (eggType.equals(ConstantEggTypes.DINOSAUR_EGG)) {
            return new DinosaurEgg();
        }
        // Ако типът на яйцето е непознат, извежда се съобщение за грешка
        System.out.println("Unknown egg: " + eggType);
        return null;
    }

    /**
     * Метод за производство на яйце спрямо подадения тип и подготовка на яйцето.
     * @param eggType Типът на яйцето.
     * @return Подготвеното яйце.
     */
    public Egg produceEgg(String eggType) {
        // Проверка дали типът на яйцето не е null
        if (eggType != null) {
            // Създаване на яйце
            Egg egg = createEgg(eggType);
            // Подготовка на яйцето
            egg.prepare();
            return egg;
        }
        // Би трябвало ако типът на яйцето е null, извежда се съобщение за грешка
        System.out.println("Can't Create Unknown egg: " + eggType);
        return null;
    }

}
