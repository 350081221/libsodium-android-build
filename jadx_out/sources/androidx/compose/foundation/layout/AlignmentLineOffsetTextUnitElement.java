package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001c¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R(\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "create", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "inspectableProperties", "node", "update", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "Landroidx/compose/ui/unit/TextUnit;", "before", "J", "getBefore-XSAIIZE", "()J", "after", "getAfter-XSAIIZE", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;JJLv3/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;

    @l
    private final AlignmentLine alignmentLine;
    private final long before;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j5, long j6, v3.l<? super InspectorInfo, r2> lVar) {
        this.alignmentLine = alignmentLine;
        this.before = j5;
        this.after = j6;
        this.inspectorInfo = lVar;
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j5, long j6, v3.l lVar, w wVar) {
        this(alignmentLine, j5, j6, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetTextUnitElement) {
            alignmentLineOffsetTextUnitElement = (AlignmentLineOffsetTextUnitElement) obj;
        } else {
            alignmentLineOffsetTextUnitElement = null;
        }
        if (alignmentLineOffsetTextUnitElement == null) {
            return false;
        }
        if (l0.g(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m6232equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m6232equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m446getAfterXSAIIZE() {
        return this.after;
    }

    @l
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m447getBeforeXSAIIZE() {
        return this.before;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m6236hashCodeimpl(this.before)) * 31) + TextUnit.m6236hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetTextUnitNode.m451setBeforeR2X_6o(this.before);
        alignmentLineOffsetTextUnitNode.m450setAfterR2X_6o(this.after);
    }
}
