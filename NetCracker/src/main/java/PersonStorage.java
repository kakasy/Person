import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

/**
 * Класс PersonStorage, описывающий хранилище для людей
 * @author Никита
 * @version 1.0
 */
public class PersonStorage {

    private static final Logger log = Logger.getLogger(PersonStorage.class);

    /** Поле массив людей */
    private Person[] people;

    /** Поле последний уникальный идентификатор
     * Необходимо для добавления, удаления и выборки людей
     */
    private int last_id;
    private int count = 0;

    @Inject
    private  Sorter sorter = null;



    /**
     * Конструктор PersonStorage - создание нового объекта коллекции людей с заданными значениями
     */
    public PersonStorage()
    {
        log.info("Создание пустого хранилища");
        people = new Person[10];
        last_id = 0;
    }

    /**
     * Метод для получения значения кол-ва людей в коллекции
     * @return возвращает количество людей
     */
    public int length()
    {
        return last_id;
    }

    /**
     * Функция для добавления человека в коллекцию
     * FIO - ФИО
     * gender - Пол
     * date_of_birth - Дата рождения
     */
    public void addPerson(String FIO, char gender, LocalDate date_of_birth)
    {
        if(last_id == people.length) {
            expand();
        }
        people[last_id] = new Person(last_id, FIO, gender, date_of_birth);

        System.out.printf("New Person added: ");
        people[last_id].showInfo();
        last_id++;
    }

    /**
     * Функция для удаления пользователя по id
     * id - уникальный идентификатор
     */
    public void deletePerson(int id)
    {
        if(last_id % 10 == 0) {
            reduce();
        }
        Person[] new_people =  new Person[people.length];
        last_id--;

        for(int i = 0; i < id; i++) {
            new_people[i] = people[i];
        }
        new_people[id] = people[id + 1];
        new_people[id].deductId();
        for(int i = id+1; i < last_id; i++) {
            new_people[i] = people[i + 1];
            new_people[i].deductId();
        }
        people = new_people;
    }

    /**
     * Функция для вывода информации об определенном человеке по id
     * Вызывает showInfo()
     * id - уникальный идентификатор
     */
    public void showPerson(int id)
    {
        people[id].showInfo();
    }

    /**
     * Функция для вывода информации обо всех людях в коллекции
     * Вызывает showInfo()
     */
    public void showAllPersons()
    {
        log.info("Все люди в хранилище");
        for(int i = 0; i < last_id; i++) {
            people[i].showInfo();
        }
    }

    /**
     * Функция для увеличения размера коллекции на 10
     */
    private void expand()
    {
        Person[] new_people = new Person[people.length + 10];

        for(int i = 0; i < people.length; i++) {
            new_people[i] = people[i];
        }
        people = new_people;
    }

    /**
     * Функция для уменьшения размера коллекции на 10
     */
    private void reduce()
    {
        Person[] new_people = new Person[people.length - 10];

        for(int i = 0; i < people.length - 10; i++)
            new_people[i] = people[i];
        people = new_people;
    }
}
