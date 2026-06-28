package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\f\u0010\u000bR3\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "block", "Lv3/l;", "getBlock$ui_release", "()Lv3/l;", "setBlock$ui_release", "(Lv3/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;

    @l
    private v3.l<? super ContentDrawScope, r2> block;

    public DrawResult(@l v3.l<? super ContentDrawScope, r2> lVar) {
        this.block = lVar;
    }

    @l
    public final v3.l<ContentDrawScope, r2> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(@l v3.l<? super ContentDrawScope, r2> lVar) {
        this.block = lVar;
    }
}
