package androidx.compose.foundation.text2;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text2.input.ImeActionHandler;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aè\u0001\u0010(\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u001728\b\u0002\u0010!\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aÔ\u0001\u0010(\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u001728\b\u0002\u0010!\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0010\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\"\u00101\u001a\u00020\u00032\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b/H\u0003¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068²\u0006\u000e\u00107\u001a\u0002068\n@\nX\u008a\u008e\u0002"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/text2/input/ImeActionHandler;", "onSubmit", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/foundation/text2/input/TextObfuscationMode;", "textObfuscationMode", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "", "enabled", "Landroidx/compose/foundation/text2/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/v0;", "name", "getResult", "Lkotlin/u;", "onTextLayout", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/ScrollState;", "scrollState", "BasicSecureTextField-TLP4tmw", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/p;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "BasicSecureTextField", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "BasicSecureTextField-mMrxcSU", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/p;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/KeyboardActions;", "KeyboardActions", "Landroidx/compose/runtime/Composable;", "content", "DisableCutCopy", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "J", "Landroidx/compose/ui/text/input/TextFieldValue;", "valueWithSelection", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,523:1\n25#2:524\n25#2:531\n25#2:548\n36#2:559\n36#2:567\n1116#3,6:525\n1116#3,6:532\n1116#3,6:538\n1116#3,3:549\n1119#3,3:555\n1116#3,6:560\n1116#3,6:568\n487#4,4:544\n491#4,2:552\n495#4:558\n487#5:554\n74#6:566\n81#7:574\n107#7,2:575\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n*L\n159#1:524\n169#1:531\n282#1:548\n283#1:559\n493#1:567\n159#1:525,6\n169#1:532,6\n184#1:538,6\n282#1:549,3\n282#1:555,3\n283#1:560,6\n493#1:568,6\n282#1:544,4\n282#1:552,2\n282#1:558\n282#1:554\n492#1:566\n169#1:574\n169#1:575,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0248  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-TLP4tmw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1060BasicSecureTextFieldTLP4tmw(@p4.l java.lang.String r37, @p4.l v3.l<? super java.lang.String, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, @p4.m androidx.compose.foundation.text2.input.ImeActionHandler r40, int r41, int r42, int r43, boolean r44, @p4.m androidx.compose.foundation.text2.input.InputTransformation r45, @p4.m androidx.compose.ui.text.TextStyle r46, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r47, @p4.m androidx.compose.ui.graphics.Brush r48, @p4.m v3.p<? super androidx.compose.ui.unit.Density, ? super v3.a<androidx.compose.ui.text.TextLayoutResult>, kotlin.r2> r49, @p4.m androidx.compose.foundation.text2.TextFieldDecorator r50, @p4.m androidx.compose.foundation.ScrollState r51, @p4.m androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.BasicSecureTextFieldKt.m1060BasicSecureTextFieldTLP4tmw(java.lang.String, v3.l, androidx.compose.ui.Modifier, androidx.compose.foundation.text2.input.ImeActionHandler, int, int, int, boolean, androidx.compose.foundation.text2.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.p, androidx.compose.foundation.text2.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ac, code lost:
    
        if (r1.changed(r50) == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034c  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.lang.Object, androidx.compose.foundation.text2.TextFieldDecorator] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-mMrxcSU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1061BasicSecureTextFieldmMrxcSU(@p4.l androidx.compose.foundation.text2.input.TextFieldState r37, @p4.m androidx.compose.ui.Modifier r38, @p4.m androidx.compose.foundation.text2.input.ImeActionHandler r39, int r40, int r41, int r42, boolean r43, @p4.m androidx.compose.foundation.text2.input.InputTransformation r44, @p4.m androidx.compose.ui.text.TextStyle r45, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r46, @p4.m androidx.compose.ui.graphics.Brush r47, @p4.m v3.p<? super androidx.compose.ui.unit.Density, ? super v3.a<androidx.compose.ui.text.TextLayoutResult>, kotlin.r2> r48, @p4.m androidx.compose.foundation.text2.TextFieldDecorator r49, @p4.m androidx.compose.foundation.ScrollState r50, @p4.m androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.BasicSecureTextFieldKt.m1061BasicSecureTextFieldmMrxcSU(androidx.compose.foundation.text2.input.TextFieldState, androidx.compose.ui.Modifier, androidx.compose.foundation.text2.input.ImeActionHandler, int, int, int, boolean, androidx.compose.foundation.text2.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.p, androidx.compose.foundation.text2.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DisableCutCopy(p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(930154034);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(930154034, i6, -1, "androidx.compose.foundation.text2.DisableCutCopy (BasicSecureTextField.kt:490)");
            }
            final TextToolbar textToolbar = (TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(textToolbar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.$$delegate_0 = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    @l
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(@l Rect rect, @m v3.a<r2> aVar, @m v3.a<r2> aVar2, @m v3.a<r2> aVar3, @m v3.a<r2> aVar4) {
                        TextToolbar.this.showMenu(rect, null, aVar2, null, aVar4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) rememberedValue), ComposableLambdaKt.composableLambda(startRestartGroup, -1741121166, true, new BasicSecureTextFieldKt$DisableCutCopy$1(pVar)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicSecureTextFieldKt$DisableCutCopy$2(pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardActions KeyboardActions(ImeActionHandler imeActionHandler) {
        return new KeyboardActions(new BasicSecureTextFieldKt$KeyboardActions$1(imeActionHandler), new BasicSecureTextFieldKt$KeyboardActions$2(imeActionHandler), new BasicSecureTextFieldKt$KeyboardActions$3(imeActionHandler), new BasicSecureTextFieldKt$KeyboardActions$4(imeActionHandler), new BasicSecureTextFieldKt$KeyboardActions$5(imeActionHandler), new BasicSecureTextFieldKt$KeyboardActions$6(imeActionHandler));
    }
}
