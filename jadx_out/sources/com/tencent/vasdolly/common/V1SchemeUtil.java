package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.ApkSigningBlockUtils;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import com.tencent.vasdolly.common.apk.ZipUtils;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: classes3.dex */
public class V1SchemeUtil {

    /* loaded from: classes3.dex */
    public static class ChannelExistException extends Exception {
        static final long serialVersionUID = -3387516993124229949L;

        public ChannelExistException() {
        }

        public ChannelExistException(String str) {
            super(str);
        }
    }

    public static boolean containV1Magic(File file) throws IOException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = new byte[ChannelConstants.V1_MAGIC.length];
                randomAccessFile2.seek(length - r6.length);
                randomAccessFile2.readFully(bArr);
                boolean isV1MagicMatch = isV1MagicMatch(bArr);
                randomAccessFile2.close();
                return isV1MagicMatch;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean containV1Signature(File file) {
        JarEntry jarEntry;
        try {
            JarFile jarFile = new JarFile(file);
            try {
                JarEntry jarEntry2 = jarFile.getJarEntry("META-INF/MANIFEST.MF");
                Enumeration<JarEntry> entries = jarFile.entries();
                while (true) {
                    if (entries.hasMoreElements()) {
                        JarEntry nextElement = entries.nextElement();
                        if (nextElement.getName().matches("META-INF/\\w+\\.SF")) {
                            jarEntry = jarFile.getJarEntry(nextElement.getName());
                            break;
                        }
                    } else {
                        jarEntry = null;
                        break;
                    }
                }
                jarFile.close();
                if (jarEntry2 != null && jarEntry != null) {
                    jarFile.close();
                    return true;
                }
                jarFile.close();
                return false;
            } finally {
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        FileChannel fileChannel;
        FileChannel channel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel2 = null;
        try {
            channel = new FileInputStream(file).getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(file2).getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            fileChannel2.close();
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static Pair<ByteBuffer, Long> getEocd(File file) throws IOException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                if (!ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, eocd.getSecond().longValue())) {
                    randomAccessFile2.close();
                    return eocd;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean isV1MagicMatch(byte[] bArr) {
        if (bArr.length != ChannelConstants.V1_MAGIC.length) {
            return false;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr2 = ChannelConstants.V1_MAGIC;
            if (i5 < bArr2.length) {
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            } else {
                return true;
            }
        }
    }

    public static String readChannel(File file) throws Exception {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = new byte[ChannelConstants.V1_MAGIC.length];
                long length2 = length - r6.length;
                randomAccessFile2.seek(length2);
                randomAccessFile2.readFully(bArr);
                if (isV1MagicMatch(bArr)) {
                    long j5 = length2 - 2;
                    randomAccessFile2.seek(j5);
                    int readShort = readShort(randomAccessFile2);
                    if (readShort > 0) {
                        randomAccessFile2.seek(j5 - readShort);
                        byte[] bArr2 = new byte[readShort];
                        randomAccessFile2.readFully(bArr2);
                        String trim = new String(bArr2, "UTF-8").trim();
                        randomAccessFile2.close();
                        return trim;
                    }
                    throw new Exception("zip channel info not found");
                }
                throw new Exception("zip v1 magic not found");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static short readShort(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    public static void removeChannelByV1(File file) throws Exception {
        if (file != null && file.exists() && file.isFile()) {
            Pair<ByteBuffer, Long> eocd = getEocd(file);
            if (eocd.getFirst().remaining() == 22) {
                System.out.println("file : " + file.getName() + " , has no comment");
                return;
            }
            System.out.println("file : " + file.getName() + " , has comment");
            int unsignedInt16 = ZipUtils.getUnsignedInt16(eocd.getFirst(), 20);
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek((eocd.getSecond().longValue() + 22) - 2);
                    writeShort(0, randomAccessFile2);
                    randomAccessFile2.setLength(file.length() - unsignedInt16);
                    System.out.println("file : " + file.getName() + " , remove comment success");
                    randomAccessFile2.close();
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new Exception("param error , file : " + file);
        }
    }

    public static void writeChannel(File file, String str) throws Exception {
        if (file != null && file.exists() && file.isFile() && str != null && !str.isEmpty()) {
            byte[] bytes = str.getBytes("UTF-8");
            Pair<ByteBuffer, Long> eocd = getEocd(file);
            RandomAccessFile randomAccessFile = null;
            if (eocd.getFirst().remaining() == 22) {
                System.out.println("file : " + file.getAbsolutePath() + " , has no comment");
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    try {
                        randomAccessFile2.seek(file.length() - 2);
                        int length = bytes.length + 2;
                        byte[] bArr = ChannelConstants.V1_MAGIC;
                        writeShort(length + bArr.length, randomAccessFile2);
                        randomAccessFile2.write(bytes);
                        writeShort(bytes.length, randomAccessFile2);
                        randomAccessFile2.write(bArr);
                        randomAccessFile2.close();
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                System.out.println("file : " + file.getAbsolutePath() + " , has comment");
                if (containV1Magic(file)) {
                    try {
                        String readChannel = readChannel(file);
                        if (readChannel != null) {
                            file.delete();
                            throw new ChannelExistException("file : " + file.getAbsolutePath() + " has a channel : " + readChannel + ", only ignore");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                int unsignedInt16 = ZipUtils.getUnsignedInt16(eocd.getFirst(), 20);
                int length2 = bytes.length + unsignedInt16 + 2;
                byte[] bArr2 = ChannelConstants.V1_MAGIC;
                int length3 = length2 + bArr2.length;
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                    try {
                        randomAccessFile3.seek((eocd.getSecond().longValue() + 22) - 2);
                        writeShort(length3, randomAccessFile3);
                        randomAccessFile3.seek(eocd.getSecond().longValue() + 22 + unsignedInt16);
                        randomAccessFile3.write(bytes);
                        writeShort(bytes.length, randomAccessFile3);
                        randomAccessFile3.write(bArr2);
                        randomAccessFile3.close();
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = randomAccessFile3;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else {
            throw new Exception("param error , file : " + file + " , channel : " + str);
        }
    }

    private static void writeShort(int i5, DataOutput dataOutput) throws IOException {
        ByteBuffer order = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) i5);
        dataOutput.write(order.array());
    }
}
