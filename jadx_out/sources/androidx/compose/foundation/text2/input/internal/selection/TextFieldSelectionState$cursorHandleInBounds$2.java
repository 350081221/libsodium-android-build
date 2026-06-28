package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1235:1\n495#2,4:1236\n500#2:1245\n129#3,5:1240\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2\n*L\n240#1:1236,4\n240#1:1245\n240#1:1240,5\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorHandleInBounds$2 extends n0 implements a<Boolean> {
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$cursorHandleInBounds$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.this$0 = textFieldSelectionState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        LayoutCoordinates textLayoutCoordinates;
        Rect visibleBounds;
        Snapshot.Companion companion = Snapshot.Companion;
        TextFieldSelectionState textFieldSelectionState = this.this$0;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                long m3520getBottomCenterF1C5BW0 = textFieldSelectionState.getCursorRect().m3520getBottomCenterF1C5BW0();
                createNonObservableSnapshot.dispose();
                textLayoutCoordinates = this.this$0.getTextLayoutCoordinates();
                return Boolean.valueOf((textLayoutCoordinates == null || (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? false : SelectionManagerKt.m1031containsInclusiveUv8p0NA(visibleBounds, m3520getBottomCenterF1C5BW0));
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
