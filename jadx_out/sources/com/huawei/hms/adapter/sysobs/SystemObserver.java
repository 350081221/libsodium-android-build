package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* loaded from: classes3.dex */
public interface SystemObserver {
    boolean onNoticeResult(int i5);

    boolean onSolutionResult(Intent intent, String str);

    boolean onUpdateResult(int i5);
}
