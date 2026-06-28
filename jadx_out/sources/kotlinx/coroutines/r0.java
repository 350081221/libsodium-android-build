package kotlinx.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/a;", "", "toString", "C0", "name", "D0", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", bi.ay, "Ljava/lang/String;", "F0", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class r0 extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f20457b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final String f20458a;

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/r0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/r0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a implements g.c<r0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public r0(@p4.l String str) {
        super(f20457b);
        this.f20458a = str;
    }

    public static /* synthetic */ r0 E0(r0 r0Var, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = r0Var.f20458a;
        }
        return r0Var.D0(str);
    }

    @p4.l
    public final String C0() {
        return this.f20458a;
    }

    @p4.l
    public final r0 D0(@p4.l String str) {
        return new r0(str);
    }

    @p4.l
    public final String F0() {
        return this.f20458a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && kotlin.jvm.internal.l0.g(this.f20458a, ((r0) obj).f20458a);
    }

    public int hashCode() {
        return this.f20458a.hashCode();
    }

    @p4.l
    public String toString() {
        return "CoroutineName(" + this.f20458a + ')';
    }
}
