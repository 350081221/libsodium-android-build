package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001að\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001123\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\"\u0010#\u001a2\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020$H\u0002\u001a \u0010/\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0011H\u0002\u001a0\u00104\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u000202H\u0002\u001a\u0010\u00105\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0002\u001a4\u0010:\u001a\u00020\u0003*\u0002062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0080@¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010=\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010<\u001a\u00020\u0011H\u0003¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010?\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b?\u0010@\u001a \u0010A\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002\u001a\u0010\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0000\"\u0014\u0010E\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H²\u0006\f\u0010G\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/v0;", "name", "innerTextField", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLv3/q;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", "CoreTextFieldRootBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "previewKeyEventToDeselectOnBack", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", "tapToFocus", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "startInputSession", "endInputSession", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/d;)Ljava/lang/Object;", "show", "SelectionToolbarAndHandles", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "isWindowFocusedBehindFlag", "USE_WINDOW_FOCUS_ENABLED", "Z", "writeable", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1195:1\n25#2:1196\n50#2:1216\n49#2:1217\n36#2:1224\n25#2:1231\n25#2:1238\n25#2:1252\n25#2:1263\n456#2,8:1287\n464#2,3:1301\n467#2,3:1307\n36#2:1313\n1116#3,6:1197\n1116#3,6:1210\n1116#3,6:1218\n1116#3,6:1225\n1116#3,6:1232\n1116#3,6:1239\n1116#3,3:1253\n1119#3,3:1259\n1116#3,6:1264\n1116#3,6:1314\n1116#3,6:1321\n74#4:1203\n74#4:1204\n74#4:1205\n74#4:1206\n74#4:1207\n74#4:1208\n74#4:1209\n74#4:1245\n74#4:1246\n74#4:1247\n74#4:1320\n487#5,4:1248\n491#5,2:1256\n495#5:1262\n487#6:1258\n68#7,6:1270\n74#7:1304\n78#7:1311\n79#8,11:1276\n92#8:1310\n3737#9,6:1295\n30#10,2:1305\n1#11:1312\n495#12,4:1327\n500#12:1336\n129#13,5:1331\n81#14:1337\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n215#1:1196\n236#1:1216\n236#1:1217\n249#1:1224\n278#1:1231\n281#1:1238\n293#1:1252\n294#1:1263\n748#1:1287,8\n748#1:1301,3\n748#1:1307,3\n1128#1:1313\n215#1:1197,6\n233#1:1210,6\n236#1:1218,6\n249#1:1225,6\n278#1:1232,6\n281#1:1239,6\n293#1:1253,3\n293#1:1259,3\n294#1:1264,6\n1128#1:1314,6\n1145#1:1321,6\n219#1:1203\n220#1:1204\n221#1:1205\n222#1:1206\n223#1:1207\n224#1:1208\n225#1:1209\n287#1:1245\n288#1:1246\n289#1:1247\n1129#1:1320\n293#1:1248,4\n293#1:1256,2\n293#1:1262\n293#1:1258\n748#1:1270,6\n748#1:1304\n748#1:1311\n748#1:1276,11\n748#1:1310\n748#1:1295,6\n749#1:1305,2\n1175#1:1327,4\n1175#1:1336\n1175#1:1331,5\n345#1:1337\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    public static final boolean USE_WINDOW_FOCUS_ENABLED = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x067e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x040e  */
    /* JADX WARN: Type inference failed for: r0v43, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CoreTextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r49, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r50, @p4.m androidx.compose.ui.Modifier r51, @p4.m androidx.compose.ui.text.TextStyle r52, @p4.m androidx.compose.ui.text.input.VisualTransformation r53, @p4.m v3.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.r2> r54, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r55, @p4.m androidx.compose.ui.graphics.Brush r56, boolean r57, int r58, int r59, @p4.m androidx.compose.ui.text.input.ImeOptions r60, @p4.m androidx.compose.foundation.text.KeyboardActions r61, boolean r62, boolean r63, @p4.m v3.q<? super v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r64, @p4.m androidx.compose.runtime.Composer r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, v3.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i5, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        int i6 = (i5 & 14) | 384;
        startRestartGroup.startReplaceableGroup(733328855);
        int i7 = i6 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, (i7 & 112) | (i7 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1985516685);
        pVar.invoke(startRestartGroup, Integer.valueOf(((((i5 >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z4, Composer composer, int i5) {
        boolean z5;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        boolean z6;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i5, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z4) {
            TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            TextLayoutResult textLayoutResult = null;
            boolean z7 = true;
            if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    z6 = state$foundation_release2.isLayoutResultStale();
                } else {
                    z6 = true;
                }
                if (!z6) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m5539getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m5783getSelectiond9O1mEE())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5545getStartimpl(textFieldSelectionManager.getValue$foundation_release().m5783getSelectiond9O1mEE()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5540getEndimpl(textFieldSelectionManager.getValue$foundation_release().m5783getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498386756);
                    TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release3 != null && state$foundation_release3.getShowSelectionHandleStart()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release4 == null || !state$foundation_release4.getShowSelectionHandleEnd()) {
                        z7 = false;
                    }
                    if (z7) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state$foundation_release5.setShowFloatingToolbar(false);
                    }
                    if (state$foundation_release5.getHasFocus()) {
                        if (state$foundation_release5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextFieldCursorHandle(@p4.l androidx.compose.foundation.text.selection.TextFieldSelectionManager r8, @p4.m androidx.compose.runtime.Composer r9, int r10) {
        /*
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            androidx.compose.runtime.Composer r9 = r9.startRestartGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L13
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r2)
        L13:
            androidx.compose.foundation.text.TextFieldState r0 = r8.getState$foundation_release()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            boolean r0 = r0.getShowCursorHandle()
            if (r0 != r1) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto Lac
            androidx.compose.ui.text.AnnotatedString r0 = r8.getTransformedText$foundation_release()
            if (r0 == 0) goto L39
            int r0 = r0.length()
            if (r0 <= 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != r1) goto L39
            r0 = r1
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto Lac
            r0 = 1157296644(0x44faf204, float:2007.563)
            r9.startReplaceableGroup(r0)
            boolean r0 = r9.changed(r8)
            java.lang.Object r3 = r9.rememberedValue()
            if (r0 != 0) goto L54
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r3 != r0) goto L5b
        L54:
            androidx.compose.foundation.text.TextDragObserver r3 = r8.cursorDragObserver$foundation_release()
            r9.updateRememberedValue(r3)
        L5b:
            r9.endReplaceableGroup()
            androidx.compose.foundation.text.TextDragObserver r3 = (androidx.compose.foundation.text.TextDragObserver) r3
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r9.consume(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            long r4 = r8.m1052getCursorPositiontuRUvjQ$foundation_release(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1
            r7 = 0
            r6.<init>(r3, r8, r7)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(r0, r3, r6)
            r3 = 294220498(0x118972d2, float:2.1685552E-28)
            r9.startReplaceableGroup(r3)
            boolean r3 = r9.changed(r4)
            java.lang.Object r6 = r9.rememberedValue()
            if (r3 != 0) goto L92
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r6 != r3) goto L9a
        L92:
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
            r6.<init>(r4)
            r9.updateRememberedValue(r6)
        L9a:
            v3.l r6 = (v3.l) r6
            r9.endReplaceableGroup()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r0, r2, r6, r1, r7)
            r0 = 0
            r6 = 384(0x180, float:5.38E-43)
            r1 = r4
            r4 = r0
            r5 = r9
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.m826CursorHandleULxng0E(r1, r3, r4, r5, r6)
        Lac:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lb5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb5:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 == 0) goto Lc3
            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
            r0.<init>(r8, r10)
            r9.updateScope(r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    @m
    public static final Object bringSelectionEndIntoView(@l BringIntoViewRequester bringIntoViewRequester, @l TextFieldValue textFieldValue, @l TextDelegate textDelegate, @l TextLayoutResult textLayoutResult, @l OffsetMapping offsetMapping, @l d<? super r2> dVar) {
        Rect rect;
        Object l5;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m6213getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (bringIntoView == l5) {
            return bringIntoView;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final boolean isWindowFocusedBehindFlag(@l WindowInfo windowInfo) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                r2 r2Var = r2.f19517a;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z4) {
        SoftwareKeyboardController keyboardController;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (z4 && (keyboardController = textFieldState.getKeyboardController()) != null) {
            keyboardController.show();
        }
    }
}
