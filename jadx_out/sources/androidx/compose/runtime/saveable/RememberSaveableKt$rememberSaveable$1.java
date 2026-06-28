package androidx.compose.runtime.saveable;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RememberSaveableKt$rememberSaveable$1 extends n0 implements a<r2> {
    final /* synthetic */ String $finalKey;
    final /* synthetic */ SaveableHolder<T> $holder;
    final /* synthetic */ Object[] $inputs;
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ Saver<T, ? extends Object> $saver;
    final /* synthetic */ T $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(SaveableHolder<T> saveableHolder, Saver<T, ? extends Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t5, Object[] objArr) {
        super(0);
        this.$holder = saveableHolder;
        this.$saver = saver;
        this.$registry = saveableStateRegistry;
        this.$finalKey = str;
        this.$value = t5;
        this.$inputs = objArr;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$holder.update(this.$saver, this.$registry, this.$finalKey, this.$value, this.$inputs);
    }
}
