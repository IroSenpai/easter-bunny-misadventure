/**
 * Клас StickerDecorator, който наследява EggDecorator и добавя стикер към декорирания обект от тип Egg.
 */
public class StickerDecorator extends EggDecorator {

    private String sticker; // Стикерът, който да се добави към яйцето

    /**
     * Конструктор за създаване на StickerDecorator.
     * @param decoratedEgg Декорираното яйце
     * @param sticker Стикерът, който да се добави
     */
    public StickerDecorator (Egg decoratedEgg, String sticker) {
        super(decoratedEgg);
        this.sticker = sticker;
    }

    /**
     * Метод за добавяне на стикер към яйцето.
     * @return Декорираният обект от тип Egg след добавяне на стикер
     */
    @Override
    public Egg decorate() {
        addSticker(); // Добавяне на стикер
        return decoratedEgg; // Връщане на декорирания обект
    }

    /**
     * Метод за изписване на съобщение за добавения стикер.
     */
    private void addSticker() { System.out.println("A " + sticker + " sicker has been placed"); }

}
