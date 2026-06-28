package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@DrawScopeMarker
@i0(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 n2\u00020\u0001:\u0001nJ\u001e\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jj\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jj\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010%\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$JX\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JN\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jl\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H'ø\u0001\u0000¢\u0006\u0004\b3\u00104Jv\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108Jb\u0010=\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u0002092\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b;\u0010<Jb\u0010=\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010D\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bB\u0010CJX\u0010D\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bE\u0010FJX\u0010H\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bG\u0010$JX\u0010H\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bI\u0010'Jp\u0010P\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJp\u0010P\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJL\u0010W\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJL\u0010W\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\u0006\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bX\u0010YJp\u0010`\u001a\u00020\u00172\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_Jp\u0010`\u001a\u00020\u00172\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010A\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010 \u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "offsetSize-PENXr5M", "(JJ)J", "offsetSize", "Landroidx/compose/ui/graphics/Brush;", "brush", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Lkotlin/r2;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getCenter-F1C5BW0", "()J", "getSize-NH-jbRc", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m3676getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m3833getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m4278getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m4279getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m4285drawImageAZ2fEMs(@l DrawScope drawScope, @l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5, int i6) {
            DrawScope.super.mo4183drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f5, drawStyle, colorFilter, i5, i6);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4300getCenterF1C5BW0(@l DrawScope drawScope) {
            return DrawScope.super.mo4276getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4301getSizeNHjbRc(@l DrawScope drawScope) {
            return DrawScope.super.mo4277getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4302roundToPxR2X_6o(@l DrawScope drawScope, long j5) {
            return DrawScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4303roundToPx0680j_4(@l DrawScope drawScope, float f5) {
            return DrawScope.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4304toDpGaN1DYA(@l DrawScope drawScope, long j5) {
            return DrawScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4305toDpu2uoSUM(@l DrawScope drawScope, float f5) {
            return DrawScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4307toDpSizekrfVVM(@l DrawScope drawScope, long j5) {
            return DrawScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4308toPxR2X_6o(@l DrawScope drawScope, long j5) {
            return DrawScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4309toPx0680j_4(@l DrawScope drawScope, float f5) {
            return DrawScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l DrawScope drawScope, @l DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4310toSizeXkaWNTQ(@l DrawScope drawScope, long j5) {
            return DrawScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4311toSp0xMU5do(@l DrawScope drawScope, float f5) {
            return DrawScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4312toSpkPz2Gy4(@l DrawScope drawScope, float f5) {
            return DrawScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4306toDpu2uoSUM(@l DrawScope drawScope, int i5) {
            return DrawScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4313toSpkPz2Gy4(@l DrawScope drawScope, int i5) {
            return DrawScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m4256drawArcillE91I$default(DrawScope drawScope, Brush brush, float f5, float f6, boolean z4, long j5, long j6, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j7;
        long j8;
        float f8;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 16) != 0) {
                j7 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j7 = j5;
            }
            if ((i6 & 32) != 0) {
                j8 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j7);
            } else {
                j8 = j6;
            }
            if ((i6 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f7;
            }
            if ((i6 & 128) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 512) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4178drawArcillE91I(brush, f5, f6, z4, j7, j8, f8, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m4257drawArcyD3GUKo$default(DrawScope drawScope, long j5, float f5, float f6, boolean z4, long j6, long j7, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j8;
        long j9;
        float f8;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 16) != 0) {
                j8 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j8 = j6;
            }
            if ((i6 & 32) != 0) {
                j9 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j8);
            } else {
                j9 = j7;
            }
            if ((i6 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f7;
            }
            if ((i6 & 128) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 512) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4179drawArcyD3GUKo(j5, f5, f6, z4, j8, j9, f8, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m4258drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f5, long j5, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        float f7;
        long j6;
        float f8;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                f7 = Size.m3561getMinDimensionimpl(drawScope.mo4277getSizeNHjbRc()) / 2.0f;
            } else {
                f7 = f5;
            }
            if ((i6 & 4) != 0) {
                j6 = drawScope.mo4276getCenterF1C5BW0();
            } else {
                j6 = j5;
            }
            if ((i6 & 8) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4180drawCircleV9BoPsw(brush, f7, j6, f8, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m4259drawCircleVaOC9Bg$default(DrawScope drawScope, long j5, float f5, long j6, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        float f7;
        long j7;
        float f8;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                f7 = Size.m3561getMinDimensionimpl(drawScope.mo4277getSizeNHjbRc()) / 2.0f;
            } else {
                f7 = f5;
            }
            if ((i6 & 4) != 0) {
                j7 = drawScope.mo4276getCenterF1C5BW0();
            } else {
                j7 = j6;
            }
            if ((i6 & 8) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4181drawCircleVaOC9Bg(j5, f7, j7, f8, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m4260drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j9 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j9 = j5;
            }
            if ((i6 & 4) != 0) {
                j10 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j10 = j6;
            }
            if ((i6 & 8) != 0) {
                j11 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j11 = j7;
            }
            if ((i6 & 16) != 0) {
                j12 = j10;
            } else {
                j12 = j8;
            }
            if ((i6 & 32) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 256) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4182drawImage9jGpkUE(imageBitmap, j9, j10, j11, j12, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m4261drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, int i7, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i8;
        int i9;
        if (obj == null) {
            if ((i7 & 2) != 0) {
                j9 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j9 = j5;
            }
            if ((i7 & 4) != 0) {
                j10 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j10 = j6;
            }
            if ((i7 & 8) != 0) {
                j11 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j11 = j7;
            }
            if ((i7 & 16) != 0) {
                j12 = j10;
            } else {
                j12 = j8;
            }
            if ((i7 & 32) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i7 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i7 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i7 & 256) != 0) {
                i8 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i8 = i5;
            }
            if ((i7 & 512) != 0) {
                i9 = Companion.m4279getDefaultFilterQualityfv9h1I();
            } else {
                i9 = i6;
            }
            drawScope.mo4183drawImageAZ2fEMs(imageBitmap, j9, j10, j11, j12, f6, drawStyle2, colorFilter2, i8, i9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m4262drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j5, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j6;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j6 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j6 = j5;
            }
            if ((i6 & 4) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 32) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4184drawImagegbVJVH8(imageBitmap, j6, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m4263drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j5, long j6, float f5, int i5, PathEffect pathEffect, float f6, ColorFilter colorFilter, int i6, int i7, Object obj) {
        float f7;
        int i8;
        PathEffect pathEffect2;
        float f8;
        ColorFilter colorFilter2;
        int i9;
        if (obj == null) {
            if ((i7 & 8) != 0) {
                f7 = 0.0f;
            } else {
                f7 = f5;
            }
            if ((i7 & 16) != 0) {
                i8 = Stroke.Companion.m4343getDefaultCapKaPHkGw();
            } else {
                i8 = i5;
            }
            if ((i7 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i7 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i7 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i7 & 256) != 0) {
                i9 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i9 = i6;
            }
            drawScope.mo4185drawLine1RTmtNc(brush, j5, j6, f7, i8, pathEffect2, f8, colorFilter2, i9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m4264drawLineNGM6Ib0$default(DrawScope drawScope, long j5, long j6, long j7, float f5, int i5, PathEffect pathEffect, float f6, ColorFilter colorFilter, int i6, int i7, Object obj) {
        float f7;
        int i8;
        PathEffect pathEffect2;
        float f8;
        ColorFilter colorFilter2;
        int i9;
        if (obj == null) {
            if ((i7 & 8) != 0) {
                f7 = 0.0f;
            } else {
                f7 = f5;
            }
            if ((i7 & 16) != 0) {
                i8 = Stroke.Companion.m4343getDefaultCapKaPHkGw();
            } else {
                i8 = i5;
            }
            if ((i7 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i7 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i7 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i7 & 256) != 0) {
                i9 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i9 = i6;
            }
            drawScope.mo4186drawLineNGM6Ib0(j5, j6, j7, f7, i8, pathEffect2, f8, colorFilter2, i9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m4265drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j5, long j6, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j7;
        long j8;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j7 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j7 = j5;
            }
            if ((i6 & 4) != 0) {
                j8 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j7);
            } else {
                j8 = j6;
            }
            if ((i6 & 8) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4187drawOvalAsUm42w(brush, j7, j8, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m4266drawOvalnJ9OG0$default(DrawScope drawScope, long j5, long j6, long j7, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j8;
        long j9;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j8 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j8 = j6;
            }
            if ((i6 & 4) != 0) {
                j9 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j8);
            } else {
                j9 = j7;
            }
            if ((i6 & 8) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4188drawOvalnJ9OG0(j5, j8, j9, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m4267drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 4) != 0) {
                f5 = 1.0f;
            }
            float f6 = f5;
            if ((i6 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i6 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i6 & 32) != 0) {
                i5 = Companion.m4278getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4189drawPathGBMwjPU(path, brush, f6, drawStyle2, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m4268drawPathLG529CI$default(DrawScope drawScope, Path path, long j5, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 4) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 32) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4190drawPathLG529CI(path, j5, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m4269drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i5, long j5, float f5, int i6, PathEffect pathEffect, float f6, ColorFilter colorFilter, int i7, int i8, Object obj) {
        float f7;
        int i9;
        PathEffect pathEffect2;
        float f8;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i8 & 8) != 0) {
                f7 = 0.0f;
            } else {
                f7 = f5;
            }
            if ((i8 & 16) != 0) {
                i9 = StrokeCap.Companion.m4085getButtKaPHkGw();
            } else {
                i9 = i6;
            }
            if ((i8 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i8 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i8 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i8 & 256) != 0) {
                i10 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i7;
            }
            drawScope.mo4191drawPointsF8ZwMP8(list, i5, j5, f7, i9, pathEffect2, f8, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m4270drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i5, Brush brush, float f5, int i6, PathEffect pathEffect, float f6, ColorFilter colorFilter, int i7, int i8, Object obj) {
        float f7;
        int i9;
        PathEffect pathEffect2;
        float f8;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i8 & 8) != 0) {
                f7 = 0.0f;
            } else {
                f7 = f5;
            }
            if ((i8 & 16) != 0) {
                i9 = StrokeCap.Companion.m4085getButtKaPHkGw();
            } else {
                i9 = i6;
            }
            if ((i8 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i8 & 64) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f6;
            }
            if ((i8 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i8 & 256) != 0) {
                i10 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i7;
            }
            drawScope.mo4192drawPointsGsft0Ws(list, i5, brush, f7, i9, pathEffect2, f8, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m4271drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j5, long j6, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j7;
        long j8;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j7 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j7 = j5;
            }
            if ((i6 & 4) != 0) {
                j8 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j7);
            } else {
                j8 = j6;
            }
            if ((i6 & 8) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4193drawRectAsUm42w(brush, j7, j8, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m4272drawRectnJ9OG0$default(DrawScope drawScope, long j5, long j6, long j7, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j8;
        long j9;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j8 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j8 = j6;
            }
            if ((i6 & 4) != 0) {
                j9 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j8);
            } else {
                j9 = j7;
            }
            if ((i6 & 8) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 64) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4194drawRectnJ9OG0(j5, j8, j9, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m4273drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j5, long j6, long j7, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j8;
        long j9;
        long j10;
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j8 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j8 = j5;
            }
            if ((i6 & 4) != 0) {
                j9 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j8);
            } else {
                j9 = j6;
            }
            if ((i6 & 8) != 0) {
                j10 = CornerRadius.Companion.m3478getZerokKHJgLs();
            } else {
                j10 = j7;
            }
            if ((i6 & 16) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 32) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 128) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4195drawRoundRectZuiqVtQ(brush, j8, j9, j10, f6, drawStyle2, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m4274drawRoundRectuAw5IA$default(DrawScope drawScope, long j5, long j6, long j7, long j8, DrawStyle drawStyle, float f5, ColorFilter colorFilter, int i5, int i6, Object obj) {
        long j9;
        long j10;
        long j11;
        DrawStyle drawStyle2;
        float f6;
        ColorFilter colorFilter2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j9 = Offset.Companion.m3509getZeroF1C5BW0();
            } else {
                j9 = j6;
            }
            if ((i6 & 4) != 0) {
                j10 = drawScope.m4275offsetSizePENXr5M(drawScope.mo4277getSizeNHjbRc(), j9);
            } else {
                j10 = j7;
            }
            if ((i6 & 8) != 0) {
                j11 = CornerRadius.Companion.m3478getZerokKHJgLs();
            } else {
                j11 = j8;
            }
            if ((i6 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if ((i6 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 128) != 0) {
                i7 = Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            drawScope.mo4196drawRoundRectuAw5IA(j5, j9, j10, j11, drawStyle2, f6, colorFilter2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m4275offsetSizePENXr5M(long j5, long j6) {
        return SizeKt.Size(Size.m3562getWidthimpl(j5) - Offset.m3493getXimpl(j6), Size.m3559getHeightimpl(j5) - Offset.m3494getYimpl(j6));
    }

    /* renamed from: drawArc-illE91I */
    void mo4178drawArcillE91I(@l Brush brush, float f5, float f6, boolean z4, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawArc-yD3GUKo */
    void mo4179drawArcyD3GUKo(long j5, float f5, float f6, boolean z4, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawCircle-V9BoPsw */
    void mo4180drawCircleV9BoPsw(@l Brush brush, float f5, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo4181drawCircleVaOC9Bg(long j5, float f5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    @k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @b1(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo4182drawImage9jGpkUE(ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo4183drawImageAZ2fEMs(@l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5, int i6) {
        m4261drawImageAZ2fEMs$default(this, imageBitmap, j5, j6, j7, j8, f5, drawStyle, colorFilter, i5, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo4184drawImagegbVJVH8(@l ImageBitmap imageBitmap, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawLine-1RTmtNc */
    void mo4185drawLine1RTmtNc(@l Brush brush, long j5, long j6, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo4186drawLineNGM6Ib0(long j5, long j6, long j7, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6);

    /* renamed from: drawOval-AsUm42w */
    void mo4187drawOvalAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawOval-n-J9OG0 */
    void mo4188drawOvalnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawPath-GBMwjPU */
    void mo4189drawPathGBMwjPU(@l Path path, @l Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawPath-LG529CI */
    void mo4190drawPathLG529CI(@l Path path, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo4191drawPointsF8ZwMP8(@l List<Offset> list, int i5, long j5, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo4192drawPointsGsft0Ws(@l List<Offset> list, int i5, @l Brush brush, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7);

    /* renamed from: drawRect-AsUm42w */
    void mo4193drawRectAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawRect-n-J9OG0 */
    void mo4194drawRectnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo4195drawRoundRectZuiqVtQ(@l Brush brush, long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo4196drawRoundRectuAw5IA(long j5, long j6, long j7, long j8, @l DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f5, @m ColorFilter colorFilter, int i5);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo4276getCenterF1C5BW0() {
        return SizeKt.m3572getCenteruvyYCjk(getDrawContext().mo4202getSizeNHjbRc());
    }

    @l
    DrawContext getDrawContext();

    @l
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4277getSizeNHjbRc() {
        return getDrawContext().mo4202getSizeNHjbRc();
    }
}
