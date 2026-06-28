package com.huawei.agconnect.common.network;

/* loaded from: classes3.dex */
public abstract class AccessNetworkManager {
    private static final AccessNetworkManager INSTANCE = new a();

    /* loaded from: classes3.dex */
    public interface AccessNetworkCallback {
        void onNetWorkReady();
    }

    public static AccessNetworkManager getInstance() {
        return INSTANCE;
    }

    public abstract void addCallback(AccessNetworkCallback accessNetworkCallback);

    public abstract boolean canAccessNetwork();

    public abstract void setAccessNetwork(boolean z4);
}
