package com.efs.sdk.base.newsharedpreferences;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class SharedPreferencesNewImpl implements SharedPreferences {
    private static final String BACKUP_FILE_SUFFIX = ".bak";
    private static final int CONTENT_LENGTH_LOST = 1;
    private static final int CONTENT_OVER_SIZE = 7;
    private static final int DATA_TYPE_ERROR = 8;
    private static final int DATA_TYPE_INVALID = 9;
    private static final long DELAY_TIME_TO_SAVE = 1000;
    private static final byte FINISH_MARK = 18;
    private static final int FINISH_MARK_LENGTH = 1;
    private static final int ID_LENGTH = 4;
    private static final int INIT_EXCEPTION = 10;
    private static final int LOAD_BAK_FILE = 12;
    private static final int MAPPED_BUFFER_ERROR = 4;
    private static final int MAX_HANDLERTHREAD = 3;
    private static final long MAX_LOCK_FILE_TIME = 10000;
    private static final int MAX_NUM = Integer.MAX_VALUE;
    private static final int MAX_TRY_TIME = 6;
    private static final int MIN_INCREASE_LENGTH = 1024;
    private static final int MODIFY_ID_LOST = 2;
    private static final int OTHER_EXCEPTION = 11;
    private static final String TAG = "SharedPreferencesNew";
    private static final long TRY_RELOAD_INTERVAL = 60;
    private static final int TRY_SAVE_TIME_DELAY = 2000;
    private static final int TYPE_CAST_EXCEPTION = 13;
    private static final int VALUE_LOST = 3;
    private static final Object mFileMonitorSyncObj = new Object();
    private static HandlerThread[] mHandlerThreadPool = new HandlerThread[3];
    private static final int mSaveMessageID = 21310;
    private static ExecutorService sCachedThreadPool;
    private String mBackupFilePath;
    private int mCurTryTime;
    private Vector<SharedPreferences.Editor> mEditorList;
    private OnSharedPreferenceErrorListener mErrorListener;
    private File mFile;
    private FileChannel mFileChannel;
    private FileMonitor mFileMonitor;
    private Handler mHandler;
    private boolean mIsSaving;
    private final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    private boolean mLoaded;
    private final LinkedHashMap<String, Object> mMap;
    private MappedByteBuffer mMappedByteBuffer;
    private int mModifyErrorCnt;
    private int mModifyID;
    private RunnableEx mSaveRunnable;
    private final Object mSyncObj;
    private final Object mSyncSaveObj;
    private final Runnable mTryReloadRunnable;
    private long mTryReloadStartTime;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ByteFloatUtils {
        private ByteFloatUtils() {
        }

        public static float bytesToFloat(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getFloat();
        }

        public static byte[] floatToBytes(float f5) {
            return ByteBuffer.allocate(4).putFloat(f5).array();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ByteIntUtils {
        private ByteIntUtils() {
        }

        public static int bytesToInt(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getInt();
        }

        public static byte[] intToBytes(int i5) {
            return ByteBuffer.allocate(4).putInt(i5).array();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ByteLongUtils {
        private ByteLongUtils() {
        }

        public static long bytesToLong(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getLong();
        }

        public static byte[] longToBytes(long j5) {
            return ByteBuffer.allocate(8).putLong(j5).array();
        }
    }

    /* loaded from: classes2.dex */
    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear;
        private HashMap<String, Object> mModified = new HashMap<>();

        public EditorImpl() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            SharedPreferencesNewImpl.this.save(this, false, false, true);
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            SharedPreferencesNewImpl.this.save(this, false, true, false);
            return true;
        }

        final boolean doClear() {
            boolean z4;
            synchronized (this) {
                z4 = this.mClear;
                this.mClear = false;
            }
            return z4;
        }

        final HashMap<String, Object> getAll() {
            HashMap<String, Object> hashMap;
            synchronized (this) {
                hashMap = this.mModified;
            }
            return hashMap;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z4) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z4));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f5) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f5));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i5) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i5));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j5) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j5));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new RuntimeException("putStringSet is not supported!");
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, null);
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    final class FileMonitor extends FileObserver {
        public FileMonitor(String str, int i5) {
            super(str, i5);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i5, String str) {
            if (SharedPreferencesNewImpl.this.mListeners.size() > 0) {
                SharedPreferencesNewImpl.this.tryReload();
            } else {
                stopWatching();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface OnSharedPreferenceErrorListener {
        void onError(String str, int i5, long j5);
    }

    /* loaded from: classes2.dex */
    public static abstract class RunnableEx implements Runnable {
        private Object mArg;

        public Object getArg() {
            return this.mArg;
        }

        public void setArg(Object obj) {
            this.mArg = obj;
        }
    }

    /* loaded from: classes2.dex */
    class SUPPORTED_TYPE {
        static final byte TYPE_BOOLEAN = 4;
        static final byte TYPE_FLOAT = 2;
        static final byte TYPE_INT = 1;
        static final byte TYPE_LONG = 3;
        static final byte TYPE_STRING = 5;

        private SUPPORTED_TYPE() {
        }
    }

    static {
        for (int i5 = 0; i5 < 3; i5++) {
            mHandlerThreadPool[i5] = new HandlerThread("newsp".concat(String.valueOf(i5)));
            mHandlerThreadPool[i5].start();
        }
        sCachedThreadPool = Executors.newCachedThreadPool();
    }

    public SharedPreferencesNewImpl(File file) {
        this(file, 0, null, false);
    }

    private MappedByteBuffer allocBuffer(int i5) {
        int i6;
        MappedByteBuffer mappedByteBuffer = this.mMappedByteBuffer;
        if (mappedByteBuffer != null) {
            i6 = mappedByteBuffer.position();
        } else {
            i6 = 0;
        }
        try {
            this.mMappedByteBuffer = this.mFileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        MappedByteBuffer mappedByteBuffer2 = this.mMappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.position(i6);
        }
        return this.mMappedByteBuffer;
    }

    private void awaitLoadedLocked() {
        if (!this.mLoaded) {
            synchronized (this) {
                while (!this.mLoaded) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        tryReload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void backup() {
        Throwable th;
        Closeable closeable;
        FileChannel fileChannel = null;
        try {
            File file = new File(this.mBackupFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileChannel = fileOutputStream.getChannel();
                this.mFileChannel.transferTo(0L, this.mMappedByteBuffer.capacity(), fileChannel);
                safeClose(fileOutputStream);
                safeClose(fileChannel);
            } catch (Throwable th2) {
                closeable = fileChannel;
                fileChannel = fileOutputStream;
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    safeClose(fileChannel);
                    safeClose(closeable);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    private byte getBCCCode(byte[] bArr) {
        byte b5 = 0;
        for (byte b6 : bArr) {
            b5 = (byte) (b5 ^ b6);
        }
        return b5;
    }

    private byte[] getBytes(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return ((String) obj).getBytes();
                }
                if (obj instanceof Boolean) {
                    int i5 = 1;
                    byte[] bArr = new byte[1];
                    if (!((Boolean) obj).booleanValue()) {
                        i5 = 0;
                    }
                    bArr[0] = (byte) i5;
                    return bArr;
                }
                if (obj instanceof Float) {
                    return ByteFloatUtils.floatToBytes(((Float) obj).floatValue());
                }
                if (obj instanceof Integer) {
                    return ByteIntUtils.intToBytes(((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    return ByteLongUtils.longToBytes(((Long) obj).longValue());
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private int getContentLength() {
        String str;
        long j5;
        if (this.mMappedByteBuffer == null || this.mFileChannel == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(0);
            byte[] bArr = new byte[4];
            safeBufferGet(this.mMappedByteBuffer, bArr);
            int bytesToInt = ByteIntUtils.bytesToInt(bArr);
            this.mMappedByteBuffer.position(4);
            byte b5 = this.mMappedByteBuffer.get();
            if ((b5 != 18 && b5 != getMaskByte(bArr)) || bytesToInt < 0) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    File file = this.mFile;
                    if (file != null) {
                        str = file.getAbsolutePath();
                    } else {
                        str = null;
                    }
                    File file2 = this.mFile;
                    if (file2 != null) {
                        j5 = file2.length();
                    } else {
                        j5 = 0;
                    }
                    onSharedPreferenceErrorListener.onError(str, 1, j5);
                }
                return -1;
            }
            if (bytesToInt > Integer.MAX_VALUE) {
                bytesToInt = Integer.MAX_VALUE;
            }
            return bytesToInt;
        }
    }

    private Pair<Integer, byte[][]> getDataBytes() {
        byte[][] bArr;
        ArrayList arrayList;
        synchronized (this.mMap) {
            bArr = new byte[this.mMap.size() * 5];
            arrayList = new ArrayList(this.mMap.entrySet());
            this.mEditorList.clear();
        }
        int i5 = 0;
        int i6 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Map.Entry entry = (Map.Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && str.trim().length() > 0 && value != null) {
                byte[] bytes = str.getBytes();
                byte[] intToBytes = ByteIntUtils.intToBytes(bytes.length);
                bArr[i6] = intToBytes;
                bArr[i6 + 1] = bytes;
                int length = i5 + intToBytes.length + bytes.length;
                byte[] bytes2 = getBytes(value);
                byte[] intToBytes2 = ByteIntUtils.intToBytes(bytes2.length);
                bArr[i6 + 2] = intToBytes2;
                bArr[i6 + 3] = bytes2;
                int length2 = length + intToBytes2.length + bytes2.length;
                byte[] bArr2 = new byte[1];
                bArr2[0] = (byte) getObjectType(value);
                bArr[i6 + 4] = bArr2;
                i5 = length2 + 1;
                i6 += 5;
            }
        }
        return new Pair<>(Integer.valueOf(i5), bArr);
    }

    private HandlerThread getHandlerThread() {
        int nextInt = new Random().nextInt();
        if (nextInt < 0) {
            nextInt = -nextInt;
        }
        return mHandlerThreadPool[nextInt % 3];
    }

    private byte getMaskByte(byte[] bArr) {
        return getBCCCode(bArr);
    }

    private Object getObjectByType(byte[] bArr, int i5) {
        if (bArr != null && bArr.length > 0) {
            try {
                if (i5 == 5) {
                    return new String(bArr);
                }
                boolean z4 = true;
                if (i5 == 4) {
                    if (bArr[0] != 1) {
                        z4 = false;
                    }
                    return Boolean.valueOf(z4);
                }
                if (i5 == 2) {
                    return Float.valueOf(ByteFloatUtils.bytesToFloat(bArr));
                }
                if (i5 == 1) {
                    return Integer.valueOf(ByteIntUtils.bytesToInt(bArr));
                }
                if (i5 == 3) {
                    return Long.valueOf(ByteLongUtils.bytesToLong(bArr));
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private int getObjectType(Object obj) {
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof Boolean) {
            return 4;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        return 0;
    }

    private Pair<byte[], Integer> getOneString(byte[] bArr, int i5) {
        int i6;
        byte[] bArr2;
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, i5, bArr3, 0, 4);
        int i7 = i5 + 4;
        byte b5 = bArr[i7];
        if (b5 != 18 && b5 != getMaskByte(bArr3)) {
            throw new Exception("length string's finish mark missing");
        }
        int i8 = i7 + 1;
        int bytesToInt = ByteIntUtils.bytesToInt(bArr3);
        if (bytesToInt >= 0 && (i6 = i8 + bytesToInt) < bArr.length && bytesToInt <= Integer.MAX_VALUE) {
            if (bytesToInt != 0) {
                bArr2 = new byte[bytesToInt];
                System.arraycopy(bArr, i8, bArr2, 0, bytesToInt);
                byte b6 = bArr[i6];
                if (b6 != 18 && b6 != getMaskByte(bArr2)) {
                    throw new Exception("Stored bytes' finish mark missing");
                }
                i8 = i6;
            } else {
                bArr2 = null;
            }
            return new Pair<>(bArr2, Integer.valueOf(i8 + 1));
        }
        throw new Exception("length string is invalid");
    }

    private int increaseModifyID() {
        int i5 = (this.mModifyID + 1) % Integer.MAX_VALUE;
        this.mModifyID = i5;
        return i5;
    }

    private boolean initBuffer() {
        boolean z4 = true;
        if (this.mMappedByteBuffer != null) {
            return true;
        }
        try {
            if (!this.mFile.exists()) {
                this.mFile.getParentFile().mkdirs();
                this.mFile.createNewFile();
                z4 = new File(this.mBackupFilePath).exists();
            } else if (this.mFile.length() == 0) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mFile.getAbsolutePath(), 4, this.mFile.length());
                }
                z4 = false;
            }
            this.mFileChannel = new RandomAccessFile(this.mFile, "rw").getChannel();
            allocBuffer(10);
            if (!z4) {
                initFileHeader();
                return z4;
            }
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
            if (onSharedPreferenceErrorListener2 != null) {
                onSharedPreferenceErrorListener2.onError(this.mFile.getAbsolutePath() + " " + e5.getCause(), 10, -1L);
            }
            return false;
        }
    }

    private void initFileHeader() {
        if (this.mMappedByteBuffer != null) {
            byte[] bArr = new byte[10];
            byte[] intToBytes = ByteIntUtils.intToBytes(0);
            System.arraycopy(intToBytes, 0, bArr, 0, 4);
            bArr[4] = getMaskByte(intToBytes);
            byte[] intToBytes2 = ByteIntUtils.intToBytes(0);
            System.arraycopy(intToBytes2, 0, bArr, 5, 4);
            bArr[9] = getMaskByte(intToBytes2);
            this.mMappedByteBuffer.position(0);
            this.mMappedByteBuffer.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(boolean r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.load(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private boolean loadFromBakFile() {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        int bytesToInt;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = true;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        try {
            randomAccessFile = new RandomAccessFile(this.mBackupFilePath, "r");
            try {
                byte[] bArr3 = new byte[4];
                randomAccessFile.read(bArr3, 0, 4);
                bytesToInt = ByteIntUtils.bytesToInt(bArr3);
            } catch (Throwable th) {
                th = th;
                bArr = bArr2;
                randomAccessFile2 = randomAccessFile;
                try {
                    th.printStackTrace();
                    safeClose(randomAccessFile2);
                    try {
                        z4 = parseBytesIntoMap(bArr, false);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        String str = this.mBackupFilePath + "#" + th.getCause() + "#" + z4;
                        if (bArr != null) {
                            i6 = bArr.length;
                        }
                        onSharedPreferenceErrorListener.onError(str, 12, i6);
                    }
                    return z4;
                } finally {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
        if (bytesToInt <= 10) {
            safeClose(randomAccessFile);
            try {
                parseBytesIntoMap(null, false);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return false;
        }
        if (bytesToInt > Integer.MAX_VALUE) {
            bytesToInt = Integer.MAX_VALUE;
        }
        if (bytesToInt > randomAccessFile.length()) {
            bytesToInt = (int) randomAccessFile.length();
        }
        int i7 = bytesToInt - 10;
        bArr2 = new byte[i7];
        randomAccessFile.seek(10L);
        randomAccessFile.read(bArr2);
        safeClose(randomAccessFile);
        try {
            z4 = parseBytesIntoMap(bArr2, false);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
        if (onSharedPreferenceErrorListener2 != null) {
            onSharedPreferenceErrorListener2.onError(this.mBackupFilePath + "#" + ((Object) "") + "#" + z4, 12, i7);
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFromDiskLocked() {
        if (this.mLoaded) {
            return;
        }
        load(false);
        this.mLoaded = true;
        notifyAll();
    }

    private FileLock lockFile(boolean z4) {
        FileChannel fileChannel = this.mFileChannel;
        FileLock fileLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z4) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (fileLock == null) {
                try {
                    fileLock = this.mFileChannel.tryLock();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (fileLock == null) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                if (SystemClock.uptimeMillis() - uptimeMillis > MAX_LOCK_FILE_TIME) {
                    return fileLock;
                }
            }
            return fileLock;
        }
        try {
            return fileChannel.tryLock();
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private boolean merge(SharedPreferences.Editor editor, Map map, boolean z4) {
        if (editor == null) {
            return false;
        }
        EditorImpl editorImpl = (EditorImpl) editor;
        boolean doClear = editorImpl.doClear();
        if (doClear) {
            map.clear();
            this.mEditorList.clear();
        }
        HashMap<String, Object> all = editorImpl.getAll();
        if (all.size() == 0) {
            if (!doClear) {
                return false;
            }
            return true;
        }
        synchronized (editor) {
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    map.remove(key);
                } else {
                    if (map.containsKey(key)) {
                        map.remove(key);
                    }
                    map.put(key, value);
                }
                if (!z4) {
                    notifyDataChanged(key);
                }
            }
        }
        return true;
    }

    private void mergeWhenReload() {
        synchronized (this.mMap) {
            if (this.mEditorList.size() > 0) {
                Iterator<SharedPreferences.Editor> it = this.mEditorList.iterator();
                while (it.hasNext()) {
                    merge(it.next(), this.mMap, true);
                }
            }
        }
    }

    private void notifyDataChanged(String str) {
        if (this.mListeners.size() > 0) {
            for (int i5 = 0; i5 < this.mListeners.size(); i5++) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.mListeners.get(i5);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    private byte[] obtainTotalBytes() {
        String str;
        Pair<Integer, byte[][]> dataBytes = getDataBytes();
        int intValue = ((Integer) dataBytes.first).intValue() + 10 + (((byte[][]) dataBytes.second).length * 1);
        if (intValue > Integer.MAX_VALUE) {
            intValue = Integer.MAX_VALUE;
        }
        byte[] bArr = new byte[intValue];
        byte[] intToBytes = ByteIntUtils.intToBytes(intValue);
        System.arraycopy(intToBytes, 0, bArr, 0, intToBytes.length);
        int length = intToBytes.length + 0;
        bArr[length] = getMaskByte(intToBytes);
        int i5 = length + 1;
        byte[] intToBytes2 = ByteIntUtils.intToBytes(increaseModifyID());
        System.arraycopy(intToBytes2, 0, bArr, i5, intToBytes2.length);
        int length2 = i5 + intToBytes2.length;
        bArr[length2] = getMaskByte(intToBytes2);
        int i6 = length2 + 1;
        byte[][] bArr2 = (byte[][]) dataBytes.second;
        int length3 = bArr2.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length3) {
                break;
            }
            byte[] bArr3 = bArr2[i7];
            if (bArr3 != null) {
                if (bArr3.length + i6 + 1 <= Integer.MAX_VALUE) {
                    System.arraycopy(bArr3, 0, bArr, i6, bArr3.length);
                    int length4 = i6 + bArr3.length;
                    bArr[length4] = getMaskByte(bArr3);
                    i6 = length4 + 1;
                } else {
                    StringBuilder sb = new StringBuilder("Write too much data in ");
                    File file = this.mFile;
                    String str2 = null;
                    if (file != null) {
                        str = file.getAbsolutePath();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    Log.e(TAG, sb.toString());
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        File file2 = this.mFile;
                        if (file2 != null) {
                            str2 = file2.getAbsolutePath();
                        }
                        onSharedPreferenceErrorListener.onError(str2, 7, -1L);
                    }
                }
            }
            i7++;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r3 = r12.mErrorListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r5 = r12.mFile;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r5 = r5.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        r3.onError(r5, 8, r13.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseBytesIntoMap(byte[] r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.parseBytesIntoMap(byte[], boolean):boolean");
    }

    private void reallocBuffer() {
        if (this.mMappedByteBuffer == null) {
            return;
        }
        synchronized (this.mSyncObj) {
            try {
                int contentLength = getContentLength();
                if (contentLength > this.mMappedByteBuffer.capacity()) {
                    allocBuffer(contentLength + 1024);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private boolean safeBufferGet(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        int position = mappedByteBuffer.position();
        if (position + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    private void safeBufferPut(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer != null && bArr != null && bArr.length != 0) {
            if (mappedByteBuffer.position() + bArr.length >= mappedByteBuffer.capacity()) {
                mappedByteBuffer = allocBuffer(mappedByteBuffer.position() + bArr.length + 1024);
            }
            mappedByteBuffer.put(bArr);
        }
    }

    private void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save(SharedPreferences.Editor editor, boolean z4, boolean z5, boolean z6) {
        long j5;
        if (editor == null) {
            return;
        }
        synchronized (this.mMap) {
            boolean z7 = false;
            this.mCurTryTime = 0;
            if (!merge(editor, this.mMap, false)) {
                if (this.mEditorList.size() == 0) {
                    return;
                }
            } else {
                z7 = true;
            }
            if (z7) {
                this.mEditorList.add(editor);
            }
            if (z5) {
                saveInner(z4);
                return;
            }
            if (z6) {
                j5 = 1000;
            } else {
                j5 = 0;
            }
            this.mSaveRunnable.setArg(Boolean.valueOf(z4));
            Message obtain = Message.obtain(this.mHandler, this.mSaveRunnable);
            obtain.what = mSaveMessageID;
            this.mHandler.sendMessageDelayed(obtain, j5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveInner(final boolean z4) {
        synchronized (this.mSyncSaveObj) {
            FileLock lockFile = lockFile(false);
            if (lockFile != null) {
                try {
                    this.mIsSaving = true;
                    if (tryReloadWhenSave()) {
                        mergeWhenReload();
                        notifyDataChanged(null);
                    }
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                        if (onSharedPreferenceErrorListener != null) {
                            onSharedPreferenceErrorListener.onError(th.getMessage(), 11, -1L);
                        }
                        try {
                            lockFile.release();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    } finally {
                        try {
                            lockFile.release();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        this.mIsSaving = false;
                    }
                }
                synchronized (this.mMap) {
                    if (this.mEditorList.size() <= 0) {
                        return;
                    }
                    saveToMappedBuffer(obtainTotalBytes(), z4);
                    backup();
                    try {
                        lockFile.release();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    this.mIsSaving = false;
                }
            }
            int i5 = this.mCurTryTime;
            this.mCurTryTime = i5 + 1;
            if (i5 < 6) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SharedPreferencesNewImpl.this.saveInner(z4);
                    }
                }, 2000L);
            }
        }
    }

    private void saveToMappedBuffer(byte[] bArr, boolean z4) {
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(0);
            safeBufferPut(this.mMappedByteBuffer, bArr);
            if (z4) {
                this.mMappedByteBuffer.force();
            }
        }
    }

    private void startLoadFromDisk(boolean z4) {
        synchronized (this) {
            this.mLoaded = false;
        }
        Runnable runnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (SharedPreferencesNewImpl.this) {
                    SharedPreferencesNewImpl.this.loadFromDiskLocked();
                }
            }
        };
        if (z4) {
            runnable.run();
        } else {
            sCachedThreadPool.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryReload() {
        if (SystemClock.uptimeMillis() - this.mTryReloadStartTime > 60) {
            this.mTryReloadStartTime = SystemClock.uptimeMillis();
            this.mHandler.removeCallbacks(this.mTryReloadRunnable);
            this.mHandler.post(this.mTryReloadRunnable);
        }
    }

    private boolean tryReloadWhenSave() {
        int modifyID = getModifyID();
        if (modifyID > 0 && modifyID != this.mModifyID) {
            load(true);
            return true;
        }
        return false;
    }

    final boolean checkTypeValid(byte b5) {
        return b5 == 4 || b5 == 2 || b5 == 1 || b5 == 3 || b5 == 5;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean containsKey;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            containsKey = this.mMap.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        awaitLoadedLocked();
        return new EditorImpl();
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            hashMap = new HashMap(this.mMap);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z4) {
        String str2;
        long j5;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Boolean bool = (Boolean) this.mMap.get(str);
                    if (bool != null) {
                        z4 = bool.booleanValue();
                    }
                } catch (ClassCastException e5) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        if (file != null) {
                            str2 = file.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                        sb.append(str2);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e5);
                        String sb2 = sb.toString();
                        File file2 = this.mFile;
                        if (file2 != null) {
                            j5 = file2.length();
                        } else {
                            j5 = 0;
                        }
                        onSharedPreferenceErrorListener.onError(sb2, 13, j5);
                    }
                    return z4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f5) {
        String str2;
        long j5;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Float f6 = (Float) this.mMap.get(str);
                    if (f6 != null) {
                        f5 = f6.floatValue();
                    }
                } catch (ClassCastException e5) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        if (file != null) {
                            str2 = file.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                        sb.append(str2);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e5);
                        String sb2 = sb.toString();
                        File file2 = this.mFile;
                        if (file2 != null) {
                            j5 = file2.length();
                        } else {
                            j5 = 0;
                        }
                        onSharedPreferenceErrorListener.onError(sb2, 13, j5);
                    }
                    return f5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i5) {
        String str2;
        long j5;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Integer num = (Integer) this.mMap.get(str);
                    if (num != null) {
                        i5 = num.intValue();
                    }
                } catch (ClassCastException e5) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        if (file != null) {
                            str2 = file.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                        sb.append(str2);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e5);
                        String sb2 = sb.toString();
                        File file2 = this.mFile;
                        if (file2 != null) {
                            j5 = file2.length();
                        } else {
                            j5 = 0;
                        }
                        onSharedPreferenceErrorListener.onError(sb2, 13, j5);
                    }
                    return i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j5) {
        String str2;
        long j6;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Long l5 = (Long) this.mMap.get(str);
                    if (l5 != null) {
                        j5 = l5.longValue();
                    }
                } catch (ClassCastException e5) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        if (file != null) {
                            str2 = file.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                        sb.append(str2);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e5);
                        String sb2 = sb.toString();
                        File file2 = this.mFile;
                        if (file2 != null) {
                            j6 = file2.length();
                        } else {
                            j6 = 0;
                        }
                        onSharedPreferenceErrorListener.onError(sb2, 13, j6);
                    }
                    return j5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getModifyID() {
        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener;
        String str;
        long j5;
        if (this.mMappedByteBuffer == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(5);
            byte[] bArr = new byte[4];
            safeBufferGet(this.mMappedByteBuffer, bArr);
            int bytesToInt = ByteIntUtils.bytesToInt(bArr);
            this.mMappedByteBuffer.position(9);
            byte b5 = this.mMappedByteBuffer.get();
            if ((b5 != 18 && b5 != getMaskByte(bArr)) || bytesToInt < 0) {
                int i5 = this.mModifyErrorCnt + 1;
                this.mModifyErrorCnt = i5;
                if (i5 < 3 && (onSharedPreferenceErrorListener = this.mErrorListener) != null) {
                    File file = this.mFile;
                    if (file != null) {
                        str = file.getAbsolutePath();
                    } else {
                        str = null;
                    }
                    File file2 = this.mFile;
                    if (file2 != null) {
                        j5 = file2.length();
                    } else {
                        j5 = 0;
                    }
                    onSharedPreferenceErrorListener.onError(str, 2, j5);
                }
                return -1;
            }
            return bytesToInt;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String str3;
        long j5;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    String str4 = (String) this.mMap.get(str);
                    if (str4 != null) {
                        str2 = str4;
                    }
                } catch (ClassCastException e5) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        if (file != null) {
                            str3 = file.getAbsolutePath();
                        } else {
                            str3 = null;
                        }
                        sb.append(str3);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e5);
                        String sb2 = sb.toString();
                        File file2 = this.mFile;
                        if (file2 != null) {
                            j5 = file2.length();
                        } else {
                            j5 = 0;
                        }
                        onSharedPreferenceErrorListener.onError(sb2, 13, j5);
                    }
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        throw new RuntimeException("putStringSet is not supported!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void onDestroy() {
        if (this.mIsSaving || this.mHandler.hasMessages(mSaveMessageID)) {
            saveInner(false);
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.add(onSharedPreferenceChangeListener);
                if (this.mFileMonitor == null) {
                    try {
                        File file = new File(this.mBackupFilePath);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    this.mFileMonitor = new FileMonitor(this.mBackupFilePath, 2);
                }
            }
            synchronized (mFileMonitorSyncObj) {
                this.mFileMonitor.startWatching();
            }
        }
    }

    public final void setSharedPreferenceErrorListener(OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this.mErrorListener = onSharedPreferenceErrorListener;
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.remove(onSharedPreferenceChangeListener);
                if (this.mFileMonitor != null && this.mListeners.size() <= 0) {
                    this.mFileMonitor.stopWatching();
                }
            }
        }
    }

    public SharedPreferencesNewImpl(File file, boolean z4) {
        this(file, 0, null, z4);
    }

    public SharedPreferencesNewImpl(File file, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, 0, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int i5, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, i5, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int i5, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener, boolean z4) {
        this.mMap = new LinkedHashMap<>();
        this.mListeners = new ArrayList<>();
        this.mLoaded = true;
        this.mSyncObj = new Object();
        this.mSyncSaveObj = new Object();
        this.mEditorList = new Vector<>();
        this.mIsSaving = false;
        this.mTryReloadRunnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.2
            @Override // java.lang.Runnable
            public void run() {
                int modifyID = SharedPreferencesNewImpl.this.getModifyID();
                if (modifyID > 0 && modifyID != SharedPreferencesNewImpl.this.mModifyID) {
                    SharedPreferencesNewImpl.this.saveInner(false);
                }
            }
        };
        this.mSaveRunnable = new RunnableEx() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferencesNewImpl.this.saveInner(((Boolean) getArg()).booleanValue());
            }
        };
        this.mErrorListener = onSharedPreferenceErrorListener;
        this.mHandler = new Handler(getHandlerThread().getLooper());
        this.mFile = file;
        this.mBackupFilePath = file.getAbsolutePath() + BACKUP_FILE_SUFFIX;
        if (initBuffer()) {
            startLoadFromDisk(z4);
        }
        this.mHandler.post(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    File file2 = new File(SharedPreferencesNewImpl.this.mBackupFilePath);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }
}
