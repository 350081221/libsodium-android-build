package com.huawei.hms.analytics.framework.policy;

/* loaded from: classes3.dex */
public interface IStoragePolicy {

    /* loaded from: classes3.dex */
    public enum PolicyType {
        NETWORK,
        STORAGECYCLY,
        STORAGELENGTH,
        STORAGESIZE,
        PARAMS
    }

    boolean decide(PolicyType policyType, long j5);

    boolean decide(PolicyType policyType, String str);
}
