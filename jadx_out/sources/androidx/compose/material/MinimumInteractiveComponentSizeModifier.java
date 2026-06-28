package androidx.compose.material;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/unit/DpSize;", "size", "J", "getSize-MYxV2XQ", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    private MinimumInteractiveComponentSizeModifier(long j5) {
        this.size = j5;
    }

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j5, w wVar) {
        this(j5);
    }

    public boolean equals(@m Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier;
        if (obj instanceof MinimumInteractiveComponentSizeModifier) {
            minimumInteractiveComponentSizeModifier = (MinimumInteractiveComponentSizeModifier) obj;
        } else {
            minimumInteractiveComponentSizeModifier = null;
        }
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m6139equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m1374getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m6144hashCodeimpl(this.size);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        int max = Math.max(mo4998measureBRTryo0.getWidth(), measureScope.mo298roundToPx0680j_4(DpSize.m6142getWidthD9Ej5fM(this.size)));
        int max2 = Math.max(mo4998measureBRTryo0.getHeight(), measureScope.mo298roundToPx0680j_4(DpSize.m6140getHeightD9Ej5fM(this.size)));
        return MeasureScope.layout$default(measureScope, max, max2, null, new MinimumInteractiveComponentSizeModifier$measure$1(max, mo4998measureBRTryo0, max2), 4, null);
    }
}
