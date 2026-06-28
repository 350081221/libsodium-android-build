package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.AnnotatedOutput;

/* loaded from: classes2.dex */
public final class HighRegisterPrefix extends VariableSizeInsn {
    private SimpleInsn[] insns;

    public HighRegisterPrefix(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(sourcePosition, registerSpecList);
        if (registerSpecList.size() != 0) {
            this.insns = null;
            return;
        }
        throw new IllegalArgumentException("registers.size() == 0");
    }

    private void calculateInsnsIfNecessary() {
        if (this.insns != null) {
            return;
        }
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        this.insns = new SimpleInsn[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RegisterSpec registerSpec = registers.get(i6);
            this.insns[i6] = moveInsnFor(registerSpec, i5);
            i5 += registerSpec.getCategory();
        }
    }

    private static SimpleInsn moveInsnFor(RegisterSpec registerSpec, int i5) {
        return DalvInsn.makeMove(SourcePosition.NO_INFO, RegisterSpec.make(i5, registerSpec.getType()), registerSpec);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        return null;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
        calculateInsnsIfNecessary();
        int i5 = 0;
        for (SimpleInsn simpleInsn : this.insns) {
            i5 += simpleInsn.codeSize();
        }
        return i5;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String listingString0(boolean z4) {
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        StringBuilder sb = new StringBuilder(100);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RegisterSpec registerSpec = registers.get(i6);
            SimpleInsn moveInsnFor = moveInsnFor(registerSpec, i5);
            if (i6 != 0) {
                sb.append('\n');
            }
            sb.append(moveInsnFor.listingString0(z4));
            i5 += registerSpec.getCategory();
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new HighRegisterPrefix(getPosition(), registerSpecList);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(AnnotatedOutput annotatedOutput) {
        calculateInsnsIfNecessary();
        for (SimpleInsn simpleInsn : this.insns) {
            simpleInsn.writeTo(annotatedOutput);
        }
    }
}
