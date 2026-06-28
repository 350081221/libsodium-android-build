package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ²\u0001\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000b\u001a\u00020\n2e\u0010\u0015\u001aa\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\f¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\f\u0010\u0010\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "Landroidx/compose/material/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/Color;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Lkotlin/v0;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Lkotlin/r2;", "content", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLv3/q;ZLv3/t;Landroidx/compose/runtime/Composer;I)V", "Transition", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n1166#2:370\n1083#2,5:371\n1166#2:376\n1083#2,5:377\n1083#2,5:393\n1083#2,5:409\n69#3,2:382\n71#3:388\n74#3:392\n69#3,2:398\n71#3:404\n74#3:408\n36#4:384\n36#4:400\n1116#5,3:385\n1119#5,3:389\n1116#5,3:401\n1119#5,3:405\n81#6:414\n81#6:415\n81#6:416\n81#6:417\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n273#1:370\n273#1:371,5\n284#1:376\n284#1:377,5\n312#1:393,5\n322#1:409,5\n312#1:382,2\n312#1:388\n312#1:392\n322#1:398,2\n322#1:404\n322#1:408\n312#1:384\n322#1:400\n312#1:385,3\n312#1:389,3\n322#1:401,3\n322#1:405,3\n273#1:414\n284#1:415\n312#1:416\n322#1:417\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTransitionScope {

    @l
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
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

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f6, code lost:
    
        if (r32 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01b8, code lost:
    
        if (r32 != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1512TransitionDTcfvLk(@p4.l androidx.compose.material.InputPhase r26, long r27, long r29, @p4.l v3.q<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r31, boolean r32, @p4.l v3.t<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m1512TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, v3.q, boolean, v3.t, androidx.compose.runtime.Composer, int):void");
    }
}
