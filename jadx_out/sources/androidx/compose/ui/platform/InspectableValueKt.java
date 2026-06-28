package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a-\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0001\"(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "definitions", "debugInspectorInfo", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "wrapped", "inspectableWrapper", "NoInspectorInfo", "Lv3/l;", "getNoInspectorInfo", "()Lv3/l;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InspectableValueKt {

    @p4.l
    private static final v3.l<InspectorInfo, r2> NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    @p4.l
    public static final v3.l<InspectorInfo, r2> debugInspectorInfo(@p4.l v3.l<? super InspectorInfo, r2> lVar) {
        return isDebugInspectorInfoEnabled() ? new InspectableValueKt$debugInspectorInfo$1(lVar) : getNoInspectorInfo();
    }

    @p4.l
    public static final v3.l<InspectorInfo, r2> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @p4.l
    public static final Modifier inspectable(@p4.l Modifier modifier, @p4.l v3.l<? super InspectorInfo, r2> lVar, @p4.l v3.l<? super Modifier, ? extends Modifier> lVar2) {
        return inspectableWrapper(modifier, lVar, lVar2.invoke(Modifier.Companion));
    }

    @p4.l
    @kotlin.a1
    public static final Modifier inspectableWrapper(@p4.l Modifier modifier, @p4.l v3.l<? super InspectorInfo, r2> lVar, @p4.l Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(lVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z4) {
        isDebugInspectorInfoEnabled = z4;
    }
}
