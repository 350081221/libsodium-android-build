package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n74#2:68\n25#3:69\n1116#4,6:70\n1116#4,6:76\n81#5:82\n107#5,2:83\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n46#1:68\n47#1:69\n47#1:70,6\n52#1:76,6\n47#1:82\n47#1:83,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<Offset> {
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, MutableState<IntSize> mutableState) {
            super(0);
            this.$manager = textFieldSelectionManager;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m3482boximpl(m1055invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m1055invokeF1C5BW0() {
            return TextFieldSelectionManagerKt.m1054calculateSelectionMagnifierCenterAndroidO0kMr_c(this.$manager, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$1(this.$magnifierSize$delegate));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m6218unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j5) {
        mutableState.setValue(IntSize.m6206boximpl(j5));
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1980580247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, i5, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6206boximpl(IntSize.Companion.m6219getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$manager, mutableState);
        composer.startReplaceableGroup(-753410549);
        boolean changed = composer.changed(mutableState) | composer.changed(density);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(density, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, anonymousClass1, (v3.l) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }
}
