package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.crypto.AesCipher;
import com.huawei.hms.analytics.framework.config.CipherType;
import com.huawei.hms.analytics.framework.config.IMandatoryParameters;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: com.huawei.hms.analytics.framework.c.b$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8244a;

        static {
            int[] iArr = new int[CipherType.values().length];
            f8244a = iArr;
            try {
                iArr[CipherType.AESGCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8244a[CipherType.AESCBC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String a(String str) {
        IMandatoryParameters iMandatoryParameters = com.huawei.hms.analytics.framework.b.b.a().f8206a;
        if (iMandatoryParameters == null) {
            return "";
        }
        String loadWorkKey = iMandatoryParameters.getLoadWorkKey();
        int i5 = AnonymousClass1.f8244a[iMandatoryParameters.getCipherType().ordinal()];
        return i5 != 1 ? i5 != 2 ? "" : AesCipher.encryptCbc(str, loadWorkKey) : AesCipher.gcmEncrypt(str, loadWorkKey);
    }

    public static String a(String str, IMandatoryParameters iMandatoryParameters) {
        if (iMandatoryParameters == null) {
            return "";
        }
        int i5 = AnonymousClass1.f8244a[iMandatoryParameters.getCipherType().ordinal()];
        return i5 != 1 ? i5 != 2 ? "" : AesCipher.decryptCbc(str, iMandatoryParameters.getLoadWorkKey()) : AesCipher.gcmDecrypt(str, iMandatoryParameters.getLoadWorkKey());
    }
}
