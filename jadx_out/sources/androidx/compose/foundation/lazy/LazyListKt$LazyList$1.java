package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt$LazyList$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ l<LazyListScope, r2> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$LazyList$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z4, boolean z5, FlingBehavior flingBehavior, boolean z6, int i5, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, l<? super LazyListScope, r2> lVar, int i6, int i7, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyListState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$isVertical = z5;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z6;
        this.$beyondBoundsItemCount = i5;
        this.$horizontalAlignment = horizontal;
        this.$verticalArrangement = vertical;
        this.$verticalAlignment = vertical2;
        this.$horizontalArrangement = horizontal2;
        this.$content = lVar;
        this.$$changed = i6;
        this.$$changed1 = i7;
        this.$$default = i8;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        LazyListKt.LazyList(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$beyondBoundsItemCount, this.$horizontalAlignment, this.$verticalArrangement, this.$verticalAlignment, this.$horizontalArrangement, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
