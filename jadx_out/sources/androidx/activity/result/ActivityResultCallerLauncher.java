package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001e"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "Lkotlin/r2;", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Lkotlin/r2;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "callerInput", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "resultContract$delegate", "Lkotlin/d0;", "getResultContract", "resultContract", "contract", "getContract", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<r2> {

    @l
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;

    @l
    private final ActivityResultContract<r2, O> contract;

    @l
    private final ActivityResultLauncher<I> launcher;

    @l
    private final d0 resultContract$delegate;

    public ActivityResultCallerLauncher(@l ActivityResultLauncher<I> launcher, @l ActivityResultContract<I, O> callerContract, I i5) {
        d0 c5;
        l0.p(launcher, "launcher");
        l0.p(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i5;
        c5 = f0.c(new ActivityResultCallerLauncher$resultContract$2(this));
        this.resultContract$delegate = c5;
        this.contract = getResultContract();
    }

    private final ActivityResultContract<r2, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    @l
    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @l
    public ActivityResultContract<r2, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(@l r2 input, @m ActivityOptionsCompat activityOptionsCompat) {
        l0.p(input, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
