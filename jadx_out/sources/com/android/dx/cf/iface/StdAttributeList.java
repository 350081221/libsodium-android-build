package com.android.dx.cf.iface;

import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class StdAttributeList extends FixedSizeList implements AttributeList {
    public StdAttributeList(int i5) {
        super(i5);
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public int byteLength() {
        int size = size();
        int i5 = 2;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += get(i6).byteLength();
        }
        return i5;
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public Attribute findFirst(String str) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            Attribute attribute = get(i5);
            if (attribute.getName().equals(str)) {
                return attribute;
            }
        }
        return null;
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public Attribute findNext(Attribute attribute) {
        Attribute attribute2;
        int size = size();
        int i5 = 0;
        while (i5 < size) {
            if (get(i5) == attribute) {
                String name = attribute.getName();
                do {
                    i5++;
                    if (i5 >= size) {
                        return null;
                    }
                    attribute2 = get(i5);
                } while (!attribute2.getName().equals(name));
                return attribute2;
            }
            i5++;
        }
        return null;
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public Attribute get(int i5) {
        return (Attribute) get0(i5);
    }

    public void set(int i5, Attribute attribute) {
        set0(i5, attribute);
    }
}
