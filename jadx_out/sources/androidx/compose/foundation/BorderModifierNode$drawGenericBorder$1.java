package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BorderModifierNode$drawGenericBorder$1 extends n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ Outline.Generic $outline;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$1(Outline.Generic generic, Brush brush) {
        super(1);
        this.$outline = generic;
        this.$brush = brush;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m4267drawPathGBMwjPU$default(contentDrawScope, this.$outline.getPath(), this.$brush, 0.0f, null, null, 0, 60, null);
    }
}
