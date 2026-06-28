package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* loaded from: classes3.dex */
public final class q {
    public static String a(Context context, String str) {
        return HiAnalyticsClient.reportEntry(context, str, 50101306);
    }

    public static void a(Context context, String str, ResponseErrorCode responseErrorCode) {
        HiAnalyticsClient.reportExit(context, str, responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 50101306);
    }

    public static void a(Context context, String str, String str2, ErrorEnum errorEnum) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), errorEnum.getExternalCode(), 50101306);
    }

    public static void a(Context context, String str, String str2, int i5) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), i5, 50101306);
    }
}
