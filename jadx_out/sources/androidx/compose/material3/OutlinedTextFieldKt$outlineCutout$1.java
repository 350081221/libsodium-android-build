package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1156:1\n222#2:1157\n262#2,11:1158\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n*L\n1139#1:1157\n1139#1:1158,11\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends kotlin.jvm.internal.n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j5, PaddingValues paddingValues) {
        super(1);
        this.$labelSize = j5;
        this.$paddingValues = paddingValues;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        float f5;
        float t5;
        float t6;
        float m3562getWidthimpl = Size.m3562getWidthimpl(this.$labelSize);
        if (m3562getWidthimpl > 0.0f) {
            f5 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
            float mo304toPx0680j_4 = contentDrawScope.mo304toPx0680j_4(f5);
            float mo304toPx0680j_42 = contentDrawScope.mo304toPx0680j_4(this.$paddingValues.mo504calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - mo304toPx0680j_4;
            float f6 = 2;
            float f7 = m3562getWidthimpl + mo304toPx0680j_42 + (mo304toPx0680j_4 * f6);
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                t5 = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - f7;
            } else {
                t5 = kotlin.ranges.u.t(mo304toPx0680j_42, 0.0f);
            }
            float f8 = t5;
            if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                float m3562getWidthimpl2 = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc());
                t6 = kotlin.ranges.u.t(mo304toPx0680j_42, 0.0f);
                f7 = m3562getWidthimpl2 - t6;
            }
            float f9 = f7;
            float m3559getHeightimpl = Size.m3559getHeightimpl(this.$labelSize);
            float f10 = (-m3559getHeightimpl) / f6;
            float f11 = m3559getHeightimpl / f6;
            int m3722getDifferencertfAjoo = ClipOp.Companion.m3722getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4205clipRectN_I0leg(f8, f10, f9, f11, m3722getDifferencertfAjoo);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
            return;
        }
        contentDrawScope.drawContent();
    }
}
