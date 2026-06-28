package com.android.dx.rop.cst;

import com.android.dx.rop.type.Type;
import com.android.dx.util.Hex;
import com.swift.sandhook.annotation.MethodReflectParams;

/* loaded from: classes2.dex */
public final class CstShort extends CstLiteral32 {
    public static final CstShort VALUE_0 = make((short) 0);

    private CstShort(short s5) {
        super(s5);
    }

    public static CstShort make(short s5) {
        return new CstShort(s5);
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.SHORT;
    }

    public short getValue() {
        return (short) getIntBits();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "short{0x" + Hex.u2(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return MethodReflectParams.SHORT;
    }

    public static CstShort make(int i5) {
        short s5 = (short) i5;
        if (s5 == i5) {
            return make(s5);
        }
        throw new IllegalArgumentException("bogus short value: " + i5);
    }
}
