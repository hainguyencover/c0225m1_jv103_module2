import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList() {
        List<Integer> list = randomList.generateList(10, 0, 40);
        List<Integer> evenList = listFilter.filterOdd(list);
        listPrinter.printList(evenList);
    }
}
