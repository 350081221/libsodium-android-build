package com.huawei.hms.analytics.instance;

/* loaded from: classes3.dex */
public interface CallBack {
    public static final int ANALYTICS_CLOSED = -110;
    public static final int BODY_ERROR = -112;
    public static final int ID_TYPE_ERROR = -115;
    public static final int INIT_FAILED = -101;
    public static final int OAID_INVALID = -114;
    public static final int OAID_TRACKING_OFF = -113;
    public static final int REGION_ERROR = -111;

    void onResult(int i5, String str);
}
