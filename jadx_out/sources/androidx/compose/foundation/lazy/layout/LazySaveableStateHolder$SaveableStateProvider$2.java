package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,108:1\n64#2,5:109\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2\n*L\n88#1:109,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazySaveableStateHolder$SaveableStateProvider$2 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Object $key;
    final /* synthetic */ LazySaveableStateHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$2(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.this$0 = lazySaveableStateHolder;
        this.$key = obj;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        Set set;
        set = this.this$0.previouslyComposedKeys;
        set.remove(this.$key);
        final LazySaveableStateHolder lazySaveableStateHolder = this.this$0;
        final Object obj = this.$key;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Set set2;
                set2 = LazySaveableStateHolder.this.previouslyComposedKeys;
                set2.add(obj);
            }
        };
    }
}
