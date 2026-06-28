package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001av\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008c\u0001\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u001c\u001a\u00020\u0006*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/r2;", "onTextLayout", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "ClickableText", "onHover", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/geometry/Offset;", "positionOffset", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "containsWithinBounds", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n25#2:197\n25#2:216\n25#2:227\n1116#3,6:198\n1116#3,6:204\n1116#3,6:210\n1116#3,6:217\n1116#3,3:228\n1119#3,3:234\n1116#3,6:238\n487#4,4:223\n491#4,2:231\n495#4:237\n487#5:233\n1#6:244\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:197\n157#1:216\n158#1:227\n80#1:198,6\n81#1:204,6\n96#1:210,6\n157#1:217,6\n158#1:228,3\n158#1:234,3\n187#1:238,6\n158#1:223,4\n158#1:231,2\n158#1:237\n158#1:233\n*E\n"})
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ab  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* renamed from: ClickableText-03UYbkw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m835ClickableText03UYbkw(@p4.l androidx.compose.ui.text.AnnotatedString r25, @p4.l v3.l<? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, @p4.m androidx.compose.ui.text.TextStyle r28, boolean r29, int r30, int r31, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r32, @p4.l v3.l<? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m835ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString, v3.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, v3.l, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m836ClickableText4YKlhWE(@p4.l androidx.compose.ui.text.AnnotatedString r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.ui.text.TextStyle r26, boolean r27, int r28, int r29, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r30, @p4.l v3.l<? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m836ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, v3.l, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j5) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m837containsWithinBoundsUv8p0NA(multiParagraph, j5)) {
            multiParagraph = null;
        }
        if (multiParagraph == null) {
            return null;
        }
        return Integer.valueOf(multiParagraph.m5422getOffsetForPositionk4lQ0M(j5));
    }

    /* renamed from: containsWithinBounds-Uv8p0NA, reason: not valid java name */
    private static final boolean m837containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j5) {
        float m3483component1impl = Offset.m3483component1impl(j5);
        float m3484component2impl = Offset.m3484component2impl(j5);
        return m3483component1impl > 0.0f && m3484component2impl >= 0.0f && m3483component1impl <= multiParagraph.getWidth() && m3484component2impl <= multiParagraph.getHeight();
    }
}
