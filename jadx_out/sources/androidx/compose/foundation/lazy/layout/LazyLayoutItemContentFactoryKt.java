package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/StableValue;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "SkippableItem-JVlU9Rs", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "SkippableItem", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m714SkippableItemJVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i5, Object obj2, Composer composer, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1439843069);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(lazyLayoutItemProvider)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i7 = i11 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(obj)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i7 |= i10;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changed(i5)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        if ((i6 & 7168) == 0) {
            if (startRestartGroup.changed(obj2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i7 |= i8;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i7, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.composableLambda(startRestartGroup, 980966366, true, new LazyLayoutItemContentFactoryKt$SkippableItem$1(lazyLayoutItemProvider, i5, obj2)), startRestartGroup, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutItemContentFactoryKt$SkippableItem$2(lazyLayoutItemProvider, obj, i5, obj2, i6));
        }
    }
}
