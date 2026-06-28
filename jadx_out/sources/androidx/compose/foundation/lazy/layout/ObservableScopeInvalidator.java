package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import u3.f;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0088\u0001\u0016\u0092\u0001\b\u0012\u0004\u0012\u00020\u00020\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "Lkotlin/r2;", "attachToScope-impl", "(Landroidx/compose/runtime/MutableState;)V", "attachToScope", "invalidateScope-impl", "invalidateScope", "", "toString-impl", "(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/MutableState;)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/MutableState;", "state", "Landroidx/compose/runtime/MutableState;", "constructor-impl", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;", "foundation_release"}, k = 1, mv = {1, 8, 0})
@f
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {

    @l
    private final MutableState<r2> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m721attachToScopeimpl(MutableState<r2> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m722boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    @l
    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<r2> m723constructorimpl(@l MutableState<r2> mutableState) {
        return mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m724constructorimpl$default(MutableState mutableState, int i5, w wVar) {
        if ((i5 & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(r2.f19517a, SnapshotStateKt.neverEqualPolicy());
        }
        return m723constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m725equalsimpl(MutableState<r2> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && l0.g(mutableState, ((ObservableScopeInvalidator) obj).m730unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m726equalsimpl0(MutableState<r2> mutableState, MutableState<r2> mutableState2) {
        return l0.g(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m727hashCodeimpl(MutableState<r2> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m728invalidateScopeimpl(MutableState<r2> mutableState) {
        mutableState.setValue(r2.f19517a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m729toStringimpl(MutableState<r2> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m725equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m727hashCodeimpl(this.state);
    }

    public String toString() {
        return m729toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m730unboximpl() {
        return this.state;
    }
}
