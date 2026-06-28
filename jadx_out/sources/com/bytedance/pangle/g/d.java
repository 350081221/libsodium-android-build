package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bytedance.pangle.g.c;
import com.tencent.vasdolly.common.V2SchemeUtil;
import com.tencent.vasdolly.common.V3SchemeUtil;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class d {
    public static o a(String str) {
        int[] iArr;
        RandomAccessFile randomAccessFile = null;
        Signature[] signatureArr = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                try {
                    try {
                        f.a(str, randomAccessFile2, V3SchemeUtil.APK_SIGNATURE_SCHEME_V3_BLOCK_ID, V2SchemeUtil.APK_SIGNATURE_SCHEME_V2_BLOCK_ID);
                        try {
                            try {
                                try {
                                    m mVar = f.f4421a.get(str).get(V3SchemeUtil.APK_SIGNATURE_SCHEME_V3_BLOCK_ID);
                                    if (mVar != null) {
                                        c.C0120c a5 = c.a(randomAccessFile2, mVar);
                                        Signature[] a6 = a(new Certificate[][]{a5.f4418a});
                                        c.b bVar = a5.f4419b;
                                        if (bVar != null) {
                                            int size = bVar.f4416a.size();
                                            Signature[] signatureArr2 = new Signature[size];
                                            iArr = new int[a5.f4419b.f4417b.size()];
                                            for (int i5 = 0; i5 < size; i5++) {
                                                signatureArr2[i5] = new Signature(a5.f4419b.f4416a.get(i5).getEncoded());
                                                iArr[i5] = a5.f4419b.f4417b.get(i5).intValue();
                                            }
                                            signatureArr = signatureArr2;
                                        } else {
                                            iArr = null;
                                        }
                                        o oVar = new o(a6, 3, signatureArr, iArr);
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused) {
                                        }
                                        return oVar;
                                    }
                                    throw new n("findVerifiedSigner, No APK Signature Scheme v3 signature in package");
                                } catch (Exception e5) {
                                    throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v2", e5);
                                }
                            } catch (n unused2) {
                                o a7 = a.a(str);
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception unused3) {
                                }
                                return a7;
                            }
                        } catch (n unused4) {
                            m mVar2 = f.f4421a.get(str).get(V2SchemeUtil.APK_SIGNATURE_SCHEME_V2_BLOCK_ID);
                            if (mVar2 != null) {
                                o oVar2 = new o(a(b.a(randomAccessFile2, mVar2).f4414a));
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception unused5) {
                                }
                                return oVar2;
                            }
                            throw new n("findVerifiedSigner, No APK Signature Scheme v2 signature in package");
                        } catch (Exception e6) {
                            throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v3", e6);
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    throw new q(4, "Failed to collect certificates from " + str + " when findSignatureInfo at once", e7);
                }
            } catch (Exception unused7) {
                throw new q(6, "failed to read apk file, minSignatureSchemeVersion : 1, apkPath : ".concat(String.valueOf(str)));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Signature[] a(Certificate[][] certificateArr) {
        Signature[] signatureArr = new Signature[certificateArr.length];
        for (int i5 = 0; i5 < certificateArr.length; i5++) {
            if (Build.VERSION.SDK_INT <= 28) {
                Constructor a5 = com.bytedance.pangle.b.b.a.a((Class<?>) Signature.class, (Class<?>[]) new Class[]{Certificate[].class});
                if (a5 != null) {
                    a5.setAccessible(true);
                }
                if (a5 != null && a5.isAccessible()) {
                    try {
                        signatureArr[i5] = (Signature) a5.newInstance(certificateArr[i5]);
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InstantiationException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            } else {
                signatureArr[i5] = new Signature(certificateArr[i5][0].getEncoded());
            }
        }
        return signatureArr;
    }
}
