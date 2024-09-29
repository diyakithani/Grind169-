
import twosum.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        twosum1 obj=new twosum1();
        twosum2 obj1=new twosum2();
        System.out.println(Arrays.toString(obj.twosum(new int[]{1, 2, 3, 4, 5},9)));
        System.out.println(Arrays.toString(obj1.twosum(new int[] {3, 3, 4, 5},6)));

    }
}