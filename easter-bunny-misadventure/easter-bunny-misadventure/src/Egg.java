/**
 * Абстрактен клас, представящ яйце,
 * като всяко яйце може да има тип, цвят и стикер.
 */
public abstract class Egg {

    // Характеристики на яйцето
    private String type; // Тип на яйцето (кокошко, щраусово, динозавърско)
    private String color; // Цвят на яйцето
    private String sticker; // Стикер на яйцето

    // Конструктори

    // Конструктор без параметри
    public Egg(){}

    // Конструктор с параметър за типа
    public Egg(String type) {
        this.type = type;
    }

    // Гетъри и сетъри за характеристиките на яйцето

    /**
     * Метод за връщане на типа на яйцето.
     * @return Типът на яйцето.
     */
    public String getType() {
        return type;
    }

    /**
     * Метод за задаване на типа на яйцето.
     * @param type Типът на яйцето.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Метод за връщане на цвета на яйцето.
     * @return Цветът на яйцето.
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод за задаване на цвета на яйцето.
     * @param color Цветът на яйцето.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Метод за връщане на стикера на яйцето.
     * @return Стикерът на яйцето.
     */
    public String getSticker() {
        return sticker;
    }

    /**
     * Метод за задаване на стикера на яйцето.
     * @param sticker Стикерът на яйцето.
     */
    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    /**
     * Абстрактен метод за приготвяне на яйцето.
     * Имплементира се специфично от всеки подклас.
     */
    public abstract void prepare();
}
