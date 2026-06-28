package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.j1;
import com.airbnb.lottie.x0;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\f\u0010V\u001a\u00020W*\u00020XH\u0014R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR/\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001e\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010\t\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001e\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001d\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u001e\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001e\u001a\u0004\bG\u0010\u001a\"\u0004\bH\u0010\u001cR+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR+\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u001e\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0010\u0010U\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Lcom/airbnb/lottie/compose/LottiePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;)V", "<set-?>", "getApplyOpacityToLayers$lottie_compose_release", "()Z", "setApplyOpacityToLayers$lottie_compose_release", "(Z)V", "applyOpacityToLayers$delegate", "Landroidx/compose/runtime/MutableState;", "getAsyncUpdates$lottie_compose_release", "()Lcom/airbnb/lottie/AsyncUpdates;", "setAsyncUpdates$lottie_compose_release", "(Lcom/airbnb/lottie/AsyncUpdates;)V", "asyncUpdates$delegate", "getClipTextToBoundingBox$lottie_compose_release", "setClipTextToBoundingBox$lottie_compose_release", "clipTextToBoundingBox$delegate", "getClipToCompositionBounds$lottie_compose_release", "setClipToCompositionBounds$lottie_compose_release", "clipToCompositionBounds$delegate", "getComposition$lottie_compose_release", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "getDynamicProperties$lottie_compose_release", "()Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "setDynamicProperties$lottie_compose_release", "(Lcom/airbnb/lottie/compose/LottieDynamicProperties;)V", "dynamicProperties$delegate", "getEnableMergePaths$lottie_compose_release", "setEnableMergePaths$lottie_compose_release", "enableMergePaths$delegate", "getFontMap$lottie_compose_release", "()Ljava/util/Map;", "setFontMap$lottie_compose_release", "(Ljava/util/Map;)V", "fontMap$delegate", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "getMaintainOriginalImageBounds$lottie_compose_release", "setMaintainOriginalImageBounds$lottie_compose_release", "maintainOriginalImageBounds$delegate", "matrix", "Landroid/graphics/Matrix;", "getOutlineMasksAndMattes$lottie_compose_release", "setOutlineMasksAndMattes$lottie_compose_release", "outlineMasksAndMattes$delegate", "getProgress$lottie_compose_release", "()F", "setProgress$lottie_compose_release", "(F)V", "progress$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getRenderMode$lottie_compose_release", "()Lcom/airbnb/lottie/RenderMode;", "setRenderMode$lottie_compose_release", "(Lcom/airbnb/lottie/RenderMode;)V", "renderMode$delegate", "setDynamicProperties", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottiePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,133:1\n81#2:134\n107#2,2:135\n81#2:140\n107#2,2:141\n81#2:143\n107#2,2:144\n81#2:146\n107#2,2:147\n81#2:149\n107#2,2:150\n81#2:152\n107#2,2:153\n81#2:155\n107#2,2:156\n81#2:158\n107#2,2:159\n81#2:161\n107#2,2:162\n81#2:164\n107#2,2:165\n81#2:167\n107#2,2:168\n75#3:137\n108#3,2:138\n245#4:170\n*S KotlinDebug\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainter\n*L\n75#1:134\n75#1:135,2\n77#1:140\n77#1:141,2\n78#1:143\n78#1:144,2\n79#1:146\n79#1:147,2\n80#1:149\n80#1:150,2\n81#1:152\n81#1:153,2\n82#1:155\n82#1:156,2\n83#1:158\n83#1:159,2\n84#1:161\n84#1:162,2\n85#1:164\n85#1:165,2\n86#1:167\n86#1:168,2\n76#1:137\n76#1:138,2\n100#1:170\n*E\n"})
/* loaded from: classes2.dex */
public final class LottiePainter extends Painter {

    /* renamed from: p, reason: collision with root package name */
    public static final int f1178p = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final MutableState f1179a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableFloatState f1180b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final MutableState f1181c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final MutableState f1182d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final MutableState f1183e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final MutableState f1184f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final MutableState f1185g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final MutableState f1186h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final MutableState f1187i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final MutableState f1188j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final MutableState f1189k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final MutableState f1190l;

    /* renamed from: m, reason: collision with root package name */
    @p4.m
    private k f1191m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final x0 f1192n;

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    private final Matrix f1193o;

