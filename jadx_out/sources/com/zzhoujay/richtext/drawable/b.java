package com.zzhoujay.richtext.drawable;

import android.graphics.RectF;
import androidx.core.view.MotionEventCompat;
import com.zzhoujay.richtext.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.y1;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    RectF f15673a;

    /* renamed from: b, reason: collision with root package name */
    c.b f15674b;

    /* renamed from: c, reason: collision with root package name */
    private String f15675c;

    /* renamed from: d, reason: collision with root package name */
    a f15676d;

    private b(String str, RectF rectF, c.b bVar, a aVar) {
        this.f15673a = rectF;
        this.f15674b = bVar;
        this.f15675c = str;
        this.f15676d = aVar;
    }

    private static int a(byte[] bArr) {
        return (bArr[3] << 24) | (bArr[0] & y1.f19838d) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[2] << 24) >>> 8);
    }

    private static byte[] f(int i5) {
        return new byte[]{(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) (i5 >>> 24)};
    }

    public static b g(InputStream inputStream, String str) {
        try {
            float i5 = i(inputStream);
            float i6 = i(inputStream);
            float i7 = i(inputStream);
            float i8 = i(inputStream);
            int j5 = j(inputStream);
            boolean h5 = h(inputStream);
            int j6 = j(inputStream);
            float i9 = i(inputStream);
            float i10 = i(inputStream);
            inputStream.close();
            return new b(str, new RectF(i5, i6, i7, i8), c.b.valueOf(j5), new a(h5, i9, j6, i10));
        } catch (IOException e5) {
            com.zzhoujay.richtext.ext.c.a(e5);
            return null;
        }
    }

    private static boolean h(InputStream inputStream) throws IOException {
        return inputStream.read() != 0;
    }

    private static float i(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(j(inputStream));
    }

    private static int j(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        inputStream.read(bArr);
        return a(bArr);
    }

    private static void m(OutputStream outputStream, boolean z4) throws IOException {
        outputStream.write(z4 ? 1 : 0);
    }

    private static void n(OutputStream outputStream, float f5) throws IOException {
        outputStream.write(f(Float.floatToIntBits(f5)));
    }

    private static void o(OutputStream outputStream, int i5) throws IOException {
        outputStream.write(f(i5));
    }

    public RectF b() {
        return this.f15673a;
    }

    public a c() {
        return this.f15676d;
    }

    public String d() {
        return this.f15675c;
    }

    public c.b e() {
        return this.f15674b;
    }

    public void k(OutputStream outputStream) {
        try {
            n(outputStream, this.f15673a.left);
            n(outputStream, this.f15673a.top);
            n(outputStream, this.f15673a.right);
            n(outputStream, this.f15673a.bottom);
            o(outputStream, this.f15674b.intValue());
            m(outputStream, this.f15676d.d());
            o(outputStream, this.f15676d.a());
            n(outputStream, this.f15676d.b());
            n(outputStream, this.f15676d.c());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e5) {
            com.zzhoujay.richtext.ext.c.a(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(b bVar) {
        this.f15676d.e(bVar.f15676d);
        this.f15673a.set(bVar.f15673a);
        this.f15674b = bVar.f15674b;
        this.f15675c = bVar.f15675c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.zzhoujay.richtext.c cVar) {
        this(cVar.g(), new RectF(0.0f, 0.0f, cVar.l(), cVar.e()), cVar.j(), new a(cVar.c()));
    }
}
