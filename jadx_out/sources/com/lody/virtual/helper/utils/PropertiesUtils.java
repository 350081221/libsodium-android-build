package com.lody.virtual.helper.utils;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public class PropertiesUtils {
    private static final char[] hexDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static boolean load(Properties properties, File file) {
        if (properties != null && file != null && file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream2);
                    FileUtils.closeQuietly(fileInputStream2);
                    return true;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    FileUtils.closeQuietly(fileInputStream);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    FileUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return false;
        }
    }

    public static boolean save(Map map, File file, String str) {
        FileOutputStream fileOutputStream;
        if (map != null && file != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                if (file.exists()) {
                    file.delete();
                } else {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                store(map, fileOutputStream, str);
                FileUtils.closeQuietly(fileOutputStream);
                return true;
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                FileUtils.closeQuietly(fileOutputStream2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                FileUtils.closeQuietly(fileOutputStream2);
                throw th;
            }
        }
        return false;
    }

    private static String saveConvert(String str, boolean z4, boolean z5) {
        boolean z6;
        int length = str.length();
        int i5 = length * 2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        StringBuffer stringBuffer = new StringBuffer(i5);
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt > '=' && charAt < 127) {
                if (charAt == '\\') {
                    stringBuffer.append('\\');
                    stringBuffer.append('\\');
                } else {
                    stringBuffer.append(charAt);
                }
            } else if (charAt != '\t') {
                if (charAt != '\n') {
                    if (charAt != '\f') {
                        if (charAt != '\r') {
                            if (charAt != ' ') {
                                if (charAt != '!' && charAt != '#' && charAt != ':' && charAt != '=') {
                                    if (charAt >= ' ' && charAt <= '~') {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    if (z6 & z5) {
                                        stringBuffer.append('\\');
                                        stringBuffer.append('u');
                                        stringBuffer.append(toHex((charAt >> '\f') & 15));
                                        stringBuffer.append(toHex((charAt >> '\b') & 15));
                                        stringBuffer.append(toHex((charAt >> 4) & 15));
                                        stringBuffer.append(toHex(charAt & 15));
                                    } else {
                                        stringBuffer.append(charAt);
                                    }
                                } else {
                                    stringBuffer.append('\\');
                                    stringBuffer.append(charAt);
                                }
                            } else {
                                if (i6 == 0 || z4) {
                                    stringBuffer.append('\\');
                                }
                                stringBuffer.append(' ');
                            }
                        } else {
                            stringBuffer.append('\\');
                            stringBuffer.append('r');
                        }
                    } else {
                        stringBuffer.append('\\');
                        stringBuffer.append('f');
                    }
                } else {
                    stringBuffer.append('\\');
                    stringBuffer.append('n');
                }
            } else {
                stringBuffer.append('\\');
                stringBuffer.append('t');
            }
        }
        return stringBuffer.toString();
    }

    private static void store(Map map, OutputStream outputStream, String str) throws IOException {
        store0(map, new BufferedWriter(new OutputStreamWriter(outputStream, "8859_1")), str, true);
    }

    private static void store0(Map map, BufferedWriter bufferedWriter, String str, boolean z4) throws IOException {
        bufferedWriter.newLine();
        if (str != null) {
            writeComments(bufferedWriter, str);
        }
        synchronized (map) {
            for (Object obj : map.keySet()) {
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(map.get(obj));
                bufferedWriter.write(saveConvert(valueOf, true, z4) + ContainerUtils.KEY_VALUE_DELIMITER + saveConvert(valueOf2, false, z4));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
    }

    private static char toHex(int i5) {
        return hexDigit[i5 & 15];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r11.charAt(r3) != '!') goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void writeComments(java.io.BufferedWriter r10, java.lang.String r11) throws java.io.IOException {
        /*
            java.lang.String r0 = "#"
            r10.write(r0)
            int r1 = r11.length()
            r2 = 6
            char[] r2 = new char[r2]
            r3 = 92
            r4 = 0
            r2[r4] = r3
            r3 = 117(0x75, float:1.64E-43)
            r5 = 1
            r2[r5] = r3
            r3 = r4
        L17:
            if (r4 >= r1) goto L96
            char r6 = r11.charAt(r4)
            r7 = 13
            r8 = 10
            r9 = 255(0xff, float:3.57E-43)
            if (r6 > r9) goto L29
            if (r6 == r8) goto L29
            if (r6 != r7) goto L94
        L29:
            if (r3 == r4) goto L32
            java.lang.String r3 = r11.substring(r3, r4)
            r10.write(r3)
        L32:
            if (r6 <= r9) goto L67
            int r3 = r6 >> 12
            r3 = r3 & 15
            char r3 = toHex(r3)
            r7 = 2
            r2[r7] = r3
            int r3 = r6 >> 8
            r3 = r3 & 15
            char r3 = toHex(r3)
            r7 = 3
            r2[r7] = r3
            int r3 = r6 >> 4
            r3 = r3 & 15
            char r3 = toHex(r3)
            r7 = 4
            r2[r7] = r3
            r3 = r6 & 15
            char r3 = toHex(r3)
            r6 = 5
            r2[r6] = r3
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r10.write(r3)
            goto L92
        L67:
            r10.newLine()
            if (r6 != r7) goto L79
            int r3 = r1 + (-1)
            if (r4 == r3) goto L79
            int r3 = r4 + 1
            char r6 = r11.charAt(r3)
            if (r6 != r8) goto L79
            r4 = r3
        L79:
            int r3 = r1 + (-1)
            if (r4 == r3) goto L8f
            int r3 = r4 + 1
            char r6 = r11.charAt(r3)
            r7 = 35
            if (r6 == r7) goto L92
            char r3 = r11.charAt(r3)
            r6 = 33
            if (r3 == r6) goto L92
        L8f:
            r10.write(r0)
        L92:
            int r3 = r4 + 1
        L94:
            int r4 = r4 + r5
            goto L17
        L96:
            if (r3 == r4) goto L9f
            java.lang.String r11 = r11.substring(r3, r4)
            r10.write(r11)
        L9f:
            r10.newLine()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.helper.utils.PropertiesUtils.writeComments(java.io.BufferedWriter, java.lang.String):void");
    }
}
