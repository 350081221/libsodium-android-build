package androidx.compose.material;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, d<? super SnackbarHostKt$SnackbarHost$1> dVar) {
        super(2, dVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        boolean z4;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                SnackbarDuration duration = snackbarData.getDuration();
                if (this.$currentSnackbarData.getActionLabel() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long millis = SnackbarHostKt.toMillis(duration, z4, this.$accessibilityManager);
                this.label = 1;
                if (d1.b(millis, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
        this.$currentSnackbarData.dismiss();
        return r2.f19517a;
    }
}
