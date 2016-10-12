import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by drewmahrt on 10/7/16.
 */
public class MainTest {

    @Test
    public void testFindLargestAndSmallest1(){
        Assert.assertArrayEquals(new int[]{1,7},Main.findLargestAndSmallest(new int[]{1,5,7,2,3}));
        Assert.assertArrayEquals(new int[]{3,3},Main.findLargestAndSmallest(new int[]{3,3}));
        Assert.assertArrayEquals(new int[]{1,5},Main.findLargestAndSmallest(new int[]{1,2,3,4,5}));
        Assert.assertArrayEquals(new int[]{7,7},Main.findLargestAndSmallest(new int[]{7,7,7,7,7,7}));
        Assert.assertArrayEquals(new int[]{3,5},Main.findLargestAndSmallest(new int[]{5,4,3}));
        Assert.assertArrayEquals(new int[]{-5,5},Main.findLargestAndSmallest(new int[]{5,4,-5,3}));
    }

    @Test
    public void testSumOfTwoLargest(){
        Assert.assertEquals(5,Main.sumOfTwoLargest(Arrays.asList(new Integer[]{3,2,1})));
        Assert.assertEquals(4,Main.sumOfTwoLargest(Arrays.asList(new Integer[]{4})));
        Assert.assertEquals(0,Main.sumOfTwoLargest(new ArrayList<Integer>()));
        Assert.assertEquals(14,Main.sumOfTwoLargest(Arrays.asList(new Integer[]{1,5,2,3,5,1,9})));
    }

    @Test
    public void testRemoveDuplicatesFromList(){
        List<Integer> list1 = Main.removeDuplicatesFromList(Arrays.asList(new Integer[]{4,1,2,3,1}));
        Collections.sort(list1);
        Assert.assertEquals(Arrays.asList(new Integer[]{1,2,3,4}),list1);

        List<Integer> list2 = Main.removeDuplicatesFromList(Arrays.asList(new Integer[]{5,6,7}));
        Collections.sort(list2);
        Assert.assertEquals(Arrays.asList(new Integer[]{5,6,7}),list2);

        List<Integer> list3 = Main.removeDuplicatesFromList(Arrays.asList(new Integer[]{1,1,1}));
        Collections.sort(list3);
        Assert.assertEquals(Arrays.asList(new Integer[]{1}),list3);

        List<Integer> list4 = Main.removeDuplicatesFromList(Arrays.asList(new Integer[]{}));
        Collections.sort(list4);
        Assert.assertEquals(Arrays.asList(new Integer[]{}),list4);
    }

    @Test
    public void testMergeSortedArrays(){
        Assert.assertArrayEquals(new int[]{1,1,4,5,7,9,11},Main.mergeSortedArrays(new int[]{1,4,7,9,0,0,0},new int[]{1,5,11}));
    }
}
