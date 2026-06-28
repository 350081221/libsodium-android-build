package com.android.dx.dex.file;

import com.android.dex.Leb128;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class EncodedField extends EncodedMember implements Comparable<EncodedField> {
    private final CstFieldRef field;

    public EncodedField(CstFieldRef cstFieldRef, int i5) {
        super(i5);
        if (cstFieldRef != null) {
            this.field = cstFieldRef;
            return;
        }
        throw new NullPointerException("field == null");
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void addContents(DexFile dexFile) {
        dexFile.getFieldIds().intern(this.field);
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void debugPrint(PrintWriter printWriter, boolean z4) {
        printWriter.println(toString());
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i5, int i6) {
        int indexOf = dexFile.getFieldIds().indexOf(this.field);
        int i7 = indexOf - i5;
        int accessFlags = getAccessFlags();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", Integer.valueOf(i6), this.field.toHuman()));
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(i7), "    field_idx:    " + Hex.u4(indexOf));
            annotatedOutput.annotate(Leb128.unsignedLeb128Size(accessFlags), "    access_flags: " + AccessFlags.fieldString(accessFlags));
        }
        annotatedOutput.writeUleb128(i7);
        annotatedOutput.writeUleb128(accessFlags);
        return indexOf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EncodedField) || compareTo((EncodedField) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public CstString getName() {
        return this.field.getNat().getName();
    }

    public CstFieldRef getRef() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.field.toHuman();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(EncodedField.class.getName());
        sb.append('{');
        sb.append(Hex.u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.field);
        sb.append('}');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedField encodedField) {
        return this.field.compareTo((Constant) encodedField.field);
    }
}
