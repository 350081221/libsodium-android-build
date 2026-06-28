package androidx.compose.foundation.pager;

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
public final class PagerKt$VerticalPager$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ l<Integer, Object> $key;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ r<PagerScope, Integer, Composer, Integer, r2> $pageContent;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PagerKt$VerticalPager$2(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i5, float f5, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z4, boolean z5, l<? super Integer, ? extends Object> lVar, NestedScrollConnection nestedScrollConnection, r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar, int i6, int i7, int i8) {
        super(2);
        this.$state = pagerState;
        this.$modifier = modifier;
        this.$contentPadding = paddingValues;
        this.$pageSize = pageSize;
        this.$beyondBoundsPageCount = i5;
        this.$pageSpacing = f5;
        this.$horizontalAlignment = horizontal;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z4;
        this.$reverseLayout = z5;
        this.$key = lVar;
        this.$pageNestedScrollConnection = nestedScrollConnection;
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
        PagerKt.m782VerticalPagerxYaah8o(this.$state, this.$modifier, this.$contentPadding, this.$pageSize, this.$beyondBoundsPageCount, this.$pageSpacing, this.$horizontalAlignment, this.$flingBehavior, this.$userScrollEnabled, this.$reverseLayout, this.$key, this.$pageNestedScrollConnection, this.$pageContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
