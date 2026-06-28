package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJÇ\u0001\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000b\u001a\u00020\n2z\u0010\u0016\u001av\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c²\u0006\f\u0010\u0010\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "Landroidx/compose/material3/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/Color;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "contentColor", "", "showLabel", "Lkotlin/Function5;", "", "Lkotlin/v0;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Lkotlin/r2;", "content", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLv3/q;ZLv3/u;Landroidx/compose/runtime/Composer;I)V", "Transition", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,433:1\n1166#2:434\n1083#2,5:435\n1166#2:440\n1083#2,5:441\n1166#2:446\n1083#2,5:447\n1083#2,5:463\n1083#2,5:479\n69#3,2:452\n71#3:458\n74#3:462\n69#3,2:468\n71#3:474\n74#3:478\n36#4:454\n36#4:470\n1116#5,3:455\n1119#5,3:459\n1116#5,3:471\n1119#5,3:475\n81#6:484\n81#6:485\n81#6:486\n81#6:487\n81#6:488\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n*L\n316#1:434\n316#1:435,5\n327#1:440\n327#1:441,5\n355#1:446\n355#1:447,5\n366#1:463,5\n376#1:479,5\n366#1:452,2\n366#1:458\n366#1:462\n376#1:468,2\n376#1:474\n376#1:478\n366#1:454\n376#1:470\n366#1:455,3\n366#1:459,3\n376#1:471,3\n376#1:475,3\n316#1:484\n327#1:485\n355#1:486\n366#1:487\n376#1:488\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTransitionScope {

    @p4.l
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$7(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02aa, code lost:
    
        if (r31 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01f3, code lost:
    
        if (r31 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01b4, code lost:
    
        if (r31 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2450TransitionDTcfvLk(@p4.l androidx.compose.material3.InputPhase r25, long r26, long r28, @p4.l v3.q<? super androidx.compose.material3.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r30, boolean r31, @p4.l v3.u<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldTransitionScope.m2450TransitionDTcfvLk(androidx.compose.material3.InputPhase, long, long, v3.q, boolean, v3.u, androidx.compose.runtime.Composer, int):void");
    }
}
