package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

/* loaded from: classes2.dex */
public final class FieldId implements Comparable<FieldId> {
    private final int declaringClassIndex;
    private final Dex dex;
    private final int nameIndex;
    private final int typeIndex;

    public FieldId(Dex dex, int i5, int i6, int i7) {
        this.dex = dex;
        this.declaringClassIndex = i5;
        this.typeIndex = i6;
        this.nameIndex = i7;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public String toString() {
        if (this.dex == null) {
            return this.declaringClassIndex + " " + this.typeIndex + " " + this.nameIndex;
        }
        return this.dex.typeNames().get(this.typeIndex) + "." + this.dex.strings().get(this.nameIndex);
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.typeIndex);
        section.writeInt(this.nameIndex);
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldId fieldId) {
        int i5 = this.declaringClassIndex;
        int i6 = fieldId.declaringClassIndex;
        if (i5 != i6) {
            return Unsigned.compare(i5, i6);
        }
        int i7 = this.nameIndex;
        int i8 = fieldId.nameIndex;
        if (i7 != i8) {
            return Unsigned.compare(i7, i8);
        }
        return Unsigned.compare(this.typeIndex, fieldId.typeIndex);
    }
}
