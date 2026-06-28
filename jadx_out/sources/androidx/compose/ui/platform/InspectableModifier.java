package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB \u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0004\u001a\u00060\u0003R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableModifier$End;", "end", "Landroidx/compose/ui/platform/InspectableModifier$End;", "getEnd", "()Landroidx/compose/ui/platform/InspectableModifier$End;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Lv3/l;)V", "End", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;

    @p4.l
    private final End end;

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier$End;", "Landroidx/compose/ui/Modifier$Element;", "(Landroidx/compose/ui/platform/InspectableModifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(@p4.l v3.l<? super InspectorInfo, r2> lVar) {
        super(lVar);
        this.end = new End();
    }

    @p4.l
    public final End getEnd() {
        return this.end;
    }
}
