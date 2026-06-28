package com.android.dx.dex.code;

import com.android.dx.dex.DexOptions;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OutputCollector {
    private final OutputFinisher finisher;
    private ArrayList<DalvInsn> suffix;

    public OutputCollector(DexOptions dexOptions, int i5, int i6, int i7, int i8) {
        this.finisher = new OutputFinisher(dexOptions, i5, i7, i8);
        this.suffix = new ArrayList<>(i6);
    }

    private void appendSuffixToOutput() {
        int size = this.suffix.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.finisher.add(this.suffix.get(i5));
        }
        this.suffix = null;
    }

    public void add(DalvInsn dalvInsn) {
        this.finisher.add(dalvInsn);
    }

    public void addSuffix(DalvInsn dalvInsn) {
        this.suffix.add(dalvInsn);
    }

    public OutputFinisher getFinisher() {
        if (this.suffix != null) {
            appendSuffixToOutput();
            return this.finisher;
        }
        throw new UnsupportedOperationException("already processed");
    }

    public void reverseBranch(int i5, CodeAddress codeAddress) {
        this.finisher.reverseBranch(i5, codeAddress);
    }
}
