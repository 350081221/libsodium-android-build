package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ q<ConstraintLayoutScope, Composer, Integer, r2> $content;
    final /* synthetic */ v3.a<r2> $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, r2> qVar, int i5, v3.a<r2> aVar) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$content = qVar;
        this.$$changed = i5;
        this.$onHelpersChanged = aVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if (((i5 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        int helpersHashCode = this.$scope.getHelpersHashCode();
        this.$scope.reset();
        this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 3) & 112) | 8));
        if (this.$scope.getHelpersHashCode() != helpersHashCode) {
            this.$onHelpersChanged.invoke();
        }
    }
}
