package com.ss.android.socialbase.downloader.network.a;

import com.ss.android.socialbase.downloader.i.f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected int f11137a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f11138b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, d> f11139c;

    /* renamed from: com.ss.android.socialbase.downloader.network.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0222a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f11140a = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, c cVar) {
        synchronized (this.f11138b) {
            this.f11138b.put(str, cVar);
        }
    }

    public d b(String str, List<com.ss.android.socialbase.downloader.model.c> list) {
        d remove;
        synchronized (this.f11139c) {
            remove = this.f11139c.remove(str);
        }
        if (remove != null) {
            if (f.a(remove.f(), list)) {
                try {
                    remove.e();
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                if (remove.h() && remove.g()) {
                    return remove;
                }
            }
            try {
                remove.d();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private a() {
        this.f11138b = new HashMap();
        this.f11139c = new LinkedHashMap(3);
        this.f11137a = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i5) {
        this.f11137a = i5;
    }

    public c a(String str, List<com.ss.android.socialbase.downloader.model.c> list) {
        c remove;
        synchronized (this.f11138b) {
            remove = this.f11138b.remove(str);
        }
        if (remove == null) {
            return null;
        }
        if (f.a(remove.h(), list)) {
            try {
                remove.d();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            if (remove.f() && remove.e()) {
                return remove;
            }
        }
        try {
            remove.c();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(String str) {
        c cVar = this.f11138b.get(str);
        if (cVar == null) {
            return false;
        }
        if (cVar.g()) {
            return true;
        }
        return cVar.f() && cVar.e();
    }

    public static a a() {
        return C0222a.f11140a;
    }
}
