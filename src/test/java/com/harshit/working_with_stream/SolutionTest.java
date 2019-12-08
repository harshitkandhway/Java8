package com.harshit.working_with_stream;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void should_count_occurances_of_a_value_in_array() {
        int[] ar = new int[]{1, 2, 3, 2, 3, 44, 2, 5, 6, 2};
        long l = Solution.countOccurances(ar, 2);
        Assertions.assertThat(l).isEqualTo(4);
    }

}