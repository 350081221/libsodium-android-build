package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,142:1\n1#2:143\n64#3,5:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n92#1:144,5\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder;
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
        this.$key = obj;
        this.$registryHolder = registryHolder;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        Map map;
        Map map2;
        map = this.this$0.registryHolders;
        boolean z4 = !map.containsKey(this.$key);
        Object obj = this.$key;
        if (z4) {
            this.this$0.savedStates.remove(this.$key);
            map2 = this.this$0.registryHolders;
            map2.put(this.$key, this.$registryHolder);
            final SaveableStateHolderImpl.RegistryHolder registryHolder = this.$registryHolder;
            final SaveableStateHolderImpl saveableStateHolderImpl = this.this$0;
            final Object obj2 = this.$key;
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Map map3;
                    SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                    map3 = saveableStateHolderImpl.registryHolders;
                    map3.remove(obj2);
                }
            };
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }
}
