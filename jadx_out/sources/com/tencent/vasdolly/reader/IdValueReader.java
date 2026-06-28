package com.tencent.vasdolly.reader;

import com.tencent.vasdolly.common.V2SchemeUtil;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public class IdValueReader {
    public static Map<Integer, ByteBuffer> getAllIdValueMap(File file) {
        if (file != null && file.exists() && file.isFile()) {
            try {
                return V2SchemeUtil.getAllIdValue(V2SchemeUtil.getApkSigningBlock(file));
            } catch (SignatureNotFoundException unused) {
                System.out.println("APK : " + file.getAbsolutePath() + " not have apk signature block");
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static ByteBuffer getByteBufferValueById(File file, int i5) {
        if (file != null && file.exists() && file.isFile()) {
            Map<Integer, ByteBuffer> allIdValueMap = getAllIdValueMap(file);
            System.out.println("getByteBufferValueById , destApk " + file.getAbsolutePath() + " IdValueMap = " + allIdValueMap);
            if (allIdValueMap != null) {
                return allIdValueMap.get(Integer.valueOf(i5));
            }
        }
        return null;
    }

    public static byte[] getByteValueById(File file, int i5) {
        if (file != null && file.exists() && file.isFile()) {
            ByteBuffer byteBufferValueById = getByteBufferValueById(file, i5);
            System.out.println("getByteValueById , id = " + i5 + " , value = " + byteBufferValueById);
            if (byteBufferValueById != null) {
                return Arrays.copyOfRange(byteBufferValueById.array(), byteBufferValueById.arrayOffset() + byteBufferValueById.position(), byteBufferValueById.arrayOffset() + byteBufferValueById.limit());
            }
        }
        return null;
    }

    public static String getStringValueById(File file, int i5) {
        byte[] byteValueById;
        if (file != null && file.exists() && file.isFile() && (byteValueById = getByteValueById(file, i5)) != null) {
            try {
                if (byteValueById.length > 0) {
                    return new String(byteValueById, "UTF-8").trim();
                }
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
            }
        }
        return "";
    }
}
