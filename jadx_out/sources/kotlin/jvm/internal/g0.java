package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class g0 extends q implements e0, kotlin.reflect.i {
    private final int arity;

    @kotlin.g1(version = "1.4")
    private final int flags;

    public g0(int i5) {
        this(i5, q.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.q
    @kotlin.g1(version = "1.1")
    protected kotlin.reflect.c computeReflected() {
        return l1.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (getName().equals(g0Var.getName()) && getSignature().equals(g0Var.getSignature()) && this.flags == g0Var.flags && this.arity == g0Var.arity && l0.g(getBoundReceiver(), g0Var.getBoundReceiver()) && l0.g(getOwner(), g0Var.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof kotlin.reflect.i)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.i
    @kotlin.g1(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.i
    @kotlin.g1(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.i
    @kotlin.g1(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.i
    @kotlin.g1(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.q, kotlin.reflect.c, kotlin.reflect.i
    @kotlin.g1(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @kotlin.g1(version = "1.1")
    public g0(int i5, Object obj) {
        this(i5, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.g1(version = "1.1")
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @kotlin.g1(version = "1.4")
    public g0(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.arity = i5;
        this.flags = i6 >> 1;
    }
}
