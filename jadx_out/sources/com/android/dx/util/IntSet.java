package com.android.dx.util;

/* loaded from: classes2.dex */
public interface IntSet {
    void add(int i5);

    int elements();

    boolean has(int i5);

    IntIterator iterator();

    void merge(IntSet intSet);

    void remove(int i5);
}
