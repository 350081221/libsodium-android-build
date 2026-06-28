package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/LabelStateImpl;", "Landroidx/compose/material3/BasicTooltipState;", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Lkotlin/r2;", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "onDispose", "", "isVisible", "Z", "()Z", "isPersistent", "<init>", "(ZZ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LabelStateImpl implements BasicTooltipState {
    private final boolean isPersistent;
    private final boolean isVisible;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LabelStateImpl() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LabelStateImpl.<init>():void");
    }

    public LabelStateImpl(boolean z4, boolean z5) {
        this.isVisible = z4;
        this.isPersistent = z5;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void dismiss() {
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void onDispose() {
    }

    @Override // androidx.compose.material3.BasicTooltipState
    @p4.m
    public Object show(@p4.l MutatePriority mutatePriority, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return r2.f19517a;
    }

    public /* synthetic */ LabelStateImpl(boolean z4, boolean z5, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? true : z4, (i5 & 2) != 0 ? true : z5);
    }
}
