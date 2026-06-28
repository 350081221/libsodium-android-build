package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a`\u0010\u0015\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0016\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001al\u0010&\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001al\u0010(\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010%\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010%\u001aj\u0010-\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u008e\u0001\u00108\u001a\u00020\t2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010/\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u00103\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109\u001a \u0010>\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020:H\u0002\u001a>\u0010E\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020:0\b2\u0006\u0010B\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u0014\u0010F\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010G\"\u0014\u0010I\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010G\"\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020:0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material3/DrawerValue;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "content", "ModalNavigationDrawer-FHprtrg", "(Lv3/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLv3/p;Landroidx/compose/runtime/Composer;II)V", "ModalNavigationDrawer", "DismissibleNavigationDrawer", "(Lv3/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLv3/p;Landroidx/compose/runtime/Composer;II)V", "PermanentNavigationDrawer", "(Lv3/p;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/Dp;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "ModalDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "DismissibleDrawerSheet-afqeVBk", "DismissibleDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentDrawerSheet", "DrawerSheet-vywBR7E", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLv3/q;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", TTDownloadField.TT_LABEL, "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationDrawerItem", "(Lv3/p;ZLv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "", bi.ay, "b", "pos", "calculateFraction", "open", "onClose", "fraction", TypedValues.Custom.S_COLOR, "Scrim-Bx497Mc", "(ZLv3/a;Lv3/a;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "DrawerPositionalThreshold", "F", "DrawerVelocityThreshold", "MinimumDrawerWidth", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,948:1\n1116#2,6:949\n1116#2,3:960\n1119#2,3:966\n1116#2,6:973\n1116#2,6:1056\n1116#2,6:1062\n1116#2,6:1068\n1116#2,6:1074\n1116#2,6:1126\n1116#2,3:1137\n1119#2,3:1143\n1116#2,6:1184\n1116#2,6:1221\n1116#2,6:1399\n1116#2,6:1405\n1116#2,6:1412\n1116#2,6:1418\n1116#2,6:1424\n487#3,4:955\n491#3,2:963\n495#3:969\n487#3,4:1132\n491#3,2:1140\n495#3:1146\n25#4:959\n456#4,8:997\n464#4,3:1011\n456#4,8:1033\n464#4,3:1047\n467#4,3:1051\n456#4,8:1097\n464#4,3:1111\n467#4,3:1115\n467#4,3:1120\n25#4:1136\n456#4,8:1166\n464#4,3:1180\n456#4,8:1204\n464#4,3:1218\n456#4,8:1244\n464#4,3:1258\n467#4,3:1262\n456#4,8:1285\n464#4,3:1299\n467#4,3:1303\n467#4,3:1308\n467#4,3:1312\n456#4,8:1334\n464#4,3:1348\n456#4,8:1370\n464#4,3:1384\n467#4,3:1388\n467#4,3:1393\n487#5:965\n487#5:1142\n162#6:970\n162#6:1147\n162#6:1398\n163#6:1411\n74#7:971\n74#7:979\n74#7:1125\n74#7:1148\n1#8:972\n68#9,6:980\n74#9:1014\n67#9,7:1015\n74#9:1050\n78#9:1055\n68#9,6:1080\n74#9:1114\n78#9:1119\n78#9:1124\n68#9,6:1149\n74#9:1183\n68#9,6:1227\n74#9:1261\n78#9:1266\n67#9,7:1267\n74#9:1302\n78#9:1307\n78#9:1316\n67#9,7:1352\n74#9:1387\n78#9:1392\n78#10,11:986\n78#10,11:1022\n91#10:1054\n78#10,11:1086\n91#10:1118\n91#10:1123\n78#10,11:1155\n75#10,14:1190\n78#10,11:1233\n91#10:1265\n78#10,11:1274\n91#10:1306\n91#10:1311\n91#10:1315\n78#10,11:1323\n78#10,11:1359\n91#10:1391\n91#10:1396\n3737#11,6:1005\n3737#11,6:1041\n3737#11,6:1105\n3737#11,6:1174\n3737#11,6:1212\n3737#11,6:1252\n3737#11,6:1293\n3737#11,6:1342\n3737#11,6:1378\n87#12,6:1317\n93#12:1351\n97#12:1397\n154#13:1430\n154#13:1431\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n281#1:949,6\n315#1:960,3\n315#1:966,3\n321#1:973,6\n347#1:1056,6\n355#1:1062,6\n362#1:1068,6\n369#1:1074,6\n423#1:1126,6\n433#1:1137,3\n433#1:1143,3\n465#1:1184,6\n447#1:1221,6\n613#1:1399,6\n732#1:1405,6\n923#1:1412,6\n924#1:1418,6\n936#1:1424,6\n315#1:955,4\n315#1:963,2\n315#1:969\n433#1:1132,4\n433#1:1140,2\n433#1:1146\n315#1:959\n332#1:997,8\n332#1:1011,3\n342#1:1033,8\n342#1:1047,3\n342#1:1051,3\n360#1:1097,8\n360#1:1111,3\n360#1:1115,3\n332#1:1120,3\n433#1:1136\n437#1:1166,8\n437#1:1180,3\n446#1:1204,8\n446#1:1218,3\n447#1:1244,8\n447#1:1258,3\n447#1:1262,3\n462#1:1285,8\n462#1:1299,3\n462#1:1303,3\n446#1:1308,3\n437#1:1312,3\n502#1:1334,8\n502#1:1348,3\n504#1:1370,8\n504#1:1384,3\n504#1:1388,3\n502#1:1393,3\n315#1:965\n433#1:1142\n316#1:970\n434#1:1147\n610#1:1398\n920#1:1411\n317#1:971\n331#1:979\n417#1:1125\n436#1:1148\n332#1:980,6\n332#1:1014\n342#1:1015,7\n342#1:1050\n342#1:1055\n360#1:1080,6\n360#1:1114\n360#1:1119\n332#1:1124\n437#1:1149,6\n437#1:1183\n447#1:1227,6\n447#1:1261\n447#1:1266\n462#1:1267,7\n462#1:1302\n462#1:1307\n437#1:1316\n504#1:1352,7\n504#1:1387\n504#1:1392\n332#1:986,11\n342#1:1022,11\n342#1:1054\n360#1:1086,11\n360#1:1118\n332#1:1123\n437#1:1155,11\n446#1:1190,14\n447#1:1233,11\n447#1:1265\n462#1:1274,11\n462#1:1306\n446#1:1311\n437#1:1315\n502#1:1323,11\n504#1:1359,11\n504#1:1391\n502#1:1396\n332#1:1005,6\n342#1:1041,6\n360#1:1105,6\n437#1:1174,6\n446#1:1212,6\n447#1:1252,6\n462#1:1293,6\n502#1:1342,6\n504#1:1378,6\n502#1:1317,6\n502#1:1351\n502#1:1397\n942#1:1430\n943#1:1431\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m6044constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m6044constructorimpl(240);

    @p4.l
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:107:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0080  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DismissibleDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2025DismissibleDrawerSheetafqeVBk(@p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, @p4.m androidx.compose.foundation.layout.WindowInsets r32, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2025DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0358  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DismissibleNavigationDrawer(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.material3.DrawerState r26, boolean r27, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(v3.p, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0075  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DrawerSheet-vywBR7E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2026DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, float r33, v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2026DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ba  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2027ModalDrawerSheetafqeVBk(@p4.m androidx.compose.ui.Modifier r23, @p4.m androidx.compose.ui.graphics.Shape r24, long r25, long r27, float r29, @p4.m androidx.compose.foundation.layout.WindowInsets r30, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2027ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalNavigationDrawer-FHprtrg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2028ModalNavigationDrawerFHprtrg(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.material3.DrawerState r30, boolean r31, long r32, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2028ModalNavigationDrawerFHprtrg(v3.p, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationDrawerItem(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, boolean r36, @p4.l v3.a<kotlin.r2> r37, @p4.m androidx.compose.ui.Modifier r38, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, @p4.m androidx.compose.ui.graphics.Shape r41, @p4.m androidx.compose.material3.NavigationDrawerItemColors r42, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r43, @p4.m androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(v3.p, boolean, v3.a, androidx.compose.ui.Modifier, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ba  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PermanentDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2029PermanentDrawerSheetafqeVBk(@p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, @p4.m androidx.compose.foundation.layout.WindowInsets r32, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2029PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PermanentNavigationDrawer(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r16, @p4.m androidx.compose.ui.Modifier r17, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r18, @p4.m androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer(v3.p, androidx.compose.ui.Modifier, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc */
    public static final void m2030ScrimBx497Mc(boolean z4, v3.a<r2> aVar, v3.a<Float> aVar2, long j5, Composer composer, int i5) {
        int i6;
        Modifier modifier;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(j5)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if ((i6 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i6, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:918)");
            }
            Strings.Companion companion = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1858700652);
            boolean z8 = true;
            if (z4) {
                Modifier.Companion companion2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(-1858700588);
                int i11 = i6 & 112;
                if (i11 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(aVar, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, aVar, (v3.p<? super PointerInputScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(-1858700504);
                boolean changed = startRestartGroup.changed(m2294getStringNWtq28);
                if (i11 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z9 = z7 | changed;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(m2294getStringNWtq28, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (v3.l) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
            startRestartGroup.startReplaceableGroup(-1858700263);
            if ((i6 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 896) != 256) {
                z8 = false;
            }
            boolean z10 = z5 | z8;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new NavigationDrawerKt$Scrim$1$1(j5, aVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (v3.l) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationDrawerKt$Scrim$2(z4, aVar, aVar2, j5, i5));
        }
    }

    public static final /* synthetic */ float access$getDrawerPositionalThreshold$p() {
        return DrawerPositionalThreshold;
    }

    public static final float calculateFraction(float f5, float f6, float f7) {
        float H;
        H = kotlin.ranges.u.H((f7 - f5) / (f6 - f5), 0.0f, 1.0f);
        return H;
    }

    @p4.l
    @Composable
    public static final DrawerState rememberDrawerState(@p4.l DrawerValue drawerValue, @p4.m v3.l<? super DrawerValue, Boolean> lVar, @p4.m Composer composer, int i5, int i6) {
        boolean z4;
        composer.startReplaceableGroup(2098699222);
        if ((i6 & 2) != 0) {
            lVar = NavigationDrawerKt$rememberDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i5, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:279)");
        }
        boolean z5 = false;
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(lVar);
        composer.startReplaceableGroup(-21510967);
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i5 & 48) == 32) {
            z5 = true;
        }
        boolean z6 = z4 | z5;
        Object rememberedValue = composer.rememberedValue();
        if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NavigationDrawerKt$rememberDrawerState$2$1(drawerValue, lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
