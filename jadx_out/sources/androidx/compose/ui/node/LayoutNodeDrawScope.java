package androidx.compose.ui.node;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001Jq\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017Jq\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJY\u0010!\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JY\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JO\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'Jm\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100Jw\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u000201H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104Jk\u0010>\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=Jk\u0010>\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@JY\u0010C\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJY\u0010C\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJM\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJM\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJq\u0010S\u001a\u00020\u00152\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0M2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJq\u0010S\u001a\u00020\u00152\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0M2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJY\u0010W\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010BJY\u0010W\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010EJc\u0010]\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010\\Jc\u0010]\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010d\u001a\u00020a*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020a*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020`*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001a\u0010j\u001a\u00020`*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001a\u0010j\u001a\u00020`*\u00020aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010mJ\u0017\u0010q\u001a\u00020n*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u0005*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010lJ\u0017\u0010s\u001a\u00020\u0005*\u00020eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010iJ\r\u0010w\u001a\u00020v*\u00020uH\u0097\u0001J\u0017\u0010y\u001a\u00020\f*\u00020nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bx\u0010pJ\u0017\u0010|\u001a\u00020e*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bz\u0010{J\u001a\u0010|\u001a\u00020e*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010{J\u001a\u0010|\u001a\u00020e*\u00020aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\b\u0010\u007f\u001a\u00020\u0015H\u0016J\u0016\u0010\u0083\u0001\u001a\u00020\u0015*\u00030\u0080\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001J;\u0010\u008a\u0001\u001a\u00020\u00152\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J;\u0010\u008d\u0001\u001a\u00020\u00152\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0080\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0091\u0001R\u001c\u0010\u001e\u001a\u00020\n8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010\r\u001a\u00020\f8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0093\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Lkotlin/r2;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;)V", MediationConstant.RIT_TYPE_DRAW, "drawDirect-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;)V", "drawDirect", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/node/DrawModifierNode;", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,128:1\n246#2:129\n74#3:130\n74#3:174\n74#3:175\n74#3:176\n385#4,6:131\n395#4,2:138\n397#4,8:143\n405#4,9:154\n414#4,8:166\n385#4,6:177\n395#4,2:184\n397#4,8:189\n405#4,9:200\n414#4,8:212\n261#5:137\n261#5:183\n234#6,3:140\n237#6,3:163\n234#6,3:186\n237#6,3:209\n1208#7:151\n1187#7,2:152\n1208#7:197\n1187#7,2:198\n542#8,17:220\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:129\n54#1:130\n61#1:174\n73#1:175\n85#1:176\n54#1:131,6\n54#1:138,2\n54#1:143,8\n54#1:154,9\n54#1:166,8\n85#1:177,6\n85#1:184,2\n85#1:189,8\n85#1:200,9\n85#1:212,8\n54#1:137\n85#1:183\n54#1:140,3\n54#1:163,3\n85#1:186,3\n85#1:209,3\n54#1:151\n54#1:152,2\n85#1:197\n85#1:198,2\n98#1:220,17\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;

    @l
    private final CanvasDrawScope canvasDrawScope;

    @m
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LayoutNodeDrawScope(@l CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m5137drawx_KDEd0$ui_release(@l Canvas canvas, long j5, @l NodeCoordinator nodeCoordinator, @l Modifier.Node node) {
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(4);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof DrawModifierNode) {
                m5138drawDirectx_KDEd0$ui_release(canvas, j5, nodeCoordinator, node);
            } else {
                if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                    int i5 = 0;
                    node = node;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            i5++;
                            if (i5 == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        node = node;
                    }
                    if (i5 == 1) {
                    }
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo4178drawArcillE91I(@l Brush brush, float f5, float f6, boolean z4, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4178drawArcillE91I(brush, f5, f6, z4, j5, j6, f7, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo4179drawArcyD3GUKo(long j5, float f5, float f6, boolean z4, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f7, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4179drawArcyD3GUKo(j5, f5, f6, z4, j6, j7, f7, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo4180drawCircleV9BoPsw(@l Brush brush, float f5, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4180drawCircleV9BoPsw(brush, f5, j5, f6, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo4181drawCircleVaOC9Bg(long j5, float f5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f6, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4181drawCircleVaOC9Bg(j5, f5, j6, f6, drawStyle, colorFilter, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        DelegatingNode nextDrawNode;
        boolean z4;
        boolean z5;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        l0.m(drawModifierNode);
        nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (nextDrawNode != 0) {
            int m5204constructorimpl = NodeKind.m5204constructorimpl(4);
            MutableVector mutableVector = null;
            while (nextDrawNode != 0) {
                if (nextDrawNode instanceof DrawModifierNode) {
                    performDraw((DrawModifierNode) nextDrawNode, canvas);
                } else {
                    if ((nextDrawNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && (nextDrawNode instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = nextDrawNode.getDelegate$ui_release();
                        int i5 = 0;
                        nextDrawNode = nextDrawNode;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                i5++;
                                if (i5 == 1) {
                                    nextDrawNode = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nextDrawNode != 0) {
                                        mutableVector.add(nextDrawNode);
                                        nextDrawNode = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            nextDrawNode = nextDrawNode;
                        }
                        if (i5 == 1) {
                        }
                    }
                }
                nextDrawNode = DelegatableNodeKt.pop(mutableVector);
            }
            return;
        }
        NodeCoordinator m5101requireCoordinator64DMado = DelegatableNodeKt.m5101requireCoordinator64DMado(drawModifierNode, NodeKind.m5204constructorimpl(4));
        if (m5101requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
            m5101requireCoordinator64DMado = m5101requireCoordinator64DMado.getWrapped$ui_release();
            l0.m(m5101requireCoordinator64DMado);
        }
        m5101requireCoordinator64DMado.performDraw(canvas);
    }

    /* renamed from: drawDirect-x_KDEd0$ui_release, reason: not valid java name */
    public final void m5138drawDirectx_KDEd0$ui_release(@l Canvas canvas, long j5, @l NodeCoordinator nodeCoordinator, @l DrawModifierNode drawModifierNode) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m4198component4NHjbRc = drawParams.m4198component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(nodeCoordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4201setSizeuvyYCjk(j5);
        canvas.save();
        drawModifierNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m4201setSizeuvyYCjk(m4198component4NHjbRc);
        this.drawNode = drawModifierNode2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @b1(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo4182drawImage9jGpkUE(ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4182drawImage9jGpkUE(imageBitmap, j5, j6, j7, j8, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo4183drawImageAZ2fEMs(@l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5, int i6) {
        this.canvasDrawScope.mo4183drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f5, drawStyle, colorFilter, i5, i6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo4184drawImagegbVJVH8(@l ImageBitmap imageBitmap, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4184drawImagegbVJVH8(imageBitmap, j5, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo4185drawLine1RTmtNc(@l Brush brush, long j5, long j6, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6) {
        this.canvasDrawScope.mo4185drawLine1RTmtNc(brush, j5, j6, f5, i5, pathEffect, f6, colorFilter, i6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo4186drawLineNGM6Ib0(long j5, long j6, long j7, float f5, int i5, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i6) {
        this.canvasDrawScope.mo4186drawLineNGM6Ib0(j5, j6, j7, f5, i5, pathEffect, f6, colorFilter, i6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo4187drawOvalAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4187drawOvalAsUm42w(brush, j5, j6, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo4188drawOvalnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4188drawOvalnJ9OG0(j5, j6, j7, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo4189drawPathGBMwjPU(@l Path path, @l Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4189drawPathGBMwjPU(path, brush, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo4190drawPathLG529CI(@l Path path, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4190drawPathLG529CI(path, j5, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo4191drawPointsF8ZwMP8(@l List<Offset> list, int i5, long j5, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7) {
        this.canvasDrawScope.mo4191drawPointsF8ZwMP8(list, i5, j5, f5, i6, pathEffect, f6, colorFilter, i7);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo4192drawPointsGsft0Ws(@l List<Offset> list, int i5, @l Brush brush, float f5, int i6, @m PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f6, @m ColorFilter colorFilter, int i7) {
        this.canvasDrawScope.mo4192drawPointsGsft0Ws(list, i5, brush, f5, i6, pathEffect, f6, colorFilter, i7);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo4193drawRectAsUm42w(@l Brush brush, long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4193drawRectAsUm42w(brush, j5, j6, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo4194drawRectnJ9OG0(long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4194drawRectnJ9OG0(j5, j6, j7, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo4195drawRoundRectZuiqVtQ(@l Brush brush, long j5, long j6, long j7, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4195drawRoundRectZuiqVtQ(brush, j5, j6, j7, f5, drawStyle, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo4196drawRoundRectuAw5IA(long j5, long j6, long j7, long j8, @l DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f5, @m ColorFilter colorFilter, int i5) {
        this.canvasDrawScope.mo4196drawRoundRectuAw5IA(j5, j6, j7, j8, drawStyle, f5, colorFilter, i5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo4276getCenterF1C5BW0() {
        return this.canvasDrawScope.mo4276getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo4277getSizeNHjbRc() {
        return this.canvasDrawScope.mo4277getSizeNHjbRc();
    }

    public final void performDraw(@l DrawModifierNode drawModifierNode, @l Canvas canvas) {
        NodeCoordinator m5101requireCoordinator64DMado = DelegatableNodeKt.m5101requireCoordinator64DMado(drawModifierNode, NodeKind.m5204constructorimpl(4));
        m5101requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m5138drawDirectx_KDEd0$ui_release(canvas, IntSizeKt.m6224toSizeozmzZPI(m5101requireCoordinator64DMado.mo5005getSizeYbymL2g()), m5101requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo297roundToPxR2X_6o(long j5) {
        return this.canvasDrawScope.mo297roundToPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo298roundToPx0680j_4(float f5) {
        return this.canvasDrawScope.mo298roundToPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo299toDpGaN1DYA(long j5) {
        return this.canvasDrawScope.mo299toDpGaN1DYA(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo300toDpu2uoSUM(float f5) {
        return this.canvasDrawScope.mo300toDpu2uoSUM(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo301toDpu2uoSUM(int i5) {
        return this.canvasDrawScope.mo301toDpu2uoSUM(i5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo302toDpSizekrfVVM(long j5) {
        return this.canvasDrawScope.mo302toDpSizekrfVVM(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo303toPxR2X_6o(long j5) {
        return this.canvasDrawScope.mo303toPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo304toPx0680j_4(float f5) {
        return this.canvasDrawScope.mo304toPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect toRect(@l DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo305toSizeXkaWNTQ(long j5) {
        return this.canvasDrawScope.mo305toSizeXkaWNTQ(j5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo306toSp0xMU5do(float f5) {
        return this.canvasDrawScope.mo306toSp0xMU5do(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo307toSpkPz2Gy4(float f5) {
        return this.canvasDrawScope.mo307toSpkPz2Gy4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo308toSpkPz2Gy4(int i5) {
        return this.canvasDrawScope.mo308toSpkPz2Gy4(i5);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i5, w wVar) {
        this((i5 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
