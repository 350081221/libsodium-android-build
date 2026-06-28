package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,138:1\n169#2,9:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n100#1:139,9\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ LazyLayoutItemContentFactory this$0;
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,138:1\n64#2,5:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n109#1:139,5\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
            super(1);
            this.this$0 = cachedItemContent;
        }

        @Override // v3.l
        @p4.l
        public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        SaveableStateHolder saveableStateHolder;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1403994769, i5, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
        }
        LazyLayoutItemProvider invoke = this.this$0.getItemProvider().invoke();
        int index = this.this$1.getIndex();
        if ((index >= invoke.getItemCount() || !l0.g(invoke.getKey(index), this.this$1.getKey())) && (index = invoke.getIndex(this.this$1.getKey())) != -1) {
            this.this$1.index = index;
        }
        int i6 = index;
        boolean z4 = i6 != -1;
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
        LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
        composer.startReusableGroup(207, Boolean.valueOf(z4));
        boolean changed = composer.changed(z4);
        if (z4) {
            saveableStateHolder = lazyLayoutItemContentFactory.saveableStateHolder;
            LazyLayoutItemContentFactoryKt.m714SkippableItemJVlU9Rs(invoke, StableValue.m732constructorimpl(saveableStateHolder), i6, StableValue.m732constructorimpl(cachedItemContent.getKey()), composer, 0);
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
        EffectsKt.DisposableEffect(this.this$1.getKey(), new AnonymousClass2(this.this$1), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
