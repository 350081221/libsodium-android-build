package androidx.compose.material;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "T", "", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,908:1\n64#2,5:909\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n*L\n528#1:909,5\n*E\n"})
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$2 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck;
    final /* synthetic */ l<T, r2> $onValueChange;
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$rememberSwipeableStateFor$2(T t5, SwipeableState<T> swipeableState, l<? super T, r2> lVar, MutableState<Boolean> mutableState) {
        super(1);
        this.$value = t5;
        this.$swipeableState = swipeableState;
        this.$onValueChange = lVar;
        this.$forceAnimationCheck = mutableState;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        if (!l0.g(this.$value, this.$swipeableState.getCurrentValue())) {
            this.$onValueChange.invoke(this.$swipeableState.getCurrentValue());
            this.$forceAnimationCheck.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
