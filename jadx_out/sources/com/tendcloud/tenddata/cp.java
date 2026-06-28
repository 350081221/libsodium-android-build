package com.tendcloud.tenddata;

import android.util.EventLogTags;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cp {

    /* renamed from: d, reason: collision with root package name */
    static byte[] f11622d;

    /* renamed from: a, reason: collision with root package name */
    static HashMap<String, String> f11619a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    static HashMap<String, String> f11620b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    static String f11621c = "utf-8";

    /* renamed from: e, reason: collision with root package name */
    private static volatile cp f11623e = null;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private cp() {
        String c5 = y.c(ab.f11351g.getPackageName());
        if (ab.f11351g != null && c5 != null) {
            f11622d = c5.getBytes();
        } else {
            f11622d = ab.class.getSimpleName().getBytes();
        }
    }

    public TreeSet<cq> a(a aVar) {
        int size;
        TreeSet treeSet = new TreeSet();
        TreeSet<cq> treeSet2 = null;
        try {
            treeSet2 = cr.a().a(aVar, 100, (String) null);
            if (treeSet2 != null && treeSet2.size() > 0) {
                Iterator<cq> it = treeSet2.iterator();
                while (it.hasNext()) {
                    cq next = it.next();
                    try {
                        next.writeData(y.b(next.c(), f11622d));
                    } catch (Throwable unused) {
                    }
                }
                treeSet.addAll(treeSet2);
                treeSet2.clear();
            }
            size = treeSet2 == null ? 0 : treeSet2.size();
        } catch (Throwable unused2) {
        }
        synchronized (EventLogTags.class) {
            if (size < 100) {
                try {
                    TreeSet<cq> a5 = cr.a().a(aVar, 100 - size, aVar.getRootFolder());
                    if (a5 != null) {
                        try {
                            if (a5.size() > 0) {
                                Iterator<cq> it2 = a5.iterator();
                                while (it2.hasNext()) {
                                    cq next2 = it2.next();
                                    try {
                                        byte[] b5 = as.b(next2.c());
                                        if (b5 != null && b5.length != 0) {
                                            next2.writeData(b5);
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    treeSet2 = a5;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (treeSet.size() > 0 && treeSet2 != null) {
                treeSet2.addAll(treeSet);
            }
            return treeSet2;
        }
    }

    public final synchronized void onTDEBEventDataStore(bv bvVar) {
        JSONObject jSONObject;
        if (bvVar == null) {
            return;
        }
        try {
            if (bvVar.f11568a.getMessageFormat().equals(a.MF_JSON)) {
                if (bvVar.f11568a == null) {
                    return;
                }
                cv cvVar = new cv(bvVar.f11569b, bvVar.f11570c);
                cvVar.setData(bvVar.f11571d);
                if (!bvVar.f11568a.name().equals("BG")) {
                    jSONObject = dk.b().a(cvVar, true, bvVar.f11568a, bvVar.f11572e);
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return;
                }
                cr.a().a(new cq(as.a(jSONObject.toString().getBytes())), bvVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void sendMessageFaild(a aVar) {
        try {
            cr.a().clearDataCache(aVar);
        } catch (Throwable unused) {
        }
    }

    public void sendMessageSuccess(a aVar) {
        try {
            cr.a().confirmRead(aVar);
        } catch (Throwable unused) {
        }
    }

    public static cp a() {
        if (f11623e == null) {
            synchronized (cp.class) {
                if (f11623e == null) {
                    f11623e = new cp();
                }
            }
        }
        return f11623e;
    }
}
