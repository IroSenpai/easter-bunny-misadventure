/**
 * Клас EasterBunny, който представлява заека на Великден.
 * Този клас е Singleton и съдържа стратегия за скриване на яйца.
 */
public class EasterBunny {

    private static EasterBunny instance; // Единствена инстанция на класа
    private HideStrategy hideStrategy; // Стратегия за скриване на яйцата

    // Частен конструктор, за да се предотврати инстанцииране извън класа
    private EasterBunny() {}

    /**
     * Метод за получаване на инстанция на класа EasterBunny (Singleton).
     * @return Инстанция на класа EasterBunny
     */
    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    /**
     * Метод за задаване на стратегия за скриване на яйцата.
     * @param hideStrategy Стратегия за скриване на яйцата
     */
  public void setHideStrategy(HideStrategy hideStrategy) {
        this.hideStrategy = hideStrategy;
      if (hideStrategy != null) {
          hideStrategy.performsAction();  // Изпълнява действие свързано със стратегията
      }
      else {
          System.out.println("No Hide Strategy Selected"); // Съобщение, ако не е избрана стратегия
          System.out.println();
      }
    }

    /**
     * Метод за скриване на яйце, използвайки зададената стратегия.
     */
  public void hide() {
        if (hideStrategy != null) {
            hideStrategy.hide(); // Скриване на яйце със зададената стратегия
        }
  }
}
