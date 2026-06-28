package com.ss.android.socialbase.appdownloader.e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.ss.android.socialbase.downloader.i.f;
import com.ss.android.socialbase.downloader.network.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f10278a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f10279b;

    /* renamed from: c, reason: collision with root package name */
    private a<Integer, Bitmap> f10280c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a<K, T> extends LinkedHashMap<K, T> {

        /* renamed from: a, reason: collision with root package name */
        final int f10284a;

        public a(int i5, int i6) {
            super(i6, 0.75f, true);
            this.f10284a = i5;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, T> entry) {
            return size() > this.f10284a;
        }
    }

    private c() {
        this.f10280c = null;
        int i5 = f10278a;
        this.f10280c = new a<>(i5, i5 / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteArrayOutputStream b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream;
            }
        }
    }

    public static c a() {
        if (f10279b == null) {
            synchronized (c.class) {
                if (f10279b == null) {
                    f10279b = new c();
                }
            }
        }
        return f10279b;
    }

    public Bitmap a(int i5) {
        return this.f10280c.get(Integer.valueOf(i5));
    }

    public void a(final int i5, final String str) {
        if (TextUtils.isEmpty(str) || a(i5) != null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.m().submit(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.e.c.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ByteArrayOutputStream byteArrayOutputStream;
                ByteArrayInputStream byteArrayInputStream;
                ByteArrayInputStream byteArrayInputStream2;
                Throwable th;
                InputStream inputStream;
                Exception e5;
                i a5;
                int i6 = 4;
                i6 = 4;
                i6 = 4;
                i6 = 4;
                i6 = 4;
                try {
                    try {
                        a5 = com.ss.android.socialbase.downloader.downloader.c.a(true, 0, str, null);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e6) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    e5 = e6;
                    inputStream = null;
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    th = th3;
                    inputStream = null;
                }
                if (a5 == null) {
                    f.a(null, null, null, null);
                    return;
                }
                inputStream = a5.a();
                try {
                    byteArrayOutputStream = c.b(inputStream);
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    } catch (Exception e7) {
                        byteArrayInputStream2 = null;
                        e5 = e7;
                        byteArrayInputStream = null;
                    } catch (Throwable th4) {
                        byteArrayInputStream2 = null;
                        th = th4;
                        byteArrayInputStream = null;
                    }
                } catch (Exception e8) {
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    e5 = e8;
                    byteArrayOutputStream = null;
                } catch (Throwable th5) {
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    th = th5;
                    byteArrayOutputStream = null;
                }
                try {
                    byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactoryInstrumentation.decodeStream(byteArrayInputStream, null, options);
                        int a6 = com.ss.android.socialbase.appdownloader.c.a(com.ss.android.socialbase.downloader.downloader.c.O(), 44.0f);
                        options.inSampleSize = c.a(a6, a6, options);
                        options.inJustDecodeBounds = false;
                        c.this.f10280c.put(Integer.valueOf(i5), BitmapFactoryInstrumentation.decodeStream(byteArrayInputStream2, null, options));
                        Closeable[] closeableArr = {inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2};
                        f.a(closeableArr);
                        i6 = closeableArr;
                    } catch (Exception e9) {
                        e5 = e9;
                        e5.printStackTrace();
                        Closeable[] closeableArr2 = {inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2};
                        f.a(closeableArr2);
                        i6 = closeableArr2;
                    }
                } catch (Exception e10) {
                    byteArrayInputStream2 = null;
                    e5 = e10;
                } catch (Throwable th6) {
                    byteArrayInputStream2 = null;
                    th = th6;
                    Closeable[] closeableArr3 = new Closeable[i6];
                    closeableArr3[0] = inputStream;
                    closeableArr3[1] = byteArrayOutputStream;
                    closeableArr3[2] = byteArrayInputStream;
                    closeableArr3[3] = byteArrayInputStream2;
                    f.a(closeableArr3);
                    throw th;
                }
            }
        });
    }

    public static int a(int i5, int i6, BitmapFactory.Options options) {
        int i7 = options.outWidth;
        if (i7 > i5 || options.outHeight > i6) {
            return Math.min(Math.round(i7 / i5), Math.round(options.outHeight / i6));
        }
        return 1;
    }
}
