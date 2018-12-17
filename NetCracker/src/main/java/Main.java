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
                    "\n 3 - Удалить человека \n");
            int variant = sc.nextInt();
            int id;
            String FIO;
            char gender;
            LocalDate dateOfBirth;
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

                default:
                    System.out.println("Неверное число. Попробуй снова");
            }
        }


    }
}
