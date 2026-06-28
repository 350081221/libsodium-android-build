package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yuanqi/master/tools/Failure;", "", "e", "", "msg", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getE", "()Ljava/lang/Throwable;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f15242c = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Throwable f15243a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final String f15244b;

    public r0(@p4.l Throwable e5, @p4.l String msg) {
        kotlin.jvm.internal.l0.p(e5, "e");
        kotlin.jvm.internal.l0.p(msg, "msg");
        this.f15243a = e5;
        this.f15244b = msg;
    }

    public static /* synthetic */ r0 d(r0 r0Var, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = r0Var.f15243a;
        }
        if ((i5 & 2) != 0) {
            str = r0Var.f15244b;
        }
        return r0Var.c(th, str);
    }

    @p4.l
    public final Throwable a() {
        return this.f15243a;
    }

    @p4.l
    public final String b() {
        return this.f15244b;
    }

    @p4.l
    public final r0 c(@p4.l Throwable e5, @p4.l String msg) {
        kotlin.jvm.internal.l0.p(e5, "e");
        kotlin.jvm.internal.l0.p(msg, "msg");
        return new r0(e5, msg);
    }

    @p4.l
    public final Throwable e() {
        return this.f15243a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.l0.g(this.f15243a, r0Var.f15243a) && kotlin.jvm.internal.l0.g(this.f15244b, r0Var.f15244b);
    }

    @p4.l
    public final String f() {
        return this.f15244b;
    }

    public int hashCode() {
        return (this.f15243a.hashCode() * 31) + this.f15244b.hashCode();
    }

    @p4.l
    public String toString() {
        return "Failure(e=" + this.f15243a + ", msg=" + this.f15244b + ')';
    }

    public /* synthetic */ r0(Throwable th, String str, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? new Exception("Something went wrong") : th, str);
    }
}
