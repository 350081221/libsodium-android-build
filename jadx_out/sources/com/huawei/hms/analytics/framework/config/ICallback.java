package com.huawei.hms.analytics.framework.config;

import com.huawei.hms.analytics.core.storage.Event;
import java.util.List;

/* loaded from: classes3.dex */
public interface ICallback {
    public static final int DEF_FLAG = 0;
    public static final int NO_REQUEST_FLAG = -1;
    public static final int REGION_CHANGE_REQUEST_FLAG = -2;

    boolean isAAIDChanged(String str, boolean z4);

    boolean isNeedStorage();

    boolean isStopEvent();

    void onResult(int i5, long j5, int i6, List<Event> list);

    void setStopEventReport(boolean z4);
}