    public LottiePainter() {
        this(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
    }

    public /* synthetic */ LottiePainter(com.airbnb.lottie.k kVar, float f5, boolean z4, boolean z5, boolean z6, j1 j1Var, boolean z7, k kVar2, boolean z8, boolean z9, Map map, com.airbnb.lottie.a aVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : kVar, (i5 & 2) != 0 ? 0.0f : f5, (i5 & 4) != 0 ? false : z4, (i5 & 8) != 0 ? false : z5, (i5 & 16) != 0 ? false : z6, (i5 & 32) != 0 ? j1.AUTOMATIC : j1Var, (i5 & 64) != 0 ? false : z7, (i5 & 128) != 0 ? null : kVar2, (i5 & 256) != 0 ? true : z8, (i5 & 512) == 0 ? z9 : false, (i5 & 1024) == 0 ? map : null, (i5 & 2048) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f1182d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final com.airbnb.lottie.a b() {
        return (com.airbnb.lottie.a) this.f1189k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f1190l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.f1187i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public final com.airbnb.lottie.k e() {
        return (com.airbnb.lottie.k) this.f1179a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public final k f() {
        return (k) this.f1186h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f1183e.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4347getIntrinsicSizeNHjbRc() {
        if (e() == null) {
            return Size.Companion.m3570getUnspecifiedNHjbRc();
        }
        return SizeKt.Size(r0.b().width(), r0.b().height());
    }

    @p4.m
    public final Map<String, Typeface> h() {
        return (Map) this.f1188j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f1185g.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        return ((Boolean) this.f1181c.getValue()).booleanValue();
    }

    public final float k() {
        return this.f1180b.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final j1 l() {
        return (j1) this.f1184f.getValue();
    }

    public final void m(boolean z4) {
        this.f1182d.setValue(Boolean.valueOf(z4));
    }

    public final void n(@p4.l com.airbnb.lottie.a aVar) {
        l0.p(aVar, "<set-?>");
        this.f1189k.setValue(aVar);
    }

    public final void o(boolean z4) {
        this.f1190l.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@p4.l DrawScope drawScope) {
        int L0;
        int L02;
        l0.p(drawScope, "<this>");
        com.airbnb.lottie.k e5 = e();
        if (e5 == null) {
            return;
        }
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        long Size = SizeKt.Size(e5.b().width(), e5.b().height());
        L0 = kotlin.math.d.L0(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()));
        L02 = kotlin.math.d.L0(Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()));
        long IntSize = IntSizeKt.IntSize(L0, L02);
        this.f1193o.reset();
        this.f1193o.preScale(IntSize.m6214getWidthimpl(IntSize) / Size.m3562getWidthimpl(Size), IntSize.m6213getHeightimpl(IntSize) / Size.m3559getHeightimpl(Size));
        this.f1192n.H(g());
        this.f1192n.x1(l());
        this.f1192n.Y0(b());
        this.f1192n.b1(e5);
        this.f1192n.e1(h());
        k f5 = f();
        k kVar = this.f1191m;
        if (f5 != kVar) {
            if (kVar != null) {
                kVar.b(this.f1192n);
            }
            k f6 = f();
            if (f6 != null) {
                f6.a(this.f1192n);
            }
            this.f1191m = f();
        }
        this.f1192n.u1(j());
        this.f1192n.X0(a());
        this.f1192n.j1(i());
        this.f1192n.a1(d());
        this.f1192n.Z0(c());
        this.f1192n.w1(k());
        this.f1192n.setBounds(0, 0, e5.b().width(), e5.b().height());
        this.f1192n.F(AndroidCanvas_androidKt.getNativeCanvas(canvas), this.f1193o);
    }

    public final void p(boolean z4) {
        this.f1187i.setValue(Boolean.valueOf(z4));
    }

    public final void q(@p4.m com.airbnb.lottie.k kVar) {
        this.f1179a.setValue(kVar);
    }

    public final void r(@p4.m k kVar) {
        this.f1186h.setValue(kVar);
    }

    public final void s(boolean z4) {
        this.f1183e.setValue(Boolean.valueOf(z4));
    }

    public final void t(@p4.m Map<String, ? extends Typeface> map) {
        this.f1188j.setValue(map);
    }

    public final void u(boolean z4) {
        this.f1185g.setValue(Boolean.valueOf(z4));
    }

    public final void v(boolean z4) {
        this.f1181c.setValue(Boolean.valueOf(z4));
    }

    public final void w(float f5) {
        this.f1180b.setFloatValue(f5);
    }

    public final void x(@p4.l j1 j1Var) {
        l0.p(j1Var, "<set-?>");
        this.f1184f.setValue(j1Var);
    }

    public LottiePainter(@p4.m com.airbnb.lottie.k kVar, float f5, boolean z4, boolean z5, boolean z6, @p4.l j1 renderMode, boolean z7, @p4.m k kVar2, boolean z8, boolean z9, @p4.m Map<String, ? extends Typeface> map, @p4.l com.airbnb.lottie.a asyncUpdates) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        MutableState mutableStateOf$default11;
        l0.p(renderMode, "renderMode");
        l0.p(asyncUpdates, "asyncUpdates");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kVar, null, 2, null);
        this.f1179a = mutableStateOf$default;
        this.f1180b = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
        this.f1181c = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5), null, 2, null);
        this.f1182d = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
        this.f1183e = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(renderMode, null, 2, null);
        this.f1184f = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z7), null, 2, null);
        this.f1185g = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kVar2, null, 2, null);
        this.f1186h = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
        this.f1187i = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(map, null, 2, null);
        this.f1188j = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(asyncUpdates, null, 2, null);
        this.f1189k = mutableStateOf$default10;
        mutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z9), null, 2, null);
        this.f1190l = mutableStateOf$default11;
        this.f1192n = new x0();
        this.f1193o = new Matrix();
    }
}
