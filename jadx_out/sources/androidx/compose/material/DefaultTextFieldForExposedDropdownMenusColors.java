package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\t\u0010\fJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u000fJ\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001a\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001a\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001a\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006.²\u0006\f\u0010-\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;", "Landroidx/compose/material/TextFieldColors;", "", "enabled", "isError", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trailingIconColor", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "indicatorColor", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", d.U, "labelColor", "textColor", "cursorColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "disabledTextColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "focused", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,740:1\n81#2:741\n81#2:742\n81#2:743\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n*L\n612#1:741\n630#1:742\n661#1:743\n*E\n"})
/* loaded from: classes.dex */
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedTrailingIconColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    private DefaultTextFieldForExposedDropdownMenusColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26) {
        this.textColor = j5;
        this.disabledTextColor = j6;
        this.cursorColor = j7;
        this.errorCursorColor = j8;
        this.focusedIndicatorColor = j9;
        this.unfocusedIndicatorColor = j10;
        this.errorIndicatorColor = j11;
        this.disabledIndicatorColor = j12;
        this.leadingIconColor = j13;
        this.disabledLeadingIconColor = j14;
        this.errorLeadingIconColor = j15;
        this.trailingIconColor = j16;
        this.focusedTrailingIconColor = j17;
        this.disabledTrailingIconColor = j18;
        this.errorTrailingIconColor = j19;
        this.backgroundColor = j20;
        this.focusedLabelColor = j21;
        this.unfocusedLabelColor = j22;
        this.disabledLabelColor = j23;
        this.errorLabelColor = j24;
        this.placeholderColor = j25;
        this.disabledPlaceholderColor = j26;
    }

    public /* synthetic */ DefaultTextFieldForExposedDropdownMenusColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26);
    }

    private static final boolean indicatorColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean trailingIconColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> backgroundColor(boolean z4, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1206593285);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1206593285, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.android.kt:645)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> cursorColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(603205843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(603205843, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.android.kt:677)");
        }
        if (z4) {
            j5 = this.errorCursorColor;
        } else {
            j5 = this.cursorColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) obj;
        if (Color.m3735equalsimpl0(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.m3735equalsimpl0(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.m3735equalsimpl0(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.m3735equalsimpl0(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.m3735equalsimpl0(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.m3735equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.m3735equalsimpl0(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.m3735equalsimpl0(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.m3735equalsimpl0(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.m3735equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.m3735equalsimpl0(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.m3735equalsimpl0(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.m3735equalsimpl0(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.m3735equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.m3735equalsimpl0(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.m3735equalsimpl0(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.m3735equalsimpl0(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.m3735equalsimpl0(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.m3735equalsimpl0(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.m3735equalsimpl0(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.m3735equalsimpl0(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.m3735equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m3741hashCodeimpl(this.textColor) * 31) + Color.m3741hashCodeimpl(this.disabledTextColor)) * 31) + Color.m3741hashCodeimpl(this.cursorColor)) * 31) + Color.m3741hashCodeimpl(this.errorCursorColor)) * 31) + Color.m3741hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.leadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.trailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.backgroundColor)) * 31) + Color.m3741hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m3741hashCodeimpl(this.errorLabelColor)) * 31) + Color.m3741hashCodeimpl(this.placeholderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> indicatorColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1956761869);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1956761869, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.android.kt:628)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledIndicatorColor;
        } else if (z5) {
            j5 = this.errorIndicatorColor;
        } else if (indicatorColor$lambda$1(collectIsFocusedAsState)) {
            j5 = this.focusedIndicatorColor;
        } else {
            j5 = this.unfocusedIndicatorColor;
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(182315157);
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(182315262);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> labelColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1110039826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1110039826, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.android.kt:659)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledLabelColor;
        } else if (z5) {
            j5 = this.errorLabelColor;
        } else if (labelColor$lambda$2(collectIsFocusedAsState)) {
            j5 = this.focusedLabelColor;
        } else {
            j5 = this.unfocusedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> leadingIconColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1834640354);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1834640354, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.android.kt:583)");
        }
        if (!z4) {
            j5 = this.disabledLeadingIconColor;
        } else if (z5) {
            j5 = this.errorLeadingIconColor;
        } else {
            j5 = this.leadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> placeholderColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1682014002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1682014002, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.android.kt:650)");
        }
        if (z4) {
            j5 = this.placeholderColor;
        } else {
            j5 = this.disabledPlaceholderColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> textColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-855386788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855386788, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.android.kt:672)");
        }
        if (z4) {
            j5 = this.textColor;
        } else {
            j5 = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> trailingIconColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1174562608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1174562608, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.android.kt:595)");
        }
        if (!z4) {
            j5 = this.disabledTrailingIconColor;
        } else if (z5) {
            j5 = this.errorTrailingIconColor;
        } else {
            j5 = this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @l
    @Composable
    public State<Color> trailingIconColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1172839089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172839089, i5, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.android.kt:610)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledTrailingIconColor;
        } else if (z5) {
            j5 = this.errorTrailingIconColor;
        } else {
            j5 = trailingIconColor$lambda$0(collectIsFocusedAsState) ? this.focusedTrailingIconColor : this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
