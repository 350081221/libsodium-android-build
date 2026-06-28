package kotlin.reflect;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.g1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.1")
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f19593c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final u f19594d = new u(null, null);

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final v f19595a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final s f19596b;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "star", "getStar$annotations", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @a1
        public static /* synthetic */ void d() {
        }

        @p4.l
        @u3.m
        public final u a(@p4.l s type) {
            l0.p(type, "type");
            return new u(v.IN, type);
        }

        @p4.l
        @u3.m
        public final u b(@p4.l s type) {
            l0.p(type, "type");
            return new u(v.OUT, type);
        }

        @p4.l
        public final u c() {
            return u.f19594d;
        }

        @p4.l
        @u3.m
        public final u e(@p4.l s type) {
            l0.p(type, "type");
            return new u(v.INVARIANT, type);
        }
    }

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19597a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19597a = iArr;
        }
    }

    public u(@p4.m v vVar, @p4.m s sVar) {
        boolean z4;
        boolean z5;
        String str;
        this.f19595a = vVar;
        this.f19596b = sVar;
        if (vVar == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (sVar == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!(z4 == z5)) {
            if (vVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + vVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @p4.l
    @u3.m
    public static final u c(@p4.l s sVar) {
        return f19593c.a(sVar);
    }

    public static /* synthetic */ u e(u uVar, v vVar, s sVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            vVar = uVar.f19595a;
        }
        if ((i5 & 2) != 0) {
            sVar = uVar.f19596b;
        }
        return uVar.d(vVar, sVar);
    }

    @p4.l
    @u3.m
    public static final u f(@p4.l s sVar) {
        return f19593c.b(sVar);
    }

    @p4.l
    @u3.m
    public static final u i(@p4.l s sVar) {
        return f19593c.e(sVar);
    }

    @p4.m
    public final v a() {
        return this.f19595a;
    }

    @p4.m
    public final s b() {
        return this.f19596b;
    }

    @p4.l
    public final u d(@p4.m v vVar, @p4.m s sVar) {
        return new u(vVar, sVar);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f19595a == uVar.f19595a && l0.g(this.f19596b, uVar.f19596b);
    }

    @p4.m
    public final s g() {
        return this.f19596b;
    }

    @p4.m
    public final v h() {
        return this.f19595a;
    }

    public int hashCode() {
        v vVar = this.f19595a;
        int hashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        s sVar = this.f19596b;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    @p4.l
    public String toString() {
        int i5;
        v vVar = this.f19595a;
        if (vVar == null) {
            i5 = -1;
        } else {
            i5 = b.f19597a[vVar.ordinal()];
        }
        if (i5 != -1) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return "out " + this.f19596b;
                    }
                    throw new j0();
                }
                return "in " + this.f19596b;
            }
            return String.valueOf(this.f19596b);
        }
        return org.slf4j.d.ANY_MARKER;
    }
}
