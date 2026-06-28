package com.android.dx.cf.attrib;

import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.util.ByteArray;

/* loaded from: classes2.dex */
public final class RawAttribute extends BaseAttribute {
    private final ByteArray data;
    private final ConstantPool pool;

    public RawAttribute(String str, ByteArray byteArray, ConstantPool constantPool) {
        super(str);
        if (byteArray != null) {
            this.data = byteArray;
            this.pool = constantPool;
            return;
        }
        throw new NullPointerException("data == null");
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.data.size() + 6;
    }

    public ByteArray getData() {
        return this.data;
    }

    public ConstantPool getPool() {
        return this.pool;
    }

    public RawAttribute(String str, ByteArray byteArray, int i5, int i6, ConstantPool constantPool) {
        this(str, byteArray.slice(i5, i6 + i5), constantPool);
    }
}
