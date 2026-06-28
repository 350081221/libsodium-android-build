package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.g1(version = "1.4")
/* loaded from: classes4.dex */
public class a implements e0, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i5, Class cls, String str, String str2, int i6) {
        this(i5, q.NO_RECEIVER, cls, str, str2, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && l0.g(this.receiver, aVar.receiver) && l0.g(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return this.arity;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return l1.g(cls);
        }
        return l1.d(cls);
    }

    public int hashCode() {
        int i5;
        int i6;
        Object obj = this.receiver;
        int i7 = 0;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = i5 * 31;
        Class cls = this.owner;
        if (cls != null) {
            i7 = cls.hashCode();
        }
        int hashCode = (((((i8 + i7) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return ((((hashCode + i6) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return l1.w(this);
    }

    public a(int i5, Object obj, Class cls, String str, String str2, int i6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i6 & 1) == 1;
        this.arity = i5;
        this.flags = i6 >> 1;
    }
}
