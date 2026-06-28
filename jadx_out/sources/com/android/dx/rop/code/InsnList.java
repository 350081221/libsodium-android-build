package com.android.dx.rop.code;

import com.android.dx.rop.code.Insn;
import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class InsnList extends FixedSizeList {
    public InsnList(int i5) {
        super(i5);
    }

    public boolean contentEquals(InsnList insnList) {
        int size;
        if (insnList == null || (size = size()) != insnList.size()) {
            return false;
        }
        for (int i5 = 0; i5 < size; i5++) {
            if (!get(i5).contentEquals(insnList.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public void forEach(Insn.Visitor visitor) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            get(i5).accept(visitor);
        }
    }

    public Insn get(int i5) {
        return (Insn) get0(i5);
    }

    public Insn getLast() {
        return get(size() - 1);
    }

    public void set(int i5, Insn insn) {
        set0(i5, insn);
    }

    public InsnList withRegisterOffset(int i5) {
        int size = size();
        InsnList insnList = new InsnList(size);
        for (int i6 = 0; i6 < size; i6++) {
            Insn insn = (Insn) get0(i6);
            if (insn != null) {
                insnList.set0(i6, insn.withRegisterOffset(i5));
            }
        }
        if (isImmutable()) {
            insnList.setImmutable();
        }
        return insnList;
    }
}
