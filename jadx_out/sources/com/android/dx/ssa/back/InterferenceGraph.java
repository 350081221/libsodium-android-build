package com.android.dx.ssa.back;

import com.android.dx.ssa.SetFactory;
import com.android.dx.util.IntSet;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class InterferenceGraph {
    private final ArrayList<IntSet> interference;

    public InterferenceGraph(int i5) {
        this.interference = new ArrayList<>(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            this.interference.add(SetFactory.makeInterferenceSet(i5));
        }
    }

    private void ensureCapacity(int i5) {
        this.interference.ensureCapacity(i5);
        for (int size = this.interference.size(); size < i5; size++) {
            this.interference.add(SetFactory.makeInterferenceSet(i5));
        }
    }

    public void add(int i5, int i6) {
        ensureCapacity(Math.max(i5, i6) + 1);
        this.interference.get(i5).add(i6);
        this.interference.get(i6).add(i5);
    }

    public void dumpToStdout() {
        int size = this.interference.size();
        for (int i5 = 0; i5 < size; i5++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Reg " + i5 + ":" + this.interference.get(i5).toString());
            System.out.println(sb.toString());
        }
    }

    public void mergeInterferenceSet(int i5, IntSet intSet) {
        if (i5 < this.interference.size()) {
            intSet.merge(this.interference.get(i5));
        }
    }
}
