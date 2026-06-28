package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Lkotlin/Function1;", "Lkotlin/r2;", "onResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "rememberLauncherForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n955#2,6:162\n955#2,6:168\n955#2,6:174\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162,6\n98#1:168,6\n104#1:174,6\n*E\n"})
/* loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    @l
    @Composable
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(@l ActivityResultContract<I, O> activityResultContract, @l v3.l<? super O, r2> lVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1408504823);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, i5 & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i5 >> 3) & 14);
        String str = (String) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (v3.a) ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.INSTANCE, composer, 3072, 6);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current != null) {
            ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
            composer.startReplaceableGroup(-1672765924);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ActivityResultLauncherHolder();
                composer.updateRememberedValue(rememberedValue);
            }
            ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) rememberedValue;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1672765850);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
                composer.updateRememberedValue(rememberedValue2);
            }
            ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) rememberedValue2;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1672765582);
            boolean changed = composer.changed(activityResultLauncherHolder) | composer.changed(activityResultRegistry) | composer.changed(str) | composer.changed(activityResultContract) | composer.changed(rememberUpdatedState2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                Object activityResultRegistryKt$rememberLauncherForActivityResult$1$1 = new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(activityResultLauncherHolder, activityResultRegistry, str, activityResultContract, rememberUpdatedState2);
                composer.updateRememberedValue(activityResultRegistryKt$rememberLauncherForActivityResult$1$1);
                rememberedValue3 = activityResultRegistryKt$rememberLauncherForActivityResult$1$1;
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract, (v3.l) rememberedValue3, composer, (i5 << 6) & 896);
            composer.endReplaceableGroup();
            return managedActivityResultLauncher;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
