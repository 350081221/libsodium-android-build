package com.bytedance.pangle.f;

import com.bytedance.pangle.ZeusPluginInstallListener;
import com.bytedance.pangle.d;

/* loaded from: classes2.dex */
public final class b extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private final ZeusPluginInstallListener f4406a;

    public b(ZeusPluginInstallListener zeusPluginInstallListener) {
        this.f4406a = zeusPluginInstallListener;
    }

    @Override // com.bytedance.pangle.d
    public final void a(String str, int i5, String str2) {
        ZeusPluginInstallListener zeusPluginInstallListener = this.f4406a;
        if (zeusPluginInstallListener != null) {
            zeusPluginInstallListener.onPluginInstall(str, i5, str2);
        }
    }
}
