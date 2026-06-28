package com.swift.sandhook.xcompat;

import android.os.Trace;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.blacklist.HookBlackList;
import com.swift.sandhook.wrapper.HookWrapper;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public final class h {
    private static j defaultHookMaker;
    private static File dexDir;
    private static final AtomicBoolean dexPathInited;
    private static final Map<Member, d> entityMap;
    private static final HashMap<Member, Method> hookedInfo;

    static {
        j kVar;
        if (a.useNewCallBackup) {
            kVar = new l();
        } else {
            kVar = new k();
        }
        defaultHookMaker = kVar;
        dexPathInited = new AtomicBoolean(false);
        entityMap = new HashMap();
        hookedInfo = new HashMap<>();
    }

    private static boolean checkMember(Member member) {
        if ((member instanceof Method) || (member instanceof Constructor)) {
            return true;
        }
        if (member.getDeclaringClass().isInterface()) {
            n.e("Cannot hook interfaces: " + member.toString());
            return false;
        }
        if (Modifier.isAbstract(member.getModifiers())) {
            n.e("Cannot hook abstract methods: " + member.toString());
            return false;
        }
        n.e("Only methods and constructors can be hooked: " + member.toString());
        return false;
    }

    public static void clearOatFile() {
        File file = new File(a.getCacheDir().getAbsolutePath(), "/sandxposed/oat/");
        if (!file.exists()) {
            return;
        }
        try {
            p.delete(file);
            file.mkdirs();
        } catch (Throwable unused) {
        }
    }

    public static synchronized void hookMethod(Member member, j.b bVar) {
        d dVar;
        j jVar;
        String str;
        synchronized (h.class) {
            if (!checkMember(member)) {
                return;
            }
            if (!hookedInfo.containsKey(member) && !entityMap.containsKey(member)) {
                try {
                    if (dexPathInited.compareAndSet(false, true)) {
                        try {
                            File file = new File(a.getCacheDir().getAbsolutePath(), "/sandxposed/");
                            dexDir = file;
                            if (!file.exists()) {
                                dexDir.mkdirs();
                            }
                        } catch (Throwable th) {
                            n.e("error when init dex path", th);
                        }
                    }
                    Trace.beginSection("SandHook-Xposed");
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = null;
                    if (a.useInternalStub && !HookBlackList.canNotHookByStub(member) && !HookBlackList.canNotHookByBridge(member)) {
                        dVar = e.getHookMethodEntity(member, bVar);
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        SandHook.hook(new HookWrapper.HookEntity(member, dVar.hook, dVar.backup, false));
                        entityMap.put(member, dVar);
                    } else {
                        if (HookBlackList.canNotHookByBridge(member)) {
                            jVar = new k();
                        } else {
                            jVar = defaultHookMaker;
                        }
                        b bVar2 = new b(h.class.getClassLoader(), member.getDeclaringClass().getClassLoader());
                        File file2 = dexDir;
                        if (file2 != null) {
                            str2 = file2.getAbsolutePath();
                        }
                        jVar.start(member, bVar, bVar2, str2);
                        hookedInfo.put(member, jVar.getCallBackupMethod());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("hook method <");
                    sb.append(member.toString());
                    sb.append("> cost ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms, by ");
                    if (dVar != null) {
                        str = "internal stub";
                    } else {
                        str = "dex maker";
                    }
                    sb.append(str);
                    n.d(sb.toString());
                    Trace.endSection();
                } catch (Throwable th2) {
                    n.e("error occur when hook method <" + member.toString() + ">", th2);
                }
                return;
            }
            n.w("already hook method:" + member.toString());
        }
    }
}
