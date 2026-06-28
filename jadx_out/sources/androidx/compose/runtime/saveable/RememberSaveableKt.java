package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.d;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.a;

@i0(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a>\u0010\u0010\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002\u001a\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "T", "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function0;", "init", "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", bi.ax, "mutableStateSaver", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", b.f22420d, "Lkotlin/r2;", "requireCanBeSaved", "", "MaxSupportedRadix", "I", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,271:1\n74#2:272\n25#3:273\n1116#4,6:274\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:272\n84#1:273\n84#1:274,6\n*E\n"})
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        l0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    @l
    @Composable
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m3351rememberSaveable(@l Object[] objArr, @m Saver<T, ? extends Object> saver, @m String str, @l a<? extends T> aVar, @m Composer composer, int i5, int i6) {
        Object consumeRestored;
        int a5;
        composer.startReplaceableGroup(441892779);
        if ((i6 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        T t5 = null;
        if ((i6 & 4) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i5, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            a5 = d.a(MaxSupportedRadix);
            str = Integer.toString(currentCompositeKeyHash, a5);
            l0.o(str, "toString(this, checkRadix(radix))");
        }
        l0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                t5 = saver.restore(consumeRestored);
            }
            rememberedValue = new SaveableHolder(saver, saveableStateRegistry, str, t5 == null ? aVar.invoke() : t5, objArr);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SaveableHolder saveableHolder = (SaveableHolder) rememberedValue;
        T t6 = (T) saveableHolder.getValueIfInputsDidntChange(objArr);
        if (t6 == null) {
            t6 = aVar.invoke();
        }
        EffectsKt.SideEffect(new RememberSaveableKt$rememberSaveable$1(saveableHolder, saver, saveableStateRegistry, str, t6, objArr), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj != null && !saveableStateRegistry.canBeSaved(obj)) {
            if (obj instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
                if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @l
    @Composable
    public static final <T> MutableState<T> rememberSaveable(@l Object[] objArr, @l Saver<T, ? extends Object> saver, @m String str, @l a<? extends MutableState<T>> aVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-202053668);
        if ((i6 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i5, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        MutableState<T> mutableState = (MutableState) m3351rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, (a) aVar, composer, (i5 & 896) | 8 | (i5 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
