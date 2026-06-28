package androidx.compose.material3;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Tooltip_androidKt$drawCaretWithPath$4 extends kotlin.jvm.internal.n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ LayoutCoordinates $anchorLayoutCoordinates;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Path $path;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tooltip_androidKt$drawCaretWithPath$4(LayoutCoordinates layoutCoordinates, Path path, long j5) {
        super(1);
        this.$anchorLayoutCoordinates = layoutCoordinates;
        this.$path = path;
        this.$containerColor = j5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        if (this.$anchorLayoutCoordinates != null) {
            contentDrawScope.drawContent();
            DrawScope.m4268drawPathLG529CI$default(contentDrawScope, this.$path, this.$containerColor, 0.0f, null, null, 0, 60, null);
        }
    }
}
