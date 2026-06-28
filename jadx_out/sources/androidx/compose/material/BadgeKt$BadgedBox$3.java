package androidx.compose.material;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BadgeKt$BadgedBox$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<BoxScope, Composer, Integer, r2> $badge;
    final /* synthetic */ q<BoxScope, Composer, Integer, r2> $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgeKt$BadgedBox$3(q<? super BoxScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, q<? super BoxScope, ? super Composer, ? super Integer, r2> qVar2, int i5, int i6) {
        super(2);
        this.$badge = qVar;
        this.$modifier = modifier;
        this.$content = qVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BadgeKt.BadgedBox(this.$badge, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
