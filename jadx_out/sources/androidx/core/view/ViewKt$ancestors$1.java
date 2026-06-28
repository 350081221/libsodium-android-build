package androidx.core.view;

import android.view.ViewParent;

@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.h0 implements v3.l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // v3.l
    public final ViewParent invoke(@p4.l ViewParent viewParent) {
        return viewParent.getParent();
    }
}
