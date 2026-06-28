package o0;

import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public class c {
    public static byte[] a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i5 = blockSize * 2;
        byte[] bArr = new byte[i5];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i6 = 1; i6 < i5; i6++) {
            byte codePointAt = (byte) (str.codePointAt(i6 % str.length()) & 127);
            bArr[i6] = codePointAt;
            if (i6 >= blockSize) {
                bArr[i6] = (byte) (bArr[0] & codePointAt);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}
