package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.m;
import v3.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H&R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "Lkotlin/r2;", "invalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", MediationConstant.RIT_TYPE_DRAW, "Lkotlin/Function1;", "invalidateListener", "Lv3/l;", "getInvalidateListener$ui_release", "()Lv3/l;", "setInvalidateListener$ui_release", "(Lv3/l;)V", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;

    @m
    private l<? super VNode, r2> invalidateListener;

    private VNode() {
    }

    public /* synthetic */ VNode(w wVar) {
        this();
    }

    public abstract void draw(@p4.l DrawScope drawScope);

    @m
    public l<VNode, r2> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        l<VNode, r2> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(@m l<? super VNode, r2> lVar) {
        this.invalidateListener = lVar;
    }
}
