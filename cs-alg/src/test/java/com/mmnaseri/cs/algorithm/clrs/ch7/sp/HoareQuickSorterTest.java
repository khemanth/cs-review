package com.mmnaseri.cs.algorithm.clrs.ch7.sp;

import com.mmnaseri.cs.algorithm.common.BaseSortTest;
import com.mmnaseri.cs.algorithm.common.Sorter;

public class HoareQuickSorterTest extends BaseSortTest{

    @Override
    protected Sorter<Integer> getAscendingSorter() {
        return new HoareQuickSorter<>(NATURAL_COMPARATOR);
    }

}