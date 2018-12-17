/**
 * Класс чекера для проверки соответствия возраста
 */
public class AgePersonChecker implements PersonChecker {

    /***
     * Функция для проверки соответсвия поля объекта человека и переданного значения
     * @param p - объект человека
     * @param age - проверяемое значения возраста
     * @return Возвращает true, если значение равно, false в другом случае
     */
    public boolean check(Person p, Object age) {
        return p.AgeOfPerson() == Integer.valueOf(age.toString());
    }
}