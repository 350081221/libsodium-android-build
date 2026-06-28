package com.android.dx.dex.file;

import com.android.dex.Leb128;
import com.android.dx.dex.code.DalvCode;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.uc.crashsdk.export.LogType;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class EncodedMethod extends EncodedMember implements Comparable<EncodedMethod> {
    private final CodeItem code;
    private final CstMethodRef method;

    public EncodedMethod(CstMethodRef cstMethodRef, int i5, DalvCode dalvCode, TypeList typeList) {
        super(i5);
        boolean z4;
        if (cstMethodRef != null) {
            this.method = cstMethodRef;
            if (dalvCode == null) {
                this.code = null;
                return;
            }
            if ((i5 & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.code = new CodeItem(cstMethodRef, dalvCode, z4, typeList);
            return;
        }
        throw new NullPointerException("method == null");
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        CodeItem codeItem = this.code;
        if (codeItem != null) {
            wordData.add(codeItem);
        }
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void debugPrint(PrintWriter printWriter, boolean z4) {
        CodeItem codeItem = this.code;
        if (codeItem == null) {
            printWriter.println(getRef().toHuman() + ": abstract or native");
            return;
        }
        codeItem.debugPrint(printWriter, "  ", z4);
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i5, int i6) {
        boolean z4;
        boolean z5;
        int indexOf = dexFile.getMethodIds().indexOf(this.method);
        int i7 = indexOf - i5;
        int accessFlags = getAccessFlags();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.code);
        if (absoluteOffsetOr0 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((accessFlags & LogType.UNEXP_ANR) == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 == z5) {
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(0, String.format("  [%x] %s", Integer.valueOf(i6), this.method.toHuman()));
                annotatedOutput.annotate(Leb128.unsignedLeb128Size(i7), "    method_idx:   " + Hex.u4(indexOf));
                annotatedOutput.annotate(Leb128.unsignedLeb128Size(accessFlags), "    access_flags: " + AccessFlags.methodString(accessFlags));
                annotatedOutput.annotate(Leb128.unsignedLeb128Size(absoluteOffsetOr0), "    code_off:     " + Hex.u4(absoluteOffsetOr0));
            }
            annotatedOutput.writeUleb128(i7);
            annotatedOutput.writeUleb128(accessFlags);
            annotatedOutput.writeUleb128(absoluteOffsetOr0);
            return indexOf;
        }
        throw new UnsupportedOperationException("code vs. access_flags mismatch");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EncodedMethod) || compareTo((EncodedMethod) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public final CstString getName() {
        return this.method.getNat().getName();
    }

    public final CstMethodRef getRef() {
        return this.method;
    }

    @Override // com.android.dx.util.ToHuman
    public final String toHuman() {
        return this.method.toHuman();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(EncodedMethod.class.getName());
        sb.append('{');
        sb.append(Hex.u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.method);
        if (this.code != null) {
            sb.append(' ');
            sb.append(this.code);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedMethod encodedMethod) {
        return this.method.compareTo((Constant) encodedMethod.method);
    }
}
