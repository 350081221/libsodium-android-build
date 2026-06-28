package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.k;

/* loaded from: classes3.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> mTaskApiCall;
    private final k<TResult> mTaskCompletionSource;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, k<TResult> kVar) {
        super(1);
        this.mTaskApiCall = taskApiCall;
        this.mTaskCompletionSource = kVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.mTaskApiCall;
    }

    public k<TResult> getTaskCompletionSource() {
        return this.mTaskCompletionSource;
    }
}
