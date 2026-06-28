package com.android.dx.rop.cst;

import a1.i;
import com.android.dx.cf.code.BootstrapMethodArgumentsList;
import com.android.dx.rop.cst.CstArray;
import com.android.dx.rop.type.Prototype;

/* loaded from: classes2.dex */
public final class CstCallSite extends CstArray {
    private CstCallSite(CstArray.List list) {
        super(list);
    }

    public static CstCallSite make(CstMethodHandle cstMethodHandle, CstNat cstNat, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        if (cstMethodHandle != null) {
            if (cstNat != null) {
                CstArray.List list = new CstArray.List(bootstrapMethodArgumentsList.size() + 3);
                list.set(0, cstMethodHandle);
                list.set(1, cstNat.getName());
                list.set(2, new CstProtoRef(Prototype.fromDescriptor(cstNat.getDescriptor().getString())));
                for (int i5 = 0; i5 < bootstrapMethodArgumentsList.size(); i5++) {
                    list.set(i5 + 3, bootstrapMethodArgumentsList.get(i5));
                }
                list.setImmutable();
                return new CstCallSite(list);
            }
            throw new NullPointerException("nat == null");
        }
        throw new NullPointerException("bootstrapMethodHandle == null");
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        return getList().compareTo(((CstCallSite) constant).getList());
    }

    @Override // com.android.dx.rop.cst.CstArray
    public boolean equals(Object obj) {
        if (obj instanceof CstCallSite) {
            return getList().equals(((CstCallSite) obj).getList());
        }
        return false;
    }

    @Override // com.android.dx.rop.cst.CstArray
    public int hashCode() {
        return getList().hashCode();
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.util.ToHuman
    public String toHuman() {
        return getList().toHuman("{", ", ", i.f138d);
    }

    @Override // com.android.dx.rop.cst.CstArray
    public String toString() {
        return getList().toString("call site{", ", ", i.f138d);
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public String typeName() {
        return "call site";
    }
}
