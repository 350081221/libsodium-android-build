package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed$inlined;
    final /* synthetic */ p $content$inlined;
    final /* synthetic */ MotionLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1(MotionLayoutScope motionLayoutScope, int i5, p pVar, int i6) {
        super(2);
        this.$scope = motionLayoutScope;
        this.$content$inlined = pVar;
        this.$$changed$inlined = i6;
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
            this.$content$inlined.invoke(composer, Integer.valueOf((this.$$changed$inlined >> 18) & 14));
        }
    }
}
