package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u001c¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R(\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetDpNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "Landroidx/compose/ui/unit/Dp;", "before", "F", "getBefore-D9Ej5fM", "()F", "after", "getAfter-D9Ej5fM", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;FFLv3/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;

    @l
    private final AlignmentLine alignmentLine;
    private final float before;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f5, float f6, v3.l<? super InspectorInfo, r2> lVar) {
        this.alignmentLine = alignmentLine;
        this.before = f5;
        this.after = f6;
        this.inspectorInfo = lVar;
        if (!((f5 >= 0.0f || Dp.m6049equalsimpl0(f5, Dp.Companion.m6064getUnspecifiedD9Ej5fM())) && (f6 >= 0.0f || Dp.m6049equalsimpl0(f6, Dp.Companion.m6064getUnspecifiedD9Ej5fM())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f5, float f6, v3.l lVar, w wVar) {
        this(alignmentLine, f5, f6, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        if (l0.g(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Dp.m6049equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && Dp.m6049equalsimpl0(this.after, alignmentLineOffsetDpElement.after)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m440getAfterD9Ej5fM() {
        return this.after;
    }

    @l
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m441getBeforeD9Ej5fM() {
        return this.before;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + Dp.m6050hashCodeimpl(this.before)) * 31) + Dp.m6050hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m445setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m444setAfter0680j_4(this.after);
    }
}
