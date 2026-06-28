package com.huawei.hms.analytics;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.crypto.AesCipher;
import com.huawei.hms.analytics.core.crypto.HAHexUtil;
import com.huawei.hms.analytics.core.crypto.PBKDF2encrypt;
import com.huawei.hms.analytics.core.crypto.RandomUtil;
import com.huawei.hms.analytics.core.log.HiLog;
import java.util.List;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public final class bo {
    private static bo klm;
    private String ghi;
    private String hij;
    public List<lmn> lmn;
    private static final Object ikl = new Object();
    private static final Object ijk = new Object();

    /* loaded from: classes3.dex */
    public interface lmn {
        void klm(String str);
    }

    private static boolean fgh() {
        return true;
    }

    private String ghi() {
        String lmn2;
        String lmn3;
        String lmn4;
        String lmn5;
        if (TextUtils.isEmpty(this.hij)) {
            synchronized (ijk) {
                if (TextUtils.isEmpty(this.hij)) {
                    bn bnVar = new bn();
                    long klm2 = dl.klm(bnVar.lmn, "Privacy_MY", "assemblyFlash");
                    boolean z4 = true;
                    if (-1 == klm2) {
                        HiLog.i("ComponentCommander", "First init components");
                    } else if (System.currentTimeMillis() - klm2 <= OpenStreetMapTileProviderConstants.ONE_YEAR) {
                        z4 = false;
                    }
                    if (z4) {
                        HiLog.i("ComponentCommander", "refresh components");
                        lmn2 = RandomUtil.getInstance().generateSecureRandomStr(128);
                        bnVar.lmn("aprpap", lmn2);
                        lmn3 = RandomUtil.getInstance().generateSecureRandomStr(128);
                        bnVar.lmn("febdoc", lmn3);
                        lmn4 = RandomUtil.getInstance().generateSecureRandomStr(128);
                        bnVar.lmn("marfil", lmn4);
                        lmn5 = RandomUtil.getInstance().generateSecureRandomStr(128);
                        bnVar.lmn("maywnj", lmn5);
                        dl.lmn(bnVar.lmn, "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
                    } else {
                        lmn2 = bnVar.lmn("aprpap");
                        lmn3 = bnVar.lmn("febdoc");
                        lmn4 = bnVar.lmn("marfil");
                        lmn5 = bnVar.lmn("maywnj");
                    }
                    byte[] hexString2ByteArray = HAHexUtil.hexString2ByteArray(lmn2);
                    byte[] hexString2ByteArray2 = HAHexUtil.hexString2ByteArray(lmn3);
                    byte[] hexString2ByteArray3 = HAHexUtil.hexString2ByteArray(lmn4);
                    byte[] hexString2ByteArray4 = HAHexUtil.hexString2ByteArray("f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc");
                    int length = hexString2ByteArray.length;
                    if (length > hexString2ByteArray2.length) {
                        length = hexString2ByteArray2.length;
                    }
                    if (length > hexString2ByteArray3.length) {
                        length = hexString2ByteArray3.length;
                    }
                    if (length > hexString2ByteArray4.length) {
                        length = hexString2ByteArray4.length;
                    }
                    char[] cArr = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        cArr[i5] = (char) (((hexString2ByteArray[i5] ^ hexString2ByteArray2[i5]) ^ hexString2ByteArray3[i5]) ^ hexString2ByteArray4[i5]);
                    }
                    this.hij = HAHexUtil.byteArray2HexString(PBKDF2encrypt.pbkdf2(cArr, HAHexUtil.hexString2ByteArray(lmn5), 10000, 128));
                }
            }
        }
        return this.hij;
    }

    private static synchronized void hij() {
        synchronized (bo.class) {
            if (klm == null) {
                klm = new bo();
            }
        }
    }

    public static boolean ikl() {
        long klm2 = dl.klm(ar.lmn().lmn.ghi, "Privacy_MY", "flashKeyTime");
        return klm2 != -1 && System.currentTimeMillis() - klm2 > OpenStreetMapTileProviderConstants.ONE_YEAR;
    }

    private String klm(String str) {
        if (!fgh()) {
            return AesCipher.encryptCbc(str, ghi());
        }
        HiLog.i("RootKeyCommander", "load work key encrypt is gcm ks");
        return AesCipher.aesKsEncrypt("analytics_keystore", str);
    }

    public static bo lmn() {
        if (klm == null) {
            hij();
        }
        return klm;
    }

    private static void lmn(String str) {
        at atVar = ar.lmn().lmn;
        dl.lmn(atVar.ghi, "Privacy_MY", "PrivacyData", str);
        dl.lmn(atVar.ghi, "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
    }

    public final void ijk() {
        synchronized (ikl) {
            String generateSecureRandomStr = RandomUtil.getInstance().generateSecureRandomStr(16);
            String klm2 = klm(this.ghi);
            if (TextUtils.isEmpty(klm2)) {
                HiLog.e("RootKeyCommander", "New working secret key encryption failed");
                return;
            }
            this.ghi = generateSecureRandomStr;
            lmn(klm2);
            List<lmn> list = this.lmn;
            if (list == null) {
                return;
            }
            for (lmn lmnVar : list) {
                if (lmnVar != null) {
                    lmnVar.klm(generateSecureRandomStr);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (fgh() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String klm() {
        /*
            r5 = this;
            java.lang.Object r0 = com.huawei.hms.analytics.bo.ikl
            monitor-enter(r0)
            java.lang.String r1 = r5.ghi     // Catch: java.lang.Throwable -> L94
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L90
            java.lang.String r1 = r5.ghi     // Catch: java.lang.Throwable -> L94
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L90
            com.huawei.hms.analytics.ar r1 = com.huawei.hms.analytics.ar.lmn()     // Catch: java.lang.Throwable -> L94
            com.huawei.hms.analytics.at r1 = r1.lmn     // Catch: java.lang.Throwable -> L94
            android.content.Context r1 = r1.ghi     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "Privacy_MY"
            java.lang.String r3 = "PrivacyData"
            java.lang.String r4 = ""
            java.lang.String r1 = com.huawei.hms.analytics.dl.klm(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L94
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L94
            r3 = 16
            if (r2 == 0) goto L3d
            com.huawei.hms.analytics.core.crypto.RandomUtil r1 = com.huawei.hms.analytics.core.crypto.RandomUtil.getInstance()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r1.generateSecureRandomStr(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r5.klm(r1)     // Catch: java.lang.Throwable -> L94
            lmn(r2)     // Catch: java.lang.Throwable -> L94
            goto L8e
        L3d:
            java.lang.String r2 = ""
            boolean r4 = fgh()     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L4b
            java.lang.String r2 = "analytics_keystore"
            java.lang.String r2 = com.huawei.hms.analytics.core.crypto.AesCipher.aesKsDecrypt(r2, r1)     // Catch: java.lang.Throwable -> L94
        L4b:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L8d
            java.lang.String r2 = "RootKeyCommander"
            java.lang.String r4 = "deCrypt work key first"
            com.huawei.hms.analytics.core.log.HiLog.i(r2, r4)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r5.ghi()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = com.huawei.hms.analytics.core.crypto.AesCipher.decryptCbc(r1, r2)     // Catch: java.lang.Throwable -> L94
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L7f
            com.huawei.hms.analytics.core.crypto.RandomUtil r1 = com.huawei.hms.analytics.core.crypto.RandomUtil.getInstance()     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r1.generateSecureRandomStr(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r5.klm(r1)     // Catch: java.lang.Throwable -> L94
            lmn(r2)     // Catch: java.lang.Throwable -> L94
            boolean r2 = fgh()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L8e
        L7b:
            com.huawei.hms.analytics.bn.lmn()     // Catch: java.lang.Throwable -> L94
            goto L8e
        L7f:
            boolean r2 = fgh()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L8e
            java.lang.String r2 = r5.klm(r1)     // Catch: java.lang.Throwable -> L94
            lmn(r2)     // Catch: java.lang.Throwable -> L94
            goto L7b
        L8d:
            r1 = r2
        L8e:
            r5.ghi = r1     // Catch: java.lang.Throwable -> L94
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r5.ghi
            return r0
        L94:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.bo.klm():java.lang.String");
    }
}
