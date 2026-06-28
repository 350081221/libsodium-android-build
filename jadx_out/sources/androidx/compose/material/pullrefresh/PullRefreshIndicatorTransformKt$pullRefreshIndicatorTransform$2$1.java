package androidx.compose.material.pullrefresh;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,76:1\n215#2,8:77\n262#2,11:85\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n*L\n55#1:77,8\n55#1:85,11\n*E\n"})
/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 extends n0 implements l<ContentDrawScope, r2> {
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 INSTANCE = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1();

    PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        int m3723getIntersectrtfAjoo = ClipOp.Companion.m3723getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4205clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m3723getIntersectrtfAjoo);
        contentDrawScope.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }
}
