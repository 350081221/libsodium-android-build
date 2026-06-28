package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ p<Composer, Integer, r2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ p<Composer, Integer, r2> $snackbar;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1(boolean z4, int i5, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, int i6) {
        super(2);
        this.$isFabDocked = z4;
        this.$fabPosition = i5;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = pVar4;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ScaffoldKt.m1422ScaffoldLayouti1QSOvI(this.$isFabDocked, this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
