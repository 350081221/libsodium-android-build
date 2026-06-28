package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/unit/IntRect;", "invoke-KMgbckE", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends n0 implements p<Offset, IntRect, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // v3.p
    @l
    /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(@m Offset offset, @l IntRect intRect) {
        boolean z4 = false;
        if (offset != null && (Offset.m3493getXimpl(offset.m3503unboximpl()) < intRect.getLeft() || Offset.m3493getXimpl(offset.m3503unboximpl()) > intRect.getRight() || Offset.m3494getYimpl(offset.m3503unboximpl()) < intRect.getTop() || Offset.m3494getYimpl(offset.m3503unboximpl()) > intRect.getBottom())) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
