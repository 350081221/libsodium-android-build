package com.android.dx.io.instructions;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class AddressMap {
    private final HashMap<Integer, Integer> map = new HashMap<>();

    public int get(int i5) {
        Integer num = this.map.get(Integer.valueOf(i5));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void put(int i5, int i6) {
        this.map.put(Integer.valueOf(i5), Integer.valueOf(i6));
    }
}
