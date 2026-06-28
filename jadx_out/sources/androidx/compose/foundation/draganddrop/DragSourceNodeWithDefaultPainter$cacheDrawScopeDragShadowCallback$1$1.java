package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends h0 implements l<CacheDrawScope, DrawResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(Object obj) {
        super(1, obj, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }

    @Override // v3.l
    @p4.l
    public final DrawResult invoke(@p4.l CacheDrawScope cacheDrawScope) {
        return ((CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }
}
