package generics;

public class GenericsMain {
    static void main() {
        GenericList<Object> nums = new GenericList<>();
        nums.add(1);
        nums.add(2);
        nums.add("abcd");
        System.out.println(nums.get(1));
    }
}
