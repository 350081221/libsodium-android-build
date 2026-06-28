package androidx.activity;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$4 extends n0 implements v3.a<CreationExtras> {
    final /* synthetic */ v3.a<CreationExtras> $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(v3.a<? extends CreationExtras> aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final CreationExtras invoke() {
        CreationExtras invoke;
        v3.a<CreationExtras> aVar = this.$extrasProducer;
        return (aVar == null || (invoke = aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : invoke;
    }
}
