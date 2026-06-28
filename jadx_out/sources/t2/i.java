package t2;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.remote.InstalledAppInfo;
import com.yuanqi.group.App;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.jdeferred.p;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f22479b = new i();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.yuanqi.group.home.models.i> f22480a = new HashMap();

    public static i d() {
        return f22479b;
    }

    private com.yuanqi.group.home.models.i f(String str) {
        InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(str, 0);
        if (installedAppInfo != null) {
            com.yuanqi.group.home.models.i iVar = new com.yuanqi.group.home.models.i(App.f13716d.a(), installedAppInfo);
            synchronized (this.f22480a) {
                this.f22480a.put(str, iVar);
            }
            return iVar;
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.yuanqi.group.home.models.i e(String str) {
        com.yuanqi.group.home.models.i iVar;
        synchronized (this.f22480a) {
            iVar = this.f22480a.get(str);
            if (iVar == null) {
                iVar = f(str);
            }
        }
        return iVar;
    }

    public void c(final String str, final q2.c<com.yuanqi.group.home.models.i> cVar) {
        p h5 = com.yuanqi.group.abs.ui.b.a().h(new Callable() { // from class: t2.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.yuanqi.group.home.models.i e5;
                e5 = i.this.e(str);
                return e5;
            }
        });
        Objects.requireNonNull(cVar);
        h5.d(new org.jdeferred.g() { // from class: t2.h
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                q2.c.this.a((com.yuanqi.group.home.models.i) obj);
            }
        });
    }
}
