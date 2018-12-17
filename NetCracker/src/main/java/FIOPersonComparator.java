/***
 * Класс компоратора для проверки Фио

 */
public class FIOPersonComparator implements PersonComparator{

    /***
     * Функция для проверки величины Фио двух людей
     * @param p1 - объект 1 человека
     * @param p2 - объект 2 человека
     * @return Возвращает 1, если значение p1 больше p2, 0, если равны, -1 в другом случае
     */
    public int compare(Person p1, Person p2)
    {
        return p1.getFIO().compareTo(p2.getFIO());
    }
}