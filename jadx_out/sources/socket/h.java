package socket;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

@Instrumented
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22398a = "Utils";

    public static byte[] a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap b(byte[] bArr) {
        return BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Map<String, byte[]> c(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Map<String, byte[]> map = (Map) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String d(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        if (str.contains("?")) {
            return str.replace("?", "");
        }
        return str;
    }

    public static byte[] e(byte[] bArr) {
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[bArr.length];
        int deflate = deflater.deflate(bArr2);
        deflater.end();
        byte[] bArr3 = new byte[deflate];
        System.arraycopy(bArr2, 0, bArr3, 0, deflate);
        return bArr3;
    }

    public static Bitmap f(Bitmap bitmap, int i5, int i6) {
        float max = Math.max(bitmap.getWidth() / i5, bitmap.getHeight() / i6);
        Matrix matrix = new Matrix();
        float f5 = 1.0f / max;
        matrix.postScale(f5, f5);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap g(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(0.3f, 0.3f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] h(byte[]... bArr) {
        int i5 = 0;
        for (byte[] bArr2 : bArr) {
            i5 += bArr2.length;
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
            i6 += bArr4.length;
        }
        return bArr3;
    }

    public static byte[] i(byte[] bArr) throws DataFormatException {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        byte[] bArr2 = new byte[bArr.length * 2];
        int inflate = inflater.inflate(bArr2);
        byte[] bArr3 = new byte[inflate];
        System.arraycopy(bArr2, 0, bArr3, 0, inflate);
        inflater.end();
        return bArr3;
    }

    public static String j(byte[] bArr) {
        int length = bArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (bArr[i5] == 0) {
                length = i5;
                break;
            }
            i5++;
        }
        return new String(Arrays.copyOfRange(bArr, 0, length), StandardCharsets.UTF_8);
    }

    public static byte[] k(String str, int i5) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[i5];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, i5));
        if (bytes.length < i5) {
            Arrays.fill(bArr, bytes.length, i5, (byte) 0);
        }
        return bArr;
    }

    public static byte[] l(Map<String, byte[]> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(map);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
