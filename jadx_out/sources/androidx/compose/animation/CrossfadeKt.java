package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import v3.l;
import v3.q;

@i0(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aZ\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a\u0088\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\t2&\u0010\f\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u0015¨\u0006\u0017²\u0006\u0012\u0010\u0016\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "", TTDownloadField.TT_LABEL, "Lkotlin/Function1;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Crossfade", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "Lkotlin/v0;", "name", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lv3/l;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "alpha", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n25#2:148\n25#2:156\n456#2,8:199\n464#2,3:213\n467#2,3:223\n1116#3,3:149\n1119#3,3:153\n1116#3,6:157\n1116#3,6:163\n1#4:152\n350#5,7:169\n33#6,6:176\n33#6,6:217\n68#7,6:182\n74#7:216\n78#7:227\n79#8,11:188\n92#8:226\n3737#9,6:207\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n139#1:199,8\n139#1:213,3\n139#1:223,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:163,6\n118#1:169,7\n127#1:176,6\n140#1:217,6\n139#1:182,6\n139#1:216\n139#1:227\n139#1:188,11\n139#1:226\n139#1:207,6\n*E\n"})
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(T r17, @p4.m androidx.compose.ui.Modifier r18, @p4.m androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r19, @p4.m java.lang.String r20, @p4.l v3.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @k(level = m.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, q qVar, Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changed(obj) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i8 = i6 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i6 & 4;
        if (i9 != 0) {
            i7 |= 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i7 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        if (i9 == 4 && (i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (i9 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i7, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:70)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, (i7 & 8) | (i7 & 14), 2), modifier, (FiniteAnimationSpec<Float>) finiteAnimationSpec, (l) null, qVar, startRestartGroup, (i7 & 112) | 512 | ((i7 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, qVar, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(@p4.l androidx.compose.animation.core.Transition<T> r16, @p4.m androidx.compose.ui.Modifier r17, @p4.m androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r18, @p4.m v3.l<? super T, ? extends java.lang.Object> r19, @p4.l v3.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r20, @p4.m androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, v3.l, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
