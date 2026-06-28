package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u0007J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0010\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001d\u0010\u001c\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u001e\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001d\u0010 \u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/DefaultDrawerItemsColor;", "Landroidx/compose/material3/NavigationDrawerItemColors;", "", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "iconColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "textColor", "containerColor", "badgeColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "selectedIconColor", "J", "getSelectedIconColor-0d7_KjU", "()J", "unselectedIconColor", "getUnselectedIconColor-0d7_KjU", "selectedTextColor", "getSelectedTextColor-0d7_KjU", "unselectedTextColor", "getUnselectedTextColor-0d7_KjU", "selectedContainerColor", "getSelectedContainerColor-0d7_KjU", "unselectedContainerColor", "getUnselectedContainerColor-0d7_KjU", "selectedBadgeColor", "getSelectedBadgeColor-0d7_KjU", "unselectedBadgeColor", "getUnselectedBadgeColor-0d7_KjU", "<init>", "(JJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private DefaultDrawerItemsColor(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.selectedIconColor = j5;
        this.unselectedIconColor = j6;
        this.selectedTextColor = j7;
        this.unselectedTextColor = j8;
        this.selectedContainerColor = j9;
        this.unselectedContainerColor = j10;
        this.selectedBadgeColor = j11;
        this.unselectedBadgeColor = j12;
    }

    public /* synthetic */ DefaultDrawerItemsColor(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @p4.l
    @Composable
    public State<Color> badgeColor(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i5, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:876)");
        }
        if (z4) {
            j5 = this.selectedBadgeColor;
        } else {
            j5 = this.unselectedBadgeColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @p4.l
    @Composable
    public State<Color> containerColor(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i5, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:869)");
        }
        if (z4) {
            j5 = this.selectedContainerColor;
        } else {
            j5 = this.unselectedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (!Color.m3735equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) || !Color.m3735equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) || !Color.m3735equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) || !Color.m3735equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) || !Color.m3735equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) || !Color.m3735equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) || !Color.m3735equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor)) {
            return false;
        }
        return Color.m3735equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor);
    }

    /* renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1833getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1834getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1835getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1836getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1837getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    /* renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1838getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1839getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1840getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return (((((((((((((Color.m3741hashCodeimpl(this.selectedIconColor) * 31) + Color.m3741hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m3741hashCodeimpl(this.selectedTextColor)) * 31) + Color.m3741hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m3741hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m3741hashCodeimpl(this.unselectedBadgeColor);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @p4.l
    @Composable
    public State<Color> iconColor(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i5, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:859)");
        }
        if (z4) {
            j5 = this.selectedIconColor;
        } else {
            j5 = this.unselectedIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @p4.l
    @Composable
    public State<Color> textColor(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i5, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:864)");
        }
        if (z4) {
            j5 = this.selectedTextColor;
        } else {
            j5 = this.unselectedTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
