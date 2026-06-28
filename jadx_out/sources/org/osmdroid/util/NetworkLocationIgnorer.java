package org.osmdroid.util;

import org.osmdroid.config.a;

/* loaded from: classes4.dex */
public class NetworkLocationIgnorer {
    private long mLastGps = 0;

    public boolean shouldIgnore(String str, long j5) {
        if ("gps".equals(str)) {
            this.mLastGps = j5;
            return false;
        }
        if (j5 < this.mLastGps + a.a().q()) {
            return true;
        }
        return false;
    }
}
