package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aæ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aÜ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010,\u001a*\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u001d0.¢\u0006\u0002\b/H\u0007¢\u0006\u0004\b1\u00102\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/r2;", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", b.f22420d, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "ProvideTextStyle", "(Landroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n74#2:399\n74#2:400\n74#2:401\n74#2:410\n74#2:411\n74#2:412\n74#2:413\n74#2:422\n74#2:423\n646#3:402\n646#3:403\n646#3:414\n646#3:415\n1116#4,6:404\n1116#4,6:416\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n*L\n110#1:399\n129#1:400\n130#1:401\n182#1:410\n278#1:411\n297#1:412\n298#1:413\n352#1:422\n395#1:423\n131#1:402\n133#1:403\n299#1:414\n301#1:415\n157#1:404,6\n326#1:416,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextKt {

    @l
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@l TextStyle textStyle, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i6, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), pVar, startRestartGroup, (i6 & 112) | ProvidedValue.$stable | 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextKt$ProvideTextStyle$1(textStyle, pVar, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1514Text4IGK_g(@p4.l java.lang.String r67, @p4.m androidx.compose.ui.Modifier r68, long r69, long r71, @p4.m androidx.compose.ui.text.font.FontStyle r73, @p4.m androidx.compose.ui.text.font.FontWeight r74, @p4.m androidx.compose.ui.text.font.FontFamily r75, long r76, @p4.m androidx.compose.ui.text.style.TextDecoration r78, @p4.m androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m androidx.compose.runtime.Composer r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1514Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1515TextIbK3jfQ(@p4.l androidx.compose.ui.text.AnnotatedString r68, @p4.m androidx.compose.ui.Modifier r69, long r70, long r72, @p4.m androidx.compose.ui.text.font.FontStyle r74, @p4.m androidx.compose.ui.text.font.FontWeight r75, @p4.m androidx.compose.ui.text.font.FontFamily r76, long r77, @p4.m androidx.compose.ui.text.style.TextDecoration r79, @p4.m androidx.compose.ui.text.style.TextAlign r80, long r81, int r83, boolean r84, int r85, int r86, @p4.m java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r87, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r88, @p4.m androidx.compose.ui.text.TextStyle r89, @p4.m androidx.compose.runtime.Composer r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1515TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1516TextfLXpl1I(java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, v3.l r72, androidx.compose.ui.text.TextStyle r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1516TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @l
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1513Text4IGK_g(androidx.compose.ui.text.AnnotatedString r52, androidx.compose.ui.Modifier r53, long r54, long r56, androidx.compose.ui.text.font.FontStyle r58, androidx.compose.ui.text.font.FontWeight r59, androidx.compose.ui.text.font.FontFamily r60, long r61, androidx.compose.ui.text.style.TextDecoration r63, androidx.compose.ui.text.style.TextAlign r64, long r65, int r67, boolean r68, int r69, java.util.Map r70, v3.l r71, androidx.compose.ui.text.TextStyle r72, androidx.compose.runtime.Composer r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1513Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
