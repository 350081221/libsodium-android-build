package com.huawei.hms.common.data;

/* loaded from: classes3.dex */
public interface DataBufferObserver {
    void onDataChanged();

    void onDataRangeChanged(int i5, int i6);

    void onDataRangeInserted(int i5, int i6);

    void onDataRangeMoved(int i5, int i6, int i7);

    void onDataRangeRemoved(int i5, int i6);
}
