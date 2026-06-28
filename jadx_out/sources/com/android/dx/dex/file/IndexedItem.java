package com.android.dx.dex.file;

/* loaded from: classes2.dex */
public abstract class IndexedItem extends Item {
    private int index = -1;

    public final int getIndex() {
        int i5 = this.index;
        if (i5 >= 0) {
            return i5;
        }
        throw new RuntimeException("index not yet set");
    }

    public final boolean hasIndex() {
        return this.index >= 0;
    }

    public final String indexString() {
        return '[' + Integer.toHexString(this.index) + ']';
    }

    public final void setIndex(int i5) {
        if (this.index == -1) {
            this.index = i5;
            return;
        }
        throw new RuntimeException("index already set");
    }
}
