package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000l\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0010\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001aa\u0010\u0010\u001a\u00020\f*\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0015\u001ac\u0010\u0010\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001ag\u0010\u0010\u001a\u00020\f*\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001ag\u0010\u0010\u001a\u00020\f*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u001a\u001ao\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u001d\u001aL\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00002\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0010\u0010 \u001am\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0001\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00000$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b)\u0010*\u001a;\u0010,\u001a\u00020%\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010+\u001a\u00028\u0000H\u0003¢\u0006\u0004\b,\u0010-\"\u001e\u00100\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020%0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063²\u0006$\u00101\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00000$\"\u0004\b\u0000\u0010\u001b8\nX\u008a\u0084\u0002²\u0006\u0012\u00102\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001b8\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", d.f3034z, "", TTDownloadField.TT_LABEL, "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLv3/p;Landroidx/compose/runtime/Composer;II)V", "transition", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lv3/q;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "shouldDisposeBlock", "Landroidx/compose/animation/OnLookaheadMeasured;", "onLookaheadMeasured", "AnimatedEnterExitImpl", "(Landroidx/compose/animation/core/Transition;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lv3/p;Landroidx/compose/animation/OnLookaheadMeasured;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "targetState", "targetEnterExit", "(Landroidx/compose/animation/core/Transition;Lv3/l;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,919:1\n25#2:920\n36#2:935\n36#2:951\n25#2:958\n456#2,8:976\n464#2,6:990\n25#2:997\n1116#3,6:921\n1116#3,6:928\n1116#3,6:936\n1116#3,6:945\n1116#3,6:952\n1116#3,6:959\n1116#3,6:998\n1#4:927\n1011#5:934\n1012#5,3:942\n79#6,11:965\n92#6:996\n3737#7,6:984\n81#8:1004\n81#8:1005\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n716#1:920\n789#1:935\n816#1:951\n834#1:958\n817#1:976,8\n817#1:990,6\n903#1:997\n716#1:921,6\n744#1:928,6\n789#1:936,6\n800#1:945,6\n816#1:952,6\n834#1:959,6\n903#1:998,6\n789#1:934\n789#1:942,3\n817#1:965,11\n817#1:996\n817#1:984,6\n793#1:1004\n795#1:1005\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedEnterExitImpl(@p4.l androidx.compose.animation.core.Transition<T> r20, @p4.l v3.l<? super T, java.lang.Boolean> r21, @p4.l androidx.compose.ui.Modifier r22, @p4.l androidx.compose.animation.EnterTransition r23, @p4.l androidx.compose.animation.ExitTransition r24, @p4.l v3.p<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean> r25, @p4.m androidx.compose.animation.OnLookaheadMeasured r26, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(androidx.compose.animation.core.Transition, v3.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, v3.p, androidx.compose.animation.OnLookaheadMeasured, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$4(State<? extends p<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (p) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(boolean r23, @p4.m androidx.compose.ui.Modifier r24, @p4.m androidx.compose.animation.EnterTransition r25, @p4.m androidx.compose.animation.ExitTransition r26, @p4.m java.lang.String r27, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void AnimatedVisibilityImpl(@l Transition<T> transition, @l v3.l<? super T, Boolean> lVar, @l Modifier modifier, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(429978603);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(transition)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(enterTransition)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 57344) == 0) {
            if (startRestartGroup.changed(exitTransition)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((458752 & i5) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((374491 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429978603, i6, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            startRestartGroup.startReplaceableGroup(-311853878);
            boolean changedInstance = startRestartGroup.changedInstance(lVar) | startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(lVar, transition);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedEnterExitImpl(transition, lVar, LayoutModifierKt.layout(modifier, (q) rememberedValue), enterTransition, exitTransition, AnimatedVisibilityKt$AnimatedVisibilityImpl$2.INSTANCE, null, qVar, startRestartGroup, 196608 | (i6 & 14) | (i6 & 112) | (i6 & 7168) | (57344 & i6) | ((i6 << 6) & 29360128), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibilityImpl$3(transition, lVar, modifier, enterTransition, exitTransition, qVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return currentState == enterExitState && transition.getTargetState() == enterExitState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, v3.l<? super T, Boolean> lVar, T t5, Composer composer, int i5) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i5, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)");
        }
        composer.startMovableGroup(-721835388, transition);
        if (transition.isSeeking()) {
            if (lVar.invoke(t5).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (lVar.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (lVar.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t5).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@p4.l androidx.compose.foundation.layout.RowScope r23, boolean r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.animation.EnterTransition r26, @p4.m androidx.compose.animation.ExitTransition r27, @p4.m java.lang.String r28, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@p4.l androidx.compose.foundation.layout.ColumnScope r23, boolean r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.animation.EnterTransition r26, @p4.m androidx.compose.animation.ExitTransition r27, @p4.m java.lang.String r28, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0047  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@p4.l androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r23, @p4.m androidx.compose.ui.Modifier r24, @p4.m androidx.compose.animation.EnterTransition r25, @p4.m androidx.compose.animation.ExitTransition r26, @p4.m java.lang.String r27, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@p4.l androidx.compose.foundation.layout.RowScope r23, @p4.l androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.animation.EnterTransition r26, @p4.m androidx.compose.animation.ExitTransition r27, @p4.m java.lang.String r28, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@p4.l androidx.compose.foundation.layout.ColumnScope r23, @p4.l androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.animation.EnterTransition r26, @p4.m androidx.compose.animation.ExitTransition r27, @p4.m java.lang.String r28, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedVisibility(@p4.l androidx.compose.animation.core.Transition<T> r23, @p4.l v3.l<? super T, java.lang.Boolean> r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.animation.EnterTransition r26, @p4.m androidx.compose.animation.ExitTransition r27, @p4.l v3.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, v3.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0050  */
    @kotlin.k(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @kotlin.b1(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(boolean r17, @p4.m androidx.compose.ui.Modifier r18, @p4.l androidx.compose.animation.EnterTransition r19, @p4.l androidx.compose.animation.ExitTransition r20, boolean r21, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
