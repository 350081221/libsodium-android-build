package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008d\u0001\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0093\u0001\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001f\u001a©\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a8\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a,\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "contentColor", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLv3/p;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-LPr_se0", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/Indication;", "indication", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Surface-9VG74zQ", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surface", "Landroidx/compose/material/ElevationOverlay;", "elevationOverlay", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,642:1\n154#2:643\n154#2:646\n154#2:656\n154#2:666\n154#2:676\n74#3:644\n74#3:654\n74#3:664\n74#3:674\n74#3:684\n74#3:685\n51#4:645\n51#4:655\n51#4:665\n51#4:675\n51#4:686\n25#5:647\n25#5:657\n25#5:667\n25#5:677\n1116#6,6:648\n1116#6,6:658\n1116#6,6:668\n1116#6,6:678\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n111#1:643\n220#1:646\n334#1:656\n449#1:666\n577#1:676\n114#1:644\n224#1:654\n338#1:664\n453#1:674\n579#1:684\n585#1:685\n114#1:645\n224#1:655\n338#1:665\n453#1:675\n585#1:686\n221#1:647\n335#1:657\n450#1:667\n578#1:677\n221#1:648,6\n335#1:658,6\n450#1:668,6\n578#1:678,6\n*E\n"})
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021a  */
    @kotlin.k(level = kotlin.m.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @kotlin.b1(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1453Surface9VG74zQ(@p4.l v3.a<kotlin.r2> r39, @p4.m androidx.compose.ui.Modifier r40, @p4.m androidx.compose.ui.graphics.Shape r41, long r42, long r44, @p4.m androidx.compose.foundation.BorderStroke r46, float r47, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r48, @p4.m androidx.compose.foundation.Indication r49, boolean r50, @p4.m java.lang.String r51, @p4.m androidx.compose.ui.semantics.Role r52, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1453Surface9VG74zQ(v3.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0082  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1454SurfaceFjzlyU(@p4.m androidx.compose.ui.Modifier r26, @p4.m androidx.compose.ui.graphics.Shape r27, long r28, long r30, @p4.m androidx.compose.foundation.BorderStroke r32, float r33, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1454SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1455SurfaceLPr_se0(@p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m androidx.compose.ui.graphics.Shape r33, long r34, long r36, @p4.m androidx.compose.foundation.BorderStroke r38, float r39, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r40, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1455SurfaceLPr_se0(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1456SurfaceNy5ogXk(boolean r31, @p4.l v3.a<kotlin.r2> r32, @p4.m androidx.compose.ui.Modifier r33, boolean r34, @p4.m androidx.compose.ui.graphics.Shape r35, long r36, long r38, @p4.m androidx.compose.foundation.BorderStroke r40, float r41, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r42, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1456SurfaceNy5ogXk(boolean, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1460surface8ww4TTg(Modifier modifier, Shape shape, long j5, BorderStroke borderStroke, float f5) {
        Modifier modifier2;
        Modifier m3406shadows4CzXII$default = ShadowKt.m3406shadows4CzXII$default(modifier, f5, shape, false, 0L, 0L, 24, null);
        if (borderStroke != null) {
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape);
        } else {
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m200backgroundbw27NRU(m3406shadows4CzXII$default.then(modifier2), j5, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1461surfaceColorAtElevationcq6XJ1M(long j5, ElevationOverlay elevationOverlay, float f5, Composer composer, int i5) {
        composer.startReplaceableGroup(1561611256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i5, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:634)");
        }
        if (Color.m3735equalsimpl0(j5, MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU()) && elevationOverlay != null) {
            j5 = elevationOverlay.mo1315apply7g2Lkgo(j5, f5, composer, (i5 & 14) | ((i5 >> 3) & 112) | ((i5 << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1457SurfaceNy5ogXk(boolean r31, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r32, @p4.m androidx.compose.ui.Modifier r33, boolean r34, @p4.m androidx.compose.ui.graphics.Shape r35, long r36, long r38, @p4.m androidx.compose.foundation.BorderStroke r40, float r41, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r42, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1457SurfaceNy5ogXk(boolean, v3.l, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
