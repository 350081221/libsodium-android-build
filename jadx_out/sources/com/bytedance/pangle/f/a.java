package com.bytedance.pangle.f;

import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.c;
import com.bytedance.pangle.d;
import com.bytedance.pangle.i;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.plugin.PluginManager;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4384a;

    public static a b() {
        if (f4384a == null) {
            synchronized (a.class) {
                if (f4384a == null) {
                    f4384a = new a();
                }
            }
        }
        return f4384a;
    }

    @Override // com.bytedance.pangle.c
    public final boolean a(String str) {
        return PluginManager.getInstance().checkPluginInstalled(str);
    }

    @Override // com.bytedance.pangle.c
    public final boolean a(String str, String str2) {
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_PLUGIN_INSTALL, "start install pkg:" + str + ", path:" + str2);
        return PluginManager.getInstance().syncInstall(str, new File(str2));
    }

    @Override // com.bytedance.pangle.c
    public final void a(int i5, d dVar) {
        Zeus.registerPluginStateListener(new c(dVar, i5));
    }

    @Override // com.bytedance.pangle.c
    public final void a(int i5) {
        ZeusPluginStateListener zeusPluginStateListener;
        List<ZeusPluginStateListener> list = i.a().f4458b;
        Iterator<ZeusPluginStateListener> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                zeusPluginStateListener = null;
                break;
            }
            zeusPluginStateListener = it.next();
            if ((zeusPluginStateListener instanceof c) && ((c) zeusPluginStateListener).f4407a == i5) {
                break;
            }
        }
        if (zeusPluginStateListener != null) {
            list.remove(zeusPluginStateListener);
        }
    }

    @Override // com.bytedance.pangle.c
    public final int b(String str) {
        return PluginManager.getInstance().getPlugin(str).getVersion();
    }
}
