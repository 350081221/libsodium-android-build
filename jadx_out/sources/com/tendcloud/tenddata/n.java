package com.tendcloud.tenddata;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, a> f11763a = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    static class a {
        private FileLock fileLock;
        private RandomAccessFile randomAccessFile;

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        Custom_Device_Id_Lock_File("Custom_Device_Id_Lock_File"),
        Cloud_Control_Lock_File("Cloud_Control_Cache_Param"),
        App_Lock_File("__App_Synchronous_Lock__"),
        Tracking_Lock_File("__Tracking_Synchronous_Lock__"),
        Env_Lock_File("__Env_Synchronous_Lock__"),
        Game_Lock_File("__Game_Synchronous_Lock__"),
        Push_Lock_File("__Push_Synchronous_Lock__"),
        EAuth_Lock_File("__EAuth_Synchronous_Lock__"),
        App_SQL_Lock_File("__AppSQL_Synchronous_Lock__"),
        BG_Lock_File("__BG_Synchronous_Lock__"),
        Universal_Lock_File("__SDK_Synchronous_Lock__"),
        AES_DATA_LOCK("_AES_DATA_LOCK"),
        AES_DATA_ENTRYCP_LOCK("_AES_DATA_ENTCRYPT_LOCK"),
        AES_SALT_LOCK("_AES_SALT_LOCK"),
        AES_IV_LOCK("_AES_IV_LOCK");

        private final String filePath;

        b(String str) {
            this.filePath = new File(ab.f11351g.getFilesDir(), ab.f11363s + str).getAbsolutePath();
        }

        public static String getFeatureLockFileName(int i5) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 != 6) {
                                    if (i5 != 7) {
                                        if (i5 != 8) {
                                            if (i5 != 99) {
                                                return null;
                                            }
                                            return Universal_Lock_File.toString();
                                        }
                                        return BG_Lock_File.toString();
                                    }
                                    return App_SQL_Lock_File.toString();
                                }
                                return EAuth_Lock_File.toString();
                            }
                            return Push_Lock_File.toString();
                        }
                        return Game_Lock_File.toString();
                    }
                    return Env_Lock_File.toString();
                }
                return Tracking_Lock_File.toString();
            }
            return App_Lock_File.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.filePath;
        }
    }

    public static boolean a(String str) {
        a aVar;
        RandomAccessFile randomAccessFile;
        try {
            if (!y.b(str)) {
                File file = new File(str);
                if (f11763a.containsKey(str)) {
                    aVar = f11763a.get(str);
                    randomAccessFile = aVar.randomAccessFile;
                } else {
                    a aVar2 = new a();
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    aVar2.randomAccessFile = randomAccessFile2;
                    f11763a.put(str, aVar2);
                    aVar = aVar2;
                    randomAccessFile = randomAccessFile2;
                }
                aVar.fileLock = randomAccessFile.getChannel().tryLock();
                if (aVar.fileLock == null) {
                    return false;
                }
                return true;
            }
            throw new RuntimeException("LockManager Error: filePath can not be null!");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static RandomAccessFile b(String str) {
        try {
            if (!y.b(str)) {
                File file = new File(str);
                if (f11763a.containsKey(str)) {
                    return f11763a.get(str).randomAccessFile;
                }
                a aVar = new a();
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                aVar.randomAccessFile = randomAccessFile;
                f11763a.put(str, aVar);
                return randomAccessFile;
            }
            throw new RuntimeException("LockManager Error: filePath can not be null!");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void getFileLock(String str) {
        a aVar;
        RandomAccessFile randomAccessFile;
        try {
            if (!y.b(str)) {
                File file = new File(str);
                if (f11763a.containsKey(str)) {
                    aVar = f11763a.get(str);
                    randomAccessFile = aVar.randomAccessFile;
                } else {
                    a aVar2 = new a();
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    aVar2.randomAccessFile = randomAccessFile2;
                    f11763a.put(str, aVar2);
                    aVar = aVar2;
                    randomAccessFile = randomAccessFile2;
                }
                aVar.fileLock = randomAccessFile.getChannel().lock();
                return;
            }
            throw new RuntimeException("LockManager Error: filePath can not be null!");
        } catch (Throwable unused) {
        }
    }

    public static void releaseFileLock(String str) {
        try {
            if (!y.b(str)) {
                if (f11763a.containsKey(str)) {
                    a aVar = f11763a.get(str);
                    if (aVar.fileLock != null) {
                        aVar.fileLock.release();
                        return;
                    }
                    return;
                }
                throw new RuntimeException("LockManager Error: there is no information about this file in the cache!");
            }
            throw new RuntimeException("LockManager Error: filePath can not be null!");
        } catch (Throwable unused) {
        }
    }
}
