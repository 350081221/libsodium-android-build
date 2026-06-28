package com.zzhoujay.richtext.cache;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import com.zzhoujay.richtext.ext.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15645c = "_rt";

    /* renamed from: d, reason: collision with root package name */
    private static final int f15646d = 1048576;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15647e = 524288000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15648f = (int) (Runtime.getRuntime().maxMemory() / 4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f15649g = 100;

    /* renamed from: h, reason: collision with root package name */
    private static final String f15650h = "_s";

    /* renamed from: i, reason: collision with root package name */
    private static final String f15651i = "_t";

    /* renamed from: j, reason: collision with root package name */
    private static File f15652j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final int f15653k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static com.jakewharton.disklrucache.a f15654l;

    /* renamed from: m, reason: collision with root package name */
    private static com.jakewharton.disklrucache.a f15655m;

    /* renamed from: n, reason: collision with root package name */
    private static File f15656n;

    /* renamed from: o, reason: collision with root package name */
    private static File f15657o;

    /* renamed from: a, reason: collision with root package name */
    private LruCache<String, Bitmap> f15658a;

    /* renamed from: b, reason: collision with root package name */
    private LruCache<String, com.zzhoujay.richtext.drawable.b> f15659b;

    /* renamed from: com.zzhoujay.richtext.cache.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0440a extends LruCache<String, Bitmap> {
        C0440a(int i5) {
            super(i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f15661a = new a(null);

        private b() {
        }
    }

    /* synthetic */ a(C0440a c0440a) {
        this();
    }

    public static a g() {
        return b.f15661a;
    }

    private static com.jakewharton.disklrucache.a h() {
        if (f15654l == null && f15652j != null) {
            try {
                f15654l = com.jakewharton.disklrucache.a.p0(f15656n, 1, 1, 1048576L);
            } catch (IOException e5) {
                c.a(e5);
            }
        }
        return f15654l;
    }

    private static com.jakewharton.disklrucache.a j() {
        if (f15655m == null && f15652j != null) {
            try {
                f15655m = com.jakewharton.disklrucache.a.p0(f15657o, 1, 1, 524288000L);
            } catch (IOException e5) {
                c.a(e5);
            }
        }
        return f15655m;
    }

    public static int k() {
        return 1;
    }

    public static void n(File file) {
        if (f15652j == null && file != null) {
            f15652j = file;
            File file2 = new File(file, f15645c);
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(file2, f15650h);
            f15656n = file3;
            if (!file3.exists()) {
                f15656n.mkdir();
            }
            File file4 = new File(file2, f15651i);
            f15657o = file4;
            if (!file4.exists()) {
                f15657o.mkdir();
            }
        }
    }

    public void a(String str, Bitmap bitmap, com.zzhoujay.richtext.drawable.b bVar) {
        b(str, bitmap);
        c(str, bVar);
    }

    public void b(String str, Bitmap bitmap) {
        this.f15658a.put(str, bitmap);
    }

    public void c(String str, com.zzhoujay.richtext.drawable.b bVar) {
        this.f15659b.put(str, bVar);
        com.zzhoujay.richtext.cache.b.f15663b.b(str, bVar, h());
    }

    public void d() {
        this.f15658a.evictAll();
        this.f15659b.evictAll();
    }

    public void e() {
        try {
            com.jakewharton.disklrucache.a h5 = h();
            if (h5 != null) {
                h5.I();
            }
        } catch (IOException e5) {
            c.a(e5);
        }
    }

    public Bitmap f(String str) {
        return this.f15658a.get(str);
    }

    public com.zzhoujay.richtext.drawable.b i(String str) {
        com.zzhoujay.richtext.drawable.b bVar = this.f15659b.get(str);
        if (bVar == null) {
            return com.zzhoujay.richtext.cache.b.f15663b.c(str, h());
        }
        return bVar;
    }

    public boolean l(String str) {
        return com.zzhoujay.richtext.cache.b.f15664c.a(str, j());
    }

    public InputStream m(String str) {
        return com.zzhoujay.richtext.cache.b.f15664c.c(str, j());
    }

    public void o(String str, InputStream inputStream) {
        com.zzhoujay.richtext.cache.b.f15664c.b(str, inputStream, j());
    }

    private a() {
        this.f15658a = new C0440a(f15648f);
        this.f15659b = new LruCache<>(100);
    }
}
