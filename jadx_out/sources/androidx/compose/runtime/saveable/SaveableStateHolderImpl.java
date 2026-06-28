package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB1\u0012(\b\u0002\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002J*\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0016R4\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0012R\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "", "", "", "", "saveAll", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "SaveableStateProvider", "(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "removeState", "savedStates", "Ljava/util/Map;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "registryHolders", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "<init>", "(Ljava/util/Map;)V", "Companion", "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n145#2,2:143\n25#2:145\n147#2,2:152\n1116#3,6:146\n1855#4,2:154\n1#5:156\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n76#1:143,2\n77#1:145\n76#1:152,2\n77#1:146,6\n102#1:154,2\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);

    @m
    private SaveableStateRegistry parentSaveableStateRegistry;

    @l
    private final Map<Object, RegistryHolder> registryHolders;

    @l
    private final Map<Object, Map<String, List<Object>>> savedStates;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002R\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "", "", "", "", "map", "Lkotlin/r2;", "saveTo", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "shouldSave", "Z", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class RegistryHolder {

        @l
        private final Object key;

        @l
        private final SaveableStateRegistry registry;
        private boolean shouldSave = true;

        public RegistryHolder(@l Object obj) {
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) SaveableStateHolderImpl.this.savedStates.get(obj), new SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl.this));
        }

        @l
        public final Object getKey() {
            return this.key;
        }

        @l
        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(@l Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }

        public final void setShouldSave(boolean z4) {
            this.shouldSave = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(@l Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> J0;
        J0 = a1.J0(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((RegistryHolder) it.next()).saveTo(J0);
        }
        if (J0.isEmpty()) {
            return null;
        }
        return J0;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@l Object obj, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        boolean z4;
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i5, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(207, obj);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (parentSaveableStateRegistry != null) {
                z4 = parentSaveableStateRegistry.canBeSaved(obj);
            } else {
                z4 = true;
            }
            if (z4) {
                rememberedValue = new RegistryHolder(obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        startRestartGroup.endReplaceableGroup();
        RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), pVar, startRestartGroup, i5 & 112);
        EffectsKt.DisposableEffect(r2.f19517a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), startRestartGroup, 6);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, pVar, i5));
        }
    }

    @m
    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@l Object obj) {
        RegistryHolder registryHolder = this.registryHolders.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(@m SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i5, w wVar) {
        this((i5 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
