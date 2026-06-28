package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b \u0018\u0000 ¢\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¢\u0002£\u0002B\u0013\u0012\b\u0010¤\u0001\u001a\u00030£\u0001¢\u0006\u0006\b \u0002\u0010¡\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\r\u001a\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u0005H\u0002J@\u0010)\u001a\u00020\u0014*\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(JH\u0010-\u001a\u00020\u0014*\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,JH\u0010/\u001a\u00020\u0014*\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010,J\f\u00100\u001a\u00020\u0000*\u00020\u0003H\u0002J\"\u00106\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J\"\u00108\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00105J\"\u0010<\u001a\u00020!2\u0006\u00101\u001a\u00020\u00002\u0006\u00109\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;J \u0010<\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0018\u0010A\u001a\u00020\u00142\u0006\u0010@\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u001a\u0010D\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ-\u0010H\u001a\u00020\u00142\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u0012H\u0086\bJ=\u0010H\u001a\u00020\u0014\"\u0006\b\u0000\u0010I\u0018\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001e\u0010N\u001a\u0004\u0018\u00010\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0006\u0010O\u001a\u00020\u0005J\u000f\u0010R\u001a\u00020\u0014H\u0010¢\u0006\u0004\bP\u0010QJ\b\u0010S\u001a\u00020\u0014H&J\u0018\u0010V\u001a\u00020\u00142\u0006\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020EH\u0014J\u000f\u0010X\u001a\u00020\u0014H\u0000¢\u0006\u0004\bW\u0010QJ+\u0010_\u001a\u00020\\2\u0006\u0010Z\u001a\u00020Y2\u000e\b\u0004\u0010G\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0084\bø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0006\u0010`\u001a\u00020\u0014J=\u0010b\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\ba\u0010\u0018J;\u0010d\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\bc\u0010\u0018J\u000e\u0010e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0006\u0010g\u001a\u00020\u0014J+\u0010i\u001a\u00020\u00142\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u00152\b\b\u0002\u0010h\u001a\u00020\u0005J8\u0010l\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ:\u0010n\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\bm\u0010kJ\u0006\u0010p\u001a\u00020oJ\u001a\u0010s\u001a\u00020!2\u0006\u0010q\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\br\u0010CJ\u001a\u0010v\u001a\u00020!2\u0006\u0010t\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\bu\u0010CJ\"\u0010{\u001a\u00020!2\u0006\u0010w\u001a\u00020\u00032\u0006\u0010x\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\by\u0010zJ\"\u0010~\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u00032\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020o2\u0006\u0010w\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0005H\u0016J\u001c\u0010\u0081\u0001\u001a\u00020!2\u0006\u0010t\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010CJ&\u0010\u0082\u0001\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u0012H\u0084\bJ\u001c\u0010\u0084\u0001\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010CJ\u001c\u0010\u0086\u0001\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010CJ\u001b\u0010\u0089\u0001\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0004J\u0007\u0010\u008a\u0001\u001a\u00020\u0014J\u0007\u0010\u008b\u0001\u001a\u00020\u0014J-\u0010\u008f\u0001\u001a\u00020\u00142\u0006\u0010@\u001a\u00020=2\u0006\u0010?\u001a\u00020\u00052\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001d\u0010\u0092\u0001\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001d\u0010\u0094\u0001\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0091\u0001J\t\u0010\u0095\u0001\u001a\u00020\u0014H\u0016J\t\u0010\u0096\u0001\u001a\u00020\u0014H\u0016J\u001b\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0007\u0010\u009b\u0001\u001a\u00020\u0005J\u001f\u0010\u009f\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u009e\u0001\u0010CJ'\u0010¢\u0001\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001R \u0010¤\u0001\u001a\u00030£\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R+\u0010¨\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R+\u0010®\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010©\u0001\u001a\u0006\b¯\u0001\u0010«\u0001\"\u0006\b°\u0001\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001RN\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u00152\u001a\u0010´\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u00158\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b\u0016\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010¹\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010¼\u0001\u001a\u00030»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R)\u0010Å\u0001\u001a\u0012\u0012\u0005\u0012\u00030Ä\u0001\u0012\u0004\u0012\u00020E\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R6\u0010\u000f\u001a\u00020\u000e2\u0007\u0010´\u0001\u001a\u00020\u000e8\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u000f\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R0\u0010\u0011\u001a\u00020\u00102\u0007\u0010´\u0001\u001a\u00020\u00108\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0011\u0010¿\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R\u001b\u0010Ð\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R*\u0010Õ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÕ\u0001\u0010µ\u0001\u0012\u0005\bÖ\u0001\u0010QR\u001d\u0010×\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140[8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R*\u0010Ù\u0001\u001a\u00020\u00052\u0007\u0010´\u0001\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÙ\u0001\u0010²\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R0\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ç\u0001\u001a\u00020\u00078&X¦\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ê\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0017\u0010ì\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010Í\u0001R\u0017\u0010î\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010Í\u0001R\u0019\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0017\u0010ô\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u001b\u0010÷\u0001\u001a\u00030õ\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bö\u0001\u0010É\u0001R\u0018\u0010û\u0001\u001a\u00030ø\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010ý\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ð\u0001R\u0017\u0010ÿ\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010Û\u0001R\u0017\u0010\u0080\u0002\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010Û\u0001R,\u0010\u0086\u0002\u001a\u00030À\u00012\b\u0010\u0081\u0002\u001a\u00030À\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R0\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0087\u00022\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0087\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001f\u0010\u0090\u0002\u001a\n\u0012\u0005\u0012\u00030Ä\u00010\u008d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001a\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0091\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0016\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010ó\u0001R\u0016\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010ó\u0001R\u0017\u0010\u009b\u0002\u001a\u00020=8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001d\u0010\u009d\u0002\u001a\u00020Y8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010É\u0001R\u0017\u0010\u009e\u0002\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010Û\u0001R\u001b\u0010\u009d\u0001\u001a\u00030\u009c\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010É\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", "headNode", "Landroidx/compose/ui/node/NodeKind;", "type", "hasNode-H91voCI", "(I)Z", "hasNode", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "Lkotlin/u;", "layerBlock", "placeSelf-f8xVGno", "(JFLv3/l;)V", "placeSelf", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawContainedDrawModifiers", "invokeOnLayoutChange", "updateLayerParameters", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hit-1hIXUjU", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hit", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "hitNear", "speculativeHit-JHbHoSQ", "speculativeHit", "toCoordinator", "ancestor", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", "bounds", "fromParentRect", "offsetFromEdge-MK-Hz9U", "(J)J", "offsetFromEdge", "", "mask", "block", "visitNodes", "T", "visitNodes-aLcG6gQ", "(ILv3/l;)V", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "head", "isTransparent", "replace$ui_release", "()V", "replace", "ensureLookaheadDelegateCreated", "width", "height", "onMeasureResultChanged", "onCoordinatesUsed$ui_release", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLv3/a;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "placeAt-f8xVGno", "placeAt", "placeSelfApparentToRealOffset-f8xVGno", "placeSelfApparentToRealOffset", MediationConstant.RIT_TYPE_DRAW, "performDraw", "onPlaced", "forceUpdateLayerParameters", "updateLayerBlock", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "localBoundingBoxOf", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "onLayoutNodeAttach", "onRelease", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "released", "Z", "isClipping", "<set-?>", "Lv3/l;", "getLayerBlock", "()Lv3/l;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "getZIndex", "()F", "setZIndex", "(F)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "drawBlock", "getDrawBlock$annotations", "invalidateParentLayer", "Lv3/a;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "()Z", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", b.f22420d, "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1329:1\n95#1,5:1330\n100#1,4:1378\n95#1,9:1382\n106#1:1393\n95#1,13:1394\n108#1:1450\n100#1,10:1451\n106#1:1523\n95#1,13:1524\n108#1:1580\n100#1,10:1581\n106#1:1596\n95#1,13:1597\n108#1:1653\n100#1,10:1654\n385#2,6:1335\n395#2,2:1342\n397#2,8:1347\n405#2,9:1358\n414#2,8:1370\n385#2,6:1407\n395#2,2:1414\n397#2,8:1419\n405#2,9:1430\n414#2,8:1442\n385#2,6:1468\n395#2,2:1475\n397#2,8:1480\n405#2,9:1491\n414#2,8:1503\n385#2,6:1537\n395#2,2:1544\n397#2,8:1549\n405#2,9:1560\n414#2,8:1572\n385#2,6:1610\n395#2,2:1617\n397#2,8:1622\n405#2,9:1633\n414#2,8:1645\n206#2:1666\n207#2,8:1668\n219#2:1678\n190#2:1679\n191#2,6:1681\n220#2:1687\n385#2,6:1688\n395#2,2:1695\n397#2,8:1700\n405#2,9:1711\n414#2,8:1723\n221#2:1731\n198#2,3:1732\n261#3:1341\n261#3:1413\n261#3:1466\n261#3:1474\n261#3:1543\n261#3:1616\n261#3:1694\n234#4,3:1344\n237#4,3:1367\n234#4,3:1416\n237#4,3:1439\n234#4,3:1477\n237#4,3:1500\n234#4,3:1546\n237#4,3:1569\n234#4,3:1619\n237#4,3:1642\n234#4,3:1697\n237#4,3:1720\n1208#5:1355\n1187#5,2:1356\n1208#5:1427\n1187#5,2:1428\n1208#5:1488\n1187#5,2:1489\n1208#5:1557\n1187#5,2:1558\n1208#5:1630\n1187#5,2:1631\n1208#5:1708\n1187#5,2:1709\n1#6:1391\n1#6:1667\n1#6:1680\n74#7:1392\n82#7:1461\n82#7:1465\n82#7:1467\n84#7:1514\n84#7:1522\n74#7:1594\n84#7:1595\n72#7:1664\n72#7:1665\n78#7:1676\n78#7:1677\n756#8,3:1462\n759#8,3:1511\n495#9,4:1515\n500#9:1592\n129#10,3:1519\n133#10:1591\n86#11:1593\n66#12,5:1735\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n106#1:1330,5\n106#1:1378,4\n116#1:1382,9\n214#1:1393\n214#1:1394,13\n214#1:1450\n214#1:1451,10\n293#1:1523\n293#1:1524,13\n293#1:1580\n293#1:1581,10\n373#1:1596\n373#1:1597,13\n373#1:1653\n373#1:1654,10\n107#1:1335,6\n107#1:1342,2\n107#1:1347,8\n107#1:1358,9\n107#1:1370,8\n214#1:1407,6\n214#1:1414,2\n214#1:1419,8\n214#1:1430,9\n214#1:1442,8\n238#1:1468,6\n238#1:1475,2\n238#1:1480,8\n238#1:1491,9\n238#1:1503,8\n293#1:1537,6\n293#1:1544,2\n293#1:1549,8\n293#1:1560,9\n293#1:1572,8\n373#1:1610,6\n373#1:1617,2\n373#1:1622,8\n373#1:1633,9\n373#1:1645,8\n1041#1:1666\n1041#1:1668,8\n1076#1:1678\n1076#1:1679\n1076#1:1681,6\n1076#1:1687\n1076#1:1688,6\n1076#1:1695,2\n1076#1:1700,8\n1076#1:1711,9\n1076#1:1723,8\n1076#1:1731\n1076#1:1732,3\n107#1:1341\n214#1:1413\n237#1:1466\n238#1:1474\n293#1:1543\n373#1:1616\n1076#1:1694\n107#1:1344,3\n107#1:1367,3\n214#1:1416,3\n214#1:1439,3\n238#1:1477,3\n238#1:1500,3\n293#1:1546,3\n293#1:1569,3\n373#1:1619,3\n373#1:1642,3\n1076#1:1697,3\n1076#1:1720,3\n107#1:1355\n107#1:1356,2\n214#1:1427\n214#1:1428,2\n238#1:1488\n238#1:1489,2\n293#1:1557\n293#1:1558,2\n373#1:1630\n373#1:1631,2\n1076#1:1708\n1076#1:1709,2\n1041#1:1667\n1076#1:1680\n214#1:1392\n230#1:1461\n237#1:1465\n238#1:1467\n291#1:1514\n293#1:1522\n359#1:1594\n373#1:1595\n652#1:1664\n1041#1:1665\n1073#1:1676\n1076#1:1677\n236#1:1462,3\n236#1:1511,3\n292#1:1515,4\n292#1:1592\n292#1:1519,3\n292#1:1591\n339#1:1593\n1120#1:1735,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;

    @l
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @l
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    @m
    private MeasureResult _measureResult;

    @m
    private MutableRect _rectCache;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;

    @m
    private OwnedLayer layer;

    @m
    private v3.l<? super GraphicsLayerScope, r2> layerBlock;

    @m
    private LayerPositionalProperties layerPositionalProperties;

    @l
    private final LayoutNode layoutNode;

    @m
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private boolean released;

    @m
    private NodeCoordinator wrapped;

    @m
    private NodeCoordinator wrappedBy;
    private float zIndex;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final v3.l<NodeCoordinator, r2> onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;

    @l
    private static final v3.l<NodeCoordinator, r2> onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;

    @l
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @l
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @l
    private static final float[] tmpMatrix = Matrix.m3964constructorimpl$default(null, 1, null);

    @l
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo5199childHitTestYqVAtuI(@l LayoutNode layoutNode, long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
            layoutNode.m5127hitTestM_7yMNQ$ui_release(j5, hitTestResult, z4, z5);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo5200entityTypeOLwlOKw() {
            return NodeKind.m5204constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@l Modifier.Node node) {
            boolean z4;
            boolean z5;
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
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
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@l LayoutNode layoutNode) {
            return true;
        }
    };

    @l
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo5199childHitTestYqVAtuI(@l LayoutNode layoutNode, long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
            layoutNode.m5128hitTestSemanticsM_7yMNQ$ui_release(j5, hitTestResult, z4, z5);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo5200entityTypeOLwlOKw() {
            return NodeKind.m5204constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@l Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@l LayoutNode layoutNode) {
            SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
            boolean z4 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z4 = true;
            }
            return !z4;
        }
    };

    @l
    private Density layerDensity = getLayoutNode().getDensity();

    @l
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m6182getZeronOccac();

    @l
    private final v3.l<Canvas, r2> drawBlock = new NodeCoordinator$drawBlock$1(this);

    @l
    private final v3.a<r2> invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);

    @i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lkotlin/r2;", "onCommitAffectingLayer", "Lv3/l;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @l
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J:\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH&ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "entityType", "Landroidx/compose/ui/Modifier$Node;", "node", "", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "shouldHitTestChildren", "layoutNode", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/r2;", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "childHitTest", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo5199childHitTestYqVAtuI(@l LayoutNode layoutNode, long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5);

        /* renamed from: entityType-OLwlOKw */
        int mo5200entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@l Modifier.Node node);

        boolean shouldHitTestChildren(@l LayoutNode layoutNode);
    }

    public NodeCoordinator(@l LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z4) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z4);
        }
        fromParentRect(mutableRect, z4);
    }

    /* renamed from: ancestorToLocal-R5De75A */
    private final long m5176ancestorToLocalR5De75A(NodeCoordinator nodeCoordinator, long j5) {
        if (nodeCoordinator == this) {
            return j5;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null && !l0.g(nodeCoordinator, nodeCoordinator2)) {
            return m5187fromParentPositionMKHz9U(nodeCoordinator2.m5176ancestorToLocalR5De75A(nodeCoordinator, j5));
        }
        return m5187fromParentPositionMKHz9U(j5);
    }

    public final void drawContainedDrawModifiers(Canvas canvas) {
        Modifier.Node m5190headH91voCI = m5190headH91voCI(NodeKind.m5204constructorimpl(4));
        if (m5190headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m5137drawx_KDEd0$ui_release(canvas, IntSizeKt.m6224toSizeozmzZPI(mo5005getSizeYbymL2g()), this, m5190headH91voCI);
        }
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z4) {
        float m6172getXimpl = IntOffset.m6172getXimpl(mo5151getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m6172getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m6172getXimpl);
        float m6173getYimpl = IntOffset.m6173getYimpl(mo5151getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m6173getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m6173getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z4) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m6214getWidthimpl(mo5005getSizeYbymL2g()), IntSize.m6213getHeightimpl(mo5005getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private static /* synthetic */ void getDrawBlock$annotations() {
    }

    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI */
    private final boolean m5177hasNodeH91voCI(int i5) {
        Modifier.Node headNode = headNode(NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(i5));
        return headNode != null && DelegatableNodeKt.m5099has64DMado(headNode, i5);
    }

    public final Modifier.Node headNode(boolean z4) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z4) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* renamed from: hit-1hIXUjU */
    public final void m5178hit1hIXUjU(Modifier.Node node, HitTestSource hitTestSource, long j5, HitTestResult hitTestResult, boolean z4, boolean z5) {
        if (node == null) {
            mo5122hitTestChildYqVAtuI(hitTestSource, j5, hitTestResult, z4, z5);
        } else {
            hitTestResult.hit(node, z5, new NodeCoordinator$hit$1(this, node, hitTestSource, j5, hitTestResult, z4, z5));
        }
    }

    /* renamed from: hitNear-JHbHoSQ */
    public final void m5179hitNearJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j5, HitTestResult hitTestResult, boolean z4, boolean z5, float f5) {
        if (node == null) {
            mo5122hitTestChildYqVAtuI(hitTestSource, j5, hitTestResult, z4, z5);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f5, z5, new NodeCoordinator$hitNear$1(this, node, hitTestSource, j5, hitTestResult, z4, z5, f5));
        }
    }

    /* renamed from: offsetFromEdge-MK-Hz9U */
    private final long m5180offsetFromEdgeMKHz9U(long j5) {
        float measuredWidth;
        float measuredHeight;
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        if (m3493getXimpl < 0.0f) {
            measuredWidth = -m3493getXimpl;
        } else {
            measuredWidth = m3493getXimpl - getMeasuredWidth();
        }
        float max = Math.max(0.0f, measuredWidth);
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        if (m3494getYimpl < 0.0f) {
            measuredHeight = -m3494getYimpl;
        } else {
            measuredHeight = m3494getYimpl - getMeasuredHeight();
        }
        return OffsetKt.Offset(max, Math.max(0.0f, measuredHeight));
    }

    /* renamed from: placeSelf-f8xVGno */
    private final void m5181placeSelff8xVGno(long j5, float f5, v3.l<? super GraphicsLayerScope, r2> lVar) {
        updateLayerBlock$default(this, lVar, false, 2, null);
        if (!IntOffset.m6171equalsimpl0(mo5151getPositionnOccac(), j5)) {
            m5195setPositiongyyYBs(j5);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5254movegyyYBs(j5);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f5;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z4, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z4, z5);
    }

    /* renamed from: speculativeHit-JHbHoSQ */
    public final void m5182speculativeHitJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j5, HitTestResult hitTestResult, boolean z4, boolean z5, float f5) {
        Modifier.Node m5202nextUntilhw7D004;
        if (node == null) {
            mo5122hitTestChildYqVAtuI(hitTestSource, j5, hitTestResult, z4, z5);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f5, z5, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j5, hitTestResult, z4, z5, f5));
        } else {
            m5202nextUntilhw7D004 = NodeCoordinatorKt.m5202nextUntilhw7D004(node, hitTestSource.mo5200entityTypeOLwlOKw(), NodeKind.m5204constructorimpl(2));
            m5182speculativeHitJHbHoSQ(m5202nextUntilhw7D004, hitTestSource, j5, hitTestResult, z4, z5, f5);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        l0.n(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: transformFromAncestor-EL8BTi8 */
    private final void m5183transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!l0.g(nodeCoordinator, this)) {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            l0.m(nodeCoordinator2);
            nodeCoordinator2.m5183transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
            if (!IntOffset.m6171equalsimpl0(mo5151getPositionnOccac(), IntOffset.Companion.m6182getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m3973resetimpl(fArr2);
                Matrix.m3984translateimpl$default(fArr2, -IntOffset.m6172getXimpl(mo5151getPositionnOccac()), -IntOffset.m6173getYimpl(mo5151getPositionnOccac()), 0.0f, 4, null);
                Matrix.m3981timesAssign58bKbWc(fArr, fArr2);
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5251inverseTransform58bKbWc(fArr);
            }
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8 */
    private final void m5184transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!l0.g(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5256transform58bKbWc(fArr);
            }
            if (!IntOffset.m6171equalsimpl0(nodeCoordinator2.mo5151getPositionnOccac(), IntOffset.Companion.m6182getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m3973resetimpl(fArr2);
                Matrix.m3984translateimpl$default(fArr2, IntOffset.m6172getXimpl(r1), IntOffset.m6173getYimpl(r1), 0.0f, 4, null);
                Matrix.m3981timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            l0.m(nodeCoordinator2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, v3.l lVar, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        nodeCoordinator.updateLayerBlock(lVar, z4);
    }

    private final void updateLayerParameters(boolean z4) {
        boolean z5;
        Owner owner$ui_release;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            v3.l<? super GraphicsLayerScope, r2> lVar = this.layerBlock;
            if (lVar != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.m4044setSizeuvyYCjk(IntSizeKt.m6224toSizeozmzZPI(mo5005getSizeYbymL2g()));
                getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new NodeCoordinator$updateLayerParameters$1(lVar));
                LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties;
                }
                layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
                ownedLayer.updateLayerProperties(reusableGraphicsLayerScope, getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
                this.isClipping = reusableGraphicsLayerScope.getClip();
                this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
                if (z4 && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode());
                    return;
                }
                return;
            }
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        }
        if (this.layerBlock == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
        } else {
            throw new IllegalStateException("null layer with a non-null layerBlock".toString());
        }
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        nodeCoordinator.updateLayerParameters(z4);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU */
    protected final long m5185calculateMinimumTouchTargetPaddingE7KxVPU(long j5) {
        return SizeKt.Size(Math.max(0.0f, (Size.m3562getWidthimpl(j5) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m3559getHeightimpl(j5) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw */
    public final float m5186distanceInMinimumTouchTargettz77jQw(long j5, long j6) {
        if (getMeasuredWidth() >= Size.m3562getWidthimpl(j6) && getMeasuredHeight() >= Size.m3559getHeightimpl(j6)) {
            return Float.POSITIVE_INFINITY;
        }
        long m5185calculateMinimumTouchTargetPaddingE7KxVPU = m5185calculateMinimumTouchTargetPaddingE7KxVPU(j6);
        float m3562getWidthimpl = Size.m3562getWidthimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU);
        float m3559getHeightimpl = Size.m3559getHeightimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU);
        long m5180offsetFromEdgeMKHz9U = m5180offsetFromEdgeMKHz9U(j5);
        if ((m3562getWidthimpl <= 0.0f && m3559getHeightimpl <= 0.0f) || Offset.m3493getXimpl(m5180offsetFromEdgeMKHz9U) > m3562getWidthimpl || Offset.m3494getYimpl(m5180offsetFromEdgeMKHz9U) > m3559getHeightimpl) {
            return Float.POSITIVE_INFINITY;
        }
        return Offset.m3492getDistanceSquaredimpl(m5180offsetFromEdgeMKHz9U);
    }

    public final void draw(@l Canvas canvas) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m6172getXimpl = IntOffset.m6172getXimpl(mo5151getPositionnOccac());
        float m6173getYimpl = IntOffset.m6173getYimpl(mo5151getPositionnOccac());
        canvas.translate(m6172getXimpl, m6173getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m6172getXimpl, -m6173getYimpl);
    }

    public final void drawBorder(@l Canvas canvas, @l Paint paint) {
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m6214getWidthimpl(m5045getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m6213getHeightimpl(m5045getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @l
    public final NodeCoordinator findCommonAncestor$ui_release(@l NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int m5204constructorimpl = NodeKind.m5204constructorimpl(2);
            if (tail2.getNode().isAttached()) {
                for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0 && parent$ui_release == tail) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            l0.m(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            l0.m(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        if (layoutNode != nodeCoordinator.getLayoutNode()) {
            return layoutNode.getInnerCoordinator$ui_release();
        }
        return nodeCoordinator;
    }

    /* renamed from: fromParentPosition-MK-Hz9U */
    public long m5187fromParentPositionMKHz9U(long j5) {
        long m6184minusNvtHpc = IntOffsetKt.m6184minusNvtHpc(j5, mo5151getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            return ownedLayer.mo5253mapOffset8S9VItk(m6184minusNvtHpc, true);
        }
        return m6184minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release */
    public final long m5188getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m5046getMeasurementConstraintsmsEJaDk();
    }

    @m
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @m
    protected final v3.l<GraphicsLayerScope, r2> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @l
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @m
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc */
    public final long m5189getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo305toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo5131getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @m
    public Object getParentData() {
        boolean z4;
        boolean z5;
        boolean z6;
        if (!getLayoutNode().getNodes$ui_release().m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(64))) {
            return null;
        }
        getTail();
        k1.h hVar = new k1.h();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((NodeKind.m5204constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int m5204constructorimpl = NodeKind.m5204constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNode = tail$ui_release;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        hVar.element = ((ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), hVar.element);
                    } else {
                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i5 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    i5++;
                                    if (i5 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i5 == 1) {
                            }
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return hVar.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo5151getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Set<AlignmentLine> k5;
        Map<AlignmentLine, Integer> map;
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            if (measureResult != null) {
                map = measureResult.getAlignmentLines();
            } else {
                map = null;
            }
            boolean z4 = false;
            if (map != null && (!map.isEmpty())) {
                z4 = true;
            }
            if (z4) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(map.keySet());
            }
        }
        if (linkedHashSet == null) {
            k5 = l1.k();
            return k5;
        }
        return linkedHashSet;
    }

    @l
    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo5005getSizeYbymL2g() {
        return m5045getMeasuredSizeYbymL2g();
    }

    @l
    public abstract Modifier.Node getTail();

    @m
    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    @m
    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @m
    /* renamed from: head-H91voCI */
    public final Modifier.Node m5190headH91voCI(int i5) {
        boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(i5);
        Modifier.Node tail = getTail();
        if (m5213getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i5) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & i5) != 0) {
                    return headNode;
                }
                if (headNode == tail) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: hitTest-YqVAtuI */
    public final void m5191hitTestYqVAtuI(@l HitTestSource hitTestSource, long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
        float m5186distanceInMinimumTouchTargettz77jQw;
        Modifier.Node m5190headH91voCI = m5190headH91voCI(hitTestSource.mo5200entityTypeOLwlOKw());
        boolean z6 = true;
        if (!m5198withinLayerBoundsk4lQ0M(j5)) {
            if (z4) {
                float m5186distanceInMinimumTouchTargettz77jQw2 = m5186distanceInMinimumTouchTargettz77jQw(j5, m5189getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(m5186distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(m5186distanceInMinimumTouchTargettz77jQw2)) {
                    z6 = false;
                }
                if (z6 && hitTestResult.isHitInMinimumTouchTargetBetter(m5186distanceInMinimumTouchTargettz77jQw2, false)) {
                    m5179hitNearJHbHoSQ(m5190headH91voCI, hitTestSource, j5, hitTestResult, z4, false, m5186distanceInMinimumTouchTargettz77jQw2);
                    return;
                }
                return;
            }
            return;
        }
        if (m5190headH91voCI == null) {
            mo5122hitTestChildYqVAtuI(hitTestSource, j5, hitTestResult, z4, z5);
            return;
        }
        if (m5192isPointerInBoundsk4lQ0M(j5)) {
            m5178hit1hIXUjU(m5190headH91voCI, hitTestSource, j5, hitTestResult, z4, z5);
            return;
        }
        if (!z4) {
            m5186distanceInMinimumTouchTargettz77jQw = Float.POSITIVE_INFINITY;
        } else {
            m5186distanceInMinimumTouchTargettz77jQw = m5186distanceInMinimumTouchTargettz77jQw(j5, m5189getMinimumTouchTargetSizeNHjbRc());
        }
        float f5 = m5186distanceInMinimumTouchTargettz77jQw;
        if (Float.isInfinite(f5) || Float.isNaN(f5)) {
            z6 = false;
        }
        if (z6 && hitTestResult.isHitInMinimumTouchTargetBetter(f5, z5)) {
            m5179hitNearJHbHoSQ(m5190headH91voCI, hitTestSource, j5, hitTestResult, z4, z5, f5);
        } else {
            m5182speculativeHitJHbHoSQ(m5190headH91voCI, hitTestSource, j5, hitTestResult, z4, z5, f5);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo5122hitTestChildYqVAtuI(@l HitTestSource hitTestSource, long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m5191hitTestYqVAtuI(hitTestSource, nodeCoordinator.m5187fromParentPositionMKHz9U(j5), hitTestResult, z4, z5);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M */
    protected final boolean m5192isPointerInBoundsk4lQ0M(long j5) {
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        if (m3493getXimpl >= 0.0f && m3494getYimpl >= 0.0f && m3493getXimpl < getMeasuredWidth() && m3494getYimpl < getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Rect localBoundingBoxOf(@l LayoutCoordinates layoutCoordinates, boolean z4) {
        if (isAttached()) {
            if (layoutCoordinates.isAttached()) {
                NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
                coordinator.onCoordinatesUsed$ui_release();
                NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
                MutableRect rectCache = getRectCache();
                rectCache.setLeft(0.0f);
                rectCache.setTop(0.0f);
                rectCache.setRight(IntSize.m6214getWidthimpl(layoutCoordinates.mo5005getSizeYbymL2g()));
                rectCache.setBottom(IntSize.m6213getHeightimpl(layoutCoordinates.mo5005getSizeYbymL2g()));
                while (coordinator != findCommonAncestor$ui_release) {
                    rectInParent$ui_release$default(coordinator, rectCache, z4, false, 4, null);
                    if (rectCache.isEmpty()) {
                        return Rect.Companion.getZero();
                    }
                    coordinator = coordinator.wrappedBy;
                    l0.m(coordinator);
                }
                ancestorToLocal(findCommonAncestor$ui_release, rectCache, z4);
                return MutableRectKt.toRect(rectCache);
            }
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates + " is not attached!").toString());
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo5006localPositionOfR5De75A(@l LayoutCoordinates layoutCoordinates, long j5) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return Offset.m3502unaryMinusF1C5BW0(layoutCoordinates.mo5006localPositionOfR5De75A(this, Offset.m3502unaryMinusF1C5BW0(j5)));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j5 = coordinator.m5196toParentPositionMKHz9U(j5);
            coordinator = coordinator.wrappedBy;
            l0.m(coordinator);
        }
        return m5176ancestorToLocalR5De75A(findCommonAncestor$ui_release, j5);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo5007localToRootMKHz9U(long j5) {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
                j5 = nodeCoordinator.m5196toParentPositionMKHz9U(j5);
            }
            return j5;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo5008localToWindowMKHz9U(long j5) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo5258calculatePositionInWindowMKHz9U(mo5007localToRootMKHz9U(j5));
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void onMeasureResultChanged(int i5, int i6) {
        boolean z4;
        boolean z5;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo5255resizeozmzZPI(IntSizeKt.IntSize(i5, i6));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i5, i6));
        updateLayerParameters(false);
        int m5204constructorimpl = NodeKind.m5204constructorimpl(4);
        boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(m5204constructorimpl);
        Modifier.Node tail = getTail();
        if (m5213getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i7 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i7++;
                                        if (i7 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i7 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        boolean z4;
        boolean z5;
        if (m5177hasNodeH91voCI(NodeKind.m5204constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int m5204constructorimpl = NodeKind.m5204constructorimpl(128);
                    boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(m5204constructorimpl);
                    if (m5213getIncludeSelfInTraversalH91voCI) {
                        parent$ui_release = getTail();
                    } else {
                        parent$ui_release = getTail().getParent$ui_release();
                        if (parent$ui_release == null) {
                            r2 r2Var = r2.f19517a;
                        }
                    }
                    for (Modifier.Node headNode = headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                        if ((headNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = headNode;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof LayoutAwareModifierNode) {
                                    ((LayoutAwareModifierNode) delegatingNode).mo294onRemeasuredozmzZPI(m5045getMeasuredSizeYbymL2g());
                                } else {
                                    if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i5++;
                                                if (i5 == 1) {
                                                    delegatingNode = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNode != 0) {
                                                        mutableVector.add(delegatingNode);
                                                        delegatingNode = 0;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                            delegatingNode = delegatingNode;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        if (headNode == parent$ui_release) {
                            break;
                        }
                    }
                    r2 r2Var2 = r2.f19517a;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(128);
        boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(m5204constructorimpl);
        Modifier.Node tail = getTail();
        if (m5213getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i5 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5++;
                                        if (i5 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public void performDraw(@l Canvas canvas) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    @l
    /* renamed from: performingMeasure-K40F9xA */
    protected final Placeable m5193performingMeasureK40F9xA(long j5, @l v3.a<? extends Placeable> aVar) {
        m5048setMeasurementConstraintsBRTryo0(j5);
        return aVar.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        m5181placeSelff8xVGno(j5, f5, lVar);
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno */
    public final void m5194placeSelfApparentToRealOffsetf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        long m5044getApparentToRealOffsetnOccac = m5044getApparentToRealOffsetnOccac();
        m5181placeSelff8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(m5044getApparentToRealOffsetnOccac), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(m5044getApparentToRealOffsetnOccac)), f5, lVar);
    }

    public final void rectInParent$ui_release(@l MutableRect mutableRect, boolean z4, boolean z5) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z5) {
                    long m5189getMinimumTouchTargetSizeNHjbRc = m5189getMinimumTouchTargetSizeNHjbRc();
                    float m3562getWidthimpl = Size.m3562getWidthimpl(m5189getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m3559getHeightimpl = Size.m3559getHeightimpl(m5189getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    mutableRect.intersect(-m3562getWidthimpl, -m3559getHeightimpl, IntSize.m6214getWidthimpl(mo5005getSizeYbymL2g()) + m3562getWidthimpl, IntSize.m6213getHeightimpl(mo5005getSizeYbymL2g()) + m3559getHeightimpl);
                } else if (z4) {
                    mutableRect.intersect(0.0f, 0.0f, IntSize.m6214getWidthimpl(mo5005getSizeYbymL2g()), IntSize.m6213getHeightimpl(mo5005getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float m6172getXimpl = IntOffset.m6172getXimpl(mo5151getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + m6172getXimpl);
        mutableRect.setRight(mutableRect.getRight() + m6172getXimpl);
        float m6173getYimpl = IntOffset.m6173getYimpl(mo5151getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + m6173getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + m6173getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4999placeAtf8xVGno(mo5151getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    protected abstract void setLookaheadDelegate(@m LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui_release(@l MeasureResult measureResult) {
        boolean z4;
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (map != null && !map.isEmpty()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((!z4 || (!measureResult.getAlignmentLines().isEmpty())) && !l0.g(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs */
    protected void m5195setPositiongyyYBs(long j5) {
        this.position = j5;
    }

    public final void setWrapped$ui_release(@m NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@m NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    protected final void setZIndex(float f5) {
        this.zIndex = f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        boolean z4;
        boolean z5;
        Modifier.Node headNode = headNode(NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(NodeKind.m5204constructorimpl(16)));
        if (headNode != null && headNode.isAttached()) {
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
            if (headNode.getNode().isAttached()) {
                Modifier.Node node = headNode.getNode();
                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        if ((child$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = child$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof PointerInputModifierNode) {
                                    if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                        return true;
                                    }
                                } else {
                                    if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i5 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i5++;
                                                if (i5 == 1) {
                                                    delegatingNode = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNode != 0) {
                                                        mutableVector.add(delegatingNode);
                                                        delegatingNode = 0;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                            delegatingNode = delegatingNode;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-MK-Hz9U */
    public long m5196toParentPositionMKHz9U(long j5) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j5 = ownedLayer.mo5253mapOffset8S9VItk(j5, false);
        }
        return IntOffsetKt.m6186plusNvtHpc(j5, mo5151getPositionnOccac());
    }

    @l
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m5185calculateMinimumTouchTargetPaddingE7KxVPU = m5185calculateMinimumTouchTargetPaddingE7KxVPU(m5189getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m3562getWidthimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m3559getHeightimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m3562getWidthimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m3559getHeightimpl(m5185calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            l0.m(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo5009transformFromEL8BTi8(@l LayoutCoordinates layoutCoordinates, @l float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m3973resetimpl(fArr);
        coordinator.m5184transformToAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
        m5183transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
    }

    public final void updateLayerBlock(@m v3.l<? super GraphicsLayerScope, r2> lVar, boolean z4) {
        boolean z5;
        Owner owner$ui_release;
        LayoutNode layoutNode = getLayoutNode();
        if (!z4 && this.layerBlock == lVar && l0.g(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.layerBlock = lVar;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && lVar != null) {
            if (this.layer == null) {
                OwnedLayer createLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this.drawBlock, this.invalidateParentLayer);
                createLayer.mo5255resizeozmzZPI(m5045getMeasuredSizeYbymL2g());
                createLayer.mo5254movegyyYBs(mo5151getPositionnOccac());
                this.layer = createLayer;
                updateLayerParameters$default(this, false, 1, null);
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                return;
            }
            if (z5) {
                updateLayerParameters$default(this, false, 1, null);
                return;
            }
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                owner$ui_release.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    public final void visitNodes(int i5, boolean z4, @l v3.l<? super Modifier.Node, r2> lVar) {
        Modifier.Node tail = getTail();
        if (!z4 && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(z4); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i5) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i5) != 0) {
                lVar.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ */
    public final /* synthetic */ <T> void m5197visitNodesaLcG6gQ(int i5, v3.l<? super T, r2> lVar) {
        boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(i5);
        Modifier.Node tail = getTail();
        if (m5213getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i5) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & i5) != 0) {
                    for (Modifier.Node node = headNode; node != null; node = DelegatableNodeKt.pop(null)) {
                        l0.y(3, "T");
                        lVar.invoke(node);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo5010windowToLocalMKHz9U(long j5) {
        if (isAttached()) {
            LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
            return mo5006localPositionOfR5De75A(findRootCoordinates, Offset.m3497minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo5257calculateLocalPositionMKHz9U(j5), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    protected final void withPositionTranslation(@l Canvas canvas, @l v3.l<? super Canvas, r2> lVar) {
        float m6172getXimpl = IntOffset.m6172getXimpl(mo5151getPositionnOccac());
        float m6173getYimpl = IntOffset.m6173getYimpl(mo5151getPositionnOccac());
        canvas.translate(m6172getXimpl, m6173getYimpl);
        lVar.invoke(canvas);
        canvas.translate(-m6172getXimpl, -m6173getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M */
    public final boolean m5198withinLayerBoundsk4lQ0M(long j5) {
        if (!OffsetKt.m3510isFinitek4lQ0M(j5)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null && this.isClipping && !ownedLayer.mo5252isInLayerk4lQ0M(j5)) {
            return false;
        }
        return true;
    }
}
