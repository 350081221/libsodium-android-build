package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import t0.b;

@i0(d1 = {"\u0000j\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aî\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\"\u0010#\u001aî\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\"\u0010%\u001aä\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\"\u0010&\u001aä\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\"\u0010'¨\u0006*²\u0006\u000e\u0010(\u001a\u00020$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/v0;", "name", "innerTextField", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,400:1\n25#2:401\n25#2:408\n36#2:421\n25#2:434\n25#2:447\n25#2:454\n1116#3,6:402\n1116#3,6:409\n1116#3,6:415\n1116#3,6:422\n1116#3,6:428\n1116#3,6:435\n1116#3,6:441\n1116#3,6:448\n1116#3,6:455\n81#4:461\n107#4,2:462\n81#4:464\n107#4,2:465\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n142#1:401\n149#1:408\n164#1:421\n292#1:434\n336#1:447\n376#1:454\n142#1:402,6\n149#1:409,6\n155#1:415,6\n164#1:422,6\n168#1:428,6\n292#1:435,6\n299#1:441,6\n336#1:448,6\n376#1:455,6\n149#1:461\n149#1:462,2\n164#1:464\n164#1:465,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0404  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@p4.l java.lang.String r41, @p4.l v3.l<? super java.lang.String, kotlin.r2> r42, @p4.m androidx.compose.ui.Modifier r43, boolean r44, boolean r45, @p4.m androidx.compose.ui.text.TextStyle r46, @p4.m androidx.compose.foundation.text.KeyboardOptions r47, @p4.m androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, @p4.m androidx.compose.ui.text.input.VisualTransformation r52, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r53, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r54, @p4.m androidx.compose.ui.graphics.Brush r55, @p4.m v3.q<? super v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r56, @p4.m androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, v3.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0265  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r37, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, boolean r40, boolean r41, @p4.m androidx.compose.ui.text.TextStyle r42, @p4.m androidx.compose.foundation.text.KeyboardOptions r43, @p4.m androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, @p4.m androidx.compose.ui.text.input.VisualTransformation r48, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r49, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r50, @p4.m androidx.compose.ui.graphics.Brush r51, @p4.m v3.q<? super v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, v3.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031c  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(java.lang.String r41, v3.l r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, v3.l r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, v3.q r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, v3.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031c  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(androidx.compose.ui.text.input.TextFieldValue r41, v3.l r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, v3.l r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, v3.q r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, v3.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
