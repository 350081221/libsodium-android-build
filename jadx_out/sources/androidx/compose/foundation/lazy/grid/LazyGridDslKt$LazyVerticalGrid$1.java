package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
public final class LazyGridDslKt$LazyVerticalGrid$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ l<LazyGridScope, r2> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$LazyVerticalGrid$1(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z5, l<? super LazyGridScope, r2> lVar, int i5, int i6) {
        super(2);
        this.$columns = gridCells;
        this.$modifier = modifier;
        this.$state = lazyGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
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
        LazyGridDslKt.LazyVerticalGrid(this.$columns, this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$verticalArrangement, this.$horizontalArrangement, this.$flingBehavior, this.$userScrollEnabled, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
