package com.huawei.agconnect.apms;

import android.os.Looper;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes3.dex */
public class c {
    public long abc;
    public long bcd;
    public volatile Set<UUID> cde;
    public String def;
    public UUID efg;
    public long fgh;
    public String ghi;
    public int hij;
    public boolean ijk;
    public t0 jkl;
    public int klm;

    public c(String str) {
        this.def = str;
        this.fgh = Thread.currentThread().getId();
        this.ghi = Thread.currentThread().getName();
        Random random = new Random();
        this.efg = new UUID(random.nextLong(), random.nextLong());
        abc();
        this.ijk = false;
        this.hij = 1;
        this.klm = 0;
        this.jkl = null;
    }

    public void abc(int i5) {
    }

    public void abc(long j5) {
        this.bcd = j5;
    }

    public void abc(UUID uuid) {
    }

    public void abc(boolean z4) {
        this.ijk = z4;
    }

    public final void abc() {
        if (this.cde == null) {
            synchronized (this) {
                if (this.cde == null) {
                    this.cde = new ConcurrentSkipListSet();
                }
            }
        }
    }

    public c(String str, int i5) {
        this(str);
        this.ijk = false;
        this.hij = (Looper.myLooper() == Looper.getMainLooper() ? h0.SYNC : h0.ASYNC).abc;
        this.def = str;
        this.klm = i5;
        this.abc = System.currentTimeMillis();
        this.jkl = null;
    }
}
