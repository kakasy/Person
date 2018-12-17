import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Comparator;

public class ShakerSort implements Sorter {

    private static Logger log = LogManager.getLogger(ShakerSort.class);

    /**
     * Шейкерная сортировка
     * @param mas - массив, который сортируем
     * @param comparator - компаратор
     * @return отсортированный массив
     */
    public void sort(Object[] mas, Comparator comparator, int counter) {
        log.info("Sort type: shaker");
        boolean wasSwapped;
        Object temp;
        do {
            wasSwapped=false;
            for (int i = 0; i < counter - 2; i++) {
                if (comparator.compare(mas[i], mas[i + 1])>=1) {
                    temp = mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=temp;
                    wasSwapped=true;
                }
            }

            if(!wasSwapped) break;

            wasSwapped=false;
            for (int j = counter-2; j >= 0; j--) {
                if(comparator.compare(mas[j],mas[j+1])>=1){
                    temp = mas[j];
                    mas[j]=mas[j+1];
                    mas[j+1]=temp;
                    wasSwapped=true;
                }
            }

        } while(wasSwapped);
    }
}