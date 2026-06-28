package androidx.compose.ui.unit;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\"1\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"<set-?>", "", "DisableNonLinearFontScalingInCompose", "getDisableNonLinearFontScalingInCompose$annotations", "()V", "getDisableNonLinearFontScalingInCompose", "()Z", "setDisableNonLinearFontScalingInCompose", "(Z)V", "DisableNonLinearFontScalingInCompose$delegate", "Landroidx/compose/runtime/MutableState;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n81#2:106\n107#2,2:107\n*S KotlinDebug\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingKt\n*L\n43#1:106\n43#1:107,2\n*E\n"})
/* loaded from: classes.dex */
public final class FontScalingKt {

    @l
    private static final MutableState DisableNonLinearFontScalingInCompose$delegate;

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        DisableNonLinearFontScalingInCompose$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalComposeUiApi
    public static final boolean getDisableNonLinearFontScalingInCompose() {
        return ((Boolean) DisableNonLinearFontScalingInCompose$delegate.getValue()).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableNonLinearFontScalingInCompose$annotations() {
    }

    @ExperimentalComposeUiApi
    public static final void setDisableNonLinearFontScalingInCompose(boolean z4) {
        DisableNonLinearFontScalingInCompose$delegate.setValue(Boolean.valueOf(z4));
    }
}
