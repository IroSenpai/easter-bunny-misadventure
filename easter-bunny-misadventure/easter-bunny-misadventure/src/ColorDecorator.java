/**
 * Клас ColorDecorator, който наследява EggDecorator и добавя цвят към декорирания обект от тип Egg.
 */
public class ColorDecorator extends EggDecorator {
    private String color; // Цветът, който да се добави към яйцето

    /**
     * Конструктор за създаване на ColorDecorator.
     * @param decoratedEgg Декорираното яйце
     * @param color Цветът, който да се добави
     */
    public ColorDecorator(Egg decoratedEgg, String color){
        super(decoratedEgg);
        this.color = color;
    }

    /**
     * Метод за добавяне на цвят към яйцето.
     * @return Декорираният обект от тип Egg след добавяне на цвят
     */
    @Override
    public Egg decorate() {;
        addColor(); // Добавяне на цвят
        return decoratedEgg; // Връщане на декорирания обект
    }

    /**
     * Метод за изписване на съобщение за добавения цвят.
     */
    public void addColor() { System.out.println("The egg has been colored in " + color); }

}
