package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class V3SchemeUtil {
    public static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;

    public static boolean containV3Signature(File file) {
        try {
            if (V2SchemeUtil.getAllIdValue(V2SchemeUtil.getApkSigningBlock(file)).containsKey(Integer.valueOf(APK_SIGNATURE_SCHEME_V3_BLOCK_ID))) {
                return true;
            }
            return false;
        } catch (SignatureNotFoundException unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have apk v3 signature block");
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
