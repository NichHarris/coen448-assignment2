package midterm2023;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuickSortUnitTest {

    // BCC Test Case 1
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [4, 6, 3, 7, 8, 2, 3, 1, 5] >
    // Description: Input a randomly ordered array of integers with more than 1 element present.
    // Expected: < [1, 2, 3, 3, 4, 5, 6, 7, 8] >
    @Test
    void testBCC1() {
        Integer[] input = new Integer[]{4,6,3,7,8,2,3,1,5};
        Integer[] expected = new Integer[]{1,2,3,3,4,5,6,7,8};
        QuickSort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    // BCC Test Case 2
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [3, 3, 3, 3, 3, 3, 3, 3] >
    // Description: Input an array of integers with more than 1 element present, and all elements having the same value.
    // Expected: < [3, 3, 3, 3, 3, 3, 3, 3] >
    @Test
    void testBCC2() {
        Integer[] input = new Integer[]{3,3,3,3,3,3,3,3};
        Integer[] expected = new Integer[]{3,3,3,3,3,3,3,3};
        QuickSort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    // BCC Test Case 3
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [1, 2, 3, 4, 5, 6, 7, 8] >
    // Description:  Input an array of integers with more than 1 element present,
    // and with the elements already sorted in ascending order.
    // Expected: < [1, 2, 3, 4, 5, 6, 7, 8] >
    @Test
    void testBCC3() {
        Integer[] input = new Integer[]{1,2,3,4,5,6,7,8};
        Integer[] expected = new Integer[]{1,2,3,4,5,6,7,8};
        QuickSort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    // BCC Test Case 4
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [8, 7, 6, 5, 4, 3, 2, 1] >
    // Description: Input an array of integers with more than 1 element present,
    // and with the elements sorted in descending order.
    // Expected: < [1, 2, 3, 3, 4, 5, 6, 7, 8] >
    @Test
    void testBCC4() {
        Integer[] input = new Integer[]{8,7,6,5,4,3,2,1};
        Integer[] expected = new Integer[]{1,2,3,4,5,6,7,8};
        QuickSort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    // BCC Test Case 5
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [1] >
    // Description: Input a randomly ordered array of integers with more than 1 element present.
    // Expected: < [1] >
    @Test
    void testBCC5() {
        Integer[] input = new Integer[]{1};
        Integer[] expected = new Integer[]{1};
        QuickSort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    // BCC Test Case 6
    // Testers' names: Matthew Sklivas, Nicholas Harris
    // Date: 2023/03/21
    // Type: Functional, black-box
    // Input: < [] >
    // Description: Input an array of integers with no elements present.
    // Expected: < ArrayIndexOutOfBoundsException >
    @Test
    void testBCC6() {
        Integer[] input = new Integer[]{};
        try {
            QuickSort.sort(input);
        } catch (ArrayIndexOutOfBoundsException e) {
            Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                Integer[] test1 = new Integer[]{};
                Integer test2 = test1[0];
            });
            assertEquals(exception.getMessage(), e.getMessage());
        }
    }

//    // DCU/DPU Test Case 1
//    // Testers' names: Matthew Sklivas, Nicholas Harris
//    // Date: 2023/03/21
//    // Type: Functional, black-box
//    // Input: < [1] >
//    // Description: Input an array of integers which covers the dcu {3,4} and
//    // dpus {(3,4), (4,5)} for the partition function.
//    // Expected: < [1] >
//    @Test
//    void testDcuDpu1() {
//        Integer[] input = new Integer[]{1};
//        Integer[] expected = new Integer[]{1};
//        QuickSort.sort(input);
//        assertThat(input).isEqualTo(expected);
//    }
//
//    // DCU/DPU Test Case 2
//    // Testers' names: Matthew Sklivas, Nicholas Harris
//    // Date: 2023/03/21
//    // Type: Functional, black-box
//    // Input:  < [2, 1] >
//    // Description: Input an array of integers which covers the dcu {3,4} and
//    // dpus {(3,3), (3,4), (4,5)} for the partition function.
//    // Expected:  < [1, 2] >
//    @Test
//    void testDcuDpu2() {
//        Integer[] input = new Integer[]{2,1};
//        Integer[] expected = new Integer[]{1,2};
//        QuickSort.sort(input);
//        assertThat(input).isEqualTo(expected);
//    }
//
//    // DCU/DPU Test Case 3
//    // Testers' names: Matthew Sklivas, Nicholas Harris
//    // Date: 2023/03/21
//    // Type: Functional, black-box
//    // Input:  < [1, 2, 3] >
//    // Description: Input an array of integers which covers the dcu {3,4} and
//    // dpus {(3,3), (3,4), (4,4), (4,5)} for the partition function.
//    // Expected:  < [1, 2, 3] >
//    @Test
//    void testDcuDpu3() {
//        Integer[] input = new Integer[]{1,2,3};
//        Integer[] expected = new Integer[]{1,2,3};
//        QuickSort.sort(input);
//        assertThat(input).isEqualTo(expected);
//    }
//
//    // DCU/DPU Test Case 4
//    // Testers' names: Matthew Sklivas, Nicholas Harris
//    // Date: 2023/03/21
//    // Type: Functional, black-box
//    // Input:  < [1, 2] >
//    // Description: Input an array of integers which covers the dcu {3,4} and
//    // dpus {(3,4), (4,4), (4,5)} for the partition function.
//    // Expected:  < [1, 2] >
//    @Test
//    void testDcuDpu4() {
//        Integer[] input = new Integer[]{1,2};
//        Integer[] expected = new Integer[]{1,2};
//        QuickSort.sort(input);
//        assertThat(input).isEqualTo(expected);
//    }
}