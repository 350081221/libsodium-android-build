package org.osmdroid.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ListPointAccepter implements PointAccepter {
    private boolean mFirst;
    private final boolean mRemoveConsecutiveDuplicates;
    private final List<Long> mList = new ArrayList();
    private final PointL mLatestPoint = new PointL();

    public ListPointAccepter(boolean z4) {
        this.mRemoveConsecutiveDuplicates = z4;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        if (!this.mRemoveConsecutiveDuplicates) {
            this.mList.add(Long.valueOf(j5));
            this.mList.add(Long.valueOf(j6));
            return;
        }
        if (this.mFirst) {
            this.mFirst = false;
            this.mList.add(Long.valueOf(j5));
            this.mList.add(Long.valueOf(j6));
            this.mLatestPoint.set(j5, j6);
            return;
        }
        PointL pointL = this.mLatestPoint;
        if (pointL.f21839x != j5 || pointL.f21840y != j6) {
            this.mList.add(Long.valueOf(j5));
            this.mList.add(Long.valueOf(j6));
            this.mLatestPoint.set(j5, j6);
        }
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    public List<Long> getList() {
        return this.mList;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mList.clear();
        this.mFirst = true;
    }
}
