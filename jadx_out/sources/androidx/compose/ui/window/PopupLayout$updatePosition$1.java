package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntRect;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PopupLayout$updatePosition$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ IntRect $parentBounds;
    final /* synthetic */ long $popupContentSize;
    final /* synthetic */ k1.g $popupPosition;
    final /* synthetic */ long $windowSize;
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$updatePosition$1(k1.g gVar, PopupLayout popupLayout, IntRect intRect, long j5, long j6) {
        super(0);
        this.$popupPosition = gVar;
        this.this$0 = popupLayout;
        this.$parentBounds = intRect;
        this.$windowSize = j5;
        this.$popupContentSize = j6;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$popupPosition.element = this.this$0.getPositionProvider().mo979calculatePositionllwVHH4(this.$parentBounds, this.$windowSize, this.this$0.getParentLayoutDirection(), this.$popupContentSize);
    }
}
