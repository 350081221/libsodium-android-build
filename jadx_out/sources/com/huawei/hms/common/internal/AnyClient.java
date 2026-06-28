package com.huawei.hms.common.internal;

import com.huawei.hms.core.aidl.IMessageEntity;

/* loaded from: classes3.dex */
public interface AnyClient {

    /* loaded from: classes3.dex */
    public interface CallBack {
        void onCallback(IMessageEntity iMessageEntity, String str);
    }

    void connect(int i5);

    void connect(int i5, boolean z4);

    void disconnect();

    String getSessionId();

    boolean isConnected();

    boolean isConnecting();

    void post(IMessageEntity iMessageEntity, String str, CallBack callBack);
}
