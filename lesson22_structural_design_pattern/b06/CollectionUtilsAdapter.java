import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    private CollectionUtils collectionUtils;

    public CollectionUtilsAdapter() {
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> numberList = new ArrayList<>(numbers);
        return collectionUtils.findMax(numberList);
    }
}
