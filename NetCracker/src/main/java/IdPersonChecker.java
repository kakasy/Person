/**
 * Класс чекера для проверки соответствия id
 */
public class IdPersonChecker implements PersonChecker{

    /***
     * Функция для проверки соответсвия поля объекта человека и переданного значения
     * @param p - объект человека
     * @param id - проверяемое значения уникального идентификатора
     * @return Возвращает true, если значение равно, false в другом случае
     */
    public boolean check(Person p, Object id)
    {
        return p.getId() == Integer.valueOf(id.toString());
    }
}