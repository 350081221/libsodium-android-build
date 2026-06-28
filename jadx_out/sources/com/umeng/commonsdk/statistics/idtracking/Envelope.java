package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bj;
import com.umeng.analytics.pro.ca;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Envelope {
    private static final String dummyID1 = "1234567890987654321";
    private static final String dummyID2 = "02:00:00:00:00:00";
    private byte[] identity;
    private String mAddress;
    private byte[] mEntity;
    private int mLength;
    private int mTimestamp;
    private final byte[] SEED = {0, 0, 0, 0, 0, 0, 0, 0};
    private final int CODEX_ENCRYPT = 1;
    private final int CODEX_NORMAL = 0;
    private String mVersion = "1.0";
    private byte[] mSignature = null;
    private byte[] mGuid = null;
    private byte[] mChecksum = null;
    private int mSerialNo = 0;
    private boolean encrypt = false;

    private Envelope(byte[] bArr, String str, byte[] bArr2) throws Exception {
        this.mAddress = null;
        this.mTimestamp = 0;
        this.mLength = 0;
        this.mEntity = null;
        this.identity = null;
        if (bArr != null && bArr.length != 0) {
            this.mAddress = str;
            this.mLength = bArr.length;
            this.mEntity = com.umeng.commonsdk.statistics.common.b.a(bArr);
            this.mTimestamp = (int) (System.currentTimeMillis() / 1000);
            this.identity = bArr2;
            return;
        }
        throw new Exception("entity is null or empty");
    }

    private byte[] genCheckSum() {
        return DataHelper.hash((DataHelper.toHexString(this.mSignature) + this.mSerialNo + this.mTimestamp + this.mLength + DataHelper.toHexString(this.mGuid)).getBytes());
    }

    public static Envelope genEncryptEnvelope(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i5 = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setEncrypt(true);
            envelope.setSignature(string);
            envelope.setSerialNumber(i5);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i5 + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
            return null;
        }
    }

    public static Envelope genEnvelope(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i5 = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setSignature(string);
            envelope.setSerialNumber(i5);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i5 + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
            return null;
        }
    }

    private byte[] genGuid(byte[] bArr, int i5) {
        byte[] hash = DataHelper.hash(this.identity);
        byte[] hash2 = DataHelper.hash(this.mEntity);
        int length = hash.length;
        int i6 = length * 2;
        byte[] bArr2 = new byte[i6];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr2[i8] = hash2[i7];
            bArr2[i8 + 1] = hash[i7];
        }
        for (int i9 = 0; i9 < 2; i9++) {
            bArr2[i9] = bArr[i9];
            bArr2[(i6 - i9) - 1] = bArr[(bArr.length - i9) - 1];
        }
        byte[] bArr3 = {(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) (i5 >>> 24)};
        for (int i10 = 0; i10 < i6; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] ^ bArr3[i10 % 4]);
        }
        return bArr2;
    }

    private byte[] genSignature() {
        return genGuid(this.SEED, (int) (System.currentTimeMillis() / 1000));
    }

    public static String getSignature(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("signature", null);
    }

    public void export(Context context) {
        String str = this.mAddress;
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bi.f12261g, null);
        String hexString = DataHelper.toHexString(this.mSignature);
        byte[] bArr = new byte[16];
        System.arraycopy(this.mSignature, 2, bArr, 0, 16);
        String hexString2 = DataHelper.toHexString(DataHelper.hash(bArr));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", str);
            if (imprintProperty != null) {
                jSONObject.put(bi.f12261g, imprintProperty);
            }
            jSONObject.put("signature", hexString);
            jSONObject.put("checksum", hexString2);
            File file = new File(context.getFilesDir(), au.b().b(au.f12194b));
            if (!file.exists()) {
                file.mkdir();
            }
            HelperUtils.writeFile(new File(file, "exchangeIdentity.json"), jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appkey", str);
            jSONObject2.put("channel", UMUtils.getChannel(context));
            if (imprintProperty != null) {
                jSONObject2.put(bi.f12261g, HelperUtils.getUmengMD5(imprintProperty));
            }
            HelperUtils.writeFile(new File(context.getFilesDir(), au.b().b(au.f12200h)), jSONObject2.toString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void seal() {
        if (this.mSignature == null) {
            this.mSignature = genSignature();
        }
        if (this.encrypt) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.mSignature, 1, bArr, 0, 16);
                this.mEntity = DataHelper.encrypt(this.mEntity, bArr);
            } catch (Exception unused) {
            }
        }
        this.mGuid = genGuid(this.mSignature, this.mTimestamp);
        this.mChecksum = genCheckSum();
    }

    public void setEncrypt(boolean z4) {
        this.encrypt = z4;
    }

    public void setSerialNumber(int i5) {
        this.mSerialNo = i5;
    }

    public void setSignature(String str) {
        this.mSignature = DataHelper.reverseHexString(str);
    }

    public byte[] toBinary() {
        bj bjVar = new bj();
        bjVar.a(this.mVersion);
        bjVar.b(this.mAddress);
        bjVar.c(DataHelper.toHexString(this.mSignature));
        bjVar.a(this.mSerialNo);
        bjVar.b(this.mTimestamp);
        bjVar.c(this.mLength);
        bjVar.a(this.mEntity);
        bjVar.d(this.encrypt ? 1 : 0);
        bjVar.d(DataHelper.toHexString(this.mGuid));
        bjVar.e(DataHelper.toHexString(this.mChecksum));
        try {
            return new ca().a(bjVar);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return String.format("version : %s\n", this.mVersion) + String.format("address : %s\n", this.mAddress) + String.format("signature : %s\n", DataHelper.toHexString(this.mSignature)) + String.format("serial : %s\n", Integer.valueOf(this.mSerialNo)) + String.format("timestamp : %d\n", Integer.valueOf(this.mTimestamp)) + String.format("length : %d\n", Integer.valueOf(this.mLength)) + String.format("guid : %s\n", DataHelper.toHexString(this.mGuid)) + String.format("checksum : %s ", DataHelper.toHexString(this.mChecksum)) + String.format("codex : %d", Integer.valueOf(this.encrypt ? 1 : 0));
    }

    public String getSignature() {
        return DataHelper.toHexString(this.mSignature);
    }
}
