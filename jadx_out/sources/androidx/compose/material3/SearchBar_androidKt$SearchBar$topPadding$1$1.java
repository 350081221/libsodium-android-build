package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "invoke-D9Ej5fM", "()F"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n51#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$topPadding$1$1\n*L\n215#1:742\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$topPadding$1$1 extends kotlin.jvm.internal.n0 implements v3.a<Dp> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$topPadding$1$1(MutableWindowInsets mutableWindowInsets, Density density) {
        super(0);
        this.$unconsumedInsets = mutableWindowInsets;
        this.$density = density;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ Dp invoke() {
        return Dp.m6042boximpl(m2129invokeD9Ej5fM());
    }

    /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m2129invokeD9Ej5fM() {
        return Dp.m6044constructorimpl(SearchBar_androidKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(this.$unconsumedInsets, this.$density).mo506calculateTopPaddingD9Ej5fM());
    }
}
