package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1116#2,6:110\n81#3:116\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n67#1:110,6\n66#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ v3.a<Offset> $magnifierCenter;
    final /* synthetic */ l<v3.a<Offset>, Modifier> $platformMagnifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(v3.a<Offset> aVar, l<? super v3.a<Offset>, ? extends Modifier> lVar) {
        super(3);
        this.$magnifierCenter = aVar;
        this.$platformMagnifier = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$0(State<Offset> state) {
        return state.getValue().m3503unboximpl();
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @m Composer composer, int i5) {
        State rememberAnimatedMagnifierPosition;
        composer.startReplaceableGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i5, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
        }
        rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        l<v3.a<Offset>, Modifier> lVar = this.$platformMagnifier;
        composer.startReplaceableGroup(1714568984);
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(rememberAnimatedMagnifierPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier invoke = lVar.invoke((v3.a) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return invoke;
    }
}
