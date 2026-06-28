package com.tendcloud.tenddata;

import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class cr {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11629a = 25;

    /* renamed from: b, reason: collision with root package name */
    private static cr f11630b;

    /* renamed from: c, reason: collision with root package name */
    private ExecutorService f11631c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<Integer, TreeSet<cq>> f11632d;

    /* renamed from: e, reason: collision with root package name */
    private CRC32 f11633e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, RandomAccessFile> f11634f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Integer, FileLock> f11635g;

    /* renamed from: h, reason: collision with root package name */
    private Lock f11636h = new ReentrantLock();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        private final String mFolderPath;
        private final String mNewFolder;
        private final TreeSet<cq> mQueue;

        private void deleteFile(String str, cq cqVar) {
            File file = new File(str + File.separator + cqVar.b());
            if (file.exists()) {
                file.delete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TreeSet<cq> treeSet = this.mQueue;
                if (treeSet != null) {
                    treeSet.isEmpty();
                    while (!this.mQueue.isEmpty()) {
                        cq pollFirst = this.mQueue.pollFirst();
                        if (pollFirst != null) {
                            File file = new File(this.mFolderPath);
                            if (file.exists()) {
                                deleteFile(file.getAbsolutePath(), pollFirst);
                            }
                            File file2 = new File(this.mNewFolder);
                            if (file2.exists()) {
                                deleteFile(file2.getAbsolutePath(), pollFirst);
                            }
                        }
                    }
                    this.mQueue.clear();
                }
            } catch (Throwable unused) {
            }
        }

        private a(com.tendcloud.tenddata.a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append(ab.f11351g.getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append(aVar.getDataFolder());
            this.mFolderPath = sb.toString();
            this.mNewFolder = ab.f11351g.getFilesDir() + str + aVar.getRootFolder() + str + aVar.getDataFolder();
            this.mQueue = (TreeSet) cr.this.f11632d.get(Integer.valueOf(aVar.index()));
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        private final String mFolderPath;
        private final cq mOperation;

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(this.mFolderPath + File.separator + this.mOperation.b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
        }

        private b(cq cqVar, com.tendcloud.tenddata.a aVar, String str) {
            String absolutePath = ab.f11351g.getFilesDir().getAbsolutePath();
            if (!TextUtils.isEmpty(str)) {
                absolutePath = absolutePath + File.separator + str;
            }
            this.mFolderPath = absolutePath + File.separator + aVar.getDataFolder();
            this.mOperation = cqVar;
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        private cs callback;
        private com.tendcloud.tenddata.a features;
        private String mFolderPath;
        private final cq mOperation;
        private final cr opm;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        
            if (r3 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        
            r3.release();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        
            r2.close();
            r0 = r7.callback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        
            if (r0 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.cr.c.run():void");
        }

        private c(cq cqVar, bv bvVar, cr crVar) {
            File filesDir = ab.f11351g.getFilesDir();
            this.opm = crVar;
            StringBuilder sb = new StringBuilder();
            sb.append(filesDir.toString());
            String str = File.separator;
            sb.append(str);
            sb.append(bvVar.f11568a.getDataFolder());
            this.mFolderPath = sb.toString();
            this.mFolderPath = filesDir.toString() + str + bvVar.f11568a.getRootFolder() + str + bvVar.f11568a.getDataFolder();
            this.mOperation = cqVar;
            this.callback = bvVar.f11573f;
            this.features = bvVar.f11568a;
        }
    }

    private cr() {
        c();
        this.f11632d = new HashMap<>();
        for (com.tendcloud.tenddata.a aVar : com.tendcloud.tenddata.a.values()) {
            this.f11632d.put(Integer.valueOf(aVar.index()), new TreeSet<>());
        }
        this.f11631c = Executors.newSingleThreadExecutor();
        this.f11633e = new CRC32();
    }

    private void c() {
        this.f11634f = new HashMap();
        this.f11635g = new HashMap();
        try {
            for (com.tendcloud.tenddata.a aVar : com.tendcloud.tenddata.a.values()) {
                File file = new File(ab.f11351g.getFilesDir(), aVar.getRootFolder());
                File file2 = new File(file, aVar.getDataFolder());
                if (!file2.exists() && !file2.mkdirs()) {
                    return;
                }
                this.f11634f.put(Integer.valueOf(aVar.index()), new RandomAccessFile(new File(file, "Lock" + aVar.index()), "rw"));
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        File filesDir = ab.f11351g.getFilesDir();
        try {
            int i5 = 0;
            for (com.tendcloud.tenddata.a aVar : com.tendcloud.tenddata.a.values()) {
                File file = new File(filesDir, aVar.getDataFolder());
                if (file.exists()) {
                    Iterator<File> it = c(file).iterator();
                    while (it.hasNext()) {
                        it.next().delete();
                    }
                }
            }
            com.tendcloud.tenddata.a[] values = com.tendcloud.tenddata.a.values();
            int length = values.length;
            while (i5 < length) {
                com.tendcloud.tenddata.a aVar2 = values[i5];
                File file2 = new File(filesDir, aVar2.getRootFolder());
                File file3 = new File(file2, aVar2.getDataFolder());
                if (file3.exists()) {
                    Iterator<File> it2 = c(file3).iterator();
                    while (it2.hasNext()) {
                        it2.next().delete();
                    }
                }
                i5++;
                filesDir = file2;
            }
        } catch (Throwable unused) {
        }
    }

    public void clearDataCache(com.tendcloud.tenddata.a aVar) {
        try {
            this.f11632d.get(Integer.valueOf(aVar.index())).clear();
        } catch (Throwable unused) {
        }
    }

    public void confirmRead(com.tendcloud.tenddata.a aVar) {
        new a(aVar).run();
    }

    public void getFileLock(com.tendcloud.tenddata.a aVar) {
        try {
            this.f11636h.lock();
            this.f11635g.put(Integer.valueOf(aVar.index()), this.f11634f.get(Integer.valueOf(aVar.index())).getChannel().lock());
        } catch (Throwable unused) {
        }
    }

    public void releaseFileLock(com.tendcloud.tenddata.a aVar) {
        try {
            if (this.f11635g.get(Integer.valueOf(aVar.index())) != null) {
                this.f11635g.get(Integer.valueOf(aVar.index())).release();
                this.f11636h.unlock();
            }
        } catch (Throwable unused) {
        }
    }

    public static cr a() {
        synchronized (cr.class) {
            if (f11630b == null) {
                f11630b = new cr();
            }
        }
        return f11630b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, com.tendcloud.tenddata.a aVar) {
        try {
            int fileLimitType = aVar.getFileLimitType();
            if (fileLimitType != 1) {
                if (fileLimitType != 2) {
                    if (fileLimitType == 3) {
                        a(file);
                    }
                } else if (file.listFiles().length >= 10) {
                    a(file);
                }
            } else if (b(file) > 25) {
                a(file);
            }
        } catch (Throwable unused) {
        }
    }

    private List<File> c(File file) {
        List<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        try {
            arrayList = Arrays.asList(listFiles);
            Collections.sort(arrayList, new Comparator<File>() { // from class: com.tendcloud.tenddata.cr.1
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    return file2.getName().compareTo(file3.getName());
                }
            });
            return arrayList;
        } catch (Throwable unused) {
            return arrayList;
        }
    }

    private void a(File file) {
        try {
            if (file.isDirectory()) {
                a(c(file).get(0));
            } else {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    private int b(File file) {
        File[] listFiles;
        if (file == null) {
            return 0;
        }
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                long j5 = 0;
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        j5 += file2.length();
                    }
                }
                return (int) (j5 / 1048576);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public synchronized void a(cq cqVar, bv bvVar) {
        this.f11631c.execute(new c(cqVar, bvVar, this));
    }

    private synchronized void a(cq cqVar, com.tendcloud.tenddata.a aVar) {
        if (aVar != null && cqVar != null) {
            try {
                this.f11632d.get(Integer.valueOf(aVar.index())).add(cqVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010d A[Catch: all -> 0x0118, TRY_ENTER, TryCatch #6 {all -> 0x0118, blocks: (B:93:0x008e, B:88:0x0092, B:51:0x00e5, B:69:0x010d, B:71:0x0113), top: B:92:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113 A[Catch: all -> 0x0118, TRY_LEAVE, TryCatch #6 {all -> 0x0118, blocks: (B:93:0x008e, B:88:0x0092, B:51:0x00e5, B:69:0x010d, B:71:0x0113), top: B:92:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.TreeSet<com.tendcloud.tenddata.cq> a(com.tendcloud.tenddata.a r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.cr.a(com.tendcloud.tenddata.a, int, java.lang.String):java.util.TreeSet");
    }
}
