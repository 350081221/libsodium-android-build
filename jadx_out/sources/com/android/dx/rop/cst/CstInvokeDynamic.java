package com.android.dx.rop.cst;

import com.android.dx.rop.type.Prototype;
import com.android.dx.rop.type.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class CstInvokeDynamic extends Constant {
    private final int bootstrapMethodIndex;
    private CstCallSite callSite;
    private CstType declaringClass;
    private final CstNat nat;
    private final Prototype prototype;
    private final List<CstCallSiteRef> references = new ArrayList();

    private CstInvokeDynamic(int i5, CstNat cstNat) {
        this.bootstrapMethodIndex = i5;
        this.nat = cstNat;
        this.prototype = Prototype.fromDescriptor(cstNat.getDescriptor().toHuman());
    }

    public static CstInvokeDynamic make(int i5, CstNat cstNat) {
        return new CstInvokeDynamic(i5, cstNat);
    }

    public CstCallSiteRef addReference() {
        CstCallSiteRef cstCallSiteRef = new CstCallSiteRef(this, this.references.size());
        this.references.add(cstCallSiteRef);
        return cstCallSiteRef;
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) constant;
        int compare = Integer.compare(this.bootstrapMethodIndex, cstInvokeDynamic.getBootstrapMethodIndex());
        if (compare != 0) {
            return compare;
        }
        int compareTo = this.nat.compareTo((Constant) cstInvokeDynamic.getNat());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.declaringClass.compareTo((Constant) cstInvokeDynamic.getDeclaringClass());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return this.callSite.compareTo((Constant) cstInvokeDynamic.getCallSite());
    }

    public int getBootstrapMethodIndex() {
        return this.bootstrapMethodIndex;
    }

    public CstCallSite getCallSite() {
        return this.callSite;
    }

    public CstType getDeclaringClass() {
        return this.declaringClass;
    }

    public CstNat getNat() {
        return this.nat;
    }

    public Prototype getPrototype() {
        return this.prototype;
    }

    public List<CstCallSiteRef> getReferences() {
        return this.references;
    }

    public Type getReturnType() {
        return this.prototype.getReturnType();
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    public void setCallSite(CstCallSite cstCallSite) {
        if (this.callSite == null) {
            if (cstCallSite != null) {
                this.callSite = cstCallSite;
                return;
            }
            throw new NullPointerException("callSite == null");
        }
        throw new IllegalArgumentException("already added call site");
    }

    public void setDeclaringClass(CstType cstType) {
        if (this.declaringClass == null) {
            if (cstType != null) {
                this.declaringClass = cstType;
                return;
            }
            throw new NullPointerException("declaringClass == null");
        }
        throw new IllegalArgumentException("already added declaring class");
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        String str;
        CstType cstType = this.declaringClass;
        if (cstType != null) {
            str = cstType.toHuman();
        } else {
            str = "Unknown";
        }
        return "InvokeDynamic(" + str + ":" + this.bootstrapMethodIndex + ", " + this.nat.toHuman() + ")";
    }

    public String toString() {
        return toHuman();
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "InvokeDynamic";
    }
}
