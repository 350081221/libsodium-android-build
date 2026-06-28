package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import kotlin.a1;
import kotlin.b1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0096\u0001B\t¢\u0006\u0006\b\u0095\u0001\u0010\u0086\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JJ\u0010\u0015\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jj\u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jl\u0010$\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001e\u0010)\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J`\u00100\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J`\u00100\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JN\u00108\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u00108\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:JF\u0010?\u001a\u00020-2\u0006\u0010<\u001a\u00020;2\u0006\u00103\u001a\u00020*2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J^\u0010?\u001a\u00020-2\u0006\u0010<\u001a\u00020;2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020B2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017ø\u0001\u0000¢\u0006\u0004\bF\u0010GJf\u0010?\u001a\u00020-2\u0006\u0010<\u001a\u00020;2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020B2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJV\u0010N\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\u0006\u0010K\u001a\u00020J2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJV\u0010N\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\u0006\u0010K\u001a\u00020J2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJN\u0010U\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020*2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJN\u0010U\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020*2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJN\u0010Y\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u00107JN\u0010Y\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010:Jf\u0010a\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020]2\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`Jf\u0010a\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020]2\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010cJF\u0010h\u001a\u00020-2\u0006\u0010e\u001a\u00020d2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bf\u0010gJF\u0010h\u001a\u00020-2\u0006\u0010e\u001a\u00020d2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bi\u0010jJf\u0010q\u001a\u00020-2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020*0k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJf\u0010q\u001a\u00020-2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020*0k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\br\u0010sJL\u0010\u007f\u001a\u00020-2\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020v2\u0006\u0010y\u001a\u00020x2\u0006\u00105\u001a\u0002042\u0017\u0010|\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0z¢\u0006\u0002\b{H\u0086\bø\u0001\u0000¢\u0006\u0004\b}\u0010~R(\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0016\u0010w\u001a\u00020v8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010u\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0092\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Paint;", "obtainFillPaint", "obtainStrokePaint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "selectPaint", "Landroidx/compose/ui/graphics/Brush;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configurePaint", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "strokeWidth", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "modulate-5vOe2sY", "(JF)J", "modulate", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Lkotlin/r2;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/Function1;", "Lkotlin/u;", "block", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLv3/l;)V", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "strokePaint", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "getFontScale", "fontScale", "<init>", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,787:1\n1#2:788\n*E\n"})
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {

    @m
    private Paint fillPaint;

    @m
    private Paint strokePaint;

    @l
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    @l
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1

        @l
        private final DrawTransform transform;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @l
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @l
        public Density getDensity() {
            return CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @l
        public LayoutDirection getLayoutDirection() {
            return CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo4202getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m4200getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @l
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(@l Canvas canvas) {
            CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(@l Density density) {
            CanvasDrawScope.this.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(@l LayoutDirection layoutDirection) {
            CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo4203setSizeuvyYCjk(long j5) {
            CanvasDrawScope.this.getDrawParams().m4201setSizeuvyYCjk(j5);
        }
    };

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m4168configurePaint2qPWKa0(long j5, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f5, ColorFilter colorFilter, int i5, int i6) {
        Paint selectPaint = selectPaint(drawStyle);
        long m4176modulate5vOe2sY = m4176modulate5vOe2sY(j5, f5);
        if (!Color.m3735equalsimpl0(selectPaint.mo3607getColor0d7_KjU(), m4176modulate5vOe2sY)) {
            selectPaint.mo3613setColor8_81llA(m4176modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!l0.g(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m3645equalsimpl0(selectPaint.mo3606getBlendMode0nO6VwU(), i5)) {
            selectPaint.mo3612setBlendModes9anfk8(i5);
        }
        if (!FilterQuality.m3828equalsimpl0(selectPaint.mo3608getFilterQualityfv9h1I(), i6)) {
            selectPaint.mo3614setFilterQualityvDHp3xo(i6);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m4169configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j5, DrawStyle drawStyle, float f5, ColorFilter colorFilter, int i5, int i6, int i7, Object obj) {
        int i8;
        if ((i7 & 32) != 0) {
            i8 = DrawScope.Companion.m4279getDefaultFilterQualityfv9h1I();
        } else {
            i8 = i6;
        }
        return canvasDrawScope.m4168configurePaint2qPWKa0(j5, drawStyle, f5, colorFilter, i5, i8);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m4170configurePaintswdJneE(Brush brush, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f5, ColorFilter colorFilter, int i5, int i6) {
        boolean z4;
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo3681applyToPq9zytI(mo4277getSizeNHjbRc(), selectPaint, f5);
        } else {
            if (selectPaint.getShader() != null) {
                selectPaint.setShader(null);
            }
            long mo3607getColor0d7_KjU = selectPaint.mo3607getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m3735equalsimpl0(mo3607getColor0d7_KjU, companion.m3760getBlack0d7_KjU())) {
                selectPaint.mo3613setColor8_81llA(companion.m3760getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() == f5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                selectPaint.setAlpha(f5);
            }
        }
        if (!l0.g(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m3645equalsimpl0(selectPaint.mo3606getBlendMode0nO6VwU(), i5)) {
            selectPaint.mo3612setBlendModes9anfk8(i5);
        }
        if (!FilterQuality.m3828equalsimpl0(selectPaint.mo3608getFilterQualityfv9h1I(), i6)) {
            selectPaint.mo3614setFilterQualityvDHp3xo(i6);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m4171configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f5, ColorFilter colorFilter, int i5, int i6, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            i6 = DrawScope.Companion.m4279getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4170configurePaintswdJneE(brush, drawStyle, f5, colorFilter, i5, i6);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m4172configureStrokePaintQ_0CZUI(long j5, float f5, float f6, int i5, int i6, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f7, ColorFilter colorFilter, int i7, int i8) {
        boolean z4;
        Paint obtainStrokePaint = obtainStrokePaint();
        long m4176modulate5vOe2sY = m4176modulate5vOe2sY(j5, f7);
        if (!Color.m3735equalsimpl0(obtainStrokePaint.mo3607getColor0d7_KjU(), m4176modulate5vOe2sY)) {
            obtainStrokePaint.mo3613setColor8_81llA(m4176modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!l0.g(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m3645equalsimpl0(obtainStrokePaint.mo3606getBlendMode0nO6VwU(), i7)) {
            obtainStrokePaint.mo3612setBlendModes9anfk8(i7);
        }
        boolean z5 = true;
        if (obtainStrokePaint.getStrokeWidth() == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            obtainStrokePaint.setStrokeWidth(f5);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f6) {
            z5 = false;
        }
        if (!z5) {
            obtainStrokePaint.setStrokeMiterLimit(f6);
        }
        if (!StrokeCap.m4081equalsimpl0(obtainStrokePaint.mo3609getStrokeCapKaPHkGw(), i5)) {
            obtainStrokePaint.mo3615setStrokeCapBeK7IIE(i5);
        }
        if (!StrokeJoin.m4091equalsimpl0(obtainStrokePaint.mo3610getStrokeJoinLxFBmk8(), i6)) {
            obtainStrokePaint.mo3616setStrokeJoinWw9F2mQ(i6);
        }
        if (!l0.g(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m3828equalsimpl0(obtainStrokePaint.mo3608getFilterQualityfv9h1I(), i8)) {
            obtainStrokePaint.mo3614setFilterQualityvDHp3xo(i8);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m4173configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j5, float f5, float f6, int i5, int i6, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i7, int i8, int i9, Object obj) {
        int i10;
        if ((i9 & 512) != 0) {
            i10 = DrawScope.Companion.m4279getDefaultFilterQualityfv9h1I();
        } else {
            i10 = i8;
        }
        return canvasDrawScope.m4172configureStrokePaintQ_0CZUI(j5, f5, f6, i5, i6, pathEffect, f7, colorFilter, i7, i10);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m4174configureStrokePaintho4zsrM(Brush brush, float f5, float f6, int i5, int i6, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f7, ColorFilter colorFilter, int i7, int i8) {
        boolean z4;
        boolean z5;
        Paint obtainStrokePaint = obtainStrokePaint();
        boolean z6 = true;
        if (brush != null) {
            brush.mo3681applyToPq9zytI(mo4277getSizeNHjbRc(), obtainStrokePaint, f7);
        } else {
            if (obtainStrokePaint.getAlpha() == f7) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                obtainStrokePaint.setAlpha(f7);
            }
        }
        if (!l0.g(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m3645equalsimpl0(obtainStrokePaint.mo3606getBlendMode0nO6VwU(), i7)) {
            obtainStrokePaint.mo3612setBlendModes9anfk8(i7);
        }
        if (obtainStrokePaint.getStrokeWidth() == f5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            obtainStrokePaint.setStrokeWidth(f5);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f6) {
            z6 = false;
        }
        if (!z6) {
            obtainStrokePaint.setStrokeMiterLimit(f6);
        }
        if (!StrokeCap.m4081equalsimpl0(obtainStrokePaint.mo3609getStrokeCapKaPHkGw(), i5)) {
            obtainStrokePaint.mo3615setStrokeCapBeK7IIE(i5);
        }
        if (!StrokeJoin.m4091equalsimpl0(obtainStrokePaint.mo3610getStrokeJoinLxFBmk8(), i6)) {
            obtainStrokePaint.mo3616setStrokeJoinWw9F2mQ(i6);
        }
        if (!l0.g(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m3828equalsimpl0(obtainStrokePaint.mo3608getFilterQualityfv9h1I(), i8)) {
            obtainStrokePaint.mo3614setFilterQualityvDHp3xo(i8);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m4175configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f5, float f6, int i5, int i6, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i7, int i8, int i9, Object obj) {
        int i10;
        if ((i9 & 512) != 0) {
            i10 = DrawScope.Companion.m4279getDefaultFilterQualityfv9h1I();
        } else {
            i10 = i8;
        }
        return canvasDrawScope.m4174configureStrokePaintho4zsrM(brush, f5, f6, i5, i6, pathEffect, f7, colorFilter, i7, i10);
    }

    @a1
    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m4176modulate5vOe2sY(long j5, float f5) {
        return !((f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1)) == 0) ? Color.m3733copywmQWz5c$default(j5, Color.m3736getAlphaimpl(j5) * f5, 0.0f, 0.0f, 0.0f, 14, null) : j5;
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4000getFillTiuSbCo());
            this.fillPaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4001getStrokeTiuSbCo());
            this.strokePaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        boolean z4;
        if (l0.g(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof Stroke) {
            Paint obtainStrokePaint = obtainStrokePaint();
            Stroke stroke = (Stroke) drawStyle;
            boolean z5 = true;
            if (obtainStrokePaint.getStrokeWidth() == stroke.getWidth()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m4081equalsimpl0(obtainStrokePaint.mo3609getStrokeCapKaPHkGw(), stroke.m4341getCapKaPHkGw())) {
                obtainStrokePaint.mo3615setStrokeCapBeK7IIE(stroke.m4341getCapKaPHkGw());
            }
            if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                z5 = false;
            }
            if (!z5) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m4091equalsimpl0(obtainStrokePaint.mo3610getStrokeJoinLxFBmk8(), stroke.m4342getJoinLxFBmk8())) {
                obtainStrokePaint.mo3616setStrokeJoinWw9F2mQ(stroke.m4342getJoinLxFBmk8());
            }
            if (!l0.g(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
            }
            return obtainStrokePaint;
        }
        throw new j0();
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m4177drawyzxVdVo(@l Density density, @l LayoutDirection layoutDirection, @l Canvas canvas, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m4198component4NHjbRc = drawParams.m4198component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4201setSizeuvyYCjk(j5);
        canvas.save();
        lVar.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m4201setSizeuvyYCjk(m4198component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo4178drawArcillE91I(@l Brush brush, float f5, float f6, boolean z4, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawArc(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6), Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6), f5, f6, z4, m4171configurePaintswdJneE$default(this, brush, drawStyle, f7, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo4179drawArcyD3GUKo(long j5, float f5, float f6, boolean z4, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawArc(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), Offset.m3493getXimpl(j6) + Size.m3562getWidthimpl(j7), Offset.m3494getYimpl(j6) + Size.m3559getHeightimpl(j7), f5, f6, z4, m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f7, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo4180drawCircleV9BoPsw(@l Brush brush, float f5, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().mo3590drawCircle9KIMszo(j5, f5, m4171configurePaintswdJneE$default(this, brush, drawStyle, f6, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo4181drawCircleVaOC9Bg(long j5, float f5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().mo3590drawCircle9KIMszo(j6, f5, m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f6, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @b1(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo4182drawImage9jGpkUE(ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().mo3592drawImageRectHPBpro0(imageBitmap, j5, j6, j7, j8, m4171configurePaintswdJneE$default(this, null, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo4183drawImageAZ2fEMs(@l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5, int i6) {
        this.drawParams.getCanvas().mo3592drawImageRectHPBpro0(imageBitmap, j5, j6, j7, j8, m4170configurePaintswdJneE(null, drawStyle, f5, colorFilter, i5, i6));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo4184drawImagegbVJVH8(@l ImageBitmap imageBitmap, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().mo3591drawImaged4ec7I(imageBitmap, j5, m4171configurePaintswdJneE$default(this, null, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo4185drawLine1RTmtNc(@l Brush brush, long j5, long j6, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6) {
        this.drawParams.getCanvas().mo3593drawLineWko1d7g(j5, j6, m4175configureStrokePaintho4zsrM$default(this, brush, f5, 4.0f, i5, StrokeJoin.Companion.m4096getMiterLxFBmk8(), pathEffect, f6, colorFilter, i6, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo4186drawLineNGM6Ib0(long j5, long j6, long j7, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6) {
        this.drawParams.getCanvas().mo3593drawLineWko1d7g(j6, j7, m4173configureStrokePaintQ_0CZUI$default(this, j5, f5, 4.0f, i5, StrokeJoin.Companion.m4096getMiterLxFBmk8(), pathEffect, f6, colorFilter, i6, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo4187drawOvalAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawOval(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6), Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6), m4171configurePaintswdJneE$default(this, brush, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo4188drawOvalnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawOval(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), Offset.m3493getXimpl(j6) + Size.m3562getWidthimpl(j7), Offset.m3494getYimpl(j6) + Size.m3559getHeightimpl(j7), m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo4189drawPathGBMwjPU(@l Path path, @l Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawPath(path, m4171configurePaintswdJneE$default(this, brush, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo4190drawPathLG529CI(@l Path path, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawPath(path, m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo4191drawPointsF8ZwMP8(@l List<Offset> list, int i5, long j5, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7) {
        this.drawParams.getCanvas().mo3594drawPointsO7TthRY(i5, list, m4173configureStrokePaintQ_0CZUI$default(this, j5, f5, 4.0f, i6, StrokeJoin.Companion.m4096getMiterLxFBmk8(), pathEffect, f6, colorFilter, i7, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo4192drawPointsGsft0Ws(@l List<Offset> list, int i5, @l Brush brush, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7) {
        this.drawParams.getCanvas().mo3594drawPointsO7TthRY(i5, list, m4175configureStrokePaintho4zsrM$default(this, brush, f5, 4.0f, i6, StrokeJoin.Companion.m4096getMiterLxFBmk8(), pathEffect, f6, colorFilter, i7, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo4193drawRectAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawRect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6), Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6), m4171configurePaintswdJneE$default(this, brush, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo4194drawRectnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawRect(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), Offset.m3493getXimpl(j6) + Size.m3562getWidthimpl(j7), Offset.m3494getYimpl(j6) + Size.m3559getHeightimpl(j7), m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo4195drawRoundRectZuiqVtQ(@l Brush brush, long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6), Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6), CornerRadius.m3468getXimpl(j7), CornerRadius.m3469getYimpl(j7), m4171configurePaintswdJneE$default(this, brush, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo4196drawRoundRectuAw5IA(long j5, long j6, long j7, long j8, @l DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f5, @m ColorFilter colorFilter, int i5) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), Offset.m3493getXimpl(j6) + Size.m3562getWidthimpl(j7), Offset.m3494getYimpl(j6) + Size.m3559getHeightimpl(j7), CornerRadius.m3468getXimpl(j8), CornerRadius.m3469getYimpl(j8), m4169configurePaint2qPWKa0$default(this, j5, drawStyle, f5, colorFilter, i5, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @l
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0016\u0010\u000b\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "component1", "Landroidx/compose/ui/unit/LayoutDirection;", "component2", "Landroidx/compose/ui/graphics/Canvas;", "component3", "Landroidx/compose/ui/geometry/Size;", "component4-NH-jbRc", "()J", "component4", "density", "layoutDirection", "canvas", "size", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    @a1
    /* loaded from: classes.dex */
    public static final class DrawParams {

        @l
        private Canvas canvas;

        @l
        private Density density;

        @l
        private LayoutDirection layoutDirection;
        private long size;

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j5) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j5;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j5, w wVar) {
            this(density, layoutDirection, canvas, j5);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m4197copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i5 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i5 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            Canvas canvas2 = canvas;
            if ((i5 & 8) != 0) {
                j5 = drawParams.size;
            }
            return drawParams.m4199copyUg5Nnss(density, layoutDirection2, canvas2, j5);
        }

        @l
        public final Density component1() {
            return this.density;
        }

        @l
        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        @l
        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m4198component4NHjbRc() {
            return this.size;
        }

        @l
        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m4199copyUg5Nnss(@l Density density, @l LayoutDirection layoutDirection, @l Canvas canvas, long j5) {
            return new DrawParams(density, layoutDirection, canvas, j5, null);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return l0.g(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && l0.g(this.canvas, drawParams.canvas) && Size.m3558equalsimpl0(this.size, drawParams.size);
        }

        @l
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @l
        public final Density getDensity() {
            return this.density;
        }

        @l
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m4200getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m3563hashCodeimpl(this.size);
        }

        public final void setCanvas(@l Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(@l Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(@l LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m4201setSizeuvyYCjk(long j5) {
            this.size = j5;
        }

        @l
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m3566toStringimpl(this.size)) + ')';
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j5, int i5, w wVar) {
            this((i5 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i5 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i5 & 4) != 0 ? new EmptyCanvas() : canvas, (i5 & 8) != 0 ? Size.Companion.m3571getZeroNHjbRc() : j5, null);
        }
    }
}
