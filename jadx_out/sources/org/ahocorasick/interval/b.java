package org.ahocorasick.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private b f21067a;

    /* renamed from: b, reason: collision with root package name */
    private b f21068b;

    /* renamed from: c, reason: collision with root package name */
    private int f21069c;

    /* renamed from: d, reason: collision with root package name */
    private List<d> f21070d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21071a;

        static {
            int[] iArr = new int[EnumC0627b.values().length];
            f21071a = iArr;
            try {
                iArr[EnumC0627b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21071a[EnumC0627b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.ahocorasick.interval.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0627b {
        LEFT,
        RIGHT
    }

    public b(List<d> list) {
        this.f21067a = null;
        this.f21068b = null;
        this.f21069c = e(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (d dVar : list) {
            if (dVar.getEnd() < this.f21069c) {
                arrayList.add(dVar);
            } else if (dVar.getStart() > this.f21069c) {
                arrayList2.add(dVar);
            } else {
                this.f21070d.add(dVar);
            }
        }
        if (arrayList.size() > 0) {
            this.f21067a = new b(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.f21068b = new b(arrayList2);
        }
    }

    protected void a(d dVar, List<d> list, List<d> list2) {
        for (d dVar2 : list2) {
            if (!dVar2.equals(dVar)) {
                list.add(dVar2);
            }
        }
    }

    protected List<d> b(d dVar, EnumC0627b enumC0627b) {
        ArrayList arrayList = new ArrayList();
        for (d dVar2 : this.f21070d) {
            int i5 = a.f21071a[enumC0627b.ordinal()];
            if (i5 != 1) {
                if (i5 == 2 && dVar2.getEnd() >= dVar.getStart()) {
                    arrayList.add(dVar2);
                }
            } else if (dVar2.getStart() <= dVar.getEnd()) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    protected List<d> c(d dVar) {
        return b(dVar, EnumC0627b.LEFT);
    }

    protected List<d> d(d dVar) {
        return b(dVar, EnumC0627b.RIGHT);
    }

    public int e(List<d> list) {
        int i5 = -1;
        int i6 = -1;
        for (d dVar : list) {
            int start = dVar.getStart();
            int end = dVar.getEnd();
            if (i5 == -1 || start < i5) {
                i5 = start;
            }
            if (i6 == -1 || end > i6) {
                i6 = end;
            }
        }
        return (i5 + i6) / 2;
    }

    protected List<d> f(b bVar, d dVar) {
        if (bVar != null) {
            return bVar.g(dVar);
        }
        return Collections.emptyList();
    }

    public List<d> g(d dVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f21069c < dVar.getStart()) {
            a(dVar, arrayList, f(this.f21068b, dVar));
            a(dVar, arrayList, d(dVar));
        } else if (this.f21069c > dVar.getEnd()) {
            a(dVar, arrayList, f(this.f21067a, dVar));
            a(dVar, arrayList, c(dVar));
        } else {
            a(dVar, arrayList, this.f21070d);
            a(dVar, arrayList, f(this.f21067a, dVar));
            a(dVar, arrayList, f(this.f21068b, dVar));
        }
        return arrayList;
    }
}
