package com.lody.virtual.helper;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public class MultiAvoidRecursive {
    private SparseBooleanArray mCallings;

    public MultiAvoidRecursive(int i5) {
        this.mCallings = new SparseBooleanArray(i5);
    }

    public boolean beginCall(int i5) {
        synchronized (this.mCallings) {
            if (this.mCallings.get(i5)) {
                return false;
            }
            this.mCallings.put(i5, true);
            return true;
        }
    }

    public void finishCall(int i5) {
        synchronized (this.mCallings) {
            this.mCallings.put(i5, false);
        }
    }

    public MultiAvoidRecursive() {
        this(7);
    }
}
