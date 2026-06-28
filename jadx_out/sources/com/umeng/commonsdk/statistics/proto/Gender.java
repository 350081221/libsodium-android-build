package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bv;

/* loaded from: classes3.dex */
public enum Gender implements bv {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    private final int value;

    Gender(int i5) {
        this.value = i5;
    }

    public static Gender findByValue(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    return null;
                }
                return UNKNOWN;
            }
            return FEMALE;
        }
        return MALE;
    }

    @Override // com.umeng.analytics.pro.bv
    public int getValue() {
        return this.value;
    }
}
