package org.burnoutcrew.reorderable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import v3.p;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b,\b'\u0018\u0000 I*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00016BÍ\u0001\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020\u0003\u00126\u00108\u001a2\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000500\u00128\u0010<\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(9\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0017\u0018\u000100\u00128\u0010@\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u0005\u0018\u000100\u0012\u0006\u0010F\u001a\u00020A¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002J#\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u0004\u0018\u00018\u00002\b\u0010#\u001a\u0004\u0018\u00018\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.RD\u00108\u001a2\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0005008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107RF\u0010<\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(9\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0017\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107RF\u0010@\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u0005\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER/\u0010M\u001a\u0004\u0018\u00010\f2\b\u0010G\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010S\u001a\b\u0012\u0004\u0012\u00020O0N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010RR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bT\u0010RR4\u0010[\u001a\u00020V2\u0006\u0010G\u001a\u00020V8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b'\u0010H\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR/\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010G\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010H\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\f0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010]R\u0013\u0010k\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bj\u0010]R\u0018\u0010n\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0018\u0010p\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0018\u0010r\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bq\u0010mR\u0018\u0010s\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\ba\u0010mR\u0018\u0010u\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bt\u0010mR\u0018\u0010w\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bv\u0010mR\u0018\u0010x\u001a\u00020\f*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010mR\u0018\u0010z\u001a\u00020\u0002*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010yR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\f8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u007fR\u0015\u0010\u0083\u0001\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u007fR\u0016\u0010\u0085\u0001\u001a\u00020\f8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u007fR\u0014\u0010\u0088\u0001\u001a\u00020\u00038F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0014\u0010\u008a\u0001\u001a\u00020\u00038F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00178&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Lorg/burnoutcrew/reorderable/l;", "T", "", "", "scrollOffset", "Lkotlin/r2;", socket.g.f22386a, "i", "", CrashHianalyticsData.TIME, "maxScroll", bi.aJ, "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "M", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "", "Q", "()Lkotlinx/coroutines/flow/i;", "offsetX", "offsetY", "", "L", "(II)Z", "K", "()V", "J", "(II)V", "x", "y", "selected", "k", "(IILjava/lang/Object;)Ljava/util/List;", "draggedItemInfo", "items", "curX", "curY", "j", "(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;", "Lkotlinx/coroutines/s0;", bi.ay, "Lkotlinx/coroutines/s0;", "scope", "b", "F", "maxScrollPerFrame", "Lkotlin/Function2;", "Lorg/burnoutcrew/reorderable/d;", "Lkotlin/v0;", "name", "fromIndex", "toIndex", "c", "Lv3/p;", "onMove", "draggedOver", "dragging", "d", "canDragOver", "startIndex", "endIndex", "e", "onDragEnd", "Lorg/burnoutcrew/reorderable/b;", "f", "Lorg/burnoutcrew/reorderable/b;", "m", "()Lorg/burnoutcrew/reorderable/b;", "dragCancelledAnimation", "<set-?>", "Landroidx/compose/runtime/MutableState;", "o", "()Ljava/lang/Integer;", "O", "(Ljava/lang/Integer;)V", "draggingItemIndex", "Lkotlinx/coroutines/channels/l;", "Lorg/burnoutcrew/reorderable/n;", "Lkotlinx/coroutines/channels/l;", "w", "()Lkotlinx/coroutines/channels/l;", "interactions", "B", "scrollChannel", "Landroidx/compose/ui/geometry/Offset;", "n", "()J", "N", "(J)V", "draggingDelta", "C", "()Ljava/lang/Object;", "P", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/l2;", "l", "Lkotlinx/coroutines/l2;", "autoscroller", "", "Ljava/util/List;", "targets", "distances", bi.aE, "draggingLayoutInfo", bi.aA, "draggingItemKey", bi.aG, "(Ljava/lang/Object;)I", "left", "D", "top", "A", "right", "bottom", "H", "width", "v", "height", "itemIndex", "(Ljava/lang/Object;)Ljava/lang/Object;", "itemKey", "G", "()Ljava/util/List;", "visibleItemsInfo", bi.aL, "()I", "firstVisibleItemIndex", bi.aK, "firstVisibleItemScrollOffset", "viewportStartOffset", "E", "viewportEndOffset", "q", "()F", "draggingItemLeft", "r", "draggingItemTop", "I", "()Z", "isVerticalScroll", "<init>", "(Lkotlinx/coroutines/s0;FLv3/p;Lv3/p;Lv3/p;Lorg/burnoutcrew/reorderable/b;)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public abstract class l<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final long f21111q = 1500;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final s0 f21114a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21115b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final p<org.burnoutcrew.reorderable.d, org.burnoutcrew.reorderable.d, r2> f21116c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private final p<org.burnoutcrew.reorderable.d, org.burnoutcrew.reorderable.d, Boolean> f21117d;

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private final p<Integer, Integer, r2> f21118e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final org.burnoutcrew.reorderable.b f21119f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final MutableState f21120g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.channels.l<n> f21121h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.channels.l<Float> f21122i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final MutableState f21123j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final MutableState f21124k;

    /* renamed from: l, reason: collision with root package name */
    @p4.m
    private l2 f21125l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final List<T> f21126m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final List<Integer> f21127n;

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    public static final c f21109o = new c(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f21110p = 8;

    /* renamed from: r, reason: collision with root package name */
    @p4.l
    private static final v3.l<Float, Float> f21112r = b.INSTANCE;

    /* renamed from: s, reason: collision with root package name */
    @p4.l
    private static final v3.l<Float, Float> f21113s = a.INSTANCE;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends n0 implements v3.l<Float, Float> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Float invoke(Float f5) {
            return invoke(f5.floatValue());
        }

        @p4.l
        public final Float invoke(float f5) {
            return Float.valueOf(f5 * f5 * f5 * f5 * f5);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.l<Float, Float> {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Float invoke(Float f5) {
            return invoke(f5.floatValue());
        }

        @p4.l
        public final Float invoke(float f5) {
            float f6 = 1;
            float f7 = f6 - f5;
            return Float.valueOf(f6 - (((f7 * f7) * f7) * f7));
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lorg/burnoutcrew/reorderable/l$c;", "", "", "viewSize", "", "viewSizeOutOfBounds", "", CrashHianalyticsData.TIME, "maxScroll", "b", "ACCELERATION_LIMIT_TIME_MS", "J", "Lkotlin/Function1;", "EaseInQuintInterpolator", "Lv3/l;", "EaseOutQuadInterpolator", "<init>", "()V", "reorderable"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(int i5, float f5, long j5, float f6) {
            boolean z4;
            float f7;
            boolean z5 = true;
            if (f5 == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return 0.0f;
            }
            float signum = Math.signum(f5) * f6 * ((Number) l.f21112r.invoke(Float.valueOf(Math.min(1.0f, (Math.abs(f5) * 1.0f) / i5)))).floatValue();
            if (j5 > 1500) {
                f7 = 1.0f;
            } else {
                f7 = ((float) j5) / ((float) 1500);
            }
            float floatValue = signum * ((Number) l.f21113s.invoke(Float.valueOf(f7))).floatValue();
            if (floatValue != 0.0f) {
                z5 = false;
            }
            if (z5) {
                if (f5 > 0.0f) {
                    return 1.0f;
                }
                return -1.0f;
            }
            return floatValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableState$autoscroll$1", f = "ReorderableState.kt", i = {0, 0}, l = {176}, m = "invokeSuspend", n = {"scroll", "start"}, s = {"L$0", "L$1"})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class d extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ float $scrollOffset;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ l<T> this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes4.dex */
        public static final class a extends n0 implements v3.l<Long, r2> {
            final /* synthetic */ k1.e $scroll;
            final /* synthetic */ k1.g $start;
            final /* synthetic */ l<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.g gVar, k1.e eVar, l<T> lVar) {
                super(1);
                this.$start = gVar;
                this.$scroll = eVar;
                this.this$0 = lVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
                invoke(l5.longValue());
                return r2.f19517a;
            }

            public final void invoke(long j5) {
                k1.g gVar = this.$start;
                long j6 = gVar.element;
                if (j6 == 0) {
                    gVar.element = j5;
                    return;
                }
                k1.e eVar = this.$scroll;
                l<T> lVar = this.this$0;
                eVar.element = lVar.h(j5 - j6, ((l) lVar).f21115b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f5, l<T> lVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$scrollOffset = f5;
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new d(this.$scrollOffset, this.this$0, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:5:0x0065). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.k1$g r1 = (kotlin.jvm.internal.k1.g) r1
                java.lang.Object r3 = r6.L$0
                kotlin.jvm.internal.k1$e r3 = (kotlin.jvm.internal.k1.e) r3
                kotlin.e1.n(r7)
                r7 = r6
                goto L65
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.e1.n(r7)
                kotlin.jvm.internal.k1$e r7 = new kotlin.jvm.internal.k1$e
                r7.<init>()
                float r1 = r6.$scrollOffset
                r7.element = r1
                kotlin.jvm.internal.k1$g r1 = new kotlin.jvm.internal.k1$g
                r1.<init>()
                r3 = r7
                r7 = r6
            L33:
                float r4 = r3.element
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                r5 = 0
                if (r4 != 0) goto L3d
                r4 = r2
                goto L3e
            L3d:
                r4 = r5
            L3e:
                if (r4 != 0) goto L75
                org.burnoutcrew.reorderable.l<T> r4 = r7.this$0
                kotlinx.coroutines.l2 r4 = org.burnoutcrew.reorderable.l.b(r4)
                if (r4 == 0) goto L4f
                boolean r4 = r4.isActive()
                if (r4 != r2) goto L4f
                r5 = r2
            L4f:
                if (r5 == 0) goto L75
                org.burnoutcrew.reorderable.l$d$a r4 = new org.burnoutcrew.reorderable.l$d$a
                org.burnoutcrew.reorderable.l<T> r5 = r7.this$0
                r4.<init>(r1, r3, r5)
                r7.L$0 = r3
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r4 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r4, r7)
                if (r4 != r0) goto L65
                return r0
            L65:
                org.burnoutcrew.reorderable.l<T> r4 = r7.this$0
                kotlinx.coroutines.channels.l r4 = r4.B()
                float r5 = r3.element
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                r4.p(r5)
                goto L33
            L75:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableState$onDrag$1$1", f = "ReorderableState.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class e extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ T $draggingItem;
        final /* synthetic */ T $targetItem;
        int label;
        final /* synthetic */ l<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l<T> lVar, T t5, T t6, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$draggingItem = t5;
            this.$targetItem = t6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new e(this.this$0, this.$draggingItem, this.$targetItem, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                ((l) this.this$0).f21116c.invoke(new org.burnoutcrew.reorderable.d(this.this$0.x(this.$draggingItem), this.this$0.y(this.$draggingItem)), new org.burnoutcrew.reorderable.d(this.this$0.x(this.$targetItem), this.this$0.y(this.$targetItem)));
                l<T> lVar = this.this$0;
                int t5 = lVar.t();
                int u4 = this.this$0.u();
                this.label = 1;
                if (lVar.M(t5, u4, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableState$onDragCanceled$1", f = "ReorderableState.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class f extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $offset;
        final /* synthetic */ org.burnoutcrew.reorderable.d $position;
        int label;
        final /* synthetic */ l<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l<T> lVar, org.burnoutcrew.reorderable.d dVar, long j5, kotlin.coroutines.d<? super f> dVar2) {
            super(2, dVar2);
            this.this$0 = lVar;
            this.$position = dVar;
            this.$offset = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new f(this.this$0, this.$position, this.$offset, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                org.burnoutcrew.reorderable.b m5 = this.this$0.m();
                org.burnoutcrew.reorderable.d dVar = this.$position;
                long j5 = this.$offset;
                this.label = 1;
                if (m5.a(dVar, j5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1", f = "ReorderableState.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/w$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class g extends o implements q<kotlinx.coroutines.flow.j<? super List<? extends T>>, Boolean, kotlin.coroutines.d<? super r2>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlin.coroutines.d dVar, l lVar) {
            super(3, dVar);
            this.this$0 = lVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super List<? extends T>> jVar, Boolean bool, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            g gVar = new g(dVar, this.this$0);
            gVar.L$0 = jVar;
            gVar.L$1 = bool;
            return gVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.flow.i M0;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                if (((Boolean) this.L$1).booleanValue()) {
                    M0 = SnapshotStateKt.snapshotFlow(new i(this.this$0));
                } else {
                    M0 = kotlinx.coroutines.flow.k.M0(null);
                }
                this.label = 1;
                if (kotlinx.coroutines.flow.k.m0(jVar, M0, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class h extends n0 implements v3.a<Boolean> {
        final /* synthetic */ l<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l<T> lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.o() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class i extends n0 implements v3.a<List<? extends T>> {
        final /* synthetic */ l<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(l<T> lVar) {
            super(0);
            this.this$0 = lVar;
        }

        @Override // v3.a
        @p4.l
        public final List<T> invoke() {
            return this.this$0.G();
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "old", "", "new", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class j extends n0 implements p<List<? extends T>, List<? extends T>, Boolean> {
        final /* synthetic */ l<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l<T> lVar) {
            super(2);
            this.this$0 = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.p
        @p4.l
        public final Boolean invoke(@p4.l List<? extends T> old, @p4.l List<? extends T> list) {
            Object D2;
            Object D22;
            l0.p(old, "old");
            l0.p(list, "new");
            D2 = e0.D2(old);
            Integer valueOf = D2 != null ? Integer.valueOf(this.this$0.x(D2)) : null;
            D22 = e0.D2(list);
            return Boolean.valueOf(l0.g(valueOf, D22 != null ? Integer.valueOf(this.this$0.x(D22)) : null) && old.size() == list.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@p4.l s0 scope, float f5, @p4.l p<? super org.burnoutcrew.reorderable.d, ? super org.burnoutcrew.reorderable.d, r2> onMove, @p4.m p<? super org.burnoutcrew.reorderable.d, ? super org.burnoutcrew.reorderable.d, Boolean> pVar, @p4.m p<? super Integer, ? super Integer, r2> pVar2, @p4.l org.burnoutcrew.reorderable.b dragCancelledAnimation) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        l0.p(scope, "scope");
        l0.p(onMove, "onMove");
        l0.p(dragCancelledAnimation, "dragCancelledAnimation");
        this.f21114a = scope;
        this.f21115b = f5;
        this.f21116c = onMove;
        this.f21117d = pVar;
        this.f21118e = pVar2;
        this.f21119f = dragCancelledAnimation;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f21120g = mutableStateOf$default;
        this.f21121h = kotlinx.coroutines.channels.o.d(0, null, null, 7, null);
        this.f21122i = kotlinx.coroutines.channels.o.d(0, null, null, 7, null);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(Offset.Companion.m3509getZeroF1C5BW0()), null, 2, null);
        this.f21123j = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f21124k = mutableStateOf$default3;
        this.f21126m = new ArrayList();
        this.f21127n = new ArrayList();
    }

    private final T C() {
        return this.f21124k.getValue();
    }

    private final void N(long j5) {
        this.f21123j.setValue(Offset.m3482boximpl(j5));
    }

    private final void O(Integer num) {
        this.f21120g.setValue(num);
    }

    private final void P(T t5) {
        this.f21124k.setValue(t5);
    }

    private final void g(float f5) {
        boolean z4;
        l2 f6;
        boolean z5 = true;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            l2 l2Var = this.f21125l;
            if (l2Var == null || !l2Var.isActive()) {
                z5 = false;
            }
            if (z5) {
                return;
            }
            f6 = kotlinx.coroutines.k.f(this.f21114a, null, null, new d(f5, this, null), 3, null);
            this.f21125l = f6;
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h(long j5, float f5) {
        float z4;
        float H;
        float m3493getXimpl;
        float f6 = 0.0f;
        if (s() == null) {
            return 0.0f;
        }
        if (I()) {
            z4 = D(r0) + r();
            H = v(r0) + z4;
            m3493getXimpl = Offset.m3494getYimpl(n());
        } else {
            z4 = z(r0) + q();
            H = H(r0) + z4;
            m3493getXimpl = Offset.m3493getXimpl(n());
        }
        if (m3493getXimpl > 0.0f) {
            f6 = u.t(H - E(), 0.0f);
        } else if (m3493getXimpl < 0.0f) {
            f6 = u.A(z4 - F(), 0.0f);
        }
        return f21109o.b((int) (H - z4), f6, j5, f5);
    }

    private final void i() {
        l2 l2Var = this.f21125l;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.f21125l = null;
    }

    private final long n() {
        return ((Offset) this.f21123j.getValue()).m3503unboximpl();
    }

    private final T s() {
        boolean z4;
        for (T t5 : G()) {
            int x4 = x(t5);
            Integer o5 = o();
            if (o5 != null && x4 == o5.intValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return t5;
            }
        }
        return null;
    }

    protected abstract int A(T t5);

    @p4.l
    public final kotlinx.coroutines.channels.l<Float> B() {
        return this.f21122i;
    }

    protected abstract int D(T t5);

    protected abstract int E();

    protected abstract int F();

    @p4.l
    protected abstract List<T> G();

    protected abstract int H(T t5);

    public abstract boolean I();

    public final void J(int i5, int i6) {
        boolean z4;
        T C = C();
        if (C == null) {
            return;
        }
        N(OffsetKt.Offset(Offset.m3493getXimpl(n()) + i5, Offset.m3494getYimpl(n()) + i6));
        T s5 = s();
        if (s5 == null) {
            return;
        }
        T j5 = j(s5, k((int) Offset.m3493getXimpl(n()), (int) Offset.m3494getYimpl(n()), C), (int) (z(s5) + q()), (int) (D(s5) + r()));
        if (j5 != null) {
            if (x(j5) != t() && x(s5) != t()) {
                this.f21116c.invoke(new org.burnoutcrew.reorderable.d(x(s5), y(s5)), new org.burnoutcrew.reorderable.d(x(j5), y(j5)));
            } else {
                kotlinx.coroutines.k.f(this.f21114a, null, null, new e(this, s5, j5, null), 3, null);
            }
            O(Integer.valueOf(x(j5)));
        }
        float h5 = h(0L, this.f21115b);
        if (h5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            g(h5);
        }
    }

    public final void K() {
        Integer num;
        Object obj;
        Integer o5 = o();
        if (o5 != null) {
            int intValue = o5.intValue();
            T C = C();
            if (C != null) {
                obj = y(C);
            } else {
                obj = null;
            }
            kotlinx.coroutines.k.f(this.f21114a, null, null, new f(this, new org.burnoutcrew.reorderable.d(intValue, obj), OffsetKt.Offset(q(), r()), null), 3, null);
        }
        T C2 = C();
        if (C2 != null) {
            num = Integer.valueOf(x(C2));
        } else {
            num = null;
        }
        Integer o6 = o();
        P(null);
        N(Offset.Companion.m3509getZeroF1C5BW0());
        O(null);
        i();
        p<Integer, Integer, r2> pVar = this.f21118e;
        if (pVar != null && num != null && o6 != null) {
            pVar.invoke(num, o6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[EDGE_INSN: B:20:0x0051->B:21:0x0051 BREAK  A[LOOP:0: B:5:0x001b->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:5:0x001b->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.I()
            if (r0 == 0) goto Lc
            int r0 = r7.F()
            int r9 = r9 + r0
            goto L11
        Lc:
            int r0 = r7.F()
            int r8 = r8 + r0
        L11:
            java.util.List r0 = r7.G()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            int r5 = r7.z(r1)
            int r6 = r7.A(r1)
            if (r8 > r6) goto L36
            if (r5 > r8) goto L36
            r5 = r3
            goto L37
        L36:
            r5 = r4
        L37:
            if (r5 == 0) goto L4c
            int r5 = r7.D(r1)
            int r6 = r7.l(r1)
            if (r9 > r6) goto L47
            if (r5 > r9) goto L47
            r5 = r3
            goto L48
        L47:
            r5 = r4
        L48:
            if (r5 == 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r5 = r4
        L4d:
            if (r5 == 0) goto L1b
            goto L51
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L62
            r7.P(r1)
            int r8 = r7.x(r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.O(r8)
            r2 = r1
        L62:
            if (r2 == 0) goto L65
            goto L66
        L65:
            r3 = r4
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.l.L(int, int):boolean");
    }

    @p4.m
    protected abstract Object M(int i5, int i6, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @p4.l
    public final kotlinx.coroutines.flow.i<List<T>> Q() {
        return kotlinx.coroutines.flow.k.h0(kotlinx.coroutines.flow.k.t0(kotlinx.coroutines.flow.k.d2(SnapshotStateKt.snapshotFlow(new h(this)), new g(null, this))), new j(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public T j(@p4.m T t5, @p4.l List<? extends T> items, int i5, int i6) {
        int l5;
        int abs;
        int D;
        int abs2;
        int z4;
        int abs3;
        int A;
        int abs4;
        Object s32;
        l0.p(items, "items");
        T t6 = null;
        if (t5 == null) {
            if (o() == null) {
                return null;
            }
            s32 = e0.s3(items);
            return (T) s32;
        }
        int H = i5 + H(t5);
        int v4 = i6 + v(t5);
        int z5 = i5 - z(t5);
        int D2 = i6 - D(t5);
        int size = items.size();
        int i7 = -1;
        for (int i8 = 0; i8 < size; i8++) {
            T t7 = items.get(i8);
            if (z5 > 0 && (A = A(t7) - H) < 0 && A(t7) > A(t5) && (abs4 = Math.abs(A)) > i7) {
                t6 = t7;
                i7 = abs4;
            }
            if (z5 < 0 && (z4 = z(t7) - i5) > 0 && z(t7) < z(t5) && (abs3 = Math.abs(z4)) > i7) {
                t6 = t7;
                i7 = abs3;
            }
            if (D2 < 0 && (D = D(t7) - i6) > 0 && D(t7) < D(t5) && (abs2 = Math.abs(D)) > i7) {
                t6 = t7;
                i7 = abs2;
            }
            if (D2 > 0 && (l5 = l(t7) - v4) < 0 && l(t7) > l(t5) && (abs = Math.abs(l5)) > i7) {
                t6 = t7;
                i7 = abs;
            }
        }
        return t6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[SYNTHETIC] */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<T> k(int r18, int r19, T r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            java.util.List<T> r2 = r0.f21126m
            r2.clear()
            java.util.List<java.lang.Integer> r2 = r0.f21127n
            r2.clear()
            int r2 = r0.z(r1)
            int r2 = r18 + r2
            int r3 = r0.A(r1)
            int r3 = r18 + r3
            int r4 = r0.D(r1)
            int r4 = r19 + r4
            int r5 = r0.l(r1)
            int r5 = r19 + r5
            int r6 = r2 + r3
            int r6 = r6 / 2
            int r7 = r4 + r5
            int r7 = r7 / 2
            java.util.List r8 = r17.G()
            int r9 = r8.size()
            r11 = 0
        L37:
            if (r11 >= r9) goto Lf4
            java.lang.Object r12 = r8.get(r11)
            int r13 = r0.x(r12)
            java.lang.Integer r14 = r17.o()
            if (r14 != 0) goto L48
            goto L4e
        L48:
            int r14 = r14.intValue()
            if (r13 == r14) goto Lec
        L4e:
            int r13 = r0.l(r12)
            if (r13 < r4) goto Lec
            int r13 = r0.D(r12)
            if (r13 > r5) goto Lec
            int r13 = r0.A(r12)
            if (r13 < r2) goto Lec
            int r13 = r0.z(r12)
            if (r13 <= r3) goto L68
            goto Lec
        L68:
            v3.p<org.burnoutcrew.reorderable.d, org.burnoutcrew.reorderable.d, java.lang.Boolean> r13 = r0.f21117d
            if (r13 == 0) goto L96
            org.burnoutcrew.reorderable.d r14 = new org.burnoutcrew.reorderable.d
            int r15 = r0.x(r12)
            java.lang.Object r10 = r0.y(r12)
            r14.<init>(r15, r10)
            org.burnoutcrew.reorderable.d r10 = new org.burnoutcrew.reorderable.d
            int r15 = r0.x(r1)
            r16 = r2
            java.lang.Object r2 = r0.y(r1)
            r10.<init>(r15, r2)
            java.lang.Object r2 = r13.invoke(r14, r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L98
            r2 = 1
            goto L99
        L96:
            r16 = r2
        L98:
            r2 = 0
        L99:
            if (r2 != 0) goto Lee
            int r2 = r0.z(r12)
            int r10 = r0.A(r12)
            int r2 = r2 + r10
            int r2 = r2 / 2
            int r2 = r6 - r2
            int r2 = java.lang.Math.abs(r2)
            int r10 = r0.D(r12)
            int r13 = r0.l(r12)
            int r10 = r10 + r13
            int r10 = r10 / 2
            int r10 = r7 - r10
            int r10 = java.lang.Math.abs(r10)
            int r2 = r2 * r2
            int r10 = r10 * r10
            int r2 = r2 + r10
            java.util.List<T> r10 = r0.f21126m
            int r10 = r10.size()
            r13 = 0
            r14 = 0
        Lc8:
            if (r13 >= r10) goto Ldd
            java.util.List<java.lang.Integer> r15 = r0.f21127n
            java.lang.Object r15 = r15.get(r13)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r2 <= r15) goto Ldd
            int r14 = r14 + 1
            int r13 = r13 + 1
            goto Lc8
        Ldd:
            java.util.List<T> r10 = r0.f21126m
            r10.add(r14, r12)
            java.util.List<java.lang.Integer> r10 = r0.f21127n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.add(r14, r2)
            goto Lee
        Lec:
            r16 = r2
        Lee:
            int r11 = r11 + 1
            r2 = r16
            goto L37
        Lf4:
            java.util.List<T> r1 = r0.f21126m
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.l.k(int, int, java.lang.Object):java.util.List");
    }

    protected abstract int l(T t5);

    @p4.l
    public final org.burnoutcrew.reorderable.b m() {
        return this.f21119f;
    }

    @p4.m
    public final Integer o() {
        return (Integer) this.f21120g.getValue();
    }

    @p4.m
    public final Object p() {
        T C = C();
        if (C != null) {
            return y(C);
        }
        return null;
    }

    public final float q() {
        int i5;
        if (s() != null) {
            T C = C();
            if (C != null) {
                i5 = z(C);
            } else {
                i5 = 0;
            }
            return (i5 + Offset.m3493getXimpl(n())) - z(r0);
        }
        return 0.0f;
    }

    public final float r() {
        int i5;
        if (s() != null) {
            T C = C();
            if (C != null) {
                i5 = D(C);
            } else {
                i5 = 0;
            }
            return (i5 + Offset.m3494getYimpl(n())) - D(r0);
        }
        return 0.0f;
    }

    protected abstract int t();

    protected abstract int u();

    protected abstract int v(T t5);

    @p4.l
    public final kotlinx.coroutines.channels.l<n> w() {
        return this.f21121h;
    }

    protected abstract int x(T t5);

    @p4.l
    protected abstract Object y(T t5);

    protected abstract int z(T t5);
}
