package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AspectRatioNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "aspectRatio", "F", "getAspectRatio", "()F", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(FZLv3/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    private final float aspectRatio;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f5, boolean z4, @l v3.l<? super InspectorInfo, r2> lVar) {
        boolean z5;
        this.aspectRatio = f5;
        this.matchHeightConstraintsFirst = z4;
        this.inspectorInfo = lVar;
        if (f5 > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f5 + " must be > 0").toString());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        AspectRatioElement aspectRatioElement;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.aspectRatio == aspectRatioElement.aspectRatio) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst) {
            return true;
        }
        return false;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public AspectRatioNode create() {
        return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l AspectRatioNode aspectRatioNode) {
        aspectRatioNode.setAspectRatio(this.aspectRatio);
        aspectRatioNode.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
    }
}
