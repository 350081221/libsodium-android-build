package androidx.compose.ui.viewinterop;

import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,617:1\n246#2:618\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n351#1:618\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, AndroidViewHolder androidViewHolder2) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        AndroidViewHolder androidViewHolder = this.$this_run;
        LayoutNode layoutNode = this.$layoutNode;
        AndroidViewHolder androidViewHolder2 = this.this$0;
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        if (androidViewHolder.getView().getVisibility() != 8) {
            androidViewHolder.isDrawing = true;
            Owner owner$ui_release = layoutNode.getOwner$ui_release();
            AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
            if (androidComposeView != null) {
                androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
            }
            androidViewHolder.isDrawing = false;
        }
    }
}
