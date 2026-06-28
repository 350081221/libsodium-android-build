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
final class MotionLayoutKt$MotionLayoutCore$3$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ q<MotionLayoutScope, Composer, Integer, r2> $content;
    final /* synthetic */ MotionLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionLayoutKt$MotionLayoutCore$3$2(q<? super MotionLayoutScope, ? super Composer, ? super Integer, r2> qVar, MotionLayoutScope motionLayoutScope, int i5) {
        super(2);
        this.$content = qVar;
        this.$scope = motionLayoutScope;
        this.$$changed = i5;
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
        } else {
            this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
        }
    }
}
