package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R1\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010.\u001a\u00020'2\u0006\u0010\r\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R(\u0010:\u001a\u0004\u0018\u00010\t2\b\u00105\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010=\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R$\u0010C\u001a\u00020>2\u0006\u00105\u001a\u00020>8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010F\u001a\u00020D8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bE\u0010+R\u001a\u0010H\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", "autoMirror$delegate", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "getVector$ui_release", "()Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/runtime/Composition;", "composition", "Landroidx/compose/runtime/Composition;", "getComposition$ui_release", "()Landroidx/compose/runtime/Composition;", "setComposition$ui_release", "(Landroidx/compose/runtime/Composition;)V", "", "invalidateCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "getInvalidateCount", "()I", "setInvalidateCount", "(I)V", "invalidateCount", "currentAlpha", "F", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawCount", "I", b.f22420d, "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui_release", "setViewportSize-uvyYCjk$ui_release", "viewportSize", "", "getName$ui_release", "()Ljava/lang/String;", "setName$ui_release", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getBitmapConfig-_sVssgQ$ui_release", "bitmapConfig", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n81#2:517\n107#2,2:518\n81#2:520\n107#2,2:521\n75#3:523\n108#3,2:524\n266#4:526\n267#4:544\n174#5,6:527\n262#5,11:533\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n189#1:517\n189#1:518,2\n191#1:520\n191#1:521,2\n228#1:523\n228#1:524,2\n242#1:526\n242#1:544\n242#1:527,6\n242#1:533,11\n*E\n"})
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;

    @l
    private final MutableState autoMirror$delegate;

    @m
    private Composition composition;
    private float currentAlpha;

    @m
    private ColorFilter currentColorFilter;
    private int drawCount;

    @l
    private final MutableIntState invalidateCount$delegate;

    @l
    private final MutableState size$delegate;

    @l
    private final VectorComponent vector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VectorPainter(@l GroupComponent groupComponent) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3550boximpl(Size.Companion.m3571getZeroNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.autoMirror$delegate = mutableStateOf$default2;
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i5) {
        this.invalidateCount$delegate.setIntValue(i5);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f5) {
        this.currentAlpha = f5;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(@m ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m4379getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m4371getCacheBitmapConfig_sVssgQ$ui_release();
    }

    @m
    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    @m
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4347getIntrinsicSizeNHjbRc() {
        return m4380getSizeNHjbRc$ui_release();
    }

    @l
    public final String getName$ui_release() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m4380getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m3567unboximpl();
    }

    @l
    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m4381getViewportSizeNHjbRc$ui_release() {
        return this.vector.m4372getViewportSizeNHjbRc$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@l DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4209scale0AR0LA0(-1.0f, 1.0f, mo4276getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        this.drawCount = getInvalidateCount();
    }

    public final void setAutoMirror$ui_release(boolean z4) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setComposition$ui_release(@m Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui_release(@m ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    public final void setName$ui_release(@l String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m4382setSizeuvyYCjk$ui_release(long j5) {
        this.size$delegate.setValue(Size.m3550boximpl(j5));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m4383setViewportSizeuvyYCjk$ui_release(long j5) {
        this.vector.m4373setViewportSizeuvyYCjk$ui_release(j5);
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i5, w wVar) {
        this((i5 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
