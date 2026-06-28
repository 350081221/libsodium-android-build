package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n121#2,4:517\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n*L\n294#1:517,4\n*E\n"})
/* loaded from: classes.dex */
final class BorderModifierNode$drawGenericBorder$3 extends n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ k1.h<ImageBitmap> $cacheImageBitmap;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Rect $pathBounds;
    final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$3(Rect rect, k1.h<ImageBitmap> hVar, long j5, ColorFilter colorFilter) {
        super(1);
        this.$pathBounds = rect;
        this.$cacheImageBitmap = hVar;
        this.$pathBoundsSize = j5;
        this.$colorFilter = colorFilter;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        float left = this.$pathBounds.getLeft();
        float top = this.$pathBounds.getTop();
        k1.h<ImageBitmap> hVar = this.$cacheImageBitmap;
        long j5 = this.$pathBoundsSize;
        ColorFilter colorFilter = this.$colorFilter;
        contentDrawScope.getDrawContext().getTransform().translate(left, top);
        DrawScope.m4261drawImageAZ2fEMs$default(contentDrawScope, hVar.element, 0L, j5, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
        contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
    }
}
