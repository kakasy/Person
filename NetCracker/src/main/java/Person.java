import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Класс Person, описывающий человека
 * @author Никита
 * @version 1.0
 */
public class Person {

    /**
     * Инициализация логгера
     */
    private static final Logger log = Logger.getLogger(Person.class);

    /**Поле id*/
    private int id;

    /**Поле ФИО*/
    private String FIO;

    /**Поле пол*/
    private char gender;

    /**Поле дата рождения*/
    private LocalDate dateOfBirth;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param id - id
     * @param FIO - ФИО
     * @param  gender - пол
     * @param dateOfBirth - дата рождения
     */
    public Person(int id, String FIO, char gender, LocalDate dateOfBirth) {
        this.id = id;
        this.FIO = FIO;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        log.debug("Init Person");
    }

    /**
     * Функция получения значения поля {@link Person#id}
     * @return возвращет значение поля id
     */
    public int getId() {
        return id;
    }

    public void setId(int NewId) {
        id = NewId;
    }

    /**
     * Функция получения значения поля {@link Person#FIO}
     * @return возвращает значение поля FIO
     */
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String NewFIO) {
        FIO = NewFIO;
    }

    /**
     * Функция получения значения поля {@link Person#gender}
     * @return возвращает значение поля gender
     */
    public char getGender() {
        return gender;
    }

    public void setGender(char NewGender) {
        gender = NewGender;
    }

    /**
     * Функция получения значения поля {@link Person#dateOfBirth}
     * @return возвращает значение поля dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate NewDate_of_birth) {
        dateOfBirth = NewDate_of_birth;
    }

    /**
     * Функция уменьшающая значение поля id нв единицу
     */
    public void deductId(){
        id--;
    }

    /**
     * Функция получения возраста человека
     * @return возвращает возраст человека
     */
    public int AgeOfPerson(){
        return Years.yearsBetween(dateOfBirth, new LocalDate()).getYears();
    }

    /**
     * Функция получения информации о человеке
     * Печатает всю информацию о человеке и количество полных лет
     */
    public void showInfo() {
        System.out.printf("id = %d, FIO = %s, gender = %c, date of birth = %s, years = %d \n", id, FIO, gender,
                dateOfBirth.toString(), AgeOfPerson());
        log.info("Информация напечатана");
    }
}
