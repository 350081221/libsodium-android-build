package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\bp\u0010qB©\u0001\b\u0017\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bp\u0010rBµ\u0001\b\u0017\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bp\u0010sBÁ\u0001\b\u0016\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\bp\u0010tBË\u0001\b\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\bp\u0010uJ\u0014\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J²\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J¾\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JÈ\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&ø\u0001\u0000¢\u0006\u0004\b(\u0010)JÒ\u0001\u0010!\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u0002002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u00104\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b5\u00103J\b\u00108\u001a\u000207H\u0016J\u000f\u0010;\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\b\u0010<\u001a\u00020\u0011H\u0016R\u001a\u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010JR\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bT\u0010DR\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u001a\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\b^\u0010DR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010e\u001a\u0004\bf\u0010gR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u0006\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010DR\u0013\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010-\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bn\u0010o\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "other", "merge", "plus", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", ForeAndBackgroundEvent.BACKGROUND, "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "", "equals", "hasSameLayoutAffectingAttributes$ui_text_release", "(Landroidx/compose/ui/text/SpanStyle;)Z", "hasSameLayoutAffectingAttributes", "hasSameNonLayoutAttributes$ui_text_release", "hasSameNonLayoutAttributes", "", TTDownloadField.TT_HASHCODE, "hashCodeLayoutAffectingAttributes$ui_text_release", "()I", "hashCodeLayoutAffectingAttributes", "toString", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextForegroundStyle$ui_text_release", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "J", "getFontSize-XSAIIZE", "()J", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "getLetterSpacing-XSAIIZE", "Landroidx/compose/ui/text/style/BaselineShift;", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/intl/LocaleList;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "Landroidx/compose/ui/text/style/TextDecoration;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getColor-0d7_KjU", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getAlpha", "()F", "<init>", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;

    @m
    private final BaselineShift baselineShift;

    @m
    private final DrawStyle drawStyle;

    @m
    private final FontFamily fontFamily;

    @m
    private final String fontFeatureSettings;
    private final long fontSize;

    @m
    private final FontStyle fontStyle;

    @m
    private final FontSynthesis fontSynthesis;

    @m
    private final FontWeight fontWeight;
    private final long letterSpacing;

    @m
    private final LocaleList localeList;

    @m
    private final PlatformSpanStyle platformStyle;

    @m
    private final Shadow shadow;

    @m
    private final TextDecoration textDecoration;

    @l
    private final TextForegroundStyle textForegroundStyle;

    @m
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, w wVar) {
        this(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j5;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j6;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j7;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, w wVar) {
        this(textForegroundStyle, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* renamed from: copy-IuqyXdg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m5496copyIuqyXdg$default(SpanStyle spanStyle, long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, int i5, Object obj) {
        long j9;
        long j10;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j11;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j12;
        TextDecoration textDecoration2;
        Shadow shadow2;
        if ((i5 & 1) != 0) {
            j9 = spanStyle.m5504getColor0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i5 & 2) != 0) {
            j10 = spanStyle.fontSize;
        } else {
            j10 = j6;
        }
        if ((i5 & 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i5 & 8) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        } else {
            fontStyle2 = fontStyle;
        }
        if ((i5 & 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        } else {
            fontSynthesis2 = fontSynthesis;
        }
        if ((i5 & 32) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i5 & 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i5 & 128) != 0) {
            j11 = spanStyle.letterSpacing;
        } else {
            j11 = j7;
        }
        if ((i5 & 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        } else {
            baselineShift2 = baselineShift;
        }
        if ((i5 & 512) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        } else {
            textGeometricTransform2 = textGeometricTransform;
        }
        if ((i5 & 1024) != 0) {
            localeList2 = spanStyle.localeList;
        } else {
            localeList2 = localeList;
        }
        LocaleList localeList3 = localeList2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        if ((i5 & 2048) != 0) {
            j12 = spanStyle.background;
        } else {
            j12 = j8;
        }
        long j13 = j12;
        if ((i5 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i5 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        } else {
            shadow2 = shadow;
        }
        return spanStyle.m5500copyIuqyXdg(j9, j10, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j11, baselineShift2, textGeometricTransform3, localeList3, j13, textDecoration2, shadow2);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m5497copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i5, Object obj) {
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        float alpha = (i5 & 2) != 0 ? spanStyle.getAlpha() : f5;
        long j8 = (i5 & 4) != 0 ? spanStyle.fontSize : j5;
        FontWeight fontWeight2 = (i5 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle2 = (i5 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis2 = (i5 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily2 = (i5 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str2 = (i5 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j9 = (i5 & 256) != 0 ? spanStyle.letterSpacing : j6;
        BaselineShift baselineShift2 = (i5 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i5 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList2 = (i5 & 2048) != 0 ? spanStyle.localeList : localeList;
        long j10 = (i5 & 4096) != 0 ? spanStyle.background : j7;
        TextDecoration textDecoration2 = (i5 & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i5 & 16384) != 0 ? spanStyle.shadow : shadow;
        if ((i5 & 32768) != 0) {
            shadow2 = shadow3;
            platformSpanStyle2 = spanStyle.platformStyle;
        } else {
            shadow2 = shadow3;
            platformSpanStyle2 = platformSpanStyle;
        }
        return spanStyle.m5501copyNcG25M8(brush, alpha, j8, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j9, baselineShift2, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformSpanStyle2, (i5 & 65536) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    @k(level = kotlin.m.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m5498copy2BkPm_w(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.textForegroundStyle;
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (w) null);
    }

    @l
    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m5499copyGSF8kmg(long j5, long j6, @m FontWeight fontWeight, @m FontStyle fontStyle, @m FontSynthesis fontSynthesis, @m FontFamily fontFamily, @m String str, long j7, @m BaselineShift baselineShift, @m TextGeometricTransform textGeometricTransform, @m LocaleList localeList, long j8, @m TextDecoration textDecoration, @m Shadow shadow, @m PlatformSpanStyle platformSpanStyle, @m DrawStyle drawStyle) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.textForegroundStyle;
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
    }

    @k(level = kotlin.m.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m5500copyIuqyXdg(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.textForegroundStyle;
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, this.platformStyle, this.drawStyle, (w) null);
    }

    @l
    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m5501copyNcG25M8(@m Brush brush, float f5, long j5, @m FontWeight fontWeight, @m FontStyle fontStyle, @m FontSynthesis fontSynthesis, @m FontFamily fontFamily, @m String str, long j6, @m BaselineShift baselineShift, @m TextGeometricTransform textGeometricTransform, @m LocaleList localeList, long j7, @m TextDecoration textDecoration, @m Shadow shadow, @m PlatformSpanStyle platformSpanStyle, @m DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f5), j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        if (hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m5502getBackground0d7_KjU() {
        return this.background;
    }

    @m
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m5503getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    @m
    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5504getColor0d7_KjU() {
        return this.textForegroundStyle.mo5834getColor0d7_KjU();
    }

    @m
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @m
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @m
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m5505getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @m
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m5506getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @m
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m5507getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @m
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m5508getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    @m
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @m
    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @m
    public final Shadow getShadow() {
        return this.shadow;
    }

    @m
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @l
    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    @m
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(@l SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        if (TextUnit.m6232equalsimpl0(this.fontSize, spanStyle.fontSize) && l0.g(this.fontWeight, spanStyle.fontWeight) && l0.g(this.fontStyle, spanStyle.fontStyle) && l0.g(this.fontSynthesis, spanStyle.fontSynthesis) && l0.g(this.fontFamily, spanStyle.fontFamily) && l0.g(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m6232equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && l0.g(this.baselineShift, spanStyle.baselineShift) && l0.g(this.textGeometricTransform, spanStyle.textGeometricTransform) && l0.g(this.localeList, spanStyle.localeList) && Color.m3735equalsimpl0(this.background, spanStyle.background) && l0.g(this.platformStyle, spanStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(@l SpanStyle spanStyle) {
        if (!l0.g(this.textForegroundStyle, spanStyle.textForegroundStyle) || !l0.g(this.textDecoration, spanStyle.textDecoration) || !l0.g(this.shadow, spanStyle.shadow) || !l0.g(this.drawStyle, spanStyle.drawStyle)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int m3741hashCodeimpl = Color.m3741hashCodeimpl(m5504getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int i17 = 0;
        if (brush != null) {
            i5 = brush.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode = (((((m3741hashCodeimpl + i5) * 31) + Float.hashCode(getAlpha())) * 31) + TextUnit.m6236hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        if (fontWeight != null) {
            i6 = fontWeight.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (hashCode + i6) * 31;
        FontStyle fontStyle = this.fontStyle;
        if (fontStyle != null) {
            i7 = FontStyle.m5655hashCodeimpl(fontStyle.m5657unboximpl());
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        if (fontSynthesis != null) {
            i8 = FontSynthesis.m5666hashCodeimpl(fontSynthesis.m5670unboximpl());
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        FontFamily fontFamily = this.fontFamily;
        if (fontFamily != null) {
            i9 = fontFamily.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int m6236hashCodeimpl = (((i21 + i10) * 31) + TextUnit.m6236hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        if (baselineShift != null) {
            i11 = BaselineShift.m5824hashCodeimpl(baselineShift.m5826unboximpl());
        } else {
            i11 = 0;
        }
        int i22 = (m6236hashCodeimpl + i11) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            i12 = textGeometricTransform.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            i13 = localeList.hashCode();
        } else {
            i13 = 0;
        }
        int m3741hashCodeimpl2 = (((i23 + i13) * 31) + Color.m3741hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        if (textDecoration != null) {
            i14 = textDecoration.hashCode();
        } else {
            i14 = 0;
        }
        int i24 = (m3741hashCodeimpl2 + i14) * 31;
        Shadow shadow = this.shadow;
        if (shadow != null) {
            i15 = shadow.hashCode();
        } else {
            i15 = 0;
        }
        int i25 = (i24 + i15) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i16 = platformSpanStyle.hashCode();
        } else {
            i16 = 0;
        }
        int i26 = (i25 + i16) * 31;
        DrawStyle drawStyle = this.drawStyle;
        if (drawStyle != null) {
            i17 = drawStyle.hashCode();
        }
        return i26 + i17;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int m6236hashCodeimpl = TextUnit.m6236hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int i13 = 0;
        if (fontWeight != null) {
            i5 = fontWeight.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (m6236hashCodeimpl + i5) * 31;
        FontStyle fontStyle = this.fontStyle;
        if (fontStyle != null) {
            i6 = FontStyle.m5655hashCodeimpl(fontStyle.m5657unboximpl());
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        if (fontSynthesis != null) {
            i7 = FontSynthesis.m5666hashCodeimpl(fontSynthesis.m5670unboximpl());
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        FontFamily fontFamily = this.fontFamily;
        if (fontFamily != null) {
            i8 = fontFamily.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int m6236hashCodeimpl2 = (((i17 + i9) * 31) + TextUnit.m6236hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        if (baselineShift != null) {
            i10 = BaselineShift.m5824hashCodeimpl(baselineShift.m5826unboximpl());
        } else {
            i10 = 0;
        }
        int i18 = (m6236hashCodeimpl2 + i10) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            i11 = textGeometricTransform.hashCode();
        } else {
            i11 = 0;
        }
        int i19 = (i18 + i11) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            i12 = localeList.hashCode();
        } else {
            i12 = 0;
        }
        int m3741hashCodeimpl = (((i19 + i12) * 31) + Color.m3741hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i13 = platformSpanStyle.hashCode();
        }
        return m3741hashCodeimpl + i13;
    }

    @Stable
    @l
    public final SpanStyle merge(@m SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        return SpanStyleKt.m5509fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo5834getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    @Stable
    @l
    public final SpanStyle plus(@l SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @l
    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m3742toStringimpl(m5504getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m6242toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m6242toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m3742toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i5, w wVar) {
        this(textForegroundStyle, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : platformSpanStyle, (i5 & 32768) != 0 ? null : drawStyle, (w) null);
    }

    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (w) null);
    }

    private SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m5957from8_81llA(j5), j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (w) null);
    }

    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : platformSpanStyle, (w) null);
    }

    private SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m5957from8_81llA(j5), j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (w) null);
    }

    public /* synthetic */ SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : platformSpanStyle, (i5 & 32768) != 0 ? null : drawStyle, (w) null);
    }

    private SpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m5957from8_81llA(j5), j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i5, w wVar) {
        this(brush, (i5 & 2) != 0 ? Float.NaN : f5, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : fontWeight, (i5 & 16) != 0 ? null : fontStyle, (i5 & 32) != 0 ? null : fontSynthesis, (i5 & 64) != 0 ? null : fontFamily, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 512) != 0 ? null : baselineShift, (i5 & 1024) != 0 ? null : textGeometricTransform, (i5 & 2048) != 0 ? null : localeList, (i5 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7, (i5 & 8192) != 0 ? null : textDecoration, (i5 & 16384) != 0 ? null : shadow, (32768 & i5) != 0 ? null : platformSpanStyle, (i5 & 65536) != 0 ? null : drawStyle, (w) null);
    }

    private SpanStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f5), j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
    }
}
