package com.huawei.agconnect.apms;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c1 {
    public static final AgentLog ghi = AgentLogManager.getAgentLog();
    public static final long hij = TimeUnit.SECONDS.toMicros(1);
    public static c1 ijk;
    public ScheduledFuture bcd = null;
    public long cde = -1;
    public String def = String.format(Locale.ENGLISH, "/proc/%s/stat", Integer.valueOf(Process.myPid()));
    public long efg = Os.sysconf(OsConstants._SC_CLK_TCK);
    public ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("CPUCollector"));
    public ConcurrentLinkedQueue<g1> fgh = new ConcurrentLinkedQueue<>();

    /* loaded from: classes3.dex */
    public class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1 abc = c1.this.abc(System.currentTimeMillis());
            if (abc != null) {
                c1.this.fgh.offer(abc);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements Runnable {
        public bcd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1 abc = c1.this.abc(System.currentTimeMillis());
            if (abc != null) {
                c1.this.fgh.offer(abc);
            }
        }
    }

    public static boolean bcd(int i5) {
        return i5 <= 0;
    }

    public final synchronized void bcd() {
        try {
            this.abc.schedule(new bcd(), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            ghi.warn(String.format(Locale.ENGLISH, "unable to start collecting cpu metrics: %s", e5.getMessage()));
        }
    }

    public void abc() {
        ScheduledFuture scheduledFuture = this.bcd;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.bcd = null;
        this.cde = -1L;
    }

    public final synchronized void abc(int i5) {
        long j5 = i5;
        this.cde = j5;
        try {
            this.bcd = this.abc.scheduleAtFixedRate(new abc(), 0L, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            ghi.warn(String.format(Locale.ENGLISH, "unable to start collecting cpu metrics: %s", e5.getMessage()));
        }
    }

    public final g1 abc(long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.def));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && readLine.length() != 0) {
                    String[] split = readLine.split(" ");
                    if (16 < split.length) {
                        j6 = Long.parseLong(split[13]);
                        j8 = Long.parseLong(split[15]);
                        j9 = Long.parseLong(split[14]);
                        j7 = Long.parseLong(split[16]);
                    } else {
                        j6 = 0;
                        j7 = 0;
                        j8 = 0;
                        j9 = 0;
                    }
                    double d5 = (j6 + j8) / this.efg;
                    long j10 = hij;
                    g1 g1Var = new g1(j5, Math.round(d5 * j10), Math.round(((j9 + j7) / this.efg) * j10));
                    try {
                        bufferedReader.close();
                    } catch (Throwable th) {
                        ghi.warn(String.format(Locale.ENGLISH, "unable to close read 'proc/[pid]/stat' file: %s", th.getMessage()));
                    }
                    return g1Var;
                }
                try {
                    bufferedReader.close();
                    return null;
                } catch (Throwable th2) {
                    ghi.warn(String.format(Locale.ENGLISH, "unable to close read 'proc/[pid]/stat' file: %s", th2.getMessage()));
                    return null;
                }
            } catch (Throwable th3) {
                try {
                    ghi.warn(String.format(Locale.ENGLISH, "unable to read 'proc/[pid]/stat' file: %s", th3.getMessage()));
                    try {
                        bufferedReader.close();
                        return null;
                    } catch (Throwable th4) {
                        ghi.warn(String.format(Locale.ENGLISH, "unable to close read 'proc/[pid]/stat' file: %s", th4.getMessage()));
                        return null;
                    }
                } finally {
                }
            }
        } catch (IOException unused) {
            ghi.warn("unable to read 'proc/[pid]/stat' file");
            return null;
        } catch (Throwable th5) {
            ghi.warn(String.format(Locale.ENGLISH, "unexpected '/proc/[pid]/stat' file format encountered: %s", th5.getMessage()));
            return null;
        }
    }
}
