import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

import java.util.Scanner;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String [] args)
    {
        log.info("starting");
        Scanner sc = new Scanner(System.in);
        PersonStorage people = new PersonStorage();
        people.addPerson("Куприянов Никита Сергеевич", 'м', new LocalDate(1997, 01, 04));
        people.addPerson("Гринь Даниил Владимирович", 'м', new LocalDate(1997, 02, 13));
        people.addPerson("Гнедов Арсений Витальевич", 'м', new LocalDate(1996, 10, 22));
        people.addPerson("Гнедов Евгений Витальевич", 'м', new LocalDate(1996, 10, 22));


        while(true)
        {
            System.out.print("Опции: \n 0 - Показать всех людей  \n 1 - Показать человека  \n 2 - Добавить человека  " +
                    "\n 3 - Удалить человека \n 4 - Сравнить по id двух людей \n 4 - Выбрать тип сортировки \n 5 - Запись лога \n");
            int variant = sc.nextInt();
            int id;
            String FIO;
            char gender;
            LocalDate dateOfBirth;
            PersonComparator pc = new IdPersonComparator();
            switch (variant)
            {
                case 0:
                    people.showAllPersons();
                    break;

                case 1:
                    System.out.print("Введите id нужного человека: ");
                    id = sc.nextInt();
                    people.showPerson(id);
                    break;

                case 2:
                    System.out.println("Введите фамилию: ");
                    FIO = sc.next();
                    System.out.println("Введите имя: ");
                    FIO += " " + sc.next();
                    System.out.println("Введите отчество: ");
                    FIO += " " + sc.next();
                    System.out.println("Пол: ");
                    gender = sc.next().toCharArray()[0];
                    System.out.println("Введите дату рождения в формате yyyy-mm-dd");
                    dateOfBirth = LocalDate.parse(sc.next());
                    people.addPerson(FIO, gender, dateOfBirth);
                    break;

                case 3:
                    System.out.print("Введите id чтобы удалить человека ");
                    id = sc.nextInt();
                    people.deletePerson(id);
                    break;
                    
                case 4:
                    System.out.print("Выберите тип сортировки: \n 0 - ShakerSort");
                    variant = sc.nextInt();
                    System.out.println("Выберите тип поиска: \n 0 - по ФИО \n 1 - по дате \n 2 - по возрасту \n");
                    type = sc.nextInt();
                    switch(type)
                    {
                        case 0:
                            pc = new FIOPersonComparator();
                            break;
                        case 1:
                            pc = new DatePersonComparator();
                            break;
                        case 2:
                            pc = new AgePersonComparator();
                            break;
                    }
                    switch(variant)
                    {
                        case 0:
                            // sorter = new ShakerSort();
                    }
                    people.sort(pc)
                        break;
                case 5:
                    log.info("Приложение закрыто");
                    System.exit(0);
                    
                default:
                    System.out.println("Неверное число. Попробуй снова");
            }
        }


    }
}
