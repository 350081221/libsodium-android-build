package com.zzhoujay.richtext;

import android.text.SpannableStringBuilder;
import androidx.collection.LruCache;
import com.zzhoujay.richtext.spans.LongClickableURLSpan;
import g3.a;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15798c = "RichTextPool";

    /* renamed from: d, reason: collision with root package name */
    private static final int f15799d = 50;

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, SoftReference<SpannableStringBuilder>> f15800a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Object, HashSet<WeakReference<f>>> f15801b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final h f15802a = new h();

        private b() {
        }
    }

    public static h e() {
        return b.f15802a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Object obj, f fVar) {
        HashSet<WeakReference<f>> hashSet = this.f15801b.get(obj);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f15801b.put(obj, hashSet);
        }
        hashSet.add(new WeakReference<>(fVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, SpannableStringBuilder spannableStringBuilder) {
        String a5 = com.zzhoujay.richtext.ext.g.a(str);
        if (this.f15800a.get(a5) != null) {
            com.zzhoujay.richtext.ext.c.b(f15798c, "cached");
            return;
        }
        SpannableStringBuilder d5 = d(new SpannableStringBuilder(spannableStringBuilder));
        d5.setSpan(new a.C0447a(), 0, d5.length(), 33);
        this.f15800a.put(a5, new SoftReference<>(d5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Object obj) {
        HashSet<WeakReference<f>> hashSet = this.f15801b.get(obj);
        if (hashSet != null) {
            Iterator<WeakReference<f>> it = hashSet.iterator();
            while (it.hasNext()) {
                f fVar = it.next().get();
                if (fVar != null) {
                    fVar.f();
                }
            }
        }
        this.f15801b.remove(obj);
    }

    SpannableStringBuilder d(SpannableStringBuilder spannableStringBuilder) {
        h3.b[] bVarArr = (h3.b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h3.b.class);
        if (bVarArr != null && bVarArr.length > 0) {
            for (h3.b bVar : bVarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(bVar);
                int spanEnd = spannableStringBuilder.getSpanEnd(bVar);
                int spanFlags = spannableStringBuilder.getSpanFlags(bVar);
                Object b5 = bVar.b();
                spannableStringBuilder.removeSpan(bVar);
                spannableStringBuilder.setSpan(b5, spanStart, spanEnd, spanFlags);
            }
            com.zzhoujay.richtext.ext.c.d(f15798c, "clearSpans > " + bVarArr.length);
        }
        LongClickableURLSpan[] longClickableURLSpanArr = (LongClickableURLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LongClickableURLSpan.class);
        if (longClickableURLSpanArr != null && longClickableURLSpanArr.length > 0) {
            for (LongClickableURLSpan longClickableURLSpan : longClickableURLSpanArr) {
                int spanStart2 = spannableStringBuilder.getSpanStart(longClickableURLSpan);
                int spanEnd2 = spannableStringBuilder.getSpanEnd(longClickableURLSpan);
                int spanFlags2 = spannableStringBuilder.getSpanFlags(longClickableURLSpan);
                Object a5 = longClickableURLSpan.a();
                spannableStringBuilder.removeSpan(longClickableURLSpan);
                spannableStringBuilder.setSpan(a5, spanStart2, spanEnd2, spanFlags2);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SpannableStringBuilder f(String str) {
        SpannableStringBuilder spannableStringBuilder;
        SoftReference<SpannableStringBuilder> softReference = this.f15800a.get(com.zzhoujay.richtext.ext.g.a(str));
        if (softReference == null) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = softReference.get();
        }
        if (spannableStringBuilder == null) {
            return null;
        }
        com.zzhoujay.richtext.ext.c.b(f15798c, "cache hit -- text");
        return new SpannableStringBuilder(spannableStringBuilder);
    }

    public void g() {
        this.f15800a.evictAll();
    }

    private h() {
        this.f15800a = new LruCache<>(50);
        this.f15801b = new WeakHashMap<>();
    }
}
