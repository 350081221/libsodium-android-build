package com.lody.virtual.helper.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ACache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, ACache> mInstanceMap = new HashMap();
    private ACacheManager mCache;

    /* loaded from: classes3.dex */
    public class ACacheManager {
        private final AtomicInteger cacheCount;
        protected File cacheDir;
        private final AtomicLong cacheSize;
        private final int countLimit;
        private final Map<File, Long> lastUsageDates;
        private final long sizeLimit;

        private void calculateCacheSizeAndCacheCount() {
            new Thread(new Runnable() { // from class: com.lody.virtual.helper.utils.ACache.ACacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    File[] listFiles = ACacheManager.this.cacheDir.listFiles();
                    if (listFiles != null) {
                        int i5 = 0;
                        int i6 = 0;
                        for (File file : listFiles) {
                            i5 = (int) (i5 + ACacheManager.this.calculateSize(file));
                            i6++;
                            ACacheManager.this.lastUsageDates.put(file, Long.valueOf(file.lastModified()));
                        }
                        ACacheManager.this.cacheSize.set(i5);
                        ACacheManager.this.cacheCount.set(i6);
                    }
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long calculateSize(File file) {
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.lastUsageDates.clear();
            this.cacheSize.set(0L);
            File[] listFiles = this.cacheDir.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File get(String str) {
            File newFile = newFile(str);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            newFile.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(newFile, valueOf);
            return newFile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File newFile(String str) {
            return new File(this.cacheDir, str.hashCode() + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(File file) {
            int i5 = this.cacheCount.get();
            while (i5 + 1 > this.countLimit) {
                this.cacheSize.addAndGet(-removeNext());
                i5 = this.cacheCount.addAndGet(-1);
            }
            this.cacheCount.addAndGet(1);
            long calculateSize = calculateSize(file);
            long j5 = this.cacheSize.get();
            while (j5 + calculateSize > this.sizeLimit) {
                j5 = this.cacheSize.addAndGet(-removeNext());
            }
            this.cacheSize.addAndGet(calculateSize);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(file, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean remove(String str) {
            return get(str).delete();
        }

        private long removeNext() {
            File file;
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> entrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
                file = null;
                Long l5 = null;
                for (Map.Entry<File, Long> entry : entrySet) {
                    if (file == null) {
                        file = entry.getKey();
                        l5 = entry.getValue();
                    } else {
                        Long value = entry.getValue();
                        if (value.longValue() < l5.longValue()) {
                            file = entry.getKey();
                            l5 = value;
                        }
                    }
                }
            }
            long calculateSize = calculateSize(file);
            if (file.delete()) {
                this.lastUsageDates.remove(file);
            }
            return calculateSize;
        }

        private ACacheManager(File file, long j5, int i5) {
            this.lastUsageDates = Collections.synchronizedMap(new HashMap());
            this.cacheDir = file;
            this.sizeLimit = j5;
            this.countLimit = i5;
            this.cacheSize = new AtomicLong();
            this.cacheCount = new AtomicInteger();
            calculateCacheSizeAndCacheCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Instrumented
    /* loaded from: classes3.dex */
    public static class Utils {
        private static final char mSeparator = ' ';

        private Utils() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] Bitmap2Bytes(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap Bytes2Bimap(byte[] bArr) {
            if (bArr.length == 0) {
                return null;
            }
            return BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable bitmap2Drawable(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            new BitmapDrawable(bitmap).setTargetDensity(bitmap.getDensity());
            return new BitmapDrawable(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String clearDateInfo(String str) {
            return (str == null || !hasDateInfo(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static byte[] copyOfRange(byte[] bArr, int i5, int i6) {
            int i7 = i6 - i5;
            if (i7 >= 0) {
                byte[] bArr2 = new byte[i7];
                System.arraycopy(bArr, i5, bArr2, 0, Math.min(bArr.length - i5, i7));
                return bArr2;
            }
            throw new IllegalArgumentException(i5 + " > " + i6);
        }

        private static String createDateInfo(int i5) {
            String str = System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0" + str;
            }
            return str + "-" + i5 + mSeparator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap drawable2Bitmap(Drawable drawable) {
            Bitmap.Config config;
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        }

        private static String[] getDateInfoFromDate(byte[] bArr) {
            if (hasDateInfo(bArr)) {
                return new String[]{new String(copyOfRange(bArr, 0, 13)), new String(copyOfRange(bArr, 14, indexOf(bArr, mSeparator)))};
            }
            return null;
        }

        private static boolean hasDateInfo(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && indexOf(bArr, mSeparator) > 14;
        }

        private static int indexOf(byte[] bArr, char c5) {
            for (int i5 = 0; i5 < bArr.length; i5++) {
                if (bArr[i5] == c5) {
                    return i5;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(String str) {
            return isDue(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithDateInfo(int i5, byte[] bArr) {
            byte[] bytes = createDateInfo(i5).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String newStringWithDateInfo(int i5, String str) {
            return createDateInfo(i5) + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            String[] dateInfoFromDate = getDateInfoFromDate(bArr);
            if (dateInfoFromDate != null && dateInfoFromDate.length == 2) {
                String str = dateInfoFromDate[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                if (System.currentTimeMillis() > Long.valueOf(str).longValue() + (Long.valueOf(dateInfoFromDate[1]).longValue() * 1000)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] clearDateInfo(byte[] bArr) {
            return hasDateInfo(bArr) ? copyOfRange(bArr, indexOf(bArr, mSeparator) + 1, bArr.length) : bArr;
        }
    }

    /* loaded from: classes3.dex */
    class xFileOutputStream extends FileOutputStream {
        File file;

        public xFileOutputStream(File file) throws FileNotFoundException {
            super(file);
            this.file = file;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            ACache.this.mCache.put(this.file);
        }
    }

    private ACache(File file, long j5, int i5) {
        if (!file.exists() && !file.mkdirs()) {
            throw new RuntimeException("can't make dirs in " + file.getAbsolutePath());
        }
        this.mCache = new ACacheManager(file, j5, i5);
    }

    public static ACache get(Context context) {
        return get(context, "ACache");
    }

    private static String myPid() {
        return "_" + Process.myPid();
    }

    public void clear() {
        this.mCache.clear();
    }

    public File file(String str) {
        File newFile = this.mCache.newFile(str);
        if (newFile.exists()) {
            return newFile;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0053: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:84), block:B:37:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getAsBinary(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            com.lody.virtual.helper.utils.ACache$ACacheManager r1 = r5.mCache     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.io.File r1 = com.lody.virtual.helper.utils.ACache.ACacheManager.access$500(r1, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r2 != 0) goto Le
            return r0
        Le:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r3 = "r"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            long r3 = r2.length()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            int r1 = (int) r3     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            r2.read(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            boolean r3 = com.lody.virtual.helper.utils.ACache.Utils.access$900(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            if (r3 != 0) goto L32
            byte[] r6 = com.lody.virtual.helper.utils.ACache.Utils.access$1000(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L52
            r2.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r0.printStackTrace()
        L31:
            return r6
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r1 = move-exception
            r1.printStackTrace()
        L3a:
            r5.remove(r6)
            return r0
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L54
        L42:
            r6 = move-exception
            r2 = r0
        L44:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r6 = move-exception
            r6.printStackTrace()
        L51:
            return r0
        L52:
            r6 = move-exception
            r0 = r2
        L54:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            r0.printStackTrace()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.helper.utils.ACache.getAsBinary(java.lang.String):byte[]");
    }

    public Bitmap getAsBitmap(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return Utils.Bytes2Bimap(getAsBinary(str));
    }

    public Drawable getAsDrawable(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return Utils.bitmap2Drawable(Utils.Bytes2Bimap(getAsBinary(str)));
    }

    public JSONArray getAsJSONArray(String str) {
        try {
            return new JSONArray(getAsString(str));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public JSONObject getAsJSONObject(String str) {
        try {
            return new JSONObject(getAsString(str));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public Object getAsObject(String str) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ?? asBinary = getAsBinary(str);
        try {
            if (asBinary == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(asBinary);
            } catch (Exception e5) {
                e = e5;
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th) {
                byteArrayInputStream = null;
                th = th;
                asBinary = 0;
            }
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object readObject = objectInputStream.readObject();
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    return readObject;
                } catch (Exception e8) {
                    e = e8;
                    e.printStackTrace();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e11) {
                e = e11;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                asBinary = 0;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                if (asBinary != 0) {
                    try {
                        asBinary.close();
                        throw th;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public String getAsString(String str) {
        BufferedReader bufferedReader;
        File file = this.mCache.get(str);
        ?? exists = file.exists();
        BufferedReader bufferedReader2 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String str2 = "";
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str2 = str2 + readLine;
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                if (!Utils.isDue(str2)) {
                    String clearDateInfo = Utils.clearDateInfo(str2);
                    try {
                        bufferedReader.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    return clearDateInfo;
                }
                try {
                    bufferedReader.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                remove(str);
                return null;
            } catch (IOException e9) {
                e = e9;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = exists;
        }
    }

    public void put(String str, String str2) {
        BufferedWriter bufferedWriter;
        File newFile = this.mCache.newFile(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(newFile), 1024);
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str2);
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e6) {
                e = e6;
                e.printStackTrace();
                this.mCache.put(newFile);
            }
        } catch (IOException e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (IOException e8) {
                    e = e8;
                    e.printStackTrace();
                    this.mCache.put(newFile);
                }
            }
            this.mCache.put(newFile);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            this.mCache.put(newFile);
            throw th;
        }
        this.mCache.put(newFile);
    }

    public boolean remove(String str) {
        return this.mCache.remove(str);
    }

    public static ACache get(Context context, String str) {
        return get(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static ACache get(File file) {
        return get(file, 50000000L, Integer.MAX_VALUE);
    }

    public static ACache get(Context context, long j5, int i5) {
        return get(new File(context.getCacheDir(), "ACache"), j5, i5);
    }

    public static ACache get(File file, long j5, int i5) {
        ACache aCache = mInstanceMap.get(file.getAbsoluteFile() + myPid());
        if (aCache != null) {
            return aCache;
        }
        ACache aCache2 = new ACache(file, j5, i5);
        mInstanceMap.put(file.getAbsolutePath() + myPid(), aCache2);
        return aCache2;
    }

    public InputStream get(String str) throws FileNotFoundException {
        File file = this.mCache.get(str);
        if (file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    public void put(String str, String str2, int i5) {
        put(str, Utils.newStringWithDateInfo(i5, str2));
    }

    public void put(String str, JSONObject jSONObject) {
        put(str, jSONObject.toString());
    }

    public void put(String str, JSONObject jSONObject, int i5) {
        put(str, jSONObject.toString(), i5);
    }

    public void put(String str, JSONArray jSONArray) {
        put(str, jSONArray.toString());
    }

    public void put(String str, JSONArray jSONArray, int i5) {
        put(str, jSONArray.toString(), i5);
    }

    public void put(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        File newFile = this.mCache.newFile(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(newFile);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e6) {
                e = e6;
                e.printStackTrace();
                this.mCache.put(newFile);
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e8) {
                    e = e8;
                    e.printStackTrace();
                    this.mCache.put(newFile);
                }
            }
            this.mCache.put(newFile);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            this.mCache.put(newFile);
            throw th;
        }
        this.mCache.put(newFile);
    }

    public OutputStream put(String str) throws FileNotFoundException {
        return new xFileOutputStream(this.mCache.newFile(str));
    }

    public void put(String str, byte[] bArr, int i5) {
        put(str, Utils.newByteArrayWithDateInfo(i5, bArr));
    }

    public void put(String str, Serializable serializable) {
        put(str, serializable, -1);
    }

    public void put(String str, Serializable serializable, int i5) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e5) {
                e = e5;
            }
            try {
                objectOutputStream.writeObject(serializable);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (i5 != -1) {
                    put(str, byteArray, i5);
                } else {
                    put(str, byteArray);
                }
                objectOutputStream.close();
            } catch (Exception e6) {
                e = e6;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                objectOutputStream2.close();
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                try {
                    objectOutputStream2.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public void put(String str, Bitmap bitmap) {
        put(str, Utils.Bitmap2Bytes(bitmap));
    }

    public void put(String str, Bitmap bitmap, int i5) {
        put(str, Utils.Bitmap2Bytes(bitmap), i5);
    }

    public void put(String str, Drawable drawable) {
        put(str, Utils.drawable2Bitmap(drawable));
    }

    public void put(String str, Drawable drawable, int i5) {
        put(str, Utils.drawable2Bitmap(drawable), i5);
    }
}
