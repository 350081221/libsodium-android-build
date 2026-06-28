package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.umeng.analytics.pro.d;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0011J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0011J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "backgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "cursorColor", "isError", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", d.U, "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", "textColor", "trailingIconColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldColors {
    @l
    @Composable
    State<Color> backgroundColor(boolean z4, @m Composer composer, int i5);

    @l
    @Composable
    State<Color> cursorColor(boolean z4, @m Composer composer, int i5);

    @l
    @Composable
    State<Color> indicatorColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5);

    @l
    @Composable
    State<Color> labelColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5);

    @l
    @Composable
    default State<Color> leadingIconColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1036335134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1036335134, i5, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        State<Color> leadingIconColor = leadingIconColor(z4, z5, composer, (i5 & 14) | (i5 & 112) | ((i5 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return leadingIconColor;
    }

    @l
    @Composable
    @k(level = kotlin.m.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @b1(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    State<Color> leadingIconColor(boolean z4, boolean z5, @m Composer composer, int i5);

    @l
    @Composable
    State<Color> placeholderColor(boolean z4, @m Composer composer, int i5);

    @l
    @Composable
    State<Color> textColor(boolean z4, @m Composer composer, int i5);

    @l
    @Composable
    default State<Color> trailingIconColor(boolean z4, boolean z5, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        composer.startReplaceableGroup(454310320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454310320, i5, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:161)");
        }
        State<Color> trailingIconColor = trailingIconColor(z4, z5, composer, (i5 & 14) | (i5 & 112) | ((i5 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trailingIconColor;
    }

    @l
    @Composable
    @k(level = kotlin.m.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @b1(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    State<Color> trailingIconColor(boolean z4, boolean z5, @m Composer composer, int i5);
}
