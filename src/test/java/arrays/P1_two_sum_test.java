package arrays;
import com.rustam.leetcode.arrays.P1_two_sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P1_two_sum_test {
    @Test
    void test_two_sum_example() {
        var res = new P1_two_sum().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, res);
    }

    @Test
    void test_two_sum_example2() {
        var res = new P1_two_sum().twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    void test_two_sum_no_answer() {
        var res = new P1_two_sum().twoSum(new int[]{1, 2, 3}, 9);
        assertArrayEquals(new int[]{-1, -1}, res);
    }

}
