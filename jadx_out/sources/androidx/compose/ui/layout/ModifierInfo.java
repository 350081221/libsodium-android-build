package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "modifier", "Landroidx/compose/ui/Modifier;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "extra", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getExtra", "()Ljava/lang/Object;", "getModifier", "()Landroidx/compose/ui/Modifier;", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;

    @l
    private final LayoutCoordinates coordinates;

    @m
    private final Object extra;

    @l
    private final Modifier modifier;

    public ModifierInfo(@l Modifier modifier, @l LayoutCoordinates layoutCoordinates, @m Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    @l
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @m
    public final Object getExtra() {
        return this.extra;
    }

    @l
    public final Modifier getModifier() {
        return this.modifier;
    }

    @l
    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + ')';
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i5, w wVar) {
        this(modifier, layoutCoordinates, (i5 & 4) != 0 ? null : obj);
    }
}
