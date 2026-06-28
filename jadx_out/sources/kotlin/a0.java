package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", "", "", TTDownloadField.TT_HASHCODE, "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.1")
/* loaded from: classes3.dex */
public final class a0 implements Comparable<a0> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f19079f = 255;

    /* renamed from: a, reason: collision with root package name */
    private final int f19081a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19082b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19083c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19084d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f19078e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final a0 f19080g = b0.a();

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public a0(int i5, int i6, int i7) {
        this.f19081a = i5;
        this.f19082b = i6;
        this.f19083c = i7;
        this.f19084d = k(i5, i6, i7);
    }

    private final int k(int i5, int i6, int i7) {
        boolean z4 = false;
        if (new kotlin.ranges.l(0, 255).l(i5) && new kotlin.ranges.l(0, 255).l(i6) && new kotlin.ranges.l(0, 255).l(i7)) {
            z4 = true;
        }
        if (z4) {
            return (i5 << 16) + (i6 << 8) + i7;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i5 + external.org.apache.commons.lang3.d.f15957a + i6 + external.org.apache.commons.lang3.d.f15957a + i7).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@p4.l a0 other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return this.f19084d - other.f19084d;
    }

    public final int e() {
        return this.f19081a;
    }

    public boolean equals(@p4.m Object obj) {
        a0 a0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var != null && this.f19084d == a0Var.f19084d) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f19082b;
    }

    public final int h() {
        return this.f19083c;
    }

    public int hashCode() {
        return this.f19084d;
    }

    public final boolean i(int i5, int i6) {
        int i7 = this.f19081a;
        if (i7 <= i5 && (i7 != i5 || this.f19082b < i6)) {
            return false;
        }
        return true;
    }

    public final boolean j(int i5, int i6, int i7) {
        int i8;
        int i9 = this.f19081a;
        if (i9 <= i5 && (i9 != i5 || ((i8 = this.f19082b) <= i6 && (i8 != i6 || this.f19083c < i7)))) {
            return false;
        }
        return true;
    }

    @p4.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19081a);
        sb.append(external.org.apache.commons.lang3.d.f15957a);
        sb.append(this.f19082b);
        sb.append(external.org.apache.commons.lang3.d.f15957a);
        sb.append(this.f19083c);
        return sb.toString();
    }

    public a0(int i5, int i6) {
        this(i5, i6, 0);
    }
}
