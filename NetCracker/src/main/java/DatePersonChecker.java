/**
 * Класс чекера для проверки соответствия даты рождения
 */
public class DatePersonChecker implements PersonChecker{

    /***
     * Функция для проверки соответсвия поля объекта человека и переданного значения
     * @param p - объект человека
     * @param date - проверяемое значения даты рождения
     * @return Возвращает true, если значение равно, false в другом случае
     */
    public boolean check(Person p, Object date)
    {
        return p.getDateOfBirth().equals(date);
    }
}