package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.j0;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "(Ljava/lang/String;I)V", "hasFocus", "", "getHasFocus", "()Z", "isCaptured", "isFocused", "Active", "ActiveParent", "Captured", "Inactive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum FocusStateImpl implements FocusState {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        throw new j0();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1) {
            return true;
        }
        if (i5 != 2 && i5 != 3 && i5 != 4) {
            throw new j0();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1 || i5 == 2) {
            return true;
        }
        if (i5 != 3 && i5 != 4) {
            throw new j0();
        }
        return false;
    }
}
