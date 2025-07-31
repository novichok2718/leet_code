package tree;
import com.rustam.leetcode.data_structure.TreeNode;
import com.rustam.leetcode.tree.P100_sameTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class P100_sameTreeTest {
    @Test
    void isSameTree_SameStructAndVal_true() {
        var sample1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var sample2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var res = new P100_sameTree().isSameTree(sample1, sample2);
        assertTrue(res);
    }
    @Test
    void isSameTree_RightArgIsNUll_false() {
        var sample1 = new TreeNode(1);
        TreeNode sample2 = null;
        var res = new P100_sameTree().isSameTree(sample1, sample2);
        assertFalse(res);
    }


}
