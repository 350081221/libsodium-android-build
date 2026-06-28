package androidx.compose.material3;

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
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aæ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aÜ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010,\u001a*\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u001d0.¢\u0006\u0002\b/H\u0007¢\u0006\u0004\b1\u00102\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/r2;", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", t0.b.f22420d, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "ProvideTextStyle", "(Landroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,354:1\n74#2:355\n74#2:360\n74#2:361\n74#2:362\n74#2:367\n74#2:368\n74#2:369\n658#3:356\n646#3:357\n658#3:358\n646#3:359\n658#3:363\n646#3:364\n658#3:365\n646#3:366\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n*L\n109#1:355\n114#1:360\n161#1:361\n255#1:362\n259#1:367\n308#1:368\n351#1:369\n112#1:356\n112#1:357\n113#1:358\n113#1:359\n257#1:363\n257#1:364\n258#1:365\n258#1:366\n*E\n"})
/* loaded from: classes.dex */
public final class TextKt {

    @p4.l
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@p4.l TextStyle textStyle, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i6, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2452Text4IGK_g(@p4.l java.lang.String r67, @p4.m androidx.compose.ui.Modifier r68, long r69, long r71, @p4.m androidx.compose.ui.text.font.FontStyle r73, @p4.m androidx.compose.ui.text.font.FontWeight r74, @p4.m androidx.compose.ui.text.font.FontFamily r75, long r76, @p4.m androidx.compose.ui.text.style.TextDecoration r78, @p4.m androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m androidx.compose.runtime.Composer r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m2452Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0441  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2453TextIbK3jfQ(@p4.l androidx.compose.ui.text.AnnotatedString r63, @p4.m androidx.compose.ui.Modifier r64, long r65, long r67, @p4.m androidx.compose.ui.text.font.FontStyle r69, @p4.m androidx.compose.ui.text.font.FontWeight r70, @p4.m androidx.compose.ui.text.font.FontFamily r71, long r72, @p4.m androidx.compose.ui.text.style.TextDecoration r74, @p4.m androidx.compose.ui.text.style.TextAlign r75, long r76, int r78, boolean r79, int r80, int r81, @p4.m java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r82, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r83, @p4.m androidx.compose.ui.text.TextStyle r84, @p4.m androidx.compose.runtime.Composer r85, int r86, int r87, int r88) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m2453TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2454TextfLXpl1I(java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, v3.l r72, androidx.compose.ui.text.TextStyle r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m2454TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @p4.l
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2451Text4IGK_g(androidx.compose.ui.text.AnnotatedString r56, androidx.compose.ui.Modifier r57, long r58, long r60, androidx.compose.ui.text.font.FontStyle r62, androidx.compose.ui.text.font.FontWeight r63, androidx.compose.ui.text.font.FontFamily r64, long r65, androidx.compose.ui.text.style.TextDecoration r67, androidx.compose.ui.text.style.TextAlign r68, long r69, int r71, boolean r72, int r73, java.util.Map r74, v3.l r75, androidx.compose.ui.text.TextStyle r76, androidx.compose.runtime.Composer r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m2451Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, v3.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
