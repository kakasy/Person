/***
 * Класс компоратора для проверки id
 */
public class IdPersonComparator implements PersonComparator {

    /***
     * Функция для проверки величины id двух людей
     * @param p1 - объект 1 человека
     * @param p2 - объект 2 человека
     * @return Возвращает 1, если значение p1 больше p2, 0, если равны, -1 в другом случае
     */
    public int compare(Person p1, Person p2)
    {
        return new Integer(p1.getId()).compareTo(p2.getId());
    }
}
