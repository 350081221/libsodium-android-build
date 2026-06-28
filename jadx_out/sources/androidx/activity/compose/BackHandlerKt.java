package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.alipay.sdk.m.x.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function0;", "Lkotlin/r2;", d.f3022n, "BackHandler", "(ZLv3/a;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n955#2,6:111\n955#2,6:117\n955#2,6:124\n76#3:123\n89#4:130\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111,6\n94#1:117,6\n101#1:124,6\n100#1:123\n84#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class BackHandlerKt {
    @Composable
    public static final void BackHandler(final boolean z4, @l v3.a<r2> aVar, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-361453782);
        int i10 = i6 & 1;
        if (i10 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(aVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i7 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                z4 = true;
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, startRestartGroup, (i7 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-971159753);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new OnBackPressedCallback(z4) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        v3.a BackHandler$lambda$0;
                        BackHandler$lambda$0 = BackHandlerKt.BackHandler$lambda$0(rememberUpdatedState);
                        BackHandler$lambda$0.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-971159481);
            boolean changed = startRestartGroup.changed(backHandlerKt$BackHandler$backCallback$1$1) | startRestartGroup.changed(z4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new BackHandlerKt$BackHandler$1$1(backHandlerKt$BackHandler$backCallback$1$1, z4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((v3.a) rememberedValue2, startRestartGroup, 0);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                startRestartGroup.startReplaceableGroup(-971159120);
                boolean changed2 = startRestartGroup.changed(onBackPressedDispatcher) | startRestartGroup.changed(lifecycleOwner) | startRestartGroup.changed(backHandlerKt$BackHandler$backCallback$1$1);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new BackHandlerKt$BackHandler$2$1(onBackPressedDispatcher, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (v3.l) rememberedValue3, startRestartGroup, 0);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackHandlerKt$BackHandler$3(z4, aVar, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v3.a<r2> BackHandler$lambda$0(State<? extends v3.a<r2>> state) {
        return state.getValue();
    }
}
