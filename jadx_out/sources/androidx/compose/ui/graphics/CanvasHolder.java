package androidx.compose.ui.graphics;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0010J*\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bR \u0010\u000b\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/CanvasHolder;", "", "Landroid/graphics/Canvas;", "targetCanvas", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/r2;", "Lkotlin/u;", "block", "drawInto", "Landroidx/compose/ui/graphics/AndroidCanvas;", "androidCanvas", "Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas", "()Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas$annotations", "()V", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CanvasHolder {

    @p4.l
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    @kotlin.a1
    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }

    public final void drawInto(@p4.l android.graphics.Canvas canvas, @p4.l v3.l<? super Canvas, r2> lVar) {
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        lVar.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @p4.l
    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }
}
