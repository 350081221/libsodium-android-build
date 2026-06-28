package com.android.dx;

import com.android.dx.rop.code.RegisterSpec;

/* loaded from: classes2.dex */
public final class Local<T> {
    private final Code code;
    private int reg = -1;
    private RegisterSpec spec;
    final TypeId<T> type;

    private Local(Code code, TypeId<T> typeId) {
        this.code = code;
        this.type = typeId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Local<T> get(Code code, TypeId<T> typeId) {
        return new Local<>(code, typeId);
    }

    public TypeId getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int initialize(int i5) {
        this.reg = i5;
        this.spec = RegisterSpec.make(i5, this.type.ropType);
        return size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int size() {
        return this.type.ropType.getCategory();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegisterSpec spec() {
        if (this.spec == null) {
            this.code.initializeLocals();
            if (this.spec == null) {
                throw new AssertionError();
            }
        }
        return this.spec;
    }

    public String toString() {
        return "v" + this.reg + "(" + this.type + ")";
    }
}
