package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "I", "O", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n*L\n108#1:162,5\n*E\n"})
/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ ActivityResultContract<I, O> $contract;
    final /* synthetic */ State<l<O, r2>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ ActivityResultLauncherHolder<I> $realLauncher;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(ActivityResultLauncherHolder<I> activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, State<? extends l<? super O, r2>> state) {
        super(1);
        this.$realLauncher = activityResultLauncherHolder;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = activityResultContract;
        this.$currentOnResult = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(State state, Object obj) {
        ((l) state.getValue()).invoke(obj);
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        ActivityResultLauncherHolder<I> activityResultLauncherHolder = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry = this.$activityResultRegistry;
        String str = this.$key;
        Object obj = this.$contract;
        final State<l<O, r2>> state = this.$currentOnResult;
        activityResultLauncherHolder.setLauncher(activityResultRegistry.register(str, obj, new ActivityResultCallback() { // from class: androidx.activity.compose.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1.invoke$lambda$0(State.this, obj2);
            }
        }));
        final ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = this.$realLauncher;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ActivityResultLauncherHolder.this.unregister();
            }
        };
    }
}
