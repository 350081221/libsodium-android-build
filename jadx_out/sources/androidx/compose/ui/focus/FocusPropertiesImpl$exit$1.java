package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/focus/FocusRequester;", "it", "Landroidx/compose/ui/focus/FocusDirection;", "invoke-3ESFkO8", "(I)Landroidx/compose/ui/focus/FocusRequester;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusPropertiesImpl$exit$1 extends n0 implements l<FocusDirection, FocusRequester> {
    public static final FocusPropertiesImpl$exit$1 INSTANCE = new FocusPropertiesImpl$exit$1();

    FocusPropertiesImpl$exit$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return m3436invoke3ESFkO8(focusDirection.m3416unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m3436invoke3ESFkO8(int i5) {
        return FocusRequester.Companion.getDefault();
    }
}
