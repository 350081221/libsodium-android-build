package com.zzhoujay.richtext.ig;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
abstract class o<T> {

    /* renamed from: a, reason: collision with root package name */
    static o<byte[]> f15853a = new a();

    /* renamed from: b, reason: collision with root package name */
    static o<String> f15854b = new b();

    /* renamed from: c, reason: collision with root package name */
    static o<InputStream> f15855c = new c();

    @Instrumented
    /* loaded from: classes3.dex */
    static class a extends o<byte[]> {
        a() {
        }

        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l b(byte[] bArr, BitmapFactory.Options options) {
            return l.a(BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length, options));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c(byte[] bArr, BitmapFactory.Options options) {
            return l.d(new com.zzhoujay.richtext.drawable.d(Movie.decodeByteArray(bArr, 0, bArr.length), options.outHeight, options.outWidth));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(byte[] bArr, BitmapFactory.Options options) {
            BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length, options);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean e(byte[] bArr, BitmapFactory.Options options) {
            return com.zzhoujay.richtext.ext.e.d(bArr);
        }
    }

    @Instrumented
    /* loaded from: classes3.dex */
    static class b extends o<String> {
        b() {
        }

        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l b(String str, BitmapFactory.Options options) {
            return l.a(BitmapFactoryInstrumentation.decodeFile(str, options));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c(String str, BitmapFactory.Options options) {
            return l.d(new com.zzhoujay.richtext.drawable.d(Movie.decodeFile(str), options.outHeight, options.outWidth));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(String str, BitmapFactory.Options options) {
            BitmapFactoryInstrumentation.decodeFile(str, options);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean e(String str, BitmapFactory.Options options) {
            return com.zzhoujay.richtext.ext.e.c(str);
        }
    }

    @Instrumented
    /* loaded from: classes3.dex */
    static class c extends o<InputStream> {

        /* renamed from: d, reason: collision with root package name */
        private static final int f15856d = 1048576;

        c() {
        }

        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l b(InputStream inputStream, BitmapFactory.Options options) {
            BufferedInputStream bufferedInputStream;
            if (inputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) inputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            if (options.inJustDecodeBounds) {
                bufferedInputStream.mark(1048576);
            }
            Bitmap decodeStream = BitmapFactoryInstrumentation.decodeStream(bufferedInputStream, null, options);
            if (options.inJustDecodeBounds) {
                try {
                    bufferedInputStream.reset();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return l.a(decodeStream);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c(InputStream inputStream, BitmapFactory.Options options) {
            return l.d(new com.zzhoujay.richtext.drawable.d(Movie.decodeStream(inputStream), options.outHeight, options.outWidth));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(InputStream inputStream, BitmapFactory.Options options) {
            BufferedInputStream bufferedInputStream;
            if (inputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) inputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            if (options.inJustDecodeBounds) {
                bufferedInputStream.mark(1048576);
            }
            BitmapFactoryInstrumentation.decodeStream(bufferedInputStream, null, options);
            if (options.inJustDecodeBounds) {
                try {
                    bufferedInputStream.reset();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.zzhoujay.richtext.ig.o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean e(InputStream inputStream, BitmapFactory.Options options) {
            return com.zzhoujay.richtext.ext.e.b(inputStream);
        }
    }

    o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(com.zzhoujay.richtext.c cVar, T t5, BitmapFactory.Options options) {
        if (cVar.n() && (cVar.o() || e(t5, options))) {
            cVar.z(true);
            return c(t5, options);
        }
        return b(t5, options);
    }

    abstract l b(T t5, BitmapFactory.Options options);

    abstract l c(T t5, BitmapFactory.Options options);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(T t5, BitmapFactory.Options options);

    abstract boolean e(T t5, BitmapFactory.Options options);
}
