package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "hapticFeedbackType", "Lkotlin/r2;", "performHapticFeedback-CdsT49E", "(I)V", "performHapticFeedback", "Landroid/view/View;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;

    @l
    private final View view;

    public PlatformHapticFeedback(@l View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo4399performHapticFeedbackCdsT49E(int i5) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m4403equalsimpl0(i5, companion.m4407getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m4403equalsimpl0(i5, companion.m4408getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}
