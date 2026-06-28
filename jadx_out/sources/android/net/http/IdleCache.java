package android.net.http;

import android.os.Process;
import android.os.SystemClock;
import org.apache.http.HttpHost;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: assets/org.apache.http.legacy.boot */
public class IdleCache {
    private static final int CHECK_INTERVAL = 2000;
    private static final int EMPTY_CHECK_MAX = 5;
    private static final int IDLE_CACHE_MAX = 8;
    private static final int TIMEOUT = 6000;
    private Entry[] mEntries = new Entry[8];
    private int mCount = 0;
    private IdleReaper mThread = null;
    private int mCached = 0;
    private int mReused = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: assets/org.apache.http.legacy.boot */
    public class Entry {
        Connection mConnection;
        HttpHost mHost;
        long mTimeout;

        Entry() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdleCache() {
        for (int i5 = 0; i5 < 8; i5++) {
            this.mEntries[i5] = new Entry();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        r5.mHost = r9;
        r5.mConnection = r10;
        r5.mTimeout = 6000 + r3;
        r8.mCount++;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r8.mThread != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r8.mThread = new android.net.http.IdleCache.IdleReaper(r8, null);
        r8.mThread.start();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean cacheConnection(org.apache.http.HttpHost r9, android.net.http.Connection r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            int r1 = r8.mCount     // Catch: java.lang.Throwable -> L3e
            r2 = 8
            if (r1 >= r2) goto L3c
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        Ld:
            if (r1 >= r2) goto L3c
            android.net.http.IdleCache$Entry[] r5 = r8.mEntries     // Catch: java.lang.Throwable -> L3e
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L3e
            org.apache.http.HttpHost r6 = r5.mHost     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto L39
            r5.mHost = r9     // Catch: java.lang.Throwable -> L3e
            r5.mConnection = r10     // Catch: java.lang.Throwable -> L3e
            r6 = 6000(0x1770, double:2.9644E-320)
            long r6 = r6 + r3
            r5.mTimeout = r6     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.mCount     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 + 1
            r8.mCount = r2     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            android.net.http.IdleCache$IdleReaper r2 = r8.mThread     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L3c
            android.net.http.IdleCache$IdleReaper r2 = new android.net.http.IdleCache$IdleReaper     // Catch: java.lang.Throwable -> L3e
            r6 = 0
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            r8.mThread = r2     // Catch: java.lang.Throwable -> L3e
            android.net.http.IdleCache$IdleReaper r2 = r8.mThread     // Catch: java.lang.Throwable -> L3e
            r2.start()     // Catch: java.lang.Throwable -> L3e
            goto L3c
        L39:
            int r1 = r1 + 1
            goto Ld
        L3c:
            monitor-exit(r8)
            return r0
        L3e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.net.http.IdleCache.cacheConnection(org.apache.http.HttpHost, android.net.http.Connection):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        r0 = r2.mConnection;
        r2.mHost = null;
        r2.mConnection = null;
        r5.mCount--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.net.http.Connection getConnection(org.apache.http.HttpHost r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r1 = r5.mCount     // Catch: java.lang.Throwable -> L2d
            if (r1 <= 0) goto L2b
            r1 = 0
        L7:
            r2 = 8
            if (r1 >= r2) goto L2b
            android.net.http.IdleCache$Entry[] r2 = r5.mEntries     // Catch: java.lang.Throwable -> L2d
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L2d
            org.apache.http.HttpHost r3 = r2.mHost     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L28
            boolean r4 = r3.equals(r6)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L28
            android.net.http.Connection r4 = r2.mConnection     // Catch: java.lang.Throwable -> L2d
            r0 = r4
            r4 = 0
            r2.mHost = r4     // Catch: java.lang.Throwable -> L2d
            r2.mConnection = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r5.mCount     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + (-1)
            r5.mCount = r4     // Catch: java.lang.Throwable -> L2d
            goto L2b
        L28:
            int r1 = r1 + 1
            goto L7
        L2b:
            monitor-exit(r5)
            return r0
        L2d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.net.http.IdleCache.getConnection(org.apache.http.HttpHost):android.net.http.Connection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void clear() {
        for (int i5 = 0; this.mCount > 0 && i5 < 8; i5++) {
            Entry entry = this.mEntries[i5];
            if (entry.mHost != null) {
                entry.mHost = null;
                entry.mConnection.closeConnection();
                entry.mConnection = null;
                this.mCount--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void clearIdle() {
        if (this.mCount > 0) {
            long time = SystemClock.uptimeMillis();
            for (int i5 = 0; i5 < 8; i5++) {
                Entry entry = this.mEntries[i5];
                if (entry.mHost != null && time > entry.mTimeout) {
                    entry.mHost = null;
                    entry.mConnection.closeConnection();
                    entry.mConnection = null;
                    this.mCount--;
                }
            }
        }
    }

    /* loaded from: assets/org.apache.http.legacy.boot */
    private class IdleReaper extends Thread {
        private IdleReaper() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int check = 0;
            setName("IdleReaper");
            Process.setThreadPriority(10);
            synchronized (IdleCache.this) {
                while (check < 5) {
                    try {
                        IdleCache.this.wait(2000L);
                    } catch (InterruptedException e5) {
                    }
                    if (IdleCache.this.mCount == 0) {
                        check++;
                    } else {
                        check = 0;
                        IdleCache.this.clearIdle();
                    }
                }
                IdleCache.this.mThread = null;
            }
        }
    }
}
