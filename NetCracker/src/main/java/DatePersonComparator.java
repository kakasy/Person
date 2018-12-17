/**
 * Класс компоратора для проверки даты рождения
 */
public class DatePersonComparator implements PersonComparator {

    public int compare(Person p1, Person p2) {
        /***
         * Функция для проверки величины даты рождения двух людей
         * @param p1 - объект 1 человека
         * @param p2 - объект 2 человека
         * @return Возвращает 1, если значение p1 больше p2, 0, если равны, -1 в другом случае
         */
        return p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
    }
}