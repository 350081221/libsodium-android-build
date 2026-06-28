package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/PasswordRevealFilter;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "hide", "Lkotlin/Function0;", "scheduleHide", "Lv3/a;", "getScheduleHide", "()Lv3/a;", "", "<set-?>", "revealCodepointIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "getRevealCodepointIndex$foundation_release", "()I", "setRevealCodepointIndex", "(I)V", "revealCodepointIndex", "<init>", "(Lv3/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,523:1\n75#2:524\n108#2,2:525\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n*L\n412#1:524\n412#1:525,2\n*E\n"})
/* loaded from: classes.dex */
public final class PasswordRevealFilter implements InputTransformation {
    public static final int $stable = 0;

    @l
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);

    @l
    private final v3.a<r2> scheduleHide;

    public PasswordRevealFilter(@l v3.a<r2> aVar) {
        this.scheduleHide = aVar;
    }

    private final void setRevealCodepointIndex(int i5) {
        this.revealCodepointIndex$delegate.setIntValue(i5);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    @l
    public final v3.a<r2> getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer) {
        boolean z4 = true;
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m5541getLengthimpl(textFieldBuffer.getChanges().mo1065getRangejx7JFs(0)) != 1 || TextRange.m5541getLengthimpl(textFieldBuffer.getChanges().mo1064getOriginalRangejx7JFs(0)) != 0) {
            z4 = false;
        }
        if (z4 && !textFieldBuffer.hasSelection()) {
            int m5543getMinimpl = TextRange.m5543getMinimpl(textFieldBuffer.getChanges().mo1065getRangejx7JFs(0));
            if (getRevealCodepointIndex$foundation_release() != m5543getMinimpl) {
                this.scheduleHide.invoke();
                setRevealCodepointIndex(m5543getMinimpl);
                return;
            }
            return;
        }
        setRevealCodepointIndex(-1);
    }
}
