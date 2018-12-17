import java.util.Comparator;

/**
 * интерфейс для сортировки людей в хранилище
 * @author Никита
 */
public interface Sorter {
    /**
     * Сортирока списка
     * @param mas список
     * @param comparator параметр сортировки
     * @param counter количество элементов в массиве
     */
    void sort(Object[] mas, Comparator comparator, int counter);
}