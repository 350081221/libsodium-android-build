package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\\\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002A\u0010\f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006G\u0010\u000f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/i;", "Landroidx/activity/BackEventCompat;", "Lu3/n;", "Lkotlin/v0;", "name", "progress", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", d.f3022n, "PredictiveBackHandler", "(ZLv3/p;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n955#4,3:178\n958#4,3:184\n955#4,6:188\n955#4,6:194\n955#4,6:201\n473#5:183\n76#6:200\n89#7:207\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n79#1:178,3\n79#1:184,3\n81#1:188,6\n127#1:194,6\n137#1:201,6\n79#1:183\n135#1:200\n78#1:207\n*E\n"})
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    @Composable
    public static final void PredictiveBackHandler(final boolean z4, @l p<i<BackEventCompat>, ? super kotlin.coroutines.d<r2>, ? extends Object> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-642000585);
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
            if (startRestartGroup.changed(pVar)) {
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
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i7 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-723524056);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            final s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1071578902);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new OnBackPressedCallback(z4) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1

                    @m
                    private OnBackInstance onBackInstance;

                    @m
                    public final OnBackInstance getOnBackInstance() {
                        return this.onBackInstance;
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackCancelled() {
                        super.handleOnBackCancelled();
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        p PredictiveBackHandler$lambda$0;
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null && !onBackInstance.isPredictiveBack()) {
                            onBackInstance.cancel();
                            this.onBackInstance = null;
                        }
                        if (this.onBackInstance == null) {
                            s0 s0Var = coroutineScope;
                            PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                            this.onBackInstance = new OnBackInstance(s0Var, false, PredictiveBackHandler$lambda$0);
                        }
                        OnBackInstance onBackInstance2 = this.onBackInstance;
                        if (onBackInstance2 != null) {
                            onBackInstance2.close();
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackProgressed(@l BackEventCompat backEventCompat) {
                        super.handleOnBackProgressed(backEventCompat);
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            kotlinx.coroutines.channels.p.b(onBackInstance.m0sendJP2dKIU(backEventCompat));
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackStarted(@l BackEventCompat backEventCompat) {
                        p PredictiveBackHandler$lambda$0;
                        super.handleOnBackStarted(backEventCompat);
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                        s0 s0Var = coroutineScope;
                        PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                        this.onBackInstance = new OnBackInstance(s0Var, true, PredictiveBackHandler$lambda$0);
                    }

                    public final void setOnBackInstance(@m OnBackInstance onBackInstance) {
                        this.onBackInstance = onBackInstance;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf = Boolean.valueOf(z4);
            startRestartGroup.startReplaceableGroup(-1071576918);
            boolean changed = startRestartGroup.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) | startRestartGroup.changed(z4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new PredictiveBackHandlerKt$PredictiveBackHandler$1$1(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z4, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue3, startRestartGroup, i7 & 14);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                startRestartGroup.startReplaceableGroup(-1071576546);
                boolean changed2 = startRestartGroup.changed(onBackPressedDispatcher) | startRestartGroup.changed(lifecycleOwner) | startRestartGroup.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(onBackPressedDispatcher, lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (v3.l) rememberedValue4, startRestartGroup, 0);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PredictiveBackHandlerKt$PredictiveBackHandler$3(z4, pVar, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<i<BackEventCompat>, kotlin.coroutines.d<r2>, Object> PredictiveBackHandler$lambda$0(State<? extends p<i<BackEventCompat>, ? super kotlin.coroutines.d<r2>, ? extends Object>> state) {
        return (p) state.getValue();
    }
}
