package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\t\b\u0002\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%B1\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0018\u00010\u000e¢\u0006\u0004\b$\u0010(J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001J!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH\u0096\u0001J\u001c\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f0\u000eH\u0016J*\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00032\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0002\b\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R/\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", b.f22420d, "", "canBeSaved", "", DatabaseFileArchive.COLUMN_KEY, "consumeRestored", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "", "", "performSave", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "SaveableStateProvider", "(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "removeState", "wrappedRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "<set-?>", "wrappedHolder$delegate", "Landroidx/compose/runtime/MutableState;", "getWrappedHolder", "()Landroidx/compose/runtime/saveable/SaveableStateHolder;", "setWrappedHolder", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "wrappedHolder", "", "previouslyComposedKeys", "Ljava/util/Set;", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "parentRegistry", "restoredValues", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n1855#3,2:112\n1#4:114\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:109\n68#1:110,2\n75#1:112,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Set<Object> previouslyComposedKeys;

    @l
    private final MutableState wrappedHolder$delegate;

    @l
    private final SaveableStateRegistry wrappedRegistry;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<Object, Boolean> {
        final /* synthetic */ SaveableStateRegistry $parentRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.$parentRegistry = saveableStateRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.l
        @l
        public final Boolean invoke(@l Object obj) {
            SaveableStateRegistry saveableStateRegistry = this.$parentRegistry;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true);
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(@m SaveableStateRegistry saveableStateRegistry) {
            return SaverKt.Saver(LazySaveableStateHolder$Companion$saver$1.INSTANCE, new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry));
        }
    }

    public LazySaveableStateHolder(@l SaveableStateRegistry saveableStateRegistry) {
        MutableState mutableStateOf$default;
        this.wrappedRegistry = saveableStateRegistry;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.wrappedHolder$delegate = mutableStateOf$default;
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@l Object obj, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i5, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.SaveableStateProvider(obj, pVar, startRestartGroup, (i5 & 112) | 520);
            EffectsKt.DisposableEffect(obj, new LazySaveableStateHolder$SaveableStateProvider$2(this, obj), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new LazySaveableStateHolder$SaveableStateProvider$3(this, obj, pVar, i5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder".toString());
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@l Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m
    public Object consumeRestored(@l String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @m
    public final SaveableStateHolder getWrappedHolder() {
        return (SaveableStateHolder) this.wrappedHolder$delegate.getValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Map<String, List<Object>> performSave() {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                wrappedHolder.removeState(it.next());
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public SaveableStateRegistry.Entry registerProvider(@l String str, @l a<? extends Object> aVar) {
        return this.wrappedRegistry.registerProvider(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@l Object obj) {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.removeState(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder".toString());
    }

    public final void setWrappedHolder(@m SaveableStateHolder saveableStateHolder) {
        this.wrappedHolder$delegate.setValue(saveableStateHolder);
    }

    public LazySaveableStateHolder(@m SaveableStateRegistry saveableStateRegistry, @m Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new AnonymousClass1(saveableStateRegistry)));
    }
}
