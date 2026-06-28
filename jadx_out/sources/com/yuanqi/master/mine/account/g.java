package com.yuanqi.master.mine.account;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.mine.MineViewModel;
import com.yuanqi.master.network.model.UserInfoData;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000b\u001a+\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a+\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\u0014"}, d2 = {"BindNewEmail", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "isBindNew", "Landroidx/compose/runtime/MutableState;", "", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "BindNewPhone", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V", "EditEmail", "EditPhone", "EditPwd", "EditScreen", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "EditUserName", "VerifyOldEmail", "VerifyOldPhone", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,827:1\n81#2,11:828\n25#3:839\n25#3:846\n456#3,8:870\n464#3,3:884\n467#3,3:892\n25#3:897\n25#3:904\n25#3:911\n25#3:918\n25#3:925\n25#3:932\n456#3,8:956\n464#3,3:970\n25#3:977\n456#3,8:1002\n464#3,3:1016\n50#3:1022\n49#3:1023\n456#3,8:1046\n464#3,3:1060\n456#3,8:1082\n464#3,3:1096\n467#3,3:1102\n467#3,3:1107\n50#3:1114\n49#3:1115\n456#3,8:1138\n464#3,3:1152\n456#3,8:1174\n464#3,3:1188\n467#3,3:1194\n467#3,3:1199\n36#3:1206\n456#3,8:1229\n464#3,3:1243\n456#3,8:1265\n464#3,3:1279\n467#3,3:1285\n467#3,3:1290\n36#3:1297\n456#3,8:1320\n464#3,3:1334\n467#3,3:1338\n467#3,3:1343\n456#3,8:1367\n464#3,3:1381\n36#3:1385\n456#3,8:1412\n464#3,3:1426\n25#3:1430\n25#3:1437\n36#3:1444\n50#3:1451\n49#3:1452\n467#3,3:1459\n467#3,3:1464\n456#3,8:1487\n464#3,3:1501\n467#3,3:1505\n467#3,3:1513\n25#3:1518\n25#3:1526\n25#3:1533\n25#3:1540\n25#3:1547\n25#3:1554\n456#3,8:1578\n464#3,3:1592\n456#3,8:1613\n464#3,3:1627\n467#3,3:1631\n467#3,3:1644\n25#3:1649\n25#3:1656\n25#3:1663\n25#3:1670\n25#3:1677\n456#3,8:1701\n464#3,3:1715\n456#3,8:1736\n464#3,3:1750\n467#3,3:1754\n467#3,3:1767\n25#3:1772\n25#3:1779\n25#3:1786\n25#3:1793\n25#3:1800\n25#3:1807\n456#3,8:1831\n464#3,3:1845\n456#3,8:1866\n464#3,3:1880\n467#3,3:1884\n467#3,3:1897\n25#3:1902\n25#3:1909\n25#3:1916\n25#3:1923\n25#3:1930\n456#3,8:1954\n464#3,3:1968\n456#3,8:1988\n464#3,3:2002\n467#3,3:2006\n467#3,3:2019\n1116#4,6:840\n1116#4,6:847\n1116#4,6:898\n1116#4,6:905\n1116#4,6:912\n1116#4,6:919\n1116#4,6:926\n1116#4,6:933\n1116#4,6:978\n1116#4,6:1024\n1116#4,6:1116\n1116#4,6:1207\n1116#4,6:1298\n1116#4,6:1386\n1116#4,6:1431\n1116#4,6:1438\n1116#4,6:1445\n1116#4,6:1453\n1116#4,6:1519\n1116#4,6:1527\n1116#4,6:1534\n1116#4,6:1541\n1116#4,6:1548\n1116#4,6:1555\n1116#4,6:1650\n1116#4,6:1657\n1116#4,6:1664\n1116#4,6:1671\n1116#4,6:1678\n1116#4,6:1773\n1116#4,6:1780\n1116#4,6:1787\n1116#4,6:1794\n1116#4,6:1801\n1116#4,6:1808\n1116#4,6:1903\n1116#4,6:1910\n1116#4,6:1917\n1116#4,6:1924\n1116#4,6:1931\n74#5,6:853\n80#5:887\n84#5:896\n74#5,6:939\n80#5:973\n84#5:1517\n74#5,6:1561\n80#5:1595\n84#5:1648\n74#5,6:1684\n80#5:1718\n84#5:1771\n74#5,6:1814\n80#5:1848\n84#5:1901\n74#5,6:1937\n80#5:1971\n84#5:2023\n79#6,11:859\n92#6:895\n79#6,11:945\n79#6,11:991\n79#6,11:1035\n79#6,11:1071\n92#6:1105\n92#6:1110\n79#6,11:1127\n79#6,11:1163\n92#6:1197\n92#6:1202\n79#6,11:1218\n79#6,11:1254\n92#6:1288\n92#6:1293\n79#6,11:1309\n92#6:1341\n92#6:1346\n79#6,11:1356\n79#6,11:1401\n92#6:1462\n92#6:1467\n79#6,11:1476\n92#6:1508\n92#6:1516\n79#6,11:1567\n79#6,11:1602\n92#6:1634\n92#6:1647\n79#6,11:1690\n79#6,11:1725\n92#6:1757\n92#6:1770\n79#6,11:1820\n79#6,11:1855\n92#6:1887\n92#6:1900\n79#6,11:1943\n79#6,11:1977\n92#6:2009\n92#6:2022\n3737#7,6:878\n3737#7,6:964\n3737#7,6:1010\n3737#7,6:1054\n3737#7,6:1090\n3737#7,6:1146\n3737#7,6:1182\n3737#7,6:1237\n3737#7,6:1273\n3737#7,6:1328\n3737#7,6:1375\n3737#7,6:1420\n3737#7,6:1495\n3737#7,6:1586\n3737#7,6:1621\n3737#7,6:1709\n3737#7,6:1744\n3737#7,6:1839\n3737#7,6:1874\n3737#7,6:1962\n3737#7,6:1996\n154#8:888\n154#8:889\n154#8:890\n154#8:891\n154#8:974\n154#8:975\n154#8:976\n154#8:984\n154#8:1020\n154#8:1021\n154#8:1100\n154#8:1101\n154#8:1112\n154#8:1113\n154#8:1192\n154#8:1193\n154#8:1204\n154#8:1205\n154#8:1283\n154#8:1284\n154#8:1295\n154#8:1296\n154#8:1348\n154#8:1349\n154#8:1392\n154#8:1393\n154#8:1394\n154#8:1395\n154#8:1469\n154#8:1470\n154#8:1510\n154#8:1511\n154#8:1512\n154#8:1596\n154#8:1636\n154#8:1637\n154#8:1638\n154#8:1639\n154#8:1640\n154#8:1641\n154#8:1642\n154#8:1643\n154#8:1719\n154#8:1759\n154#8:1760\n154#8:1761\n154#8:1762\n154#8:1763\n154#8:1764\n154#8:1765\n154#8:1766\n154#8:1849\n154#8:1889\n154#8:1890\n154#8:1891\n154#8:1892\n154#8:1893\n154#8:1894\n154#8:1895\n154#8:1896\n154#8:2011\n154#8:2012\n154#8:2013\n154#8:2014\n154#8:2015\n154#8:2016\n154#8:2017\n154#8:2018\n87#9,6:985\n93#9:1019\n86#9,7:1064\n93#9:1099\n97#9:1106\n86#9,7:1156\n93#9:1191\n97#9:1198\n86#9,7:1247\n93#9:1282\n97#9:1289\n97#9:1347\n87#9,6:1350\n93#9:1384\n97#9:1468\n69#10,5:1030\n74#10:1063\n78#10:1111\n69#10,5:1122\n74#10:1155\n78#10:1203\n69#10,5:1213\n74#10:1246\n78#10:1294\n69#10,5:1304\n74#10:1337\n78#10:1342\n69#10,5:1396\n74#10:1429\n78#10:1463\n69#10,5:1471\n74#10:1504\n78#10:1509\n69#10,5:1597\n74#10:1630\n78#10:1635\n69#10,5:1720\n74#10:1753\n78#10:1758\n69#10,5:1850\n74#10:1883\n78#10:1888\n69#10,5:1972\n74#10:2005\n78#10:2010\n74#11:1525\n*S KotlinDebug\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt\n*L\n72#1:828,11\n110#1:839\n114#1:846\n118#1:870,8\n118#1:884,3\n118#1:892,3\n156#1:897\n160#1:904\n164#1:911\n175#1:918\n181#1:925\n185#1:932\n189#1:956,8\n189#1:970,3\n205#1:977\n208#1:1002,8\n208#1:1016,3\n224#1:1022\n224#1:1023\n214#1:1046,8\n214#1:1060,3\n230#1:1082,8\n230#1:1096,3\n230#1:1102,3\n214#1:1107,3\n251#1:1114\n251#1:1115\n245#1:1138,8\n245#1:1152,3\n257#1:1174,8\n257#1:1188,3\n257#1:1194,3\n245#1:1199,3\n275#1:1206\n269#1:1229,8\n269#1:1243,3\n278#1:1265,8\n278#1:1279,3\n278#1:1285,3\n269#1:1290,3\n293#1:1297\n287#1:1320,8\n287#1:1334,3\n287#1:1338,3\n208#1:1343,3\n304#1:1367,8\n304#1:1381,3\n313#1:1385\n326#1:1412,8\n326#1:1426,3\n352#1:1430\n353#1:1437\n366#1:1444\n369#1:1451\n369#1:1452\n326#1:1459,3\n304#1:1464,3\n380#1:1487,8\n380#1:1501,3\n380#1:1505,3\n189#1:1513,3\n425#1:1518\n444#1:1526\n448#1:1533\n452#1:1540\n456#1:1547\n460#1:1554\n465#1:1578,8\n465#1:1592,3\n468#1:1613,8\n468#1:1627,3\n468#1:1631,3\n465#1:1644,3\n538#1:1649\n542#1:1656\n546#1:1663\n550#1:1670\n554#1:1677\n557#1:1701,8\n557#1:1715,3\n559#1:1736,8\n559#1:1750,3\n559#1:1754,3\n557#1:1767,3\n630#1:1772\n647#1:1779\n651#1:1786\n655#1:1793\n659#1:1800\n663#1:1807\n668#1:1831,8\n668#1:1845,3\n670#1:1866,8\n670#1:1880,3\n670#1:1884,3\n668#1:1897,3\n741#1:1902\n745#1:1909\n749#1:1916\n753#1:1923\n757#1:1930\n761#1:1954,8\n761#1:1968,3\n762#1:1988,8\n762#1:2002,3\n762#1:2006,3\n761#1:2019,3\n110#1:840,6\n114#1:847,6\n156#1:898,6\n160#1:905,6\n164#1:912,6\n175#1:919,6\n181#1:926,6\n185#1:933,6\n205#1:978,6\n224#1:1024,6\n251#1:1116,6\n275#1:1207,6\n293#1:1298,6\n313#1:1386,6\n352#1:1431,6\n353#1:1438,6\n366#1:1445,6\n369#1:1453,6\n425#1:1519,6\n444#1:1527,6\n448#1:1534,6\n452#1:1541,6\n456#1:1548,6\n460#1:1555,6\n538#1:1650,6\n542#1:1657,6\n546#1:1664,6\n550#1:1671,6\n554#1:1678,6\n630#1:1773,6\n647#1:1780,6\n651#1:1787,6\n655#1:1794,6\n659#1:1801,6\n663#1:1808,6\n741#1:1903,6\n745#1:1910,6\n749#1:1917,6\n753#1:1924,6\n757#1:1931,6\n118#1:853,6\n118#1:887\n118#1:896\n189#1:939,6\n189#1:973\n189#1:1517\n465#1:1561,6\n465#1:1595\n465#1:1648\n557#1:1684,6\n557#1:1718\n557#1:1771\n668#1:1814,6\n668#1:1848\n668#1:1901\n761#1:1937,6\n761#1:1971\n761#1:2023\n118#1:859,11\n118#1:895\n189#1:945,11\n208#1:991,11\n214#1:1035,11\n230#1:1071,11\n230#1:1105\n214#1:1110\n245#1:1127,11\n257#1:1163,11\n257#1:1197\n245#1:1202\n269#1:1218,11\n278#1:1254,11\n278#1:1288\n269#1:1293\n287#1:1309,11\n287#1:1341\n208#1:1346\n304#1:1356,11\n326#1:1401,11\n326#1:1462\n304#1:1467\n380#1:1476,11\n380#1:1508\n189#1:1516\n465#1:1567,11\n468#1:1602,11\n468#1:1634\n465#1:1647\n557#1:1690,11\n559#1:1725,11\n559#1:1757\n557#1:1770\n668#1:1820,11\n670#1:1855,11\n670#1:1887\n668#1:1900\n761#1:1943,11\n762#1:1977,11\n762#1:2009\n761#1:2022\n118#1:878,6\n189#1:964,6\n208#1:1010,6\n214#1:1054,6\n230#1:1090,6\n245#1:1146,6\n257#1:1182,6\n269#1:1237,6\n278#1:1273,6\n287#1:1328,6\n304#1:1375,6\n326#1:1420,6\n380#1:1495,6\n465#1:1586,6\n468#1:1621,6\n557#1:1709,6\n559#1:1744,6\n668#1:1839,6\n670#1:1874,6\n761#1:1962,6\n762#1:1996,6\n119#1:888\n126#1:889\n133#1:890\n146#1:891\n190#1:974\n197#1:975\n204#1:976\n211#1:984\n217#1:1020\n220#1:1021\n234#1:1100\n236#1:1101\n248#1:1112\n249#1:1113\n260#1:1192\n261#1:1193\n272#1:1204\n274#1:1205\n280#1:1283\n281#1:1284\n290#1:1295\n291#1:1296\n303#1:1348\n307#1:1349\n324#1:1392\n328#1:1393\n329#1:1394\n330#1:1395\n379#1:1469\n383#1:1470\n389#1:1510\n397#1:1511\n412#1:1512\n467#1:1596\n474#1:1636\n476#1:1637\n484#1:1638\n486#1:1639\n503#1:1640\n515#1:1641\n516#1:1642\n527#1:1643\n558#1:1719\n565#1:1759\n567#1:1760\n575#1:1761\n577#1:1762\n594#1:1763\n606#1:1764\n607#1:1765\n618#1:1766\n669#1:1849\n676#1:1889\n678#1:1890\n685#1:1891\n687#1:1892\n704#1:1893\n716#1:1894\n717#1:1895\n728#1:1896\n768#1:2011\n770#1:2012\n777#1:2013\n779#1:2014\n796#1:2015\n808#1:2016\n809#1:2017\n820#1:2018\n208#1:985,6\n208#1:1019\n230#1:1064,7\n230#1:1099\n230#1:1106\n257#1:1156,7\n257#1:1191\n257#1:1198\n278#1:1247,7\n278#1:1282\n278#1:1289\n208#1:1347\n304#1:1350,6\n304#1:1384\n304#1:1468\n214#1:1030,5\n214#1:1063\n214#1:1111\n245#1:1122,5\n245#1:1155\n245#1:1203\n269#1:1213,5\n269#1:1246\n269#1:1294\n287#1:1304,5\n287#1:1337\n287#1:1342\n326#1:1396,5\n326#1:1429\n326#1:1463\n380#1:1471,5\n380#1:1504\n380#1:1509\n468#1:1597,5\n468#1:1630\n468#1:1635\n559#1:1720,5\n559#1:1753\n559#1:1758\n670#1:1850,5\n670#1:1883\n670#1:1888\n762#1:1972,5\n762#1:2005\n762#1:2010\n442#1:1525\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        a(Object obj) {
            super(1, obj, MineViewModel.class, "verifyEmail", "verifyEmail(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).b0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a0 extends kotlin.jvm.internal.n0 implements v3.q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ String $type;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditScreen$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,827:1\n68#2,6:828\n74#2:862\n78#2:867\n79#3,11:834\n92#3:866\n456#4,8:845\n464#4,3:859\n467#4,3:863\n3737#5,6:853\n*S KotlinDebug\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditScreen$2$1\n*L\n86#1:828,6\n86#1:862\n86#1:867\n86#1:834,11\n86#1:866\n86#1:845,8\n86#1:859,3\n86#1:863,3\n86#1:853,6\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ String $type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, String str, NavHostController navHostController, MineViewModel mineViewModel) {
                super(3);
                this.$it = paddingValues;
                this.$type = str;
                this.$navController = navHostController;
                this.$mineViewModel = mineViewModel;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                invoke(boxScope, composer, num.intValue());
                return r2.f19517a;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.l BoxScope GradientBox, @p4.m Composer composer, int i5) {
                kotlin.jvm.internal.l0.p(GradientBox, "$this$GradientBox");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1742464916, i5, -1, "com.yuanqi.master.mine.account.EditScreen.<anonymous>.<anonymous> (EditScreen.kt:84)");
                }
                if (com.yuanqi.master.mine.account.a.f14786a.b().getValue() != null) {
                    Modifier padding = PaddingKt.padding(Modifier.Companion, this.$it);
                    String str = this.$type;
                    NavHostController navHostController = this.$navController;
                    MineViewModel mineViewModel = this.$mineViewModel;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    v3.a<ComposeUiNode> constructor = companion.getConstructor();
                    v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
                    Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                composer.startReplaceableGroup(-349114606);
                                g.g(navHostController, mineViewModel, composer, 72);
                                composer.endReplaceableGroup();
                                break;
                            }
                            composer.startReplaceableGroup(-349114320);
                            TextKt.m2452Text4IGK_g("页面传参错误", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131070);
                            composer.endReplaceableGroup();
                            break;
                        case 50:
                            if (str.equals("2")) {
                                composer.startReplaceableGroup(-349114532);
                                g.e(navHostController, mineViewModel, composer, 72);
                                composer.endReplaceableGroup();
                                break;
                            }
                            composer.startReplaceableGroup(-349114320);
                            TextKt.m2452Text4IGK_g("页面传参错误", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131070);
                            composer.endReplaceableGroup();
                            break;
                        case 51:
                            if (str.equals("3")) {
                                composer.startReplaceableGroup(-349114463);
                                g.d(navHostController, mineViewModel, composer, 72);
                                composer.endReplaceableGroup();
                                break;
                            }
                            composer.startReplaceableGroup(-349114320);
                            TextKt.m2452Text4IGK_g("页面传参错误", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131070);
                            composer.endReplaceableGroup();
                            break;
                        case 52:
                            if (str.equals("4")) {
                                composer.startReplaceableGroup(-349114392);
                                g.c(navHostController, mineViewModel, composer, 72);
                                composer.endReplaceableGroup();
                                break;
                            }
                            composer.startReplaceableGroup(-349114320);
                            TextKt.m2452Text4IGK_g("页面传参错误", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131070);
                            composer.endReplaceableGroup();
                            break;
                        default:
                            composer.startReplaceableGroup(-349114320);
                            TextKt.m2452Text4IGK_g("页面传参错误", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131070);
                            composer.endReplaceableGroup();
                            break;
                    }
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, NavHostController navHostController, MineViewModel mineViewModel) {
            super(3);
            this.$type = str;
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l PaddingValues it, @p4.m Composer composer, int i5) {
            int i6;
            kotlin.jvm.internal.l0.p(it, "it");
            if ((i5 & 14) == 0) {
                i6 = (composer.changed(it) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2077236187, i5, -1, "com.yuanqi.master.mine.account.EditScreen.<anonymous> (EditScreen.kt:83)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -1742464916, true, new a(it, this.$type, this.$navController, this.$mineViewModel)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        b(Object obj) {
            super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).a0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(NavHostController navHostController, MineViewModel mineViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.f(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MutableState<String> $email;
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$BindNewEmail$1$4$1$1", f = "EditScreen.kt", i = {}, l = {788}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0383a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Integer> $countDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0383a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0383a> dVar) {
                    super(2, dVar);
                    this.$countDown = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0383a(this.$countDown, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0383a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0 && i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    while (this.$countDown.getValue().intValue() > 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                        this.label = 1;
                        if (d1.b(1000L, this) == l5) {
                            return l5;
                        }
                    }
                    if (this.$countDown.getValue().intValue() <= 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                super(1);
                this.$mineViewModel = mineViewModel;
                this.$countDown = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                invoke(num.intValue());
                return r2.f19517a;
            }

            public final void invoke(int i5) {
                if (i5 != 200) {
                    return;
                }
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.c(), null, new C0383a(this.$countDown, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$email = mutableState;
            this.$countDown = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.N(this.$email.getValue(), new a(this.$mineViewModel, this.$countDown));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class c0 extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        c0(Object obj) {
            super(1, obj, MineViewModel.class, "verifyUname", "verifyUname(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).g0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<String> $email;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$BindNewEmail$1$5$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0384a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ NavHostController $navController;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0384a(NavHostController navHostController, kotlin.coroutines.d<? super C0384a> dVar) {
                    super(2, dVar);
                    this.$navController = navHostController;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0384a(this.$navController, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0384a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$navController.popBackStack();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, NavHostController navHostController) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0384a(this.$navController, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, NavHostController navHostController) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$email = mutableState;
            this.$code = mutableState2;
            this.$navController = navHostController;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.G(this.$email.getValue(), this.$code.getValue(), new a(this.$mineViewModel, this.$navController));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<String> $userName;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$EditUserName$1$2$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$d0$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0385a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ NavHostController $navController;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0385a(NavHostController navHostController, kotlin.coroutines.d<? super C0385a> dVar) {
                    super(2, dVar);
                    this.$navController = navHostController;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0385a(this.$navController, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0385a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$navController.popBackStack();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, NavHostController navHostController) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0385a(this.$navController, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(MineViewModel mineViewModel, MutableState<String> mutableState, NavHostController navHostController) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$userName = mutableState;
            this.$navController = navHostController;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.k(this.$userName.getValue(), new a(this.$mineViewModel, this.$navController));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MutableState<Boolean> $isBindNew;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NavHostController navHostController, MineViewModel mineViewModel, MutableState<Boolean> mutableState, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$isBindNew = mutableState;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.a(this.$navController, this.$mineViewModel, this.$isBindNew, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(NavHostController navHostController, MineViewModel mineViewModel, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.g(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class f extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        f(Object obj) {
            super(1, obj, MineViewModel.class, "verifyPhone", "verifyPhone(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).c0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class f0 extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        f0(Object obj) {
            super(1, obj, MineViewModel.class, "verifyEmail", "verifyEmail(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).b0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.account.g$g, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0386g extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        C0386g(Object obj) {
            super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).a0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class g0 extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        g0(Object obj) {
            super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).a0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ MutableState<String> $phone;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$BindNewPhone$1$4$1$1", f = "EditScreen.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0387a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Integer> $countDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0387a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0387a> dVar) {
                    super(2, dVar);
                    this.$countDown = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0387a(this.$countDown, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0387a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0 && i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    while (this.$countDown.getValue().intValue() > 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                        this.label = 1;
                        if (d1.b(1000L, this) == l5) {
                            return l5;
                        }
                    }
                    if (this.$countDown.getValue().intValue() <= 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                super(1);
                this.$mineViewModel = mineViewModel;
                this.$countDown = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                invoke(num.intValue());
                return r2.f19517a;
            }

            public final void invoke(int i5) {
                if (i5 != 200) {
                    return;
                }
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.c(), null, new C0387a(this.$countDown, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$phone = mutableState;
            this.$countDown = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.N(this.$phone.getValue(), new a(this.$mineViewModel, this.$countDown));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MutableState<String> $email;
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$VerifyOldEmail$1$4$1$1", f = "EditScreen.kt", i = {}, l = {696}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$h0$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0388a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Integer> $countDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0388a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0388a> dVar) {
                    super(2, dVar);
                    this.$countDown = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0388a(this.$countDown, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0388a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0 && i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    while (this.$countDown.getValue().intValue() > 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                        this.label = 1;
                        if (d1.b(1000L, this) == l5) {
                            return l5;
                        }
                    }
                    if (this.$countDown.getValue().intValue() <= 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                super(1);
                this.$mineViewModel = mineViewModel;
                this.$countDown = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                invoke(num.intValue());
                return r2.f19517a;
            }

            public final void invoke(int i5) {
                if (i5 != 200) {
                    return;
                }
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.c(), null, new C0388a(this.$countDown, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$email = mutableState;
            this.$countDown = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.N(this.$email.getValue(), new a(this.$mineViewModel, this.$countDown));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<String> $phone;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$BindNewPhone$1$5$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0389a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ NavHostController $navController;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0389a(NavHostController navHostController, kotlin.coroutines.d<? super C0389a> dVar) {
                    super(2, dVar);
                    this.$navController = navHostController;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0389a(this.$navController, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0389a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$navController.popBackStack();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, NavHostController navHostController) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0389a(this.$navController, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, NavHostController navHostController) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$phone = mutableState;
            this.$code = mutableState2;
            this.$navController = navHostController;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.H(this.$phone.getValue(), this.$code.getValue(), new a(this.$mineViewModel, this.$navController));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<String> $email;
        final /* synthetic */ MutableState<Boolean> $isBindNew;
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $isBindNew;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$VerifyOldEmail$1$5$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$i0$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0390a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Boolean> $isBindNew;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0390a(MutableState<Boolean> mutableState, kotlin.coroutines.d<? super C0390a> dVar) {
                    super(2, dVar);
                    this.$isBindNew = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0390a(this.$isBindNew, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0390a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$isBindNew.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Boolean> mutableState) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$isBindNew = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0390a(this.$isBindNew, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$email = mutableState;
            this.$code = mutableState2;
            this.$isBindNew = mutableState3;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.L(this.$email.getValue(), this.$code.getValue(), new a(this.$mineViewModel, this.$isBindNew));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NavHostController navHostController, MineViewModel mineViewModel, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.b(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MutableState<Boolean> $isBindNew;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(NavHostController navHostController, MineViewModel mineViewModel, MutableState<Boolean> mutableState, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$isBindNew = mutableState;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.h(this.$navController, this.$mineViewModel, this.$isBindNew, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(NavHostController navHostController, MineViewModel mineViewModel, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.c(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class k0 extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        k0(Object obj) {
            super(1, obj, MineViewModel.class, "verifyPhone", "verifyPhone(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).c0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NavHostController navHostController, MineViewModel mineViewModel, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.d(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class l0 extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        l0(Object obj) {
            super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).a0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class m extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        m(Object obj) {
            super(1, obj, MineViewModel.class, "verifyPwd", "verifyPwd(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).f0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ MutableState<String> $phone;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$VerifyOldPhone$1$4$1$1", f = "EditScreen.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$m0$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0391a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Integer> $countDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0391a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0391a> dVar) {
                    super(2, dVar);
                    this.$countDown = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0391a(this.$countDown, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0391a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0 && i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    while (this.$countDown.getValue().intValue() > 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                        this.label = 1;
                        if (d1.b(1000L, this) == l5) {
                            return l5;
                        }
                    }
                    if (this.$countDown.getValue().intValue() <= 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                super(1);
                this.$mineViewModel = mineViewModel;
                this.$countDown = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                invoke(num.intValue());
                return r2.f19517a;
            }

            public final void invoke(int i5) {
                if (i5 != 200) {
                    return;
                }
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.c(), null, new C0391a(this.$countDown, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Integer> mutableState2) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$phone = mutableState;
            this.$countDown = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.N(this.$phone.getValue(), new a(this.$mineViewModel, this.$countDown));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $phoneOrEmail;
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
            super(0);
            this.$usePhone = mutableState;
            this.$phoneOrEmail = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$usePhone.setValue(Boolean.TRUE);
            MutableState<String> mutableState = this.$phoneOrEmail;
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            kotlin.jvm.internal.l0.m(value);
            String userPhone = value.getUserPhone();
            if (userPhone == null) {
                userPhone = "";
            }
            mutableState.setValue(userPhone);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n0 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MutableState<Boolean> $isBindNew;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ MutableState<String> $phone;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $isBindNew;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$VerifyOldPhone$1$5$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$n0$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0392a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Boolean> $isBindNew;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0392a(MutableState<Boolean> mutableState, kotlin.coroutines.d<? super C0392a> dVar) {
                    super(2, dVar);
                    this.$isBindNew = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0392a(this.$isBindNew, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0392a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$isBindNew.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Boolean> mutableState) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$isBindNew = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0392a(this.$isBindNew, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$phone = mutableState;
            this.$code = mutableState2;
            this.$isBindNew = mutableState3;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.M(this.$phone.getValue(), this.$code.getValue(), new a(this.$mineViewModel, this.$isBindNew));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $phoneOrEmail;
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
            super(0);
            this.$phoneOrEmail = mutableState;
            this.$usePhone = mutableState2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState<String> mutableState = this.$phoneOrEmail;
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            kotlin.jvm.internal.l0.m(value);
            String userEmail = value.getUserEmail();
            if (userEmail == null) {
                userEmail = "";
            }
            mutableState.setValue(userEmail);
            this.$usePhone.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o0 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MutableState<Boolean> $isBindNew;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(NavHostController navHostController, MineViewModel mineViewModel, MutableState<Boolean> mutableState, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$isBindNew = mutableState;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.i(this.$navController, this.$mineViewModel, this.$isBindNew, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(MutableState<Boolean> mutableState) {
            super(0);
            this.$usePhone = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$usePhone.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(MutableState<Boolean> mutableState) {
            super(0);
            this.$usePhone = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$usePhone.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ MutableState<String> $phoneOrEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(MutableState<String> mutableState) {
            super(1);
            this.$phoneOrEmail = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            this.$phoneOrEmail.setValue(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(MutableState<Boolean> mutableState) {
            super(2);
            this.$usePhone = mutableState;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            int i6;
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1178404021, i5, -1, "com.yuanqi.master.mine.account.EditPwd.<anonymous>.<anonymous>.<anonymous> (EditScreen.kt:318)");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(StringResources_androidKt.stringResource(R.string.please_input, composer, 6));
            if (this.$usePhone.getValue().booleanValue()) {
                composer.startReplaceableGroup(1332707717);
                i6 = R.string.phone;
            } else {
                composer.startReplaceableGroup(1332707758);
                i6 = R.string.email;
            }
            String stringResource = StringResources_androidKt.stringResource(i6, composer, 6);
            composer.endReplaceableGroup();
            sb.append(stringResource);
            TextKt.m2452Text4IGK_g(sb.toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Integer> $countDown;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ MutableState<String> $phoneOrEmail;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
            final /* synthetic */ MutableState<Integer> $countDown;
            final /* synthetic */ MineViewModel $mineViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$EditPwd$1$3$3$1$1", f = "EditScreen.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0393a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ MutableState<Integer> $countDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0393a(MutableState<Integer> mutableState, kotlin.coroutines.d<? super C0393a> dVar) {
                    super(2, dVar);
                    this.$countDown = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0393a(this.$countDown, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0393a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    Object l5;
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    int i5 = this.label;
                    if (i5 != 0 && i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                    while (this.$countDown.getValue().intValue() > 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(this.$countDown.getValue().intValue() - 1));
                        this.label = 1;
                        if (d1.b(1000L, this) == l5) {
                            return l5;
                        }
                    }
                    if (this.$countDown.getValue().intValue() <= 0) {
                        this.$countDown.setValue(kotlin.coroutines.jvm.internal.b.f(60));
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, MutableState<Integer> mutableState) {
                super(1);
                this.$mineViewModel = mineViewModel;
                this.$countDown = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
                invoke(num.intValue());
                return r2.f19517a;
            }

            public final void invoke(int i5) {
                if (i5 != 200) {
                    return;
                }
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.c(), null, new C0393a(this.$countDown, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(MutableState<Integer> mutableState, MineViewModel mineViewModel, MutableState<String> mutableState2) {
            super(0);
            this.$countDown = mutableState;
            this.$mineViewModel = mineViewModel;
            this.$phoneOrEmail = mutableState2;
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
            this.$mineViewModel.N(this.$phoneOrEmail.getValue(), new a(this.$mineViewModel, this.$countDown));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.n0 implements v3.l<ContentDrawScope, r2> {
        final /* synthetic */ MutableState<Boolean> $readyToDraw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(MutableState<Boolean> mutableState) {
            super(1);
            this.$readyToDraw = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ContentDrawScope drawWithContent) {
            kotlin.jvm.internal.l0.p(drawWithContent, "$this$drawWithContent");
            if (this.$readyToDraw.getValue().booleanValue()) {
                drawWithContent.drawContent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditPwd$1$3$4$2$1\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,827:1\n159#2,2:828\n*S KotlinDebug\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditPwd$1$3$4$2$1\n*L\n371#1:828,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.n0 implements v3.l<TextLayoutResult, r2> {
        final /* synthetic */ MutableState<Boolean> $readyToDraw;
        final /* synthetic */ MutableState<TextStyle> $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2) {
            super(1);
            this.$textStyle = mutableState;
            this.$readyToDraw = mutableState2;
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
                MutableState<TextStyle> mutableState = this.$textStyle;
                TextStyle value = mutableState.getValue();
                long m5576getFontSizeXSAIIZE = this.$textStyle.getValue().m5576getFontSizeXSAIIZE();
                TextUnitKt.m6248checkArithmeticR2X_6o(m5576getFontSizeXSAIIZE);
                m5571copyp1EtxEg = value.m5571copyp1EtxEg((r48 & 1) != 0 ? value.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? value.spanStyle.m5505getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m6233getRawTypeimpl(m5576getFontSizeXSAIIZE), (float) (TextUnit.m6235getValueimpl(m5576getFontSizeXSAIIZE) * 0.9d)), (r48 & 4) != 0 ? value.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? value.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? value.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? value.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? value.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? value.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? value.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? value.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? value.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? value.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? value.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? value.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? value.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? value.paragraphStyle.m5460getTextAligne0LSkKk() : 0, (r48 & 65536) != 0 ? value.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? value.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? value.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? value.platformStyle : null, (r48 & 1048576) != 0 ? value.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? value.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? value.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? value.paragraphStyle.getTextMotion() : null);
                mutableState.setValue(m5571copyp1EtxEg);
                return;
            }
            this.$readyToDraw.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class w extends kotlin.jvm.internal.h0 implements v3.l<String, String> {
        w(Object obj) {
            super(1, obj, MineViewModel.class, "verifyCode", "verifyCode(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return ((MineViewModel) this.receiver).a0(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class x extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<String> $code;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<String> $newPwd;
        final /* synthetic */ MutableState<String> $phoneOrEmail;
        final /* synthetic */ MutableState<Boolean> $usePhone;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.EditScreenKt$EditPwd$1$6$1$1", f = "EditScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.g$x$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0394a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ NavHostController $navController;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0394a(NavHostController navHostController, kotlin.coroutines.d<? super C0394a> dVar) {
                    super(2, dVar);
                    this.$navController = navHostController;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0394a(this.$navController, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0394a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$navController.popBackStack();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, NavHostController navHostController) {
                super(0);
                this.$mineViewModel = mineViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(this.$mineViewModel.t(), k1.e(), null, new C0394a(this.$navController, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(MineViewModel mineViewModel, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, NavHostController navHostController) {
            super(0);
            this.$mineViewModel = mineViewModel;
            this.$newPwd = mutableState;
            this.$usePhone = mutableState2;
            this.$phoneOrEmail = mutableState3;
            this.$code = mutableState4;
            this.$navController = navHostController;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.j(this.$newPwd.getValue(), this.$usePhone.getValue().booleanValue(), this.$phoneOrEmail.getValue(), this.$code.getValue(), new a(this.$mineViewModel, this.$navController));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class y extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(NavHostController navHostController, MineViewModel mineViewModel, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            g.e(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class z extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NavHostController navHostController) {
                super(0);
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$navController.popBackStack(com.yuanqi.master.mine.c.f14821c, false, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(NavHostController navHostController) {
            super(2);
            this.$navController = navHostController;
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
                ComposerKt.traceEventStart(-1842015142, i5, -1, "com.yuanqi.master.mine.account.EditScreen.<anonymous> (EditScreen.kt:77)");
            }
            com.yuanqi.master.tools.a.f("", null, new a(this.$navController), composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0333  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r39, @p4.l com.yuanqi.master.mine.MineViewModel r40, @p4.l androidx.compose.runtime.MutableState<java.lang.Boolean> r41, @p4.m androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.g.a(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@p4.l androidx.navigation.NavHostController r37, @p4.l com.yuanqi.master.mine.MineViewModel r38, @p4.m androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.g.b(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@p4.l NavHostController navController, @p4.l MineViewModel mineViewModel, @p4.m Composer composer, int i5) {
        kotlin.jvm.internal.l0.p(navController, "navController");
        kotlin.jvm.internal.l0.p(mineViewModel, "mineViewModel");
        Composer startRestartGroup = composer.startRestartGroup(388092694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(388092694, i5, -1, "com.yuanqi.master.mine.account.EditEmail (EditScreen.kt:628)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            kotlin.jvm.internal.l0.m(value);
            String userEmail = value.getUserEmail();
            boolean z4 = true;
            if (userEmail != null && userEmail.length() != 0) {
                z4 = false;
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            startRestartGroup.startReplaceableGroup(755434253);
            a(navController, mineViewModel, mutableState, startRestartGroup, 456);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(755434328);
            h(navController, mineViewModel, mutableState, startRestartGroup, 456);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(navController, mineViewModel, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@p4.l NavHostController navController, @p4.l MineViewModel mineViewModel, @p4.m Composer composer, int i5) {
        String userPhone;
        kotlin.jvm.internal.l0.p(navController, "navController");
        kotlin.jvm.internal.l0.p(mineViewModel, "mineViewModel");
        Composer startRestartGroup = composer.startRestartGroup(-769401340);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-769401340, i5, -1, "com.yuanqi.master.mine.account.EditPhone (EditScreen.kt:422)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            boolean z4 = true;
            if (value != null && (userPhone = value.getUserPhone()) != null && userPhone.length() != 0) {
                z4 = false;
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            startRestartGroup.startReplaceableGroup(1066152386);
            b(navController, mineViewModel, startRestartGroup, 72);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(1066152450);
            i(navController, mineViewModel, mutableState, startRestartGroup, 456);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(navController, mineViewModel, i5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, null, 2, null);
        r6.updateRememberedValue(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1176  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@p4.l androidx.navigation.NavHostController r110, @p4.l com.yuanqi.master.mine.MineViewModel r111, @p4.m androidx.compose.runtime.Composer r112, int r113) {
        /*
            Method dump skipped, instructions count: 4483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.g.e(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@p4.l NavHostController navController, @p4.m MineViewModel mineViewModel, @p4.m Composer composer, int i5, int i6) {
        MineViewModel mineViewModel2;
        CreationExtras creationExtras;
        kotlin.jvm.internal.l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-1478118506);
        if ((i6 & 2) != 0) {
            ViewModelProvider.Factory a5 = ViewModelFactoryKt.a();
            startRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(MineViewModel.class, current, null, a5, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                mineViewModel2 = (MineViewModel) viewModel;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            mineViewModel2 = mineViewModel;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478118506, i5, -1, "com.yuanqi.master.mine.account.EditScreen (EditScreen.kt:72)");
        }
        MineViewModel mineViewModel3 = mineViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(startRestartGroup, -1842015142, true, new z(navController)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2077236187, true, new a0(mineViewModel2.n(), navController, mineViewModel2)), startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b0(navController, mineViewModel3, i5, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@p4.l NavHostController navController, @p4.l MineViewModel mineViewModel, @p4.m Composer composer, int i5) {
        boolean z4;
        long J;
        kotlin.jvm.internal.l0.p(navController, "navController");
        kotlin.jvm.internal.l0.p(mineViewModel, "mineViewModel");
        Composer startRestartGroup = composer.startRestartGroup(-1561946420);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1561946420, i5, -1, "com.yuanqi.master.mine.account.EditUserName (EditScreen.kt:107)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new SnackbarHostState();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
            kotlin.jvm.internal.l0.m(value);
            String userName = value.getUserName();
            kotlin.jvm.internal.l0.m(userName);
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userName, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion2, Dp.m6044constructorimpl(50)), startRestartGroup, 6);
        TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.change_user_name, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (kotlin.jvm.internal.w) null), startRestartGroup, 0, 1572864, 65534);
        float f5 = 20;
        SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion2, Dp.m6044constructorimpl(f5)), startRestartGroup, 6);
        com.yuanqi.master.tools.a.j(mutableState, StringResources_androidKt.stringResource(R.string.new_user, startRestartGroup, 6), false, 0.0f, false, false, new c0(mineViewModel), startRestartGroup, 390, 56);
        SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion2, Dp.m6044constructorimpl(f5)), startRestartGroup, 6);
        if (mineViewModel.g0((String) mutableState.getValue()).length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            J = com.yuanqi.master.theme.b.m();
        } else {
            J = com.yuanqi.master.theme.b.J();
        }
        com.yuanqi.master.tools.a.o(StringResources_androidKt.stringResource(R.string.submit, startRestartGroup, 6), J, 0L, 0.0f, 0.0f, 0.0f, 0L, new d0(mineViewModel, mutableState, navController), startRestartGroup, 0, 124);
        SnackbarHostKt.SnackbarHost(snackbarHostState, PaddingKt.m555paddingVpY3zN4$default(companion2, Dp.m6044constructorimpl(f5), 0.0f, 2, null), com.yuanqi.master.mine.account.d.f14794a.a(), startRestartGroup, 438, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e0(navController, mineViewModel, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x035b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@p4.l androidx.navigation.NavHostController r39, @p4.l com.yuanqi.master.mine.MineViewModel r40, @p4.l androidx.compose.runtime.MutableState<java.lang.Boolean> r41, @p4.m androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.g.h(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0365  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(@p4.l androidx.navigation.NavHostController r39, @p4.l com.yuanqi.master.mine.MineViewModel r40, @p4.l androidx.compose.runtime.MutableState<java.lang.Boolean> r41, @p4.m androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.g.i(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):void");
    }
}
