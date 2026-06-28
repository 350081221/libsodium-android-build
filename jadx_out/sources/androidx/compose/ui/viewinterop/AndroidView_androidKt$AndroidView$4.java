package androidx.compose.ui.viewinterop;

import android.content.Context;
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
public final class AndroidView_androidKt$AndroidView$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l<Context, T> $factory;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<T, r2> $onRelease;
    final /* synthetic */ l<T, r2> $onReset;
    final /* synthetic */ l<T, r2> $update;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$AndroidView$4(l<? super Context, ? extends T> lVar, Modifier modifier, l<? super T, r2> lVar2, l<? super T, r2> lVar3, l<? super T, r2> lVar4, int i5, int i6) {
        super(2);
        this.$factory = lVar;
        this.$modifier = modifier;
        this.$onReset = lVar2;
        this.$onRelease = lVar3;
        this.$update = lVar4;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AndroidView_androidKt.AndroidView(this.$factory, this.$modifier, this.$onReset, this.$onRelease, this.$update, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
