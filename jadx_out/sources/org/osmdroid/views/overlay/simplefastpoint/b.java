package org.osmdroid.views.overlay.simplefastpoint;

import java.util.Iterator;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay;

/* loaded from: classes4.dex */
public final class b implements SimpleFastPointOverlay.c {

    /* renamed from: a, reason: collision with root package name */
    private final List<IGeoPoint> f22083a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22084b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22085c;

    public b(List<IGeoPoint> list) {
        this(list, list.size() != 0 && (list.get(0) instanceof LabelledGeoPoint), list.size() != 0 && (list.get(0) instanceof StyledLabelledGeoPoint));
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.c
    public boolean b() {
        return this.f22085c;
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.c
    public boolean d() {
        return this.f22084b;
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.c
    public IGeoPoint get(int i5) {
        return this.f22083a.get(i5);
    }

    @Override // java.lang.Iterable
    public Iterator<IGeoPoint> iterator() {
        return this.f22083a.iterator();
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.c
    public int size() {
        return this.f22083a.size();
    }

    public b(List<IGeoPoint> list, boolean z4) {
        this(list, z4, false);
    }

    public b(List<IGeoPoint> list, boolean z4, boolean z5) {
        this.f22083a = list;
        this.f22084b = z4;
        this.f22085c = z5;
    }
}
