package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, f1<k>> f1257a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<g1> f1258b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f1259c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f1260d = {31, -117, 8};

    private d0() {
    }

    public static f1<k> A(final InputStream inputStream, @Nullable final String str, final boolean z4) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 C;
                C = d0.C(inputStream, str, z4);
                return C;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.u
            @Override // java.lang.Runnable
            public final void run() {
                d0.l0(z4, inputStream);
            }
        });
    }

    public static void A0(g1 g1Var) {
        f1258b.remove(g1Var);
    }

    @WorkerThread
    public static d1<k> B(InputStream inputStream, @Nullable String str) {
        return C(inputStream, str, true);
    }

    @WorkerThread
    public static d1<k> C(InputStream inputStream, @Nullable String str, boolean z4) {
        return F(com.airbnb.lottie.parser.moshi.c.A(okio.y0.e(okio.y0.u(inputStream))), str, z4);
    }

    public static f1<k> D(final com.airbnb.lottie.parser.moshi.c cVar, @Nullable final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 E;
                E = d0.E(com.airbnb.lottie.parser.moshi.c.this, str);
                return E;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.a0
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.l.c(com.airbnb.lottie.parser.moshi.c.this);
            }
        });
    }

    @WorkerThread
    public static d1<k> E(com.airbnb.lottie.parser.moshi.c cVar, @Nullable String str) {
        return F(cVar, str, true);
    }

    @WorkerThread
    public static d1<k> F(com.airbnb.lottie.parser.moshi.c cVar, @Nullable String str, boolean z4) {
        return G(cVar, str, z4);
    }

    private static d1<k> G(com.airbnb.lottie.parser.moshi.c cVar, @Nullable String str, boolean z4) {
        k b5;
        try {
            if (str == null) {
                b5 = null;
            } else {
                try {
                    b5 = com.airbnb.lottie.model.g.c().b(str);
                } catch (Exception e5) {
                    d1<k> d1Var = new d1<>(e5);
                    if (z4) {
                        com.airbnb.lottie.utils.l.c(cVar);
                    }
                    return d1Var;
                }
            }
            if (b5 != null) {
                d1<k> d1Var2 = new d1<>(b5);
                if (z4) {
                    com.airbnb.lottie.utils.l.c(cVar);
                }
                return d1Var2;
            }
            k a5 = com.airbnb.lottie.parser.w.a(cVar);
            if (str != null) {
                com.airbnb.lottie.model.g.c().d(str, a5);
            }
            d1<k> d1Var3 = new d1<>(a5);
            if (z4) {
                com.airbnb.lottie.utils.l.c(cVar);
            }
            return d1Var3;
        } catch (Throwable th) {
            if (z4) {
                com.airbnb.lottie.utils.l.c(cVar);
            }
            throw th;
        }
    }

    public static f1<k> H(final String str, @Nullable final String str2) {
        return r(str2, new Callable() { // from class: com.airbnb.lottie.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 I;
                I = d0.I(str, str2);
                return I;
            }
        }, null);
    }

    @WorkerThread
    public static d1<k> I(String str, @Nullable String str2) {
        return E(com.airbnb.lottie.parser.moshi.c.A(okio.y0.e(okio.y0.u(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static d1<k> J(JSONObject jSONObject, @Nullable String str) {
        return I(jSONObject.toString(), str);
    }

    public static f1<k> K(Context context, @RawRes int i5) {
        return L(context, i5, x0(context, i5));
    }

    public static f1<k> L(Context context, @RawRes final int i5, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return r(str, new Callable() { // from class: com.airbnb.lottie.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 p02;
                p02 = d0.p0(weakReference, applicationContext, i5, str);
                return p02;
            }
        }, null);
    }

    @WorkerThread
    public static d1<k> M(Context context, @RawRes int i5) {
        return N(context, i5, x0(context, i5));
    }

    @WorkerThread
    public static d1<k> N(Context context, @RawRes int i5, @Nullable String str) {
        k b5;
        if (str == null) {
            b5 = null;
        } else {
            b5 = com.airbnb.lottie.model.g.c().b(str);
        }
        if (b5 != null) {
            return new d1<>(b5);
        }
        try {
            BufferedSource e5 = okio.y0.e(okio.y0.u(context.getResources().openRawResource(i5)));
            if (d0(e5).booleanValue()) {
                return W(context, new ZipInputStream(e5.z0()), str);
            }
            if (b0(e5).booleanValue()) {
                try {
                    return B(new GZIPInputStream(e5.z0()), str);
                } catch (IOException e6) {
                    return new d1<>((Throwable) e6);
                }
            }
            return B(e5.z0(), str);
        } catch (Resources.NotFoundException e7) {
            return new d1<>((Throwable) e7);
        }
    }

    public static f1<k> O(Context context, String str) {
        return P(context, str, "url_" + str);
    }

    public static f1<k> P(final Context context, final String str, @Nullable final String str2) {
        return r(str2, new Callable() { // from class: com.airbnb.lottie.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 q02;
                q02 = d0.q0(context, str, str2);
                return q02;
            }
        }, null);
    }

    @WorkerThread
    public static d1<k> Q(Context context, String str) {
        return R(context, str, str);
    }

    @WorkerThread
    public static d1<k> R(Context context, String str, @Nullable String str2) {
        k b5;
        if (str2 == null) {
            b5 = null;
        } else {
            b5 = com.airbnb.lottie.model.g.c().b(str2);
        }
        if (b5 != null) {
            return new d1<>(b5);
        }
        d1<k> c5 = f.i(context).c(context, str, str2);
        if (str2 != null && c5.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c5.b());
        }
        return c5;
    }

    public static f1<k> S(final Context context, final ZipInputStream zipInputStream, @Nullable final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 W;
                W = d0.W(context, zipInputStream, str);
                return W;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.w
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.l.c(zipInputStream);
            }
        });
    }

    public static f1<k> T(final Context context, final ZipInputStream zipInputStream, @Nullable final String str, boolean z4) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 W;
                W = d0.W(context, zipInputStream, str);
                return W;
            }
        }, z4 ? new Runnable() { // from class: com.airbnb.lottie.y
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.l.c(zipInputStream);
            }
        } : null);
    }

    public static f1<k> U(ZipInputStream zipInputStream, @Nullable String str) {
        return S(null, zipInputStream, str);
    }

    public static f1<k> V(ZipInputStream zipInputStream, @Nullable String str, boolean z4) {
        return T(null, zipInputStream, str, z4);
    }

    @WorkerThread
    public static d1<k> W(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        return X(context, zipInputStream, str, true);
    }

    @WorkerThread
    public static d1<k> X(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str, boolean z4) {
        try {
            return a0(context, zipInputStream, str);
        } finally {
            if (z4) {
                com.airbnb.lottie.utils.l.c(zipInputStream);
            }
        }
    }

    public static d1<k> Y(ZipInputStream zipInputStream, @Nullable String str) {
        return Z(zipInputStream, str, true);
    }

    public static d1<k> Z(ZipInputStream zipInputStream, @Nullable String str, boolean z4) {
        return X(null, zipInputStream, str, z4);
    }

    @WorkerThread
    private static d1<k> a0(Context context, ZipInputStream zipInputStream, @Nullable String str) {
        k b5;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            b5 = null;
        } else {
            try {
                b5 = com.airbnb.lottie.model.g.c().b(str);
            } catch (IOException e5) {
                return new d1<>((Throwable) e5);
            }
        }
        if (b5 != null) {
            return new d1<>(b5);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        k kVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                kVar = G(com.airbnb.lottie.parser.moshi.c.A(okio.y0.e(okio.y0.u(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } catch (Throwable th3) {
                        com.airbnb.lottie.utils.f.f("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        com.airbnb.lottie.utils.f.e("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactoryInstrumentation.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (kVar == null) {
            return new d1<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            y0 t5 = t(kVar, (String) entry.getKey());
            if (t5 != null) {
                t5.i(com.airbnb.lottie.utils.l.m((Bitmap) entry.getValue(), t5.g(), t5.e()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z4 = false;
            for (com.airbnb.lottie.model.c cVar : kVar.g().values()) {
                if (cVar.b().equals(entry2.getKey())) {
                    cVar.f((Typeface) entry2.getValue());
                    z4 = true;
                }
            }
            if (!z4) {
                com.airbnb.lottie.utils.f.e("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator<Map.Entry<String, y0>> it = kVar.j().entrySet().iterator();
            while (it.hasNext()) {
                y0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String d5 = value.d();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (d5.startsWith("data:") && d5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(d5.substring(d5.indexOf(44) + 1), 0);
                        value.i(BitmapFactoryInstrumentation.decodeByteArray(decode, 0, decode.length, options));
                    } catch (IllegalArgumentException e6) {
                        com.airbnb.lottie.utils.f.f("data URL did not have correct base64 format.", e6);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            com.airbnb.lottie.model.g.c().d(str, kVar);
        }
        return new d1<>(kVar);
    }

    private static Boolean b0(BufferedSource bufferedSource) {
        return v0(bufferedSource, f1260d);
    }

    private static boolean c0(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean d0(BufferedSource bufferedSource) {
        return v0(bufferedSource, f1259c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(String str, AtomicBoolean atomicBoolean, k kVar) {
        Map<String, f1<k>> map = f1257a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            w0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, f1<k>> map = f1257a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            w0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(boolean z4, InputStream inputStream) {
        if (z4) {
            com.airbnb.lottie.utils.l.c(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d1 p0(WeakReference weakReference, Context context, int i5, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return N(context, i5, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d1 q0(Context context, String str, String str2) throws Exception {
        d1<k> c5 = f.i(context).c(context, str, str2);
        if (str2 != null && c5.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c5.b());
        }
        return c5;
    }

    private static f1<k> r(@Nullable final String str, Callable<d1<k>> callable, @Nullable Runnable runnable) {
        k b5;
        f1<k> f1Var = null;
        if (str == null) {
            b5 = null;
        } else {
            b5 = com.airbnb.lottie.model.g.c().b(str);
        }
        if (b5 != null) {
            f1Var = new f1<>(b5);
        }
        if (str != null) {
            Map<String, f1<k>> map = f1257a;
            if (map.containsKey(str)) {
                f1Var = map.get(str);
            }
        }
        if (f1Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return f1Var;
        }
        f1<k> f1Var2 = new f1<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            f1Var2.d(new z0() { // from class: com.airbnb.lottie.p
                @Override // com.airbnb.lottie.z0
                public final void onResult(Object obj) {
                    d0.e0(str, atomicBoolean, (k) obj);
                }
            });
            f1Var2.c(new z0() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.z0
                public final void onResult(Object obj) {
                    d0.f0(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, f1<k>> map2 = f1257a;
                map2.put(str, f1Var2);
                if (map2.size() == 1) {
                    w0(false);
                }
            }
        }
        return f1Var2;
    }

    public static void s(Context context) {
        f1257a.clear();
        com.airbnb.lottie.model.g.c().a();
        com.airbnb.lottie.network.g h5 = f.h(context);
        if (h5 != null) {
            h5.a();
        }
    }

    @Nullable
    private static y0 t(k kVar, String str) {
        for (y0 y0Var : kVar.j().values()) {
            if (y0Var.d().equals(str)) {
                return y0Var;
            }
        }
        return null;
    }

    public static f1<k> u(Context context, String str) {
        return v(context, str, "asset_" + str);
    }

    public static f1<k> v(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return r(str2, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 x4;
                x4 = d0.x(applicationContext, str, str2);
                return x4;
            }
        }, null);
    }

    private static Boolean v0(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b5 : bArr) {
                if (peek.readByte() != b5) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e5) {
            com.airbnb.lottie.utils.f.c("Failed to check zip file header", e5);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    @WorkerThread
    public static d1<k> w(Context context, String str) {
        return x(context, str, "asset_" + str);
    }

    private static void w0(boolean z4) {
        ArrayList arrayList = new ArrayList(f1258b);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((g1) arrayList.get(i5)).a(z4);
        }
    }

    @WorkerThread
    public static d1<k> x(Context context, String str, @Nullable String str2) {
        k b5;
        if (str2 == null) {
            b5 = null;
        } else {
            b5 = com.airbnb.lottie.model.g.c().b(str2);
        }
        if (b5 != null) {
            return new d1<>(b5);
        }
        try {
            BufferedSource e5 = okio.y0.e(okio.y0.u(context.getAssets().open(str)));
            if (d0(e5).booleanValue()) {
                return W(context, new ZipInputStream(e5.z0()), str2);
            }
            if (b0(e5).booleanValue()) {
                return B(new GZIPInputStream(e5.z0()), str2);
            }
            return B(e5.z0(), str2);
        } catch (IOException e6) {
            return new d1<>((Throwable) e6);
        }
    }

    private static String x0(Context context, @RawRes int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(c0(context) ? "_night_" : "_day_");
        sb.append(i5);
        return sb.toString();
    }

    @Deprecated
    public static f1<k> y(final JSONObject jSONObject, @Nullable final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 J;
                J = d0.J(jSONObject, str);
                return J;
            }
        }, null);
    }

    public static void y0(g1 g1Var) {
        boolean z4;
        f1258b.add(g1Var);
        if (f1257a.size() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        g1Var.a(z4);
    }

    public static f1<k> z(final InputStream inputStream, @Nullable final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d1 B;
                B = d0.B(inputStream, str);
                return B;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.o
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.l.c(inputStream);
            }
        });
    }

    public static void z0(int i5) {
        com.airbnb.lottie.model.g.c().e(i5);
    }
}
