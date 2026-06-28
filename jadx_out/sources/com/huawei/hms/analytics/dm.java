package com.huawei.hms.analytics;

import android.os.Bundle;
import com.huawei.hms.analytics.core.log.HiLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dm {
    private static final Charset lmn = Charset.forName("UTF-8");

    public static String lmn(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            db dbVar = new db((byte) 0);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                if (read > 0) {
                    byte[] bArr3 = dbVar.lmn;
                    int length = bArr3.length;
                    int i5 = dbVar.klm;
                    if (length - i5 >= read) {
                        System.arraycopy(bArr2, 0, bArr3, i5, read);
                    } else {
                        byte[] bArr4 = new byte[(bArr3.length + read) << 1];
                        System.arraycopy(bArr3, 0, bArr4, 0, i5);
                        System.arraycopy(bArr2, 0, bArr4, dbVar.klm, read);
                        dbVar.lmn = bArr4;
                    }
                    dbVar.klm += read;
                }
            }
            int i6 = dbVar.klm;
            if (i6 == 0) {
                lmn(fileInputStream);
                return "";
            }
            if (i6 <= 0) {
                bArr = new byte[0];
            } else {
                byte[] bArr5 = new byte[i6];
                System.arraycopy(dbVar.lmn, 0, bArr5, 0, i6);
                bArr = bArr5;
            }
            String str = new String(bArr, lmn);
            lmn(fileInputStream);
            return str;
        } catch (FileNotFoundException unused3) {
            fileInputStream2 = fileInputStream;
            HiLog.w("StreamToolsKit", "getInfoFromFile(): No files need to be read");
            lmn(fileInputStream2);
            return "";
        } catch (IOException unused4) {
            fileInputStream2 = fileInputStream;
            HiLog.w("StreamToolsKit", "getInfoFromFile(): stream.read or new string exception");
            lmn(fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            lmn(fileInputStream2);
            throw th;
        }
    }

    public static JSONObject lmn(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                try {
                    jSONObject.put(str, bundle.get(str));
                } catch (JSONException unused) {
                    HiLog.w("StreamToolsKit", "bundleToJSON exception");
                }
            }
        }
        return jSONObject;
    }

    private static void lmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HiLog.w("StreamToolsKit", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static void lmn(File file, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
            fileOutputStream.flush();
            lmn(fileOutputStream);
        } catch (FileNotFoundException unused3) {
            fileOutputStream2 = fileOutputStream;
            HiLog.w("StreamToolsKit", "saveInfoToFile(): No files need to be read");
            lmn(fileOutputStream2);
        } catch (IOException unused4) {
            fileOutputStream2 = fileOutputStream;
            HiLog.w("StreamToolsKit", "saveInfoToFile(): io exc from write info to file!");
            lmn(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            lmn(fileOutputStream2);
            throw th;
        }
    }

    public static byte[] lmn(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        try {
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[1024];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            deflater.end();
            lmn(byteArrayOutputStream);
        }
    }
}
