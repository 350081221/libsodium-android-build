package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.j;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes2.dex */
public class l implements n, j {

    /* renamed from: d, reason: collision with root package name */
    private final String f998d;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.j f1000f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f995a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f996b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f997c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<n> f999e = new ArrayList();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1001a;

        static {
            int[] iArr = new int[j.a.values().length];
            f1001a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1001a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1001a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1001a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1001a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(com.airbnb.lottie.model.content.j jVar) {
        this.f998d = jVar.c();
        this.f1000f = jVar;
    }

    private void a() {
        for (int i5 = 0; i5 < this.f999e.size(); i5++) {
            this.f997c.addPath(this.f999e.get(i5).getPath());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.f996b.reset();
        this.f995a.reset();
        for (int size = this.f999e.size() - 1; size >= 1; size--) {
            n nVar = this.f999e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> k5 = dVar.k();
                for (int size2 = k5.size() - 1; size2 >= 0; size2--) {
                    Path path = k5.get(size2).getPath();
                    path.transform(dVar.l());
                    this.f996b.addPath(path);
                }
            } else {
                this.f996b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f999e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> k6 = dVar2.k();
            for (int i5 = 0; i5 < k6.size(); i5++) {
                Path path2 = k6.get(i5).getPath();
                path2.transform(dVar2.l());
                this.f995a.addPath(path2);
            }
        } else {
            this.f995a.set(nVar2.getPath());
        }
        this.f997c.op(this.f995a, this.f996b, op);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i5 = 0; i5 < this.f999e.size(); i5++) {
            this.f999e.get(i5).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f999e.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f998d;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f997c.reset();
        if (this.f1000f.d()) {
            return this.f997c;
        }
        int i5 = a.f1001a[this.f1000f.b().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            d(Path.Op.XOR);
                        }
                    } else {
                        d(Path.Op.INTERSECT);
                    }
                } else {
                    d(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                d(Path.Op.UNION);
            }
        } else {
            a();
        }
        return this.f997c;
    }
}
