package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.MutableState;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/r2;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Configuration, r2> {
    final /* synthetic */ MutableState<Configuration> $configuration$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(MutableState<Configuration> mutableState) {
        super(1);
        this.$configuration$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Configuration configuration) {
        invoke2(configuration);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Configuration configuration) {
        this.$configuration$delegate.setValue(new Configuration(configuration));
    }
}
