package com.mmnaseri.cs.ds.clrs.ch11.s4;

import com.mmnaseri.cs.ds.clrs.ch11.HashCalculator;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (7/13/15)
 */
public class LinearHashCalculator implements HashCalculator {

    private final int prime;
    private final int coefficient;
    private final int offset;

    public LinearHashCalculator(int prime, int coefficient, int offset) {
        this.prime = prime;
        this.coefficient = coefficient;
        this.offset = offset;
    }

    @Override
    public int calculate(int index, int capacity) {
        //this is to protect ourselves against integer value overflows
        long base = (long) coefficient * index + offset;
        base = base % prime;
        return (int) (base % capacity);
    }

}
