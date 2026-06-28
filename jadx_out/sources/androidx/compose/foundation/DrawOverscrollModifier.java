package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/DrawOverscrollModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawOverscrollModifier extends InspectorValueInfo implements DrawModifier {

    @p4.l
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawOverscrollModifier(@p4.l AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, @p4.l v3.l<? super InspectorInfo, r2> lVar) {
        super(lVar);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@p4.l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.overscrollEffect.drawOverscroll(contentDrawScope);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawOverscrollModifier)) {
            return false;
        }
        return l0.g(this.overscrollEffect, ((DrawOverscrollModifier) obj).overscrollEffect);
    }

    public int hashCode() {
        return this.overscrollEffect.hashCode();
    }

    @p4.l
    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.overscrollEffect + ')';
    }
}
