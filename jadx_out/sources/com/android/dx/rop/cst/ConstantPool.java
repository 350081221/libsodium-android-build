package com.android.dx.rop.cst;

/* loaded from: classes2.dex */
public interface ConstantPool {
    Constant get(int i5);

    Constant get0Ok(int i5);

    Constant[] getEntries();

    Constant getOrNull(int i5);

    int size();
}
