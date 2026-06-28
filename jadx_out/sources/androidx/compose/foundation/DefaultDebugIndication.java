package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/Indication;", "()V", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n36#2:188\n1116#3,6:189\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:188\n171#1:189,6\n*E\n"})
/* loaded from: classes.dex */
final class DefaultDebugIndication implements Indication {

    @p4.l
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "drawIndication", "Landroidx/compose/runtime/State;", "", "isPressed", "Landroidx/compose/runtime/State;", "isHovered", "isFocused", "<init>", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class DefaultDebugIndicationInstance implements IndicationInstance {

        @p4.l
        private final State<Boolean> isFocused;

        @p4.l
        private final State<Boolean> isHovered;

        @p4.l
        private final State<Boolean> isPressed;

        public DefaultDebugIndicationInstance(@p4.l State<Boolean> state, @p4.l State<Boolean> state2, @p4.l State<Boolean> state3) {
            this.isPressed = state;
            this.isHovered = state2;
            this.isFocused = state3;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(@p4.l ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, Color.m3733copywmQWz5c$default(Color.Companion.m3760getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo4277getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                DrawScope.m4272drawRectnJ9OG0$default(contentDrawScope, Color.m3733copywmQWz5c$default(Color.Companion.m3760getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo4277getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.Indication
    @p4.l
    @Composable
    public IndicationInstance rememberUpdatedInstance(@p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1683566979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683566979, i5, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i6 = i5 & 14;
        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i6);
        State<Boolean> collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i6);
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i6);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultDebugIndicationInstance(collectIsPressedAsState, collectIsHoveredAsState, collectIsFocusedAsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDebugIndicationInstance;
    }
}
