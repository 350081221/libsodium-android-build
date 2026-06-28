package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<v> f930a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(v vVar) {
        this.f930a.add(vVar);
    }

    public void b(Path path) {
        for (int size = this.f930a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.l.b(path, this.f930a.get(size));
        }
    }
}
