package com.bytedance.pangle.service.a;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.e;
import com.bytedance.pangle.g;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.plugin.PluginManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends e.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f4584c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<ComponentName, IBinder> f4587d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<ComponentName, b> f4588e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final C0124a<Intent> f4589f = new C0124a<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<ComponentName, com.bytedance.pangle.service.a> f4590g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<ComponentName> f4591h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final HashSet<ComponentName> f4592i = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public final List<Runnable> f4586b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4585a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.pangle.service.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0124a<T> extends HashMap<g, T> {
        C0124a() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            if (super.containsKey(obj)) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            Iterator<g> it = keySet().iterator();
            while (it.hasNext()) {
                try {
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                if (it.next().a() == ((g) obj).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        @Nullable
        public final T remove(@Nullable Object obj) {
            g gVar;
            T t5 = (T) super.remove(obj);
            if (t5 != null) {
                return t5;
            }
            Iterator<g> it = keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = it.next();
                    try {
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                    if (gVar.a() == ((g) obj).a()) {
                        break;
                    }
                } else {
                    gVar = null;
                    break;
                }
            }
            return (T) super.remove(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends HashSet<g> {
        b() {
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@Nullable Object obj) {
            if (super.contains(obj)) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            Iterator<g> it = iterator();
            while (it.hasNext()) {
                try {
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                if (it.next().a() == ((g) obj).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@Nullable Object obj) {
            g gVar;
            if (super.remove(obj)) {
                return true;
            }
            Iterator it = iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    try {
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                    if (gVar.a() == ((g) obj).a()) {
                        break;
                    }
                } else {
                    gVar = null;
                    break;
                }
            }
            return super.remove(gVar);
        }
    }

    private a() {
    }

    public static a b() {
        if (f4584c == null) {
            synchronized (a.class) {
                if (f4584c == null) {
                    f4584c = new a();
                }
            }
        }
        return f4584c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ComponentName c(Intent intent, String str) {
        ComponentName component = intent.getComponent();
        if (!this.f4590g.containsKey(component)) {
            com.bytedance.pangle.service.a d5 = d(intent, str);
            if (d5 == null) {
                return component;
            }
            this.f4590g.put(component, d5);
            this.f4591h.add(component);
        }
        com.bytedance.pangle.service.a aVar = this.f4590g.get(component);
        if (aVar != null) {
            aVar.onStartCommand(intent, 0, 0);
        }
        return component;
    }

    private static com.bytedance.pangle.service.a d(Intent intent, String str) {
        com.bytedance.pangle.service.a e5 = e(intent, str);
        if (e5 != null) {
            e5.onCreate();
        }
        return e5;
    }

    private static com.bytedance.pangle.service.a e(Intent intent, String str) {
        boolean z4;
        ComponentName component = intent.getComponent();
        Plugin plugin = PluginManager.getInstance().getPlugin(str);
        try {
            z4 = Zeus.loadPlugin(str);
        } catch (Exception e5) {
            e = e5;
            z4 = false;
        }
        try {
            com.bytedance.pangle.service.a aVar = (com.bytedance.pangle.service.a) plugin.mClassLoader.loadClass(component.getClassName()).newInstance();
            aVar.attach(plugin);
            return aVar;
        } catch (Exception e6) {
            e = e6;
            ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "newServiceInstance failed! loadPlugin = ".concat(String.valueOf(z4)), e);
            return null;
        }
    }

    @Override // com.bytedance.pangle.e.a, android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.bytedance.pangle.e
    public final ComponentName a(final Intent intent, final String str) {
        if (Zeus.hasInit()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return c(intent, str);
            }
            this.f4585a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.c(intent, str);
                }
            });
        } else {
            this.f4586b.add(new Runnable() { // from class: com.bytedance.pangle.service.a.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.c(intent, str);
                }
            });
        }
        return intent.getComponent();
    }

    @Override // com.bytedance.pangle.e
    public final boolean b(final Intent intent, String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b().a(intent.getComponent());
            return true;
        }
        this.f4585a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.3
            @Override // java.lang.Runnable
            public final void run() {
                a.b().a(intent.getComponent());
            }
        });
        return true;
    }

    private boolean b(ComponentName componentName) {
        if (!this.f4591h.contains(componentName)) {
            if (this.f4588e.get(componentName) != null) {
                return false;
            }
            c(componentName);
            return true;
        }
        if (!this.f4592i.contains(componentName) || this.f4588e.containsKey(componentName)) {
            return false;
        }
        c(componentName);
        return true;
    }

    private void c(ComponentName componentName) {
        com.bytedance.pangle.service.a remove = this.f4590g.remove(componentName);
        this.f4592i.remove(componentName);
        this.f4587d.remove(componentName);
        this.f4591h.remove(componentName);
        if (remove != null) {
            remove.onDestroy();
        }
    }

    public final synchronized boolean a(ComponentName componentName) {
        if (!this.f4590g.containsKey(componentName)) {
            return false;
        }
        this.f4592i.add(componentName);
        return b(componentName);
    }

    @Override // com.bytedance.pangle.e
    public final boolean a(final Intent intent, final g gVar, final int i5, final String str) {
        if (Zeus.hasInit()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return a(intent, gVar, str);
            }
            this.f4585a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        a.this.a(intent, gVar, str);
                    } catch (RemoteException e5) {
                        ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "bindService failed", e5);
                    }
                }
            });
            return true;
        }
        this.f4586b.add(new Runnable() { // from class: com.bytedance.pangle.service.a.a.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.a(intent, gVar, str);
                } catch (RemoteException e5) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "pending bindService failed", e5);
                }
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(g gVar) {
        for (ComponentName componentName : this.f4588e.keySet()) {
            b bVar = this.f4588e.get(componentName);
            if (bVar.contains(gVar)) {
                bVar.remove(gVar);
                Intent remove = this.f4589f.remove(gVar);
                if (bVar.size() == 0) {
                    this.f4588e.remove(componentName);
                    com.bytedance.pangle.service.a aVar = this.f4590g.get(componentName);
                    if (aVar != null) {
                        aVar.onUnbind(remove);
                    }
                }
                b(componentName);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(Intent intent, g gVar, String str) {
        ComponentName component = intent.getComponent();
        if (!this.f4590g.containsKey(component)) {
            com.bytedance.pangle.service.a d5 = d(intent, str);
            if (d5 == null) {
                return false;
            }
            this.f4590g.put(component, d5);
        }
        com.bytedance.pangle.service.a aVar = this.f4590g.get(component);
        if (!this.f4587d.containsKey(component)) {
            this.f4587d.put(component, aVar.onBind(intent));
        }
        IBinder iBinder = this.f4587d.get(component);
        if (iBinder != null) {
            if (this.f4588e.containsKey(component)) {
                if (!this.f4588e.get(component).contains(gVar)) {
                    this.f4588e.get(component).add(gVar);
                    this.f4589f.put(gVar, intent);
                    gVar.a(component, iBinder);
                }
            } else {
                b bVar = new b();
                bVar.add(gVar);
                this.f4588e.put(component, bVar);
                this.f4589f.put(gVar, intent);
                gVar.a(component, iBinder);
            }
        }
        return true;
    }

    @Override // com.bytedance.pangle.e
    public final void a(final g gVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(gVar);
        } else {
            this.f4585a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(gVar);
                }
            });
        }
    }
}
