package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\b\u0006\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000e\u0010\u000fR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/ComposedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "factory", "Lv3/q;", "getFactory", "()Lv3/q;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "inspectorInfo", "<init>", "(Lv3/l;Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {

    @l
    private final q<Modifier, Composer, Integer, Modifier> factory;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedModifier(@l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar);
        this.factory = qVar;
    }

    @l
    public final q<Modifier, Composer, Integer, Modifier> getFactory() {
        return this.factory;
    }
}
