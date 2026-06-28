package com.zzhoujay.richtext.ig;

import android.widget.TextView;
import com.zzhoujay.richtext.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class g implements e3.f, e3.g {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15820e = "DefaultImageGetter";

    /* renamed from: f, reason: collision with root package name */
    public static final String f15821f = "com.zzhoujay.richtext.ig.g";

    /* renamed from: g, reason: collision with root package name */
    private static final int f15822g = R.id.E;

    /* renamed from: d, reason: collision with root package name */
    private e3.g f15826d;

    /* renamed from: c, reason: collision with root package name */
    private int f15825c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<e> f15823a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<k, e> f15824b = new WeakHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends com.zzhoujay.richtext.ig.a<Object> {
        a(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, e3.g gVar2, o oVar) {
            super(cVar, gVar, textView, cVar2, gVar2, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final ExecutorService f15828a = Executors.newCachedThreadPool();

        private b() {
        }
    }

    private void g(e eVar, com.zzhoujay.richtext.ig.a aVar) {
        synchronized (g.class) {
            this.f15823a.add(eVar);
            this.f15824b.put(aVar, eVar);
        }
    }

    private void h(TextView textView) {
        synchronized (g.class) {
            HashSet<e> hashSet = (HashSet) textView.getTag(f15822g);
            if (hashSet != null) {
                if (hashSet == this.f15823a) {
                    return;
                }
                HashSet hashSet2 = new HashSet(hashSet);
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).cancel();
                }
                hashSet2.clear();
                hashSet.clear();
            }
            textView.setTag(f15822g, this.f15823a);
        }
    }

    private void i(com.zzhoujay.richtext.c cVar, com.zzhoujay.richtext.g gVar, TextView textView, com.zzhoujay.richtext.drawable.c cVar2, Exception exc) {
        new a(cVar, gVar, textView, cVar2, this, null).onFailure(exc);
    }

    private static ExecutorService j() {
        return b.f15828a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.zzhoujay.richtext.ig.b, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.zzhoujay.richtext.ig.c, java.lang.Runnable] */
    @Override // e3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable a(com.zzhoujay.richtext.c r17, com.zzhoujay.richtext.g r18, android.widget.TextView r19) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zzhoujay.richtext.ig.g.a(com.zzhoujay.richtext.c, com.zzhoujay.richtext.g, android.widget.TextView):android.graphics.drawable.Drawable");
    }

    @Override // e3.g
    public void d(Object obj) {
        if (obj instanceof com.zzhoujay.richtext.ig.a) {
            com.zzhoujay.richtext.ig.a aVar = (com.zzhoujay.richtext.ig.a) obj;
            synchronized (g.class) {
                e eVar = this.f15824b.get(aVar);
                if (eVar != null) {
                    this.f15823a.remove(eVar);
                }
                this.f15824b.remove(aVar);
                int i5 = this.f15825c + 1;
                this.f15825c = i5;
                e3.g gVar = this.f15826d;
                if (gVar != null) {
                    gVar.d(Integer.valueOf(i5));
                }
            }
        }
    }

    @Override // e3.f
    public void f(e3.g gVar) {
        this.f15826d = gVar;
    }

    @Override // e3.m
    public void recycle() {
        synchronized (g.class) {
            Iterator<e> it = this.f15823a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f15823a.clear();
            Iterator<Map.Entry<k, e>> it2 = this.f15824b.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getKey().recycle();
            }
            this.f15824b.clear();
        }
    }
}
