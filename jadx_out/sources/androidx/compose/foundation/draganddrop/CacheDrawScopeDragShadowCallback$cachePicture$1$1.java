package androidx.compose.foundation.draganddrop;

import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n299#2,20:147\n246#2:167\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n*L\n132#1:147,20\n142#1:167\n*E\n"})
/* loaded from: classes.dex */
final class CacheDrawScopeDragShadowCallback$cachePicture$1$1 extends n0 implements l<ContentDrawScope, r2> {
    final /* synthetic */ int $height;
    final /* synthetic */ Picture $picture;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScopeDragShadowCallback$cachePicture$1$1(Picture picture, int i5, int i6) {
        super(1);
        this.$picture = picture;
        this.$width = i5;
        this.$height = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        Canvas Canvas = AndroidCanvas_androidKt.Canvas(this.$picture.beginRecording(this.$width, this.$height));
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        long mo4277getSizeNHjbRc = contentDrawScope.mo4277getSizeNHjbRc();
        Density density = contentDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        long mo4202getSizeNHjbRc = contentDrawScope.getDrawContext().mo4202getSizeNHjbRc();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo4203setSizeuvyYCjk(mo4277getSizeNHjbRc);
        Canvas.save();
        contentDrawScope.drawContent();
        Canvas.restore();
        DrawContext drawContext2 = contentDrawScope.getDrawContext();
        drawContext2.setDensity(density);
        drawContext2.setLayoutDirection(layoutDirection2);
        drawContext2.setCanvas(canvas);
        drawContext2.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
        this.$picture.endRecording();
        AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas()).drawPicture(this.$picture);
    }
}
