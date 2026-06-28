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
public final class LazyDslKt$LazyRow$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l<LazyListScope, r2> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$LazyRow$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z4, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z5, l<? super LazyListScope, r2> lVar, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyListState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$horizontalArrangement = horizontal;
        this.$verticalAlignment = vertical;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z5;
        this.$content = lVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        LazyDslKt.LazyRow(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$horizontalArrangement, this.$verticalAlignment, this.$flingBehavior, this.$userScrollEnabled, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
