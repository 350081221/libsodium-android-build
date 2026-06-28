package com.ss.android.downloadlib.b;

import android.os.Build;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.a.a;

/* loaded from: classes3.dex */
public class c {
    public static void a(final com.ss.android.downloadad.api.a.b bVar, @NonNull final com.ss.android.downloadlib.guide.install.a aVar) {
        boolean b5 = com.ss.android.socialbase.downloader.a.a.a().b();
        if (!b5 && Build.VERSION.SDK_INT >= 29) {
            m.c();
        }
        boolean b6 = com.ss.android.socialbase.downloader.a.a.a().b();
        if (!b5 && b6 && bVar != null) {
            bVar.l(true);
        }
        aVar.a();
        com.ss.android.socialbase.downloader.c.a.b("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->isAppForegroundSecond:::" + b6);
        if (!b6) {
            com.ss.android.socialbase.downloader.a.a.a().a(new a.InterfaceC0196a() { // from class: com.ss.android.downloadlib.b.c.1
                @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
                public void b() {
                    com.ss.android.socialbase.downloader.c.a.b("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->onAppForeground");
                    com.ss.android.socialbase.downloader.a.a.a().b(this);
                    if (!m.b(com.ss.android.downloadad.api.a.b.this)) {
                        com.ss.android.downloadad.api.a.b.this.m(true);
                        com.ss.android.downloadlib.d.a.a().a("install_delay_invoke", com.ss.android.downloadad.api.a.b.this);
                        aVar.a();
                    }
                }

                @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
                public void c() {
                }
            });
        }
    }
}
