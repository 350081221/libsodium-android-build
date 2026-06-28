package com.huawei.hms.analytics.core.transport;

import com.huawei.hms.analytics.core.transport.net.Response;

/* loaded from: classes3.dex */
public interface CallbackListener {
    void onFailure(int i5);

    void onSuccess(Response response);
}
