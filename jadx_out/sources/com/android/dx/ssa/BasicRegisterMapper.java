package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.util.IntList;

/* loaded from: classes2.dex */
public class BasicRegisterMapper extends RegisterMapper {
    private final IntList oldToNew;
    private int runningCountNewRegisters;

    public BasicRegisterMapper(int i5) {
        this.oldToNew = new IntList(i5);
    }

    public void addMapping(int i5, int i6, int i7) {
        if (i5 >= this.oldToNew.size()) {
            for (int size = i5 - this.oldToNew.size(); size >= 0; size--) {
                this.oldToNew.add(-1);
            }
        }
        this.oldToNew.set(i5, i6);
        int i8 = i6 + i7;
        if (this.runningCountNewRegisters < i8) {
            this.runningCountNewRegisters = i8;
        }
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public int getNewRegisterCount() {
        return this.runningCountNewRegisters;
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public RegisterSpec map(RegisterSpec registerSpec) {
        int i5;
        if (registerSpec == null) {
            return null;
        }
        try {
            i5 = this.oldToNew.get(registerSpec.getReg());
        } catch (IndexOutOfBoundsException unused) {
            i5 = -1;
        }
        if (i5 >= 0) {
            return registerSpec.withReg(i5);
        }
        throw new RuntimeException("no mapping specified for register");
    }

    public int oldToNew(int i5) {
        if (i5 >= this.oldToNew.size()) {
            return -1;
        }
        return this.oldToNew.get(i5);
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Old\tNew\n");
        int size = this.oldToNew.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append(i5);
            sb.append('\t');
            sb.append(this.oldToNew.get(i5));
            sb.append('\n');
        }
        sb.append("new reg count:");
        sb.append(this.runningCountNewRegisters);
        sb.append('\n');
        return sb.toString();
    }
}
