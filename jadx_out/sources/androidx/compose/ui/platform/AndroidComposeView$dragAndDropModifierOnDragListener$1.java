package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends kotlin.jvm.internal.h0 implements v3.q<DragAndDropTransferData, Size, v3.l<? super DrawScope, ? extends r2>, Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, v3.l<? super DrawScope, ? extends r2> lVar) {
        return m5287invoke12SF9DM(dragAndDropTransferData, size.m3567unboximpl(), lVar);
    }

    @p4.l
    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m5287invoke12SF9DM(@p4.l DragAndDropTransferData dragAndDropTransferData, long j5, @p4.l v3.l<? super DrawScope, r2> lVar) {
        boolean m5285startDrag12SF9DM;
        m5285startDrag12SF9DM = ((AndroidComposeView) this.receiver).m5285startDrag12SF9DM(dragAndDropTransferData, j5, lVar);
        return Boolean.valueOf(m5285startDrag12SF9DM);
    }
}
