package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\f\u0010\t\u001a\u00020\u0002*\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010+\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R1\u00104\u001a\u00020.2\u0006\u0010$\u001a\u00020.8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u0010&\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00105\u001a\u00020.8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R%\u0010<\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020:¢\u0006\u0002\b;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010A\u001a\u00020>8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Lkotlin/r2;", "doInvalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", MediationConstant.RIT_TYPE_DRAW, "", "toString", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", "isDirty", "Z", "Landroidx/compose/ui/graphics/vector/DrawCache;", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "Lkotlin/Function0;", "invalidateCallback", "Lv3/a;", "getInvalidateCallback$ui_release", "()Lv3/a;", "setInvalidateCallback$ui_release", "(Lv3/a;)V", "<set-?>", "intrinsicColorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "tintFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "viewportSize$delegate", "getViewportSize-NH-jbRc$ui_release", "()J", "setViewportSize-uvyYCjk$ui_release", "(J)V", "viewportSize", "previousDrawSize", "J", "rootScaleX", "F", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/u;", "drawVectorBlock", "Lv3/l;", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getCacheBitmapConfig-_sVssgQ$ui_release", "()I", "cacheBitmapConfig", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,651:1\n81#2:652\n107#2,2:653\n81#2:655\n107#2,2:656\n646#3:658\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:652\n121#1:653,2\n127#1:655\n127#1:656,2\n148#1:658\n*E\n"})
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;

    @l
    private final DrawCache cacheDrawScope;

    @l
    private final v3.l<DrawScope, r2> drawVectorBlock;

    @l
    private final MutableState intrinsicColorFilter$delegate;

    @l
    private a<r2> invalidateCallback;
    private boolean isDirty;

    @l
    private String name;
    private long previousDrawSize;

    @l
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;

    @m
    private ColorFilter tintFilter;

    @l
    private final MutableState viewportSize$delegate;

    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<VNode, r2> {
        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(VNode vNode) {
            invoke2(vNode);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l VNode vNode) {
            VectorComponent.this.doInvalidate();
        }
    }

    public VectorComponent(@l GroupComponent groupComponent) {
        super(null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new AnonymousClass1());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.intrinsicColorFilter$delegate = mutableStateOf$default;
        Size.Companion companion = Size.Companion;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3550boximpl(companion.m3571getZeroNHjbRc()), null, 2, null);
        this.viewportSize$delegate = mutableStateOf$default2;
        this.previousDrawSize = companion.m3570getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if ((r10.root.m4356getTintColor0d7_KjU() != androidx.compose.ui.graphics.Color.Companion.m3770getUnspecified0d7_KjU()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(@p4.l androidx.compose.ui.graphics.drawscope.DrawScope r11, float r12, @p4.m androidx.compose.ui.graphics.ColorFilter r13) {
        /*
            r10 = this;
            androidx.compose.ui.graphics.vector.GroupComponent r0 = r10.root
            boolean r0 = r0.isTintable()
            r1 = 0
            if (r0 == 0) goto L20
            androidx.compose.ui.graphics.vector.GroupComponent r0 = r10.root
            long r2 = r0.m4356getTintColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r4 = r0.m3770getUnspecified0d7_KjU()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L20
            goto L21
        L20:
            r2 = r1
        L21:
            if (r2 == 0) goto L3a
            androidx.compose.ui.graphics.ColorFilter r0 = r10.getIntrinsicColorFilter$ui_release()
            boolean r0 = androidx.compose.ui.graphics.vector.VectorKt.tintableWithAlphaMask(r0)
            if (r0 == 0) goto L3a
            boolean r0 = androidx.compose.ui.graphics.vector.VectorKt.tintableWithAlphaMask(r13)
            if (r0 == 0) goto L3a
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r0 = androidx.compose.ui.graphics.ImageBitmapConfig.Companion
            int r0 = r0.m3953getAlpha8_sVssgQ()
            goto L40
        L3a:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r0 = androidx.compose.ui.graphics.ImageBitmapConfig.Companion
            int r0 = r0.m3954getArgb8888_sVssgQ()
        L40:
            r3 = r0
            boolean r0 = r10.isDirty
            if (r0 != 0) goto L5b
            long r4 = r10.previousDrawSize
            long r6 = r11.mo4277getSizeNHjbRc()
            boolean r0 = androidx.compose.ui.geometry.Size.m3558equalsimpl0(r4, r6)
            if (r0 == 0) goto L5b
            int r0 = r10.m4371getCacheBitmapConfig_sVssgQ$ui_release()
            boolean r0 = androidx.compose.ui.graphics.ImageBitmapConfig.m3949equalsimpl0(r3, r0)
            if (r0 != 0) goto Ld6
        L5b:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r0 = androidx.compose.ui.graphics.ImageBitmapConfig.Companion
            int r0 = r0.m3953getAlpha8_sVssgQ()
            boolean r0 = androidx.compose.ui.graphics.ImageBitmapConfig.m3949equalsimpl0(r3, r0)
            if (r0 == 0) goto L77
            androidx.compose.ui.graphics.ColorFilter$Companion r4 = androidx.compose.ui.graphics.ColorFilter.Companion
            androidx.compose.ui.graphics.vector.GroupComponent r0 = r10.root
            long r5 = r0.m4356getTintColor0d7_KjU()
            r7 = 0
            r8 = 2
            r9 = 0
            androidx.compose.ui.graphics.ColorFilter r0 = androidx.compose.ui.graphics.ColorFilter.Companion.m3775tintxETnrds$default(r4, r5, r7, r8, r9)
            goto L78
        L77:
            r0 = 0
        L78:
            r10.tintFilter = r0
            long r4 = r11.mo4277getSizeNHjbRc()
            float r0 = androidx.compose.ui.geometry.Size.m3562getWidthimpl(r4)
            long r4 = r10.m4372getViewportSizeNHjbRc$ui_release()
            float r2 = androidx.compose.ui.geometry.Size.m3562getWidthimpl(r4)
            float r0 = r0 / r2
            r10.rootScaleX = r0
            long r4 = r11.mo4277getSizeNHjbRc()
            float r0 = androidx.compose.ui.geometry.Size.m3559getHeightimpl(r4)
            long r4 = r10.m4372getViewportSizeNHjbRc$ui_release()
            float r2 = androidx.compose.ui.geometry.Size.m3559getHeightimpl(r4)
            float r0 = r0 / r2
            r10.rootScaleY = r0
            androidx.compose.ui.graphics.vector.DrawCache r2 = r10.cacheDrawScope
            long r4 = r11.mo4277getSizeNHjbRc()
            float r0 = androidx.compose.ui.geometry.Size.m3562getWidthimpl(r4)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            int r0 = (int) r0
            long r4 = r11.mo4277getSizeNHjbRc()
            float r4 = androidx.compose.ui.geometry.Size.m3559getHeightimpl(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            long r4 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r4)
            androidx.compose.ui.unit.LayoutDirection r7 = r11.getLayoutDirection()
            v3.l<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.r2> r8 = r10.drawVectorBlock
            r6 = r11
            r2.m4354drawCachedImageFqjB98A(r3, r4, r6, r7, r8)
            r10.isDirty = r1
            long r0 = r11.mo4277getSizeNHjbRc()
            r10.previousDrawSize = r0
        Ld6:
            if (r13 == 0) goto Ld9
            goto Le6
        Ld9:
            androidx.compose.ui.graphics.ColorFilter r13 = r10.getIntrinsicColorFilter$ui_release()
            if (r13 == 0) goto Le4
            androidx.compose.ui.graphics.ColorFilter r13 = r10.getIntrinsicColorFilter$ui_release()
            goto Le6
        Le4:
            androidx.compose.ui.graphics.ColorFilter r13 = r10.tintFilter
        Le6:
            androidx.compose.ui.graphics.vector.DrawCache r0 = r10.cacheDrawScope
            r0.drawInto(r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComponent.draw(androidx.compose.ui.graphics.drawscope.DrawScope, float, androidx.compose.ui.graphics.ColorFilter):void");
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m4371getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo3601getConfig_sVssgQ() : ImageBitmapConfig.Companion.m3954getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    @l
    public final a<r2> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m4372getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m3567unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(@m ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@l a<r2> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void setName(@l String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m4373setViewportSizeuvyYCjk$ui_release(long j5) {
        this.viewportSize$delegate.setValue(Size.m3550boximpl(j5));
    }

    @l
    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Size.m3562getWidthimpl(m4372getViewportSizeNHjbRc$ui_release()) + "\n\tviewportHeight: " + Size.m3559getHeightimpl(m4372getViewportSizeNHjbRc$ui_release()) + "\n";
        l0.o(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@l DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
