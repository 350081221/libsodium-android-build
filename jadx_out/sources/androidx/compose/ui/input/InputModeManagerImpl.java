package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "inputMode", "", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", "Lkotlin/Function1;", "onRequestInputModeChange", "Lv3/l;", "<set-?>", "inputMode$delegate", "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V", "initialInputMode", "<init>", "(ILv3/l;Lkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:78\n72#1:79,2\n*E\n"})
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;

    @l
    private final MutableState inputMode$delegate;

    @l
    private final v3.l<InputMode, Boolean> onRequestInputModeChange;

    /* JADX WARN: Multi-variable type inference failed */
    private InputModeManagerImpl(int i5, v3.l<? super InputMode, Boolean> lVar) {
        MutableState mutableStateOf$default;
        this.onRequestInputModeChange = lVar;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m4411boximpl(i5), null, 2, null);
        this.inputMode$delegate = mutableStateOf$default;
    }

    public /* synthetic */ InputModeManagerImpl(int i5, v3.l lVar, w wVar) {
        this(i5, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo4420getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m4417unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    @ExperimentalComposeUiApi
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo4421requestInputModeiuPiT84(int i5) {
        return this.onRequestInputModeChange.invoke(InputMode.m4411boximpl(i5)).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m4422setInputModeiuPiT84(int i5) {
        this.inputMode$delegate.setValue(InputMode.m4411boximpl(i5));
    }
}
