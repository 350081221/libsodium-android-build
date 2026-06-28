package com.yuanqi.master.tools;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ClearKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.yqtech.multiapp.R;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\n\u001a1\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ak\u0010\u001a\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010#\u001a.\u0010$\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010&\u001aC\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\b¢\u0006\u0002\b*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010+\u001a\u001d\u0010,\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010.\u001a+\u0010/\u001a\u00020\u00012\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\b¢\u0006\u0002\b*H\u0007¢\u0006\u0002\u00101\u001a/\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000105H\u0007¢\u0006\u0002\u00107\u001ac\u00108\u001a\u00020\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u00152\b\b\u0002\u0010?\u001a\u00020\u00152\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010!H\u0007¢\u0006\u0002\u0010@\u001a\u001d\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010.\u001a#\u0010D\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010F\u001aL\u0010G\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010H\u001a\u00020\u00052\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010I\u001a7\u0010J\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00152\b\b\u0002\u0010L\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010M\u001ag\u0010N\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020\u000e2\b\b\u0002\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020R2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010V\u001ag\u0010W\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020\u000e2\b\b\u0002\u0010Q\u001a\u00020R2\b\b\u0002\u0010X\u001a\u00020R2\b\b\u0002\u0010Y\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020R2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[\u001a\u0015\u0010\\\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010]\u001a%\u0010^\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010_\u001a3\u0010`\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u00152\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006d"}, d2 = {"AboutItem", "", "imageId", "", com.alipay.sdk.m.x.d.f3030v, "", "note", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "clickAction", "(ILjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BaseText", "text", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "BaseText-g5HRv50", "(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;II)V", "BaseTextPlus", "isBold", "", "modifier", "Landroidx/compose/ui/Modifier;", "BaseTextPlus-1vCVg1Y", "(Ljava/lang/String;JJZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CodeInputView", ServiceManagerNative.ACCOUNT, "Landroidx/compose/runtime/MutableState;", "accountError", PluginConstants.KEY_ERROR_CODE, "countDown", k0.c.f19046j, "Lkotlin/Function1;", "action", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomTitleBar", "navigationClick", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CustomTopBar", "actions", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DeviceInfoItem", "content", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "GradientBox", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "HistoryItem", "history", "Lcom/yuanqi/master/database/model/History;", "Lkotlin/Function2;", "", "(Lcom/yuanqi/master/database/model/History;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "InputText", "str", "placeholder", "isPwd", "fillWith", "", "isNumber", "isEnable", "(Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZFZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InviteItem", "user", "datetime", "LinkText", "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ManagerItem", "subTitle", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PermissionItem", "hasPermission", "isNeedPermission", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RoundedButton", "bgColor", "textColor", "radius", "Landroidx/compose/ui/unit/Dp;", "horizontalMargins", "verticalMargins", "RoundedButton-J1SLt1o", "(Ljava/lang/String;JJFFFJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SmallRoundedButton", "width", "height", "SmallRoundedButton-X-ecE8g", "(Ljava/lang/String;JJFFFFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TipText", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "VipRightsItem", "(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "VipRightsPackageItem", "price", "isSelected", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nBaseCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,806:1\n154#2:807\n154#2:848\n154#2:849\n154#2:850\n154#2:851\n154#2:886\n154#2:939\n154#2:940\n154#2:941\n154#2:942\n154#2:977\n154#2:1013\n154#2:1014\n154#2:1015\n154#2:1016\n154#2:1027\n154#2:1063\n154#2:1064\n154#2:1100\n154#2:1118\n154#2:1119\n154#2:1120\n154#2:1191\n154#2:1227\n154#2:1228\n154#2:1229\n154#2:1230\n154#2:1231\n154#2:1247\n154#2:1248\n154#2:1283\n154#2:1329\n164#2:1330\n154#2:1331\n154#2:1374\n154#2:1375\n154#2:1376\n164#2:1408\n154#2:1419\n154#2:1420\n154#2:1492\n154#2:1493\n154#2:1494\n154#2:1495\n154#2:1531\n154#2:1532\n154#2:1555\n154#2:1556\n154#2:1557\n154#2:1628\n154#2:1664\n154#2:1665\n154#2:1666\n154#2:1682\n154#2:1683\n154#2:1684\n154#2:1685\n154#2:1686\n154#2:1687\n154#2:1688\n154#2:1689\n154#2:1690\n154#2:1748\n154#2:1749\n154#2:1750\n154#2:1761\n154#2:1828\n154#2:1829\n154#2:1865\n154#2:1876\n154#2:1877\n154#2:1920\n68#3,6:808\n74#3:842\n78#3:847\n69#3,5:852\n74#3:885\n78#3:931\n69#3,5:943\n74#3:976\n78#3:1026\n69#3,5:1121\n74#3:1154\n78#3:1246\n69#3,5:1249\n74#3:1282\n78#3:1328\n68#3,6:1339\n74#3:1373\n78#3:1418\n68#3,6:1421\n74#3:1455\n78#3:1547\n69#3,5:1558\n74#3:1591\n78#3:1681\n68#3,6:1762\n74#3:1796\n78#3:1801\n69#3,5:1886\n74#3:1919\n78#3:1925\n79#4,11:814\n92#4:846\n79#4,11:857\n79#4,11:893\n92#4:925\n92#4:930\n79#4,11:948\n79#4,11:984\n92#4:1020\n92#4:1025\n79#4,11:1034\n79#4,11:1071\n92#4:1104\n92#4:1109\n79#4,11:1126\n79#4,11:1162\n79#4,11:1198\n92#4:1235\n92#4:1240\n92#4:1245\n79#4,11:1254\n79#4,11:1290\n92#4:1322\n92#4:1327\n79#4,11:1345\n79#4,11:1379\n92#4:1412\n92#4:1417\n79#4,11:1427\n79#4,11:1463\n79#4,11:1502\n92#4:1536\n92#4:1541\n92#4:1546\n79#4,11:1563\n79#4,11:1599\n79#4,11:1635\n92#4:1670\n92#4:1675\n92#4:1680\n79#4,11:1719\n79#4,11:1768\n92#4:1800\n92#4:1805\n79#4,11:1836\n79#4,11:1891\n92#4:1924\n92#4:1929\n456#5,8:825\n464#5,3:839\n467#5,3:843\n456#5,8:868\n464#5,3:882\n456#5,8:904\n464#5,3:918\n467#5,3:922\n467#5,3:927\n36#5:932\n456#5,8:959\n464#5,3:973\n456#5,8:995\n464#5,3:1009\n467#5,3:1017\n467#5,3:1022\n456#5,8:1045\n464#5,3:1059\n456#5,8:1082\n464#5,3:1096\n467#5,3:1101\n467#5,3:1106\n36#5:1111\n456#5,8:1137\n464#5,3:1151\n456#5,8:1173\n464#5,3:1187\n456#5,8:1209\n464#5,3:1223\n467#5,3:1232\n467#5,3:1237\n467#5,3:1242\n456#5,8:1265\n464#5,3:1279\n456#5,8:1301\n464#5,3:1315\n467#5,3:1319\n467#5,3:1324\n36#5:1332\n456#5,8:1356\n464#5,3:1370\n456#5,8:1390\n464#5,3:1404\n467#5,3:1409\n467#5,3:1414\n456#5,8:1438\n464#5,3:1452\n456#5,8:1474\n464#5,3:1488\n456#5,8:1513\n464#5,3:1527\n467#5,3:1533\n467#5,3:1538\n467#5,3:1543\n36#5:1548\n456#5,8:1574\n464#5,3:1588\n456#5,8:1610\n464#5,3:1624\n456#5,8:1646\n464#5,3:1660\n467#5,3:1667\n467#5,3:1672\n467#5,3:1677\n36#5:1691\n25#5:1698\n25#5:1705\n456#5,8:1730\n464#5,3:1744\n67#5,3:1751\n66#5:1754\n456#5,8:1779\n464#5,3:1793\n467#5,3:1797\n467#5,3:1802\n25#5:1807\n25#5:1814\n25#5:1821\n456#5,8:1847\n464#5,3:1861\n67#5,3:1866\n66#5:1869\n50#5:1878\n49#5:1879\n456#5,8:1902\n464#5,3:1916\n467#5,3:1921\n467#5,3:1926\n3737#6,6:833\n3737#6,6:876\n3737#6,6:912\n3737#6,6:967\n3737#6,6:1003\n3737#6,6:1053\n3737#6,6:1090\n3737#6,6:1145\n3737#6,6:1181\n3737#6,6:1217\n3737#6,6:1273\n3737#6,6:1309\n3737#6,6:1364\n3737#6,6:1398\n3737#6,6:1446\n3737#6,6:1482\n3737#6,6:1521\n3737#6,6:1582\n3737#6,6:1618\n3737#6,6:1654\n3737#6,6:1738\n3737#6,6:1787\n3737#6,6:1855\n3737#6,6:1910\n87#7,6:887\n93#7:921\n97#7:926\n87#7,6:978\n93#7:1012\n97#7:1021\n87#7,6:1028\n93#7:1062\n97#7:1110\n87#7,6:1192\n93#7:1226\n97#7:1236\n87#7,6:1284\n93#7:1318\n97#7:1323\n86#7,7:1456\n93#7:1491\n97#7:1542\n87#7,6:1629\n93#7:1663\n97#7:1671\n87#7,6:1830\n93#7:1864\n97#7:1930\n1116#8,6:933\n1116#8,6:1112\n1116#8,6:1333\n1116#8,6:1549\n1116#8,6:1692\n1116#8,6:1699\n1116#8,6:1706\n1116#8,6:1755\n1116#8,6:1808\n1116#8,6:1815\n1116#8,6:1822\n1116#8,6:1870\n1116#8,6:1880\n74#9,6:1065\n80#9:1099\n84#9:1105\n73#9,7:1155\n80#9:1190\n84#9:1241\n78#9,2:1377\n80#9:1407\n84#9:1413\n74#9,6:1496\n80#9:1530\n84#9:1537\n73#9,7:1592\n80#9:1627\n84#9:1676\n73#9,7:1712\n80#9:1747\n84#9:1806\n*S KotlinDebug\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt\n*L\n94#1:807\n175#1:848\n176#1:849\n177#1:850\n179#1:851\n183#1:886\n205#1:939\n206#1:940\n207#1:941\n209#1:942\n212#1:977\n218#1:1013\n221#1:1014\n229#1:1015\n234#1:1016\n250#1:1027\n253#1:1063\n258#1:1064\n265#1:1100\n282#1:1118\n283#1:1119\n284#1:1120\n289#1:1191\n295#1:1227\n297#1:1228\n300#1:1229\n303#1:1230\n309#1:1231\n344#1:1247\n345#1:1248\n350#1:1283\n373#1:1329\n375#1:1330\n375#1:1331\n381#1:1374\n382#1:1375\n383#1:1376\n393#1:1408\n413#1:1419\n414#1:1420\n419#1:1492\n423#1:1493\n425#1:1494\n426#1:1495\n430#1:1531\n434#1:1532\n458#1:1555\n459#1:1556\n460#1:1557\n466#1:1628\n476#1:1664\n489#1:1665\n494#1:1666\n511#1:1682\n512#1:1683\n513#1:1684\n521#1:1685\n536#1:1686\n537#1:1687\n538#1:1688\n539#1:1689\n564#1:1690\n604#1:1748\n605#1:1749\n607#1:1750\n671#1:1761\n702#1:1828\n703#1:1829\n711#1:1865\n750#1:1876\n752#1:1877\n777#1:1920\n152#1:808,6\n152#1:842\n152#1:847\n172#1:852,5\n172#1:885\n172#1:931\n200#1:943,5\n200#1:976\n200#1:1026\n277#1:1121,5\n277#1:1154\n277#1:1246\n341#1:1249,5\n341#1:1282\n341#1:1328\n371#1:1339,6\n371#1:1373\n371#1:1418\n410#1:1421,6\n410#1:1455\n410#1:1547\n453#1:1558,5\n453#1:1591\n453#1:1681\n668#1:1762,6\n668#1:1796\n668#1:1801\n748#1:1886,5\n748#1:1919\n748#1:1925\n152#1:814,11\n152#1:846\n172#1:857,11\n182#1:893,11\n182#1:925\n172#1:930\n200#1:948,11\n211#1:984,11\n211#1:1020\n200#1:1025\n246#1:1034,11\n257#1:1071,11\n257#1:1104\n246#1:1109\n277#1:1126,11\n287#1:1162,11\n288#1:1198,11\n288#1:1235\n287#1:1240\n277#1:1245\n341#1:1254,11\n349#1:1290,11\n349#1:1322\n341#1:1327\n371#1:1345,11\n378#1:1379,11\n378#1:1412\n371#1:1417\n410#1:1427,11\n418#1:1463,11\n426#1:1502,11\n426#1:1536\n418#1:1541\n410#1:1546\n453#1:1563,11\n463#1:1599,11\n464#1:1635,11\n464#1:1670\n463#1:1675\n453#1:1680\n600#1:1719,11\n668#1:1768,11\n668#1:1800\n600#1:1805\n699#1:1836,11\n748#1:1891,11\n748#1:1924\n699#1:1929\n152#1:825,8\n152#1:839,3\n152#1:843,3\n172#1:868,8\n172#1:882,3\n182#1:904,8\n182#1:918,3\n182#1:922,3\n172#1:927,3\n202#1:932\n200#1:959,8\n200#1:973,3\n211#1:995,8\n211#1:1009,3\n211#1:1017,3\n200#1:1022,3\n246#1:1045,8\n246#1:1059,3\n257#1:1082,8\n257#1:1096,3\n257#1:1101,3\n246#1:1106,3\n279#1:1111\n277#1:1137,8\n277#1:1151,3\n287#1:1173,8\n287#1:1187,3\n288#1:1209,8\n288#1:1223,3\n288#1:1232,3\n287#1:1237,3\n277#1:1242,3\n341#1:1265,8\n341#1:1279,3\n349#1:1301,8\n349#1:1315,3\n349#1:1319,3\n341#1:1324,3\n376#1:1332\n371#1:1356,8\n371#1:1370,3\n378#1:1390,8\n378#1:1404,3\n378#1:1409,3\n371#1:1414,3\n410#1:1438,8\n410#1:1452,3\n418#1:1474,8\n418#1:1488,3\n426#1:1513,8\n426#1:1527,3\n426#1:1533,3\n418#1:1538,3\n410#1:1543,3\n455#1:1548\n453#1:1574,8\n453#1:1588,3\n463#1:1610,8\n463#1:1624,3\n464#1:1646,8\n464#1:1660,3\n464#1:1667,3\n463#1:1672,3\n453#1:1677,3\n583#1:1691\n593#1:1698\n597#1:1705\n600#1:1730,8\n600#1:1744,3\n651#1:1751,3\n651#1:1754\n668#1:1779,8\n668#1:1793,3\n668#1:1797,3\n600#1:1802,3\n692#1:1807\n696#1:1814\n697#1:1821\n699#1:1847,8\n699#1:1861,3\n714#1:1866,3\n714#1:1869\n754#1:1878\n754#1:1879\n748#1:1902,8\n748#1:1916,3\n748#1:1921,3\n699#1:1926,3\n152#1:833,6\n172#1:876,6\n182#1:912,6\n200#1:967,6\n211#1:1003,6\n246#1:1053,6\n257#1:1090,6\n277#1:1145,6\n287#1:1181,6\n288#1:1217,6\n341#1:1273,6\n349#1:1309,6\n371#1:1364,6\n378#1:1398,6\n410#1:1446,6\n418#1:1482,6\n426#1:1521,6\n453#1:1582,6\n463#1:1618,6\n464#1:1654,6\n600#1:1738,6\n668#1:1787,6\n699#1:1855,6\n748#1:1910,6\n182#1:887,6\n182#1:921\n182#1:926\n211#1:978,6\n211#1:1012\n211#1:1021\n246#1:1028,6\n246#1:1062\n246#1:1110\n288#1:1192,6\n288#1:1226\n288#1:1236\n349#1:1284,6\n349#1:1318\n349#1:1323\n418#1:1456,7\n418#1:1491\n418#1:1542\n464#1:1629,6\n464#1:1663\n464#1:1671\n699#1:1830,6\n699#1:1864\n699#1:1930\n202#1:933,6\n279#1:1112,6\n376#1:1333,6\n455#1:1549,6\n583#1:1692,6\n593#1:1699,6\n597#1:1706,6\n651#1:1755,6\n692#1:1808,6\n696#1:1815,6\n697#1:1822,6\n714#1:1870,6\n754#1:1880,6\n257#1:1065,6\n257#1:1099\n257#1:1105\n287#1:1155,7\n287#1:1190\n287#1:1241\n378#1:1377,2\n378#1:1407\n378#1:1413\n426#1:1496,6\n426#1:1530\n426#1:1537\n463#1:1592,7\n463#1:1627\n463#1:1676\n600#1:1712,7\n600#1:1747\n600#1:1806\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.tools.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0428a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $clickAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0428a(v3.a<r2> aVar) {
            super(0);
            this.$clickAction = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$clickAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ v3.a<r2> $clickAction;
        final /* synthetic */ int $imageId;
        final /* synthetic */ v3.p<Composer, Integer, r2> $note;
        final /* synthetic */ String $subTitle;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(int i5, String str, String str2, v3.p<? super Composer, ? super Integer, r2> pVar, v3.a<r2> aVar, int i6, int i7) {
            super(2);
            this.$imageId = i5;
            this.$title = str;
            this.$subTitle = str2;
            this.$note = pVar;
            this.$clickAction = aVar;
            this.$$changed = i6;
            this.$$default = i7;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.m(this.$imageId, this.$title, this.$subTitle, this.$note, this.$clickAction, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ v3.a<r2> $clickAction;
        final /* synthetic */ int $imageId;
        final /* synthetic */ v3.p<Composer, Integer, r2> $note;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i5, String str, v3.p<? super Composer, ? super Integer, r2> pVar, v3.a<r2> aVar, int i6, int i7) {
            super(2);
            this.$imageId = i5;
            this.$title = str;
            this.$note = pVar;
            this.$clickAction = aVar;
            this.$$changed = i6;
            this.$$default = i7;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.a(this.$imageId, this.$title, this.$note, this.$clickAction, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $clickAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(v3.a<r2> aVar) {
            super(0);
            this.$clickAction = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$clickAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j5, long j6, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$color = j5;
            this.$fontSize = j6;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.b(this.$text, this.$color, this.$fontSize, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ v3.a<r2> $clickAction;
        final /* synthetic */ boolean $hasPermission;
        final /* synthetic */ boolean $isNeedPermission;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, boolean z4, boolean z5, v3.a<r2> aVar, int i5, int i6) {
            super(2);
            this.$title = str;
            this.$hasPermission = z4;
            this.$isNeedPermission = z5;
            this.$clickAction = aVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.n(this.$title, this.$hasPermission, this.$isNeedPermission, this.$clickAction, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ boolean $isBold;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j5, long j6, boolean z4, Modifier modifier, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$color = j5;
            this.$fontSize = j6;
            this.$isBold = z4;
            this.$modifier = modifier;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.c(this.$text, this.$color, this.$fontSize, this.$isBold, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d0 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ String $text;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(String str, long j5, long j6, int i5) {
            super(3);
            this.$text = str;
            this.$textColor = j5;
            this.$fontSize = j6;
            this.$$dirty = i5;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l RowScope Button, @p4.m Composer composer, int i5) {
            kotlin.jvm.internal.l0.p(Button, "$this$Button");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363516333, i5, -1, "com.yuanqi.master.tools.RoundedButton.<anonymous> (BaseCompose.kt:526)");
            }
            String str = this.$text;
            long j5 = this.$textColor;
            long j6 = this.$fontSize;
            int i6 = this.$$dirty;
            TextKt.m2452Text4IGK_g(str, (Modifier) null, j5, j6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, (i6 & 14) | (i6 & 896) | ((i6 >> 9) & 7168), 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<String> $errMsg;
        final /* synthetic */ v3.l<String, String> $validate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(MutableState<String> mutableState, MutableState<String> mutableState2, v3.l<? super String, String> lVar) {
            super(1);
            this.$code = mutableState;
            this.$errMsg = mutableState2;
            this.$validate = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            String str;
            kotlin.jvm.internal.l0.p(it, "it");
            this.$code.setValue(it);
            MutableState<String> mutableState = this.$errMsg;
            v3.l<String, String> lVar = this.$validate;
            if (lVar == null || (str = lVar.invoke(it)) == null) {
                str = "";
            }
            mutableState.setValue(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $bgColor;
        final /* synthetic */ long $fontSize;
        final /* synthetic */ float $horizontalMargins;
        final /* synthetic */ v3.a<r2> $onClick;
        final /* synthetic */ float $radius;
        final /* synthetic */ String $text;
        final /* synthetic */ long $textColor;
        final /* synthetic */ float $verticalMargins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, long j5, long j6, float f5, float f6, float f7, long j7, v3.a<r2> aVar, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$bgColor = j5;
            this.$textColor = j6;
            this.$radius = f5;
            this.$horizontalMargins = f6;
            this.$verticalMargins = f7;
            this.$fontSize = j7;
            this.$onClick = aVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.o(this.$text, this.$bgColor, this.$textColor, this.$radius, this.$horizontalMargins, this.$verticalMargins, this.$fontSize, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ MutableState<Integer> $countDown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MutableState<Integer> mutableState, v3.a<r2> aVar) {
            super(0);
            this.$countDown = mutableState;
            this.$action = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$countDown.getValue().intValue() != 60) {
                return;
            }
            this.$action.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f0 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $text;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, long j5, int i5) {
            super(3);
            this.$text = str;
            this.$textColor = j5;
            this.$$dirty = i5;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l RowScope Button, @p4.m Composer composer, int i5) {
            kotlin.jvm.internal.l0.p(Button, "$this$Button");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1865263289, i5, -1, "com.yuanqi.master.tools.SmallRoundedButton.<anonymous> (BaseCompose.kt:550)");
            }
            String str = this.$text;
            long j5 = this.$textColor;
            long sp = TextUnitKt.getSp(12);
            int i6 = this.$$dirty;
            TextKt.m2452Text4IGK_g(str, (Modifier) null, j5, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, (i6 & 14) | 3072 | (i6 & 896), 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.n0 implements v3.l<ContentDrawScope, r2> {
        final /* synthetic */ k1.h<MutableState<Boolean>> $readyToDraw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1.h<MutableState<Boolean>> hVar) {
            super(1);
            this.$readyToDraw = hVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ContentDrawScope drawWithContent) {
            kotlin.jvm.internal.l0.p(drawWithContent, "$this$drawWithContent");
            if (this.$readyToDraw.element.getValue().booleanValue()) {
                drawWithContent.drawContent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $bgColor;
        final /* synthetic */ float $height;
        final /* synthetic */ float $horizontalMargins;
        final /* synthetic */ v3.a<r2> $onClick;
        final /* synthetic */ float $radius;
        final /* synthetic */ String $text;
        final /* synthetic */ long $textColor;
        final /* synthetic */ float $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str, long j5, long j6, float f5, float f6, float f7, float f8, v3.a<r2> aVar, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$bgColor = j5;
            this.$textColor = j6;
            this.$radius = f5;
            this.$width = f6;
            this.$height = f7;
            this.$horizontalMargins = f8;
            this.$onClick = aVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.p(this.$text, this.$bgColor, this.$textColor, this.$radius, this.$width, this.$height, this.$horizontalMargins, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nBaseCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CodeInputView$1$3$2\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,806:1\n159#2,2:807\n*S KotlinDebug\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CodeInputView$1$3$2\n*L\n784#1:807,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.n0 implements v3.l<TextLayoutResult, r2> {
        final /* synthetic */ k1.h<MutableState<Boolean>> $readyToDraw;
        final /* synthetic */ k1.h<MutableState<TextStyle>> $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.h<MutableState<TextStyle>> hVar, k1.h<MutableState<Boolean>> hVar2) {
            super(1);
            this.$textStyle = hVar;
            this.$readyToDraw = hVar2;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TextLayoutResult textLayoutResult) {
            invoke2(textLayoutResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TextLayoutResult textLayoutResult) {
            TextStyle m5571copyp1EtxEg;
            kotlin.jvm.internal.l0.p(textLayoutResult, "textLayoutResult");
            if (textLayoutResult.getDidOverflowWidth()) {
                MutableState<TextStyle> mutableState = this.$textStyle.element;
                MutableState<TextStyle> mutableState2 = mutableState;
                TextStyle value = mutableState.getValue();
                long m5576getFontSizeXSAIIZE = this.$textStyle.element.getValue().m5576getFontSizeXSAIIZE();
                TextUnitKt.m6248checkArithmeticR2X_6o(m5576getFontSizeXSAIIZE);
                m5571copyp1EtxEg = value.m5571copyp1EtxEg((r48 & 1) != 0 ? value.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? value.spanStyle.m5505getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m6233getRawTypeimpl(m5576getFontSizeXSAIIZE), (float) (TextUnit.m6235getValueimpl(m5576getFontSizeXSAIIZE) * 0.9d)), (r48 & 4) != 0 ? value.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? value.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? value.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? value.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? value.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? value.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? value.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? value.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? value.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? value.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? value.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? value.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? value.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? value.paragraphStyle.m5460getTextAligne0LSkKk() : 0, (r48 & 65536) != 0 ? value.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? value.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? value.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? value.platformStyle : null, (r48 & 1048576) != 0 ? value.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? value.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? value.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? value.paragraphStyle.getTextMotion() : null);
                mutableState2.setValue(m5571copyp1EtxEg);
                return;
            }
            this.$readyToDraw.element.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, int i5) {
            super(2);
            this.$text = str;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.q(this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ MutableState<String> $account;
        final /* synthetic */ MutableState<String> $accountError;
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ v3.l<String, String> $validate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Integer> mutableState4, v3.l<? super String, String> lVar, v3.a<r2> aVar, int i5, int i6) {
            super(2);
            this.$account = mutableState;
            this.$accountError = mutableState2;
            this.$code = mutableState3;
            this.$countDown = mutableState4;
            this.$validate = lVar;
            this.$action = aVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.d(this.$account, this.$accountError, this.$code, this.$countDown, this.$validate, this.$action, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ int $imageId;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(int i5, String str, String str2, int i6) {
            super(2);
            this.$imageId = i5;
            this.$title = str;
            this.$content = str2;
            this.$$changed = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.r(this.$imageId, this.$title, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nBaseCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CustomTitleBar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,806:1\n154#2:807\n36#3:808\n1116#4,6:809\n*S KotlinDebug\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CustomTitleBar$1\n*L\n102#1:807\n103#1:808\n103#1:809,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ v3.a<r2> $navigationClick;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.tools.a$j$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0429a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ v3.a<r2> $navigationClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0429a(v3.a<r2> aVar) {
                super(0);
                this.$navigationClick = aVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$navigationClick.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(v3.a<r2> aVar, int i5) {
            super(2);
            this.$navigationClick = aVar;
            this.$$dirty = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-341781624, i5, -1, "com.yuanqi.master.tools.CustomTitleBar.<anonymous> (BaseCompose.kt:97)");
            }
            Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.back, composer, 6);
            float f5 = 10;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null);
            v3.a<r2> aVar = this.$navigationClick;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0429a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconKt.m1924Iconww6aTOc(painterResource, "", ClickableKt.m235clickableXHw0xAI$default(m557paddingqDBjuR0$default, false, null, null, (v3.a) rememberedValue, 7, null), com.yuanqi.master.theme.b.L(), composer, 3128, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(v3.a<r2> aVar) {
            super(0);
            this.$onClick = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onClick.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.a<r2> $navigationClick;
        final /* synthetic */ v3.p<Composer, Integer, r2> $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(v3.p<? super Composer, ? super Integer, r2> pVar, v3.a<r2> aVar, int i5) {
            super(2);
            this.$title = pVar;
            this.$navigationClick = aVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.e(this.$title, this.$navigationClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ v3.a<r2> $onClick;
        final /* synthetic */ String $price;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(String str, String str2, boolean z4, v3.a<r2> aVar, int i5) {
            super(2);
            this.$title = str;
            this.$price = str2;
            this.$isSelected = z4;
            this.$onClick = aVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.s(this.$title, this.$price, this.$isSelected, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, int i5) {
            super(2);
            this.$title = str;
            this.$$dirty = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-472926317, i5, -1, "com.yuanqi.master.tools.CustomTopBar.<anonymous> (BaseCompose.kt:123)");
            }
            long L = com.yuanqi.master.theme.b.L();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.m2452Text4IGK_g(this.$title, (Modifier) null, L, TextUnitKt.getSp(18), (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, (this.$$dirty & 14) | 200064, 0, 130514);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nBaseCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CustomTopBar$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,806:1\n154#2:807\n36#3:808\n1116#4,6:809\n*S KotlinDebug\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$CustomTopBar$2\n*L\n137#1:807\n138#1:808\n138#1:809,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ v3.a<r2> $navigationClick;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.tools.a$m$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0430a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ v3.a<r2> $navigationClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0430a(v3.a<r2> aVar) {
                super(0);
                this.$navigationClick = aVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$navigationClick.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(v3.a<r2> aVar, int i5) {
            super(2);
            this.$navigationClick = aVar;
            this.$$dirty = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1254218645, i5, -1, "com.yuanqi.master.tools.CustomTopBar.<anonymous> (BaseCompose.kt:132)");
            }
            Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.back, composer, 6);
            float f5 = 10;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null);
            v3.a<r2> aVar = this.$navigationClick;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0430a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconKt.m1924Iconww6aTOc(painterResource, "", ClickableKt.m235clickableXHw0xAI$default(m557paddingqDBjuR0$default, false, null, null, (v3.a) rememberedValue, 7, null), com.yuanqi.master.theme.b.L(), composer, 3128, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $actions;
        final /* synthetic */ v3.a<r2> $navigationClick;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(String str, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, v3.a<r2> aVar, int i5, int i6) {
            super(2);
            this.$title = str;
            this.$actions = qVar;
            this.$navigationClick = aVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.f(this.$title, this.$actions, this.$navigationClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, int i5) {
            super(2);
            this.$title = str;
            this.$content = str2;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.g(this.$title, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.q<BoxScope, Composer, Integer, r2> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(v3.q<? super BoxScope, ? super Composer, ? super Integer, r2> qVar, int i5) {
            super(2);
            this.$content = qVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.h(this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.p<Double, Double, r2> $action;
        final /* synthetic */ v2.c $history;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(v3.p<? super Double, ? super Double, r2> pVar, v2.c cVar) {
            super(0);
            this.$action = pVar;
            this.$history = cVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$action.invoke(Double.valueOf(this.$history.m()), Double.valueOf(this.$history.n()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.p<Double, Double, r2> $action;
        final /* synthetic */ v2.c $history;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(v2.c cVar, v3.p<? super Double, ? super Double, r2> pVar, int i5) {
            super(2);
            this.$history = cVar;
            this.$action = pVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.i(this.$history, this.$action, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ MutableState<String> $errMsg;
        final /* synthetic */ MutableState<String> $str;
        final /* synthetic */ v3.l<String, String> $validate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(MutableState<String> mutableState, MutableState<String> mutableState2, v3.l<? super String, String> lVar) {
            super(1);
            this.$str = mutableState;
            this.$errMsg = mutableState2;
            this.$validate = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            String str;
            kotlin.jvm.internal.l0.p(it, "it");
            this.$str.setValue(it);
            MutableState<String> mutableState = this.$errMsg;
            v3.l<String, String> lVar = this.$validate;
            if (lVar == null || (str = lVar.invoke(it)) == null) {
                str = "";
            }
            mutableState.setValue(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, int i5) {
            super(2);
            this.$placeholder = str;
            this.$$dirty = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(662311793, i5, -1, "com.yuanqi.master.tools.InputText.<anonymous>.<anonymous> (BaseCompose.kt:655)");
            }
            long sp = TextUnitKt.getSp(13);
            TextKt.m2452Text4IGK_g(this.$placeholder, (Modifier) null, com.yuanqi.master.theme.b.X(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, ((this.$$dirty >> 3) & 14) | 3456, 3072, 122866);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nBaseCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$InputText$1$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,806:1\n86#2,7:807\n93#2:842\n97#2:872\n79#3,11:814\n92#3:871\n456#4,8:825\n464#4,3:839\n36#4:844\n36#4:853\n36#4:861\n467#4,3:868\n3737#5,6:833\n154#6:843\n154#6:851\n154#6:852\n154#6:860\n1116#7,6:845\n1116#7,6:854\n1116#7,6:862\n*S KotlinDebug\n*F\n+ 1 BaseCompose.kt\ncom/yuanqi/master/tools/BaseComposeKt$InputText$1$3\n*L\n611#1:807,7\n611#1:842\n611#1:872\n611#1:814,11\n611#1:871\n611#1:825,8\n611#1:839,3\n618#1:844\n629#1:853\n637#1:861\n611#1:868,3\n611#1:833,6\n617#1:843\n623#1:851\n628#1:852\n636#1:860\n618#1:845,6\n629#1:854,6\n637#1:862,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ boolean $isPwd;
        final /* synthetic */ MutableState<Boolean> $showPwd;
        final /* synthetic */ MutableState<String> $str;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.tools.a$u$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0431a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<String> $str;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0431a(MutableState<String> mutableState) {
                super(0);
                this.$str = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$str.setValue("");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $showPwd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MutableState<Boolean> mutableState) {
                super(0);
                this.$showPwd = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showPwd.setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $showPwd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(MutableState<Boolean> mutableState) {
                super(0);
                this.$showPwd = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showPwd.setValue(Boolean.TRUE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(boolean z4, MutableState<String> mutableState, int i5, boolean z5, MutableState<Boolean> mutableState2) {
            super(2);
            this.$isEnable = z4;
            this.$str = mutableState;
            this.$$dirty = i5;
            this.$isPwd = z5;
            this.$showPwd = mutableState2;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-457405822, i5, -1, "com.yuanqi.master.tools.InputText.<anonymous>.<anonymous> (BaseCompose.kt:610)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            boolean z4 = this.$isEnable;
            MutableState<String> mutableState = this.$str;
            boolean z5 = this.$isPwd;
            MutableState<Boolean> mutableState2 = this.$showPwd;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceableGroup(1876894679);
            if (z4) {
                if (mutableState.getValue().length() > 0) {
                    ImageVector clear = ClearKt.getClear(Icons.Rounded.INSTANCE);
                    long h5 = com.yuanqi.master.theme.b.h();
                    Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(20));
                    composer.startReplaceableGroup(1157296644);
                    boolean changed = composer.changed(mutableState);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new C0431a(mutableState);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    IconKt.m1925Iconww6aTOc(clear, "", ClickableKt.m235clickableXHw0xAI$default(m602size3ABfNKs, false, null, null, (v3.a) rememberedValue, 7, null), h5, composer, 3120, 0);
                }
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(2128229001);
            if (z5) {
                float f5 = 20;
                SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                if (mutableState2.getValue().booleanValue()) {
                    composer.startReplaceableGroup(1876895267);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.pwd_not_v, composer, 6);
                    Modifier m602size3ABfNKs2 = SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(f5));
                    composer.startReplaceableGroup(1157296644);
                    boolean changed2 = composer.changed(mutableState2);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new b(mutableState2);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    ImageKt.Image(painterResource, "", ClickableKt.m235clickableXHw0xAI$default(m602size3ABfNKs2, false, null, null, (v3.a) rememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1876895694);
                    Painter painterResource2 = PainterResources_androidKt.painterResource(R.mipmap.pwd_v, composer, 6);
                    Modifier m602size3ABfNKs3 = SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(f5));
                    composer.startReplaceableGroup(1157296644);
                    boolean changed3 = composer.changed(mutableState2);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new c(mutableState2);
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    ImageKt.Image(painterResource2, "", ClickableKt.m235clickableXHw0xAI$default(m602size3ABfNKs3, false, null, null, (v3.a) rememberedValue3, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                    composer.endReplaceableGroup();
                }
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $fillWith;
        final /* synthetic */ boolean $isEnable;
        final /* synthetic */ boolean $isNumber;
        final /* synthetic */ boolean $isPwd;
        final /* synthetic */ String $placeholder;
        final /* synthetic */ MutableState<String> $str;
        final /* synthetic */ v3.l<String, String> $validate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(MutableState<String> mutableState, String str, boolean z4, float f5, boolean z5, boolean z6, v3.l<? super String, String> lVar, int i5, int i6) {
            super(2);
            this.$str = mutableState;
            this.$placeholder = str;
            this.$isPwd = z4;
            this.$fillWith = f5;
            this.$isNumber = z5;
            this.$isEnable = z6;
            this.$validate = lVar;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.j(this.$str, this.$placeholder, this.$isPwd, this.$fillWith, this.$isNumber, this.$isEnable, this.$validate, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class w extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $datetime;
        final /* synthetic */ String $user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, String str2, int i5) {
            super(2);
            this.$user = str;
            this.$datetime = str2;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.k(this.$user, this.$datetime, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class x extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(v3.a<r2> aVar) {
            super(0);
            this.$onClick = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onClick.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class y extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.a<r2> $onClick;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, v3.a<r2> aVar, int i5) {
            super(2);
            this.$text = str;
            this.$onClick = aVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            a.l(this.$text, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class z extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $clickAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(v3.a<r2> aVar) {
            super(0);
            this.$clickAction = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$clickAction.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r32, @p4.l java.lang.String r33, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.l v3.a<kotlin.r2> r35, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.a(int, java.lang.String, v3.p, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@p4.l java.lang.String r30, long r31, long r33, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.b(java.lang.String, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@p4.l java.lang.String r32, long r33, long r35, boolean r37, @p4.m androidx.compose.ui.Modifier r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.c(java.lang.String, long, long, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0495  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@p4.l androidx.compose.runtime.MutableState<java.lang.String> r115, @p4.l androidx.compose.runtime.MutableState<java.lang.String> r116, @p4.l androidx.compose.runtime.MutableState<java.lang.String> r117, @p4.l androidx.compose.runtime.MutableState<java.lang.Integer> r118, @p4.m v3.l<? super java.lang.String, java.lang.String> r119, @p4.l v3.a<kotlin.r2> r120, @p4.m androidx.compose.runtime.Composer r121, int r122, int r123) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.d(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, v3.l, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@p4.l v3.p<? super Composer, ? super Integer, r2> title, @p4.l v3.a<r2> navigationClick, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(navigationClick, "navigationClick");
        Composer startRestartGroup = composer.startRestartGroup(-84382962);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(title)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(navigationClick)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84382962, i6, -1, "com.yuanqi.master.tools.CustomTitleBar (BaseCompose.kt:90)");
            }
            composer2 = startRestartGroup;
            AppBarKt.TopAppBar(title, SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6044constructorimpl(60)), ComposableLambdaKt.composableLambda(startRestartGroup, -341781624, true, new j(navigationClick, i6)), null, null, TopAppBarDefaults.INSTANCE.m2611topAppBarColorszjMxDiM(Color.Companion.m3769getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, startRestartGroup, ((TopAppBarDefaults.$stable | 0) << 15) | 6, 30), null, startRestartGroup, (i6 & 14) | 432, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(title, navigationClick, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@p4.l java.lang.String r20, @p4.m v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.l v3.a<kotlin.r2> r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.f(java.lang.String, v3.q, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@p4.l String title, @p4.l String content, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(897473083);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(title)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(content)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        int i9 = i6;
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897473083, i9, -1, "com.yuanqi.master.tools.DeviceInfoItem (BaseCompose.kt:170)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 10;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m555paddingVpY3zN4$default(PaddingKt.m557paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 0.0f, 13, null), Dp.m6044constructorimpl(f5), 0.0f, 2, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(6))), com.yuanqi.master.theme.b.k(), null, 2, null), Dp.m6044constructorimpl(15), 0.0f, Dp.m6044constructorimpl(30), 0.0f, 10, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment centerStart = companion2.getCenterStart();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(companion, 0.0f, Dp.m6044constructorimpl(16), 1, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2452Text4IGK_g(title, (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, (i9 & 14) | 3456, 0, 131058);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(content, (Modifier) null, com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, ((i9 >> 3) & 14) | 3456, 0, 131058);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new o(title, content, i5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@p4.l v3.q<? super BoxScope, ? super Composer, ? super Integer, r2> content, @p4.m Composer composer, int i5) {
        int i6;
        List<Color> L;
        int i7;
        kotlin.jvm.internal.l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1230308826);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(content)) {
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
                ComposerKt.traceEventStart(-1230308826, i6, -1, "com.yuanqi.master.tools.GradientBox (BaseCompose.kt:150)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            Brush.Companion companion = Brush.Companion;
            Color.Companion companion2 = Color.Companion;
            L = kotlin.collections.w.L(Color.m3724boximpl(com.yuanqi.master.theme.b.p()), Color.m3724boximpl(companion2.m3771getWhite0d7_KjU()), Color.m3724boximpl(companion2.m3771getWhite0d7_KjU()));
            Modifier background$default = BackgroundKt.background$default(fillMaxSize$default, companion.m3701verticalGradient8A3gB4(L, 100.0f, 400.0f, TileMode.Companion.m4105getClamp3opZhB0()), null, 0.0f, 6, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(background$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i6 << 3) & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p(content, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(@p4.l v2.c history, @p4.l v3.p<? super Double, ? super Double, r2> action, @p4.m Composer composer, int i5) {
        String str;
        kotlin.jvm.internal.l0.p(history, "history");
        kotlin.jvm.internal.l0.p(action, "action");
        Composer startRestartGroup = composer.startRestartGroup(1208219441);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208219441, i5, -1, "com.yuanqi.master.tools.HistoryItem (BaseCompose.kt:408)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f5 = 10;
        Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m553padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6044constructorimpl(f5)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.k(), null, 2, null), false, null, null, new q(action, history), 7, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f6 = 15;
        SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f6)), startRestartGroup, 6);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.menu_virtual_location, startRestartGroup, 6), "", SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
        SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f6)), startRestartGroup, 6);
        Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(companion, 0.0f, Dp.m6044constructorimpl(f5), 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl3, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        c(history.k(), 0L, TextUnitKt.getSp(18), true, null, startRestartGroup, 3456, 18);
        float f7 = 5;
        c("纬度:  " + history.m(), 0L, 0L, false, PaddingKt.m555paddingVpY3zN4$default(companion, 0.0f, Dp.m6044constructorimpl(f7), 1, null), startRestartGroup, 24576, 14);
        c("经度: " + history.n(), 0L, 0L, false, PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(f7), 7, null), startRestartGroup, 24576, 14);
        StringBuilder sb = new StringBuilder();
        sb.append("时间: ");
        Date p5 = history.p();
        if (p5 != null) {
            str = f1.c(p5);
        } else {
            str = null;
        }
        sb.append(str);
        c(sb.toString(), 0L, 0L, false, null, startRestartGroup, 0, 30);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new r(history, action, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0516  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(@p4.l androidx.compose.runtime.MutableState<java.lang.String> r117, @p4.l java.lang.String r118, boolean r119, float r120, boolean r121, boolean r122, @p4.m v3.l<? super java.lang.String, java.lang.String> r123, @p4.m androidx.compose.runtime.Composer r124, int r125, int r126) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.j(androidx.compose.runtime.MutableState, java.lang.String, boolean, float, boolean, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(@p4.l String user, @p4.l String datetime, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        kotlin.jvm.internal.l0.p(user, "user");
        kotlin.jvm.internal.l0.p(datetime, "datetime");
        Composer startRestartGroup = composer.startRestartGroup(233237686);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(user)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(datetime)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        int i9 = i6;
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(233237686, i9, -1, "com.yuanqi.master.tools.InviteItem (BaseCompose.kt:339)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 10;
            Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m557paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.k(), null, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment centerStart = companion2.getCenterStart();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m201backgroundbw27NRU$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(companion, Dp.m6044constructorimpl(15), Dp.m6044constructorimpl(16));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            long L = com.yuanqi.master.theme.b.L();
            long sp = TextUnitKt.getSp(15);
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m2452Text4IGK_g(user, (Modifier) null, L, sp, (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, (i9 & 14) | 200064, 0, 131026);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(datetime, (Modifier) null, com.yuanqi.master.theme.b.P(), TextUnitKt.getSp(13), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, ((i9 >> 3) & 14) | 200064, 0, 131026);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new w(user, datetime, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(@p4.l String text, @p4.l v3.a<r2> onClick, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        kotlin.jvm.internal.l0.p(text, "text");
        kotlin.jvm.internal.l0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1460831988);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(text)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        int i9 = i6;
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1460831988, i9, -1, "com.yuanqi.master.tools.LinkText (BaseCompose.kt:577)");
            }
            long m5 = com.yuanqi.master.theme.b.m();
            long sp = TextUnitKt.getSp(14);
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(onClick);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x(onClick);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(text, ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, (v3.a) rememberedValue, 7, null), m5, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, (i9 & 14) | 3456, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new y(text, onClick, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(int r38, @p4.l java.lang.String r39, @p4.m java.lang.String r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.l v3.a<kotlin.r2> r42, @p4.m androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.m(int, java.lang.String, java.lang.String, v3.p, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0054  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(@p4.l java.lang.String r68, boolean r69, boolean r70, @p4.l v3.a<kotlin.r2> r71, @p4.m androidx.compose.runtime.Composer r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.n(java.lang.String, boolean, boolean, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(@p4.l java.lang.String r35, long r36, long r38, float r40, float r41, float r42, long r43, @p4.l v3.a<kotlin.r2> r45, @p4.m androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.o(java.lang.String, long, long, float, float, float, long, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(@p4.l java.lang.String r32, long r33, long r35, float r37, float r38, float r39, float r40, @p4.l v3.a<kotlin.r2> r41, @p4.m androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.tools.a.p(java.lang.String, long, long, float, float, float, float, v3.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@p4.l String text, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        kotlin.jvm.internal.l0.p(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1618646661);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(text)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1618646661, i6, -1, "com.yuanqi.master.tools.TipText (BaseCompose.kt:558)");
            }
            float f5 = 20;
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(text, PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null), com.yuanqi.master.theme.b.h(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, (i6 & 14) | 3504, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h0(text, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void r(int i5, @p4.l String title, @p4.l String content, @p4.m Composer composer, int i6) {
        int i7;
        Composer composer2;
        int i8;
        int i9;
        int i10;
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(803101476);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(i5)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i7 = i10 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(title)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 896) == 0) {
            if (startRestartGroup.changed(content)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i7 |= i8;
        }
        int i11 = i7;
        if ((i11 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(803101476, i11, -1, "com.yuanqi.master.tools.VipRightsItem (BaseCompose.kt:244)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.Companion;
            float f5 = 5;
            Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6044constructorimpl(20), Dp.m6044constructorimpl(f5));
            startRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i5, startRestartGroup, i11 & 14), "", SizeKt.m602size3ABfNKs(companion2, Dp.m6044constructorimpl(30)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion2, Dp.m6044constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(title, (Modifier) null, com.yuanqi.master.theme.b.k2(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, ((i11 >> 3) & 14) | 3456, 3120, 120818);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion2, Dp.m6044constructorimpl(f5)), composer2, 6);
            TextKt.m2452Text4IGK_g(content, (Modifier) null, com.yuanqi.master.theme.b.l2(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, ((i11 >> 6) & 14) | 3456, 0, 131058);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i0(i5, title, content, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void s(@p4.l String title, @p4.l String price, boolean z4, @p4.l v3.a<r2> onClick, @p4.m Composer composer, int i5) {
        int i6;
        long m3771getWhite0d7_KjU;
        long a42;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(price, "price");
        kotlin.jvm.internal.l0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1324644187);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(title)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(price)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        int i11 = i6;
        if ((i11 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1324644187, i11, -1, "com.yuanqi.master.tools.VipRightsPackageItem (BaseCompose.kt:367)");
            }
            if (z4) {
                m3771getWhite0d7_KjU = com.yuanqi.master.theme.b.I2();
            } else {
                m3771getWhite0d7_KjU = Color.Companion.m3771getWhite0d7_KjU();
            }
            long j5 = m3771getWhite0d7_KjU;
            if (z4) {
                a42 = com.yuanqi.master.theme.b.H2();
            } else {
                a42 = com.yuanqi.master.theme.b.a4();
            }
            long j6 = a42;
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 5;
            Modifier m212borderxT4_qwU = BorderKt.m212borderxT4_qwU(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), j5, null, 2, null), Dp.m6044constructorimpl((float) 0.5d), com.yuanqi.master.theme.b.W1(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5)));
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(onClick);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new j0(onClick);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(m212borderxT4_qwU, false, null, null, (v3.a) rememberedValue, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier m553padding3ABfNKs = PaddingKt.m553padding3ABfNKs(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(90)), Dp.m6044constructorimpl(110)), Dp.m6044constructorimpl(10));
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m553padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(15);
            TextAlign.Companion companion4 = TextAlign.Companion;
            int m5936getCentere0LSkKk = companion4.m5936getCentere0LSkKk();
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextKt.m2452Text4IGK_g(price, (Modifier) null, j6, sp, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(m5936getCentere0LSkKk), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, ((i11 >> 3) & 14) | 199680, 0, 130514);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl((float) 17.5d)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(title, (Modifier) null, j6, TextUnitKt.getSp(15), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(companion4.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, (i11 & 14) | 199680, 0, 130514);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k0(title, price, z4, onClick, i5));
        }
    }
}
