package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableNode$updatedCanPan$1 extends n0 implements l<Offset, Boolean> {
    final /* synthetic */ TransformableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$updatedCanPan$1(TransformableNode transformableNode) {
        super(1);
        this.this$0 = transformableNode;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
        return m413invokek4lQ0M(offset.m3503unboximpl());
    }

    @p4.l
    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final Boolean m413invokek4lQ0M(long j5) {
        l lVar;
        lVar = this.this$0.canPan;
        return (Boolean) lVar.invoke(Offset.m3482boximpl(j5));
    }
}
