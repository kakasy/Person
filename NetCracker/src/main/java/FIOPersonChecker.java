import org.apache.log4j.Logger;

/**
 * Класс чекера для проверки соответствия Фио
 */
public class FIOPersonChecker implements PersonChecker {

    private static final Logger log = Logger.getLogger(FIOPersonChecker.class);
    /***
     * Функция для проверки соответсвия поля объекта человека и переданного значения
     * @param p - объект человека
     * @param FIO - проверяемое значения Фио
     * @return Возвращает true, если значение равно, false в другом случае
     */
    public boolean check(Person p, Object FIO)
    {
        log.info("check Person" + p.getFIO() + "and" + FIO.toString());
        return p.getFIO().equals(FIO);
    }
}