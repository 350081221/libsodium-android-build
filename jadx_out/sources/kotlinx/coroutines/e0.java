package kotlinx.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/e0;", "", bi.ay, "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "b", "result", "onCancellation", "c", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Ljava/lang/Object;", "Lv3/l;", "<init>", "(Ljava/lang/Object;Lv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    @u3.e
    public final Object f20021a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public final v3.l<Throwable, kotlin.r2> f20022b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@p4.m Object obj, @p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        this.f20021a = obj;
        this.f20022b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 d(e0 e0Var, Object obj, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = e0Var.f20021a;
        }
        if ((i5 & 2) != 0) {
            lVar = e0Var.f20022b;
        }
        return e0Var.c(obj, lVar);
    }

    @p4.m
    public final Object a() {
        return this.f20021a;
    }

    @p4.l
    public final v3.l<Throwable, kotlin.r2> b() {
        return this.f20022b;
    }

    @p4.l
    public final e0 c(@p4.m Object obj, @p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        return new e0(obj, lVar);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.l0.g(this.f20021a, e0Var.f20021a) && kotlin.jvm.internal.l0.g(this.f20022b, e0Var.f20022b);
    }

    public int hashCode() {
        Object obj = this.f20021a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f20022b.hashCode();
    }

    @p4.l
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f20021a + ", onCancellation=" + this.f20022b + ')';
    }
}
