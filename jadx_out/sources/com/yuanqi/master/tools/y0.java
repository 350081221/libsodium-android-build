package com.yuanqi.master.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/master/tools/NetworkUtil;", "", "()V", "isNetworkConnected", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final y0 f15274a = new y0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15275b = 0;

    private y0() {
    }

    public final boolean a(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }
}
