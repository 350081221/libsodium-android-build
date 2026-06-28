package com.android.dx.rop.code;

import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.FixedSizeList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class RegisterSpecList extends FixedSizeList implements TypeList {
    public static final RegisterSpecList EMPTY = new RegisterSpecList(0);

    /* loaded from: classes2.dex */
    private static class Expander {
        private int base;
        private final BitSet compatRegs;
        private boolean duplicateFirst;
        private final RegisterSpecList regSpecList;
        private final RegisterSpecList result;

        /* JADX INFO: Access modifiers changed from: private */
        public void expandRegister(int i5) {
            expandRegister(i5, (RegisterSpec) this.regSpecList.get0(i5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RegisterSpecList getResult() {
            if (this.regSpecList.isImmutable()) {
                this.result.setImmutable();
            }
            return this.result;
        }

        private Expander(RegisterSpecList registerSpecList, BitSet bitSet, int i5, boolean z4) {
            this.regSpecList = registerSpecList;
            this.compatRegs = bitSet;
            this.base = i5;
            this.result = new RegisterSpecList(registerSpecList.size());
            this.duplicateFirst = z4;
        }

        private void expandRegister(int i5, RegisterSpec registerSpec) {
            BitSet bitSet = this.compatRegs;
            boolean z4 = true;
            if (bitSet != null && bitSet.get(i5)) {
                z4 = false;
            }
            if (z4) {
                registerSpec = registerSpec.withReg(this.base);
                if (!this.duplicateFirst) {
                    this.base += registerSpec.getCategory();
                }
            }
            this.duplicateFirst = false;
            this.result.set0(i5, registerSpec);
        }
    }

    public RegisterSpecList(int i5) {
        super(i5);
    }

    public static RegisterSpecList make(RegisterSpec registerSpec) {
        RegisterSpecList registerSpecList = new RegisterSpecList(1);
        registerSpecList.set(0, registerSpec);
        return registerSpecList;
    }

    public RegisterSpec get(int i5) {
        return (RegisterSpec) get0(i5);
    }

    public int getRegistersSize() {
        int nextReg;
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RegisterSpec registerSpec = (RegisterSpec) get0(i6);
            if (registerSpec != null && (nextReg = registerSpec.getNextReg()) > i5) {
                i5 = nextReg;
            }
        }
        return i5;
    }

    @Override // com.android.dx.rop.type.TypeList
    public Type getType(int i5) {
        return get(i5).getType().getType();
    }

    @Override // com.android.dx.rop.type.TypeList
    public int getWordCount() {
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += getType(i6).getCategory();
        }
        return i5;
    }

    public int indexOfRegister(int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (get(i6).getReg() == i5) {
                return i6;
            }
        }
        return -1;
    }

    public void set(int i5, RegisterSpec registerSpec) {
        set0(i5, registerSpec);
    }

    public RegisterSpec specForRegister(int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            RegisterSpec registerSpec = get(i6);
            if (registerSpec.getReg() == i5) {
                return registerSpec;
            }
        }
        return null;
    }

    public RegisterSpecList subset(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        int i5 = 0;
        for (int i6 = 0; i6 < size(); i6++) {
            if (!bitSet.get(i6)) {
                registerSpecList.set0(i5, get0(i6));
                i5++;
            }
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    @Override // com.android.dx.rop.type.TypeList
    public TypeList withAddedType(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    public RegisterSpecList withExpandedRegisters(int i5, boolean z4, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        Expander expander = new Expander(bitSet, i5, z4);
        for (int i6 = 0; i6 < size; i6++) {
            expander.expandRegister(i6);
        }
        return expander.getResult();
    }

    public RegisterSpecList withFirst(RegisterSpec registerSpec) {
        int size = size();
        RegisterSpecList registerSpecList = new RegisterSpecList(size + 1);
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            registerSpecList.set0(i6, get0(i5));
            i5 = i6;
        }
        registerSpecList.set0(0, registerSpec);
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public RegisterSpecList withOffset(int i5) {
        int size = size();
        if (size == 0) {
            return this;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        for (int i6 = 0; i6 < size; i6++) {
            RegisterSpec registerSpec = (RegisterSpec) get0(i6);
            if (registerSpec != null) {
                registerSpecList.set0(i6, registerSpec.withOffset(i5));
            }
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public RegisterSpecList withoutFirst() {
        int size = size() - 1;
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            registerSpecList.set0(i5, get0(i6));
            i5 = i6;
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public RegisterSpecList withoutLast() {
        int size = size() - 1;
        if (size == 0) {
            return EMPTY;
        }
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        for (int i5 = 0; i5 < size; i5++) {
            registerSpecList.set0(i5, get0(i5));
        }
        if (isImmutable()) {
            registerSpecList.setImmutable();
        }
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        RegisterSpecList registerSpecList = new RegisterSpecList(2);
        registerSpecList.set(0, registerSpec);
        registerSpecList.set(1, registerSpec2);
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2, RegisterSpec registerSpec3) {
        RegisterSpecList registerSpecList = new RegisterSpecList(3);
        registerSpecList.set(0, registerSpec);
        registerSpecList.set(1, registerSpec2);
        registerSpecList.set(2, registerSpec3);
        return registerSpecList;
    }

    public static RegisterSpecList make(RegisterSpec registerSpec, RegisterSpec registerSpec2, RegisterSpec registerSpec3, RegisterSpec registerSpec4) {
        RegisterSpecList registerSpecList = new RegisterSpecList(4);
        registerSpecList.set(0, registerSpec);
        registerSpecList.set(1, registerSpec2);
        registerSpecList.set(2, registerSpec3);
        registerSpecList.set(3, registerSpec4);
        return registerSpecList;
    }
}
