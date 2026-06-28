package com.android.dx.cf.iface;

import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i5) {
        super(i5);
    }

    @Override // com.android.dx.cf.iface.FieldList
    public Field get(int i5) {
        return (Field) get0(i5);
    }

    public void set(int i5, Field field) {
        set0(i5, field);
    }
}
