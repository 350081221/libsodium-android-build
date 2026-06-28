package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000~\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001az\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0090\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001ad\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001az\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 \u001a\u0084\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010!\u001a\u001e\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u001a¬\u0001\u00103\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0014\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010-0)\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/r2;", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "BasicText-VhcvRP8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZILandroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZIILandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionIdSaver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lv3/l;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lv3/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "textModifier", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,447:1\n74#2:448\n74#2:449\n74#2:460\n74#2:461\n74#2:490\n74#2:491\n74#2:502\n74#2:538\n67#3,3:450\n66#3:453\n286#3,8:467\n294#3,2:487\n67#3,3:492\n66#3:495\n286#3,8:508\n294#3,2:528\n25#3:531\n456#3,8:562\n464#3,6:576\n1116#4,6:454\n1116#4,6:496\n1116#4,6:532\n1116#4,6:539\n1116#4,6:545\n124#5,5:462\n130#5,5:475\n135#5:486\n137#5:489\n124#5,5:503\n130#5,5:516\n135#5:527\n137#5:530\n79#5,11:551\n92#5:582\n3737#6,6:480\n3737#6,6:521\n3737#6,6:570\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n96#1:448\n98#1:449\n125#1:460\n137#1:461\n190#1:490\n192#1:491\n221#1:502\n250#1:538\n103#1:450,3\n103#1:453\n145#1:467,8\n145#1:487,2\n197#1:492,3\n197#1:495\n209#1:508,8\n209#1:528,2\n234#1:531\n237#1:562,8\n237#1:576,6\n103#1:454,6\n197#1:496,6\n234#1:532,6\n252#1:539,6\n256#1:545,6\n145#1:462,5\n145#1:475,5\n145#1:486\n145#1:489\n209#1:503,5\n209#1:516,5\n209#1:527\n209#1:530\n237#1:551,11\n237#1:582\n145#1:480,6\n209#1:521,6\n237#1:570,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m828BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.text.TextStyle r27, v3.l r28, int r29, boolean r30, int r31, java.util.Map r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m828BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m830BasicTextBpD7jsM(java.lang.String r21, androidx.compose.ui.Modifier r22, androidx.compose.ui.text.TextStyle r23, v3.l r24, int r25, boolean r26, int r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m830BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-RWo7tUw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m831BasicTextRWo7tUw(@p4.l androidx.compose.ui.text.AnnotatedString r50, @p4.m androidx.compose.ui.Modifier r51, @p4.m androidx.compose.ui.text.TextStyle r52, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r53, int r54, boolean r55, int r56, int r57, @p4.m java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r58, @p4.m androidx.compose.ui.graphics.ColorProducer r59, @p4.m androidx.compose.runtime.Composer r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m831BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m833BasicTextVhcvRP8(@p4.l java.lang.String r43, @p4.m androidx.compose.ui.Modifier r44, @p4.m androidx.compose.ui.text.TextStyle r45, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r46, int r47, boolean r48, int r49, int r50, @p4.m androidx.compose.ui.graphics.ColorProducer r51, @p4.m androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m833BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new BasicTextKt$selectionIdSaver$1(selectionRegistrar), BasicTextKt$selectionIdSaver$2.INSTANCE);
    }

    /* renamed from: textModifier-RWo7tUw */
    private static final Modifier m834textModifierRWo7tUw(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, int i7, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, l<? super List<Rect>, r2> lVar2, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i5, z4, i6, i7, list, lVar2, selectionController, colorProducer, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m829BasicText4YKlhWE(java.lang.String r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.text.TextStyle r27, v3.l r28, int r29, boolean r30, int r31, int r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m829BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0089  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m832BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, v3.l r29, int r30, boolean r31, int r32, int r33, java.util.Map r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m832BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, v3.l, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }
}
