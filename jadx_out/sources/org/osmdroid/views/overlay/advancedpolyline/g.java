package org.osmdroid.views.overlay.advancedpolyline;

import java.util.Map;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public class g extends d {

    /* renamed from: b, reason: collision with root package name */
    private final SortedMap<Float, Integer> f21877b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21878c;

    public g(SortedMap<Float, Integer> sortedMap, boolean z4) {
        this.f21877b = sortedMap;
        this.f21878c = z4;
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.d
    protected int c(float f5) {
        int i5 = 0;
        for (Map.Entry<Float, Integer> entry : this.f21877b.entrySet()) {
            if (this.f21878c) {
                if (f5 < entry.getKey().floatValue()) {
                    return entry.getValue().intValue();
                }
            } else if (f5 <= entry.getKey().floatValue()) {
                return entry.getValue().intValue();
            }
            i5++;
        }
        if (i5 != this.f21877b.size()) {
            return 0;
        }
        SortedMap<Float, Integer> sortedMap = this.f21877b;
        return sortedMap.get(sortedMap.lastKey()).intValue();
    }
}
