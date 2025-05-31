package b1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("element 4: " + list.get(4));
        System.out.println("element 1: " + list.get(1));
        System.out.println("element 2: " + list.get(2));
        System.out.println("element 3: " + list.get(3));
        System.out.println("element 0: " + list.get(0));

//        list.get(6);
//        System.out.println("element 6: " + list.get(6)); // This will throw an exception

//        list.get(-1);
//        System.out.println("element -1: " + list.get(-1)); // This will also throw an exception
    }
}
