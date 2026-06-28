package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J,\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "alignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "(Landroidx/compose/ui/Alignment;Z)V", "component1", "component2", "copy", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,310:1\n69#2,6:311\n69#2,6:317\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n142#1:311,6\n162#1:317,6\n*E\n"})
/* loaded from: classes.dex */
public final class BoxMeasurePolicy implements MeasurePolicy {

    @l
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(@l Alignment alignment, boolean z4) {
        this.alignment = alignment;
        this.propagateMinConstraints = z4;
    }

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i5 & 2) != 0) {
            z4 = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z4);
    }

    @l
    public final BoxMeasurePolicy copy(@l Alignment alignment, boolean z4) {
        return new BoxMeasurePolicy(alignment, z4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return l0.g(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        long m5991copyZbe2FdA$default;
        int i5;
        int i6;
        boolean matchesParentSize;
        boolean matchesParentSize2;
        boolean matchesParentSize3;
        int m6002getMinWidthimpl;
        int m6001getMinHeightimpl;
        Placeable mo4998measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, BoxMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (this.propagateMinConstraints) {
            m5991copyZbe2FdA$default = j5;
        } else {
            m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        }
        if (list.size() == 1) {
            Measurable measurable = list.get(0);
            matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
            if (!matchesParentSize3) {
                mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                m6002getMinWidthimpl = Math.max(Constraints.m6002getMinWidthimpl(j5), mo4998measureBRTryo0.getWidth());
                m6001getMinHeightimpl = Math.max(Constraints.m6001getMinHeightimpl(j5), mo4998measureBRTryo0.getHeight());
            } else {
                m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
                m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
                mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5)));
            }
            int i7 = m6002getMinWidthimpl;
            int i8 = m6001getMinHeightimpl;
            return MeasureScope.layout$default(measureScope, i7, i8, null, new BoxMeasurePolicy$measure$2(mo4998measureBRTryo0, measurable, measureScope, i7, i8, this), 4, null);
        }
        Placeable[] placeableArr = new Placeable[list.size()];
        k1.f fVar = new k1.f();
        fVar.element = Constraints.m6002getMinWidthimpl(j5);
        k1.f fVar2 = new k1.f();
        fVar2.element = Constraints.m6001getMinHeightimpl(j5);
        int size = list.size();
        boolean z4 = false;
        for (int i9 = 0; i9 < size; i9++) {
            Measurable measurable2 = list.get(i9);
            matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
            if (!matchesParentSize2) {
                Placeable mo4998measureBRTryo02 = measurable2.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                placeableArr[i9] = mo4998measureBRTryo02;
                fVar.element = Math.max(fVar.element, mo4998measureBRTryo02.getWidth());
                fVar2.element = Math.max(fVar2.element, mo4998measureBRTryo02.getHeight());
            } else {
                z4 = true;
            }
        }
        if (z4) {
            int i10 = fVar.element;
            if (i10 != Integer.MAX_VALUE) {
                i5 = i10;
            } else {
                i5 = 0;
            }
            int i11 = fVar2.element;
            if (i11 != Integer.MAX_VALUE) {
                i6 = i11;
            } else {
                i6 = 0;
            }
            long Constraints = ConstraintsKt.Constraints(i5, i10, i6, i11);
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Measurable measurable3 = list.get(i12);
                matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                if (matchesParentSize) {
                    placeableArr[i12] = measurable3.mo4998measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, fVar.element, fVar2.element, null, new BoxMeasurePolicy$measure$5(placeableArr, list, measureScope, fVar, fVar2, this), 4, null);
    }

    @l
    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }
}
