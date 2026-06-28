package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/focus/FocusProperties;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusableKt$focusGroup$1 extends n0 implements v3.l<FocusProperties, r2> {
    public static final FocusableKt$focusGroup$1 INSTANCE = new FocusableKt$focusGroup$1();

    FocusableKt$focusGroup$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }
}
