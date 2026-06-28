package kotlinx.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/n3;", "", "Lkotlin/coroutines/a;", "toString", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "H0", "oldState", "Lkotlin/r2;", "G0", "", "C0", "id", "D0", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", bi.ay, "J", "F0", "()J", "<init>", "(J)V", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class q0 extends kotlin.coroutines.a implements n3<String> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f20444b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f20445a;

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/q0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/q0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a implements g.c<q0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public q0(long j5) {
        super(f20444b);
        this.f20445a = j5;
    }

    public static /* synthetic */ q0 E0(q0 q0Var, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = q0Var.f20445a;
        }
        return q0Var.D0(j5);
    }

    public final long C0() {
        return this.f20445a;
    }

    @p4.l
    public final q0 D0(long j5) {
        return new q0(j5);
    }

    public final long F0() {
        return this.f20445a;
    }

    @Override // kotlinx.coroutines.n3
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void restoreThreadContext(@p4.l kotlin.coroutines.g gVar, @p4.l String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.n3
    @p4.l
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public String updateThreadContext(@p4.l kotlin.coroutines.g gVar) {
        String str;
        int D3;
        r0 r0Var = (r0) gVar.get(r0.f20457b);
        if (r0Var == null || (str = r0Var.F0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        D3 = kotlin.text.f0.D3(name, " @", 0, false, 6, null);
        if (D3 < 0) {
            D3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + D3 + 10);
        String substring = name.substring(0, D3);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f20445a);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f20445a == ((q0) obj).f20445a;
    }

    public int hashCode() {
        return Long.hashCode(this.f20445a);
    }

    @p4.l
    public String toString() {
        return "CoroutineId(" + this.f20445a + ')';
    }
}
