package com.yuanqi.master.config;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/yuanqi/master/config/SortApp;", "", "()V", TTDownloadField.TT_APP_NAME, "", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", TTDownloadField.TT_PACKAGE_NAME, "getPackageName", "setPackageName", "sortIndex", "getSortIndex", "setSortIndex", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f14562e = 8;

    /* renamed from: a, reason: collision with root package name */
    private int f14563a;

    /* renamed from: c, reason: collision with root package name */
    private int f14565c;

    /* renamed from: b, reason: collision with root package name */
    @l
    private String f14564b = "";

    /* renamed from: d, reason: collision with root package name */
    @l
    private String f14566d = "";

    @l
    public final String a() {
        return this.f14564b;
    }

    public final int b() {
        return this.f14563a;
    }

    @l
    public final String c() {
        return this.f14566d;
    }

    public final int d() {
        return this.f14565c;
    }

    public final void e(@l String str) {
        l0.p(str, "<set-?>");
        this.f14564b = str;
    }

    public final void f(int i5) {
        this.f14563a = i5;
    }

    public final void g(@l String str) {
        l0.p(str, "<set-?>");
        this.f14566d = str;
    }

    public final void h(int i5) {
        this.f14565c = i5;
    }

    @l
    public String toString() {
        return "SortApp(id=" + this.f14563a + ", appName='" + this.f14564b + "', sortIndex=" + this.f14565c + ", packageName='" + this.f14566d + "')";
    }
}
