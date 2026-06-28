package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.g1(version = "1.7")
/* loaded from: classes4.dex */
public class c0 extends g0 implements Serializable {
    private final Class funInterface;

    public c0(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // kotlin.jvm.internal.g0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return this.funInterface.equals(((c0) obj).funInterface);
    }

    @Override // kotlin.jvm.internal.g0
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // kotlin.jvm.internal.g0
    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.g0, kotlin.jvm.internal.q
    public kotlin.reflect.i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
