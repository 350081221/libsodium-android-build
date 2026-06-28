package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt$Pager$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ l<Integer, Object> $key;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ r<PagerScope, Integer, Composer, Integer, r2> $pageContent;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPagerKt$Pager$2(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z4, Orientation orientation, SnapFlingBehavior snapFlingBehavior, boolean z5, int i5, float f5, PageSize pageSize, NestedScrollConnection nestedScrollConnection, l<? super Integer, ? extends Object> lVar, Alignment.Horizontal horizontal, Alignment.Vertical vertical, r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar, int i6, int i7, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$state = pagerState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$orientation = orientation;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z5;
        this.$beyondBoundsPageCount = i5;
        this.$pageSpacing = f5;
        this.$pageSize = pageSize;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$key = lVar;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$pageContent = rVar;
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
        LazyLayoutPagerKt.m776Pagerfs30GE4(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$orientation, this.$flingBehavior, this.$userScrollEnabled, this.$beyondBoundsPageCount, this.$pageSpacing, this.$pageSize, this.$pageNestedScrollConnection, this.$key, this.$horizontalAlignment, this.$verticalAlignment, this.$pageContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
