package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous parameter 0>", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5 extends n0 implements p<PointerInputChange, Offset, r2> {
    final /* synthetic */ k1.h<Handle> $actingHandle;
    final /* synthetic */ k1.f $dragBeginOffsetInText;
    final /* synthetic */ k1.g $dragBeginPosition;
    final /* synthetic */ k1.g $dragTotalDistance;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<String> {
        final /* synthetic */ long $currentDragPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j5) {
            super(0);
            this.$currentDragPosition = j5;
        }

        @Override // v3.a
        @l
        public final String invoke() {
            return "onDrag after longPress " + ((Object) Offset.m3501toStringimpl(this.$currentDragPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5(TextFieldSelectionState textFieldSelectionState, k1.g gVar, k1.g gVar2, k1.f fVar, k1.h<Handle> hVar) {
        super(2);
        this.this$0 = textFieldSelectionState;
        this.$dragTotalDistance = gVar;
        this.$dragBeginPosition = gVar2;
        this.$dragBeginOffsetInText = fVar;
        this.$actingHandle = hVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
        m1186invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1186invokeUv8p0NA(@p4.l androidx.compose.ui.input.pointer.PointerInputChange r11, long r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5.m1186invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange, long):void");
    }
}
