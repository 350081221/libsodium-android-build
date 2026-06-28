package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.util.ArraySet;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f4441a = new o(null, 0, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Signature[] f4442b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4443c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final ArraySet<PublicKey> f4444d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final Signature[] f4445e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final int[] f4446f;

    public o(Signature[] signatureArr, int i5, ArraySet<PublicKey> arraySet, Signature[] signatureArr2, int[] iArr) {
        this.f4442b = signatureArr;
        this.f4443c = i5;
        this.f4444d = arraySet;
        this.f4445e = signatureArr2;
        this.f4446f = iArr;
    }

    private static ArraySet<PublicKey> a(Signature[] signatureArr) {
        Method method;
        ArraySet<PublicKey> arraySet = new ArraySet<>(signatureArr.length);
        for (Signature signature : signatureArr) {
            try {
                method = Signature.class.getMethod("getPublicKey", new Class[0]);
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
                method = null;
            }
            if (method != null && method.isAccessible()) {
                try {
                    arraySet.add((PublicKey) method.invoke(signature, new Object[0]));
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                } catch (InvocationTargetException e7) {
                    e7.printStackTrace();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        return arraySet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f4443c != oVar.f4443c || !a(this.f4442b, oVar.f4442b)) {
            return false;
        }
        ArraySet<PublicKey> arraySet = this.f4444d;
        if (arraySet != null) {
            if (!arraySet.equals(oVar.f4444d)) {
                return false;
            }
        } else if (oVar.f4444d != null) {
            return false;
        }
        if (Arrays.equals(this.f4445e, oVar.f4445e) && Arrays.equals(this.f4446f, oVar.f4446f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        int hashCode = ((Arrays.hashCode(this.f4442b) * 31) + this.f4443c) * 31;
        ArraySet<PublicKey> arraySet = this.f4444d;
        if (arraySet != null) {
            i5 = arraySet.hashCode();
        } else {
            i5 = 0;
        }
        return ((((hashCode + i5) * 31) + Arrays.hashCode(this.f4445e)) * 31) + Arrays.hashCode(this.f4446f);
    }

    public o(Signature[] signatureArr, int i5, Signature[] signatureArr2, int[] iArr) {
        this(signatureArr, i5, a(signatureArr), signatureArr2, iArr);
    }

    public o(Signature[] signatureArr) {
        this(signatureArr, 2, null, null);
    }

    public static boolean a(Signature[] signatureArr, Signature[] signatureArr2) {
        return signatureArr.length == signatureArr2.length && com.bytedance.pangle.util.d.a((Object[]) signatureArr, (Object[]) signatureArr2) && com.bytedance.pangle.util.d.a((Object[]) signatureArr2, (Object[]) signatureArr);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (bArr[i5] != bArr2[i5]) {
                return false;
            }
        }
        return true;
    }
}
