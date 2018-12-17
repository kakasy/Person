import java.util.Comparator;

public class Sorting {

    @Inject
    private Sorter sorter;

    public void sort(Object[] object, Comparator comp, int counter ){
        sorter.sort(object, comp, counter);
    }

}