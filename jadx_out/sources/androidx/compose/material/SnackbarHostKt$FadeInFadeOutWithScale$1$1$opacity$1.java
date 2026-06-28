package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import kotlin.collections.b0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends n0 implements a<r2> {
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "Landroidx/compose/material/SnackbarData;", "invoke", "(Landroidx/compose/material/FadeInFadeOutAnimationItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<FadeInFadeOutAnimationItem<SnackbarData>, Boolean> {
        final /* synthetic */ SnackbarData $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData) {
            super(1);
            this.$key = snackbarData;
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l FadeInFadeOutAnimationItem<SnackbarData> fadeInFadeOutAnimationItem) {
            return Boolean.valueOf(l0.g(fadeInFadeOutAnimationItem.getKey(), this.$key));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(SnackbarData snackbarData, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(0);
        this.$key = snackbarData;
        this.$state = fadeInFadeOutState;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (l0.g(this.$key, this.$state.getCurrent())) {
            return;
        }
        b0.I0(this.$state.getItems(), new AnonymousClass1(this.$key));
        RecomposeScope scope = this.$state.getScope();
        if (scope != null) {
            scope.invalidate();
        }
    }
}
