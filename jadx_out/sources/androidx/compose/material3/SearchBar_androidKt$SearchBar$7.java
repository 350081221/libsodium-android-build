package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$7 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $active;
    final /* synthetic */ SearchBarColors $colors;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Boolean, r2> $onActiveChange;
    final /* synthetic */ v3.l<String, r2> $onQueryChange;
    final /* synthetic */ v3.l<String, r2> $onSearch;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$SearchBar$7(String str, v3.l<? super String, r2> lVar, v3.l<? super String, r2> lVar2, boolean z4, v3.l<? super Boolean, r2> lVar3, Modifier modifier, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Shape shape, SearchBarColors searchBarColors, float f5, float f6, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6, int i7) {
        super(2);
        this.$query = str;
        this.$onQueryChange = lVar;
        this.$onSearch = lVar2;
        this.$active = z4;
        this.$onActiveChange = lVar3;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$shape = shape;
        this.$colors = searchBarColors;
        this.$tonalElevation = f5;
        this.$shadowElevation = f6;
        this.$windowInsets = windowInsets;
        this.$interactionSource = mutableInteractionSource;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SearchBar_androidKt.m2126SearchBarWuY5d9Q(this.$query, this.$onQueryChange, this.$onSearch, this.$active, this.$onActiveChange, this.$modifier, this.$enabled, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$tonalElevation, this.$shadowElevation, this.$windowInsets, this.$interactionSource, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
