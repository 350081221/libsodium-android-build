package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public abstract class j1 extends q implements kotlin.reflect.o {
    private final boolean syntheticJavaProperty;

    public j1() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.q
    public kotlin.reflect.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (getOwner().equals(j1Var.getOwner()) && getName().equals(j1Var.getName()) && getSignature().equals(j1Var.getSignature()) && l0.g(getBoundReceiver(), j1Var.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof kotlin.reflect.o)) {
            return false;
        }
        return obj.equals(compute());
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.o
    @kotlin.g1(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.o
    @kotlin.g1(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.g1(version = "1.1")
    public kotlin.reflect.o getReflected() {
        if (!this.syntheticJavaProperty) {
            return (kotlin.reflect.o) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @kotlin.g1(version = "1.1")
    public j1(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @kotlin.g1(version = "1.4")
    public j1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.syntheticJavaProperty = (i5 & 2) == 2;
    }
}
