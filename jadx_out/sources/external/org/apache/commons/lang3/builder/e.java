package external.org.apache.commons.lang3.builder;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15944a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15945b;

    public e(Object obj) {
        this.f15945b = System.identityHashCode(obj);
        this.f15944a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15945b != eVar.f15945b || this.f15944a != eVar.f15944a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15945b;
    }
}
