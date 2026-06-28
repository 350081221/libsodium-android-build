package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\u00020\u0003HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/shape/DpCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "Landroidx/compose/ui/geometry/Size;", "shapeSize", "Landroidx/compose/ui/unit/Density;", "density", "", "toPx-TmRCtEA", "(JLandroidx/compose/ui/unit/Density;)F", "toPx", "", "toString", "size", "copy-0680j_4", "(F)Landroidx/compose/foundation/shape/DpCornerSize;", "copy", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "F", "getValueOverride-D9Ej5fM", "valueOverride", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/* loaded from: classes.dex */
public final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    private DpCornerSize(float f5) {
        this.size = f5;
    }

    public /* synthetic */ DpCornerSize(float f5, w wVar) {
        this(f5);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m819component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m820copy0680j_4$default(DpCornerSize dpCornerSize, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = dpCornerSize.size;
        }
        return dpCornerSize.m821copy0680j_4(f5);
    }

    @l
    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m821copy0680j_4(float f5) {
        return new DpCornerSize(f5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m6049equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m6042boximpl(m822getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m822getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m6050hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo814toPxTmRCtEA(long j5, @l Density density) {
        return density.mo304toPx0680j_4(this.size);
    }

    @l
    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }
}
