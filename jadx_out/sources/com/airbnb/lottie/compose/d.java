package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.j1;
import com.airbnb.lottie.x0;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a·\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001aç\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010'\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010(\u001a\"\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020-H\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"LottieAnimation", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "iterations", "", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release", "setDynamicProperties"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,236:1\n25#2:237\n25#2:244\n36#2:251\n36#2:258\n36#2:265\n1097#3,6:238\n1097#3,6:245\n1097#3,6:252\n1097#3,6:259\n1097#3,6:266\n81#4:272\n107#4,2:273\n81#4:275\n*S KotlinDebug\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt\n*L\n92#1:237\n93#1:244\n94#1:251\n159#1:258\n216#1:265\n92#1:238,6\n93#1:245,6\n94#1:252,6\n159#1:259,6\n216#1:266,6\n94#1:272\n94#1:273,2\n205#1:275\n*E\n"})
/* loaded from: classes2.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ com.airbnb.lottie.a $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ k $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ v3.a<Float> $progress;
        final /* synthetic */ j1 $renderMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(com.airbnb.lottie.k kVar, v3.a<Float> aVar, Modifier modifier, boolean z4, boolean z5, boolean z6, j1 j1Var, boolean z7, k kVar2, Alignment alignment, ContentScale contentScale, boolean z8, boolean z9, Map<String, ? extends Typeface> map, com.airbnb.lottie.a aVar2, int i5, int i6, int i7) {
            super(2);
            this.$composition = kVar;
            this.$progress = aVar;
            this.$modifier = modifier;
            this.$outlineMasksAndMattes = z4;
            this.$applyOpacityToLayers = z5;
            this.$enableMergePaths = z6;
            this.$renderMode = j1Var;
            this.$maintainOriginalImageBounds = z7;
            this.$dynamicProperties = kVar2;
            this.$alignment = alignment;
            this.$contentScale = contentScale;
            this.$clipToCompositionBounds = z8;
            this.$clipTextToBoundingBox = z9;
            this.$fontMap = map;
            this.$asyncUpdates = aVar2;
            this.$$changed = i5;
            this.$$changed1 = i6;
            this.$$default = i7;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.c(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt$LottieAnimation$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,236:1\n245#2:237\n*S KotlinDebug\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt$LottieAnimation$2\n*L\n103#1:237\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b extends n0 implements v3.l<DrawScope, r2> {
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ com.airbnb.lottie.a $asyncUpdates;
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ x0 $drawable;
        final /* synthetic */ k $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ v3.a<Float> $progress;
        final /* synthetic */ j1 $renderMode;
        final /* synthetic */ MutableState<k> $setDynamicProperties$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Rect rect, ContentScale contentScale, Alignment alignment, Matrix matrix, x0 x0Var, boolean z4, j1 j1Var, com.airbnb.lottie.a aVar, com.airbnb.lottie.k kVar, Map<String, ? extends Typeface> map, k kVar2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, v3.a<Float> aVar2, MutableState<k> mutableState) {
            super(1);
            this.$bounds = rect;
            this.$contentScale = contentScale;
            this.$alignment = alignment;
            this.$matrix = matrix;
            this.$drawable = x0Var;
            this.$enableMergePaths = z4;
            this.$renderMode = j1Var;
            this.$asyncUpdates = aVar;
            this.$composition = kVar;
            this.$fontMap = map;
            this.$dynamicProperties = kVar2;
            this.$outlineMasksAndMattes = z5;
            this.$applyOpacityToLayers = z6;
            this.$maintainOriginalImageBounds = z7;
            this.$clipToCompositionBounds = z8;
            this.$clipTextToBoundingBox = z9;
            this.$progress = aVar2;
            this.$setDynamicProperties$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l DrawScope Canvas) {
            int L0;
            int L02;
            l0.p(Canvas, "$this$Canvas");
            Rect rect = this.$bounds;
            ContentScale contentScale = this.$contentScale;
            Alignment alignment = this.$alignment;
            Matrix matrix = this.$matrix;
            x0 x0Var = this.$drawable;
            boolean z4 = this.$enableMergePaths;
            j1 j1Var = this.$renderMode;
            com.airbnb.lottie.a aVar = this.$asyncUpdates;
            com.airbnb.lottie.k kVar = this.$composition;
            Map<String, Typeface> map = this.$fontMap;
            k kVar2 = this.$dynamicProperties;
            boolean z5 = this.$outlineMasksAndMattes;
            boolean z6 = this.$applyOpacityToLayers;
            boolean z7 = this.$maintainOriginalImageBounds;
            boolean z8 = this.$clipToCompositionBounds;
            boolean z9 = this.$clipTextToBoundingBox;
            v3.a<Float> aVar2 = this.$progress;
            MutableState<k> mutableState = this.$setDynamicProperties$delegate;
            Canvas canvas = Canvas.getDrawContext().getCanvas();
            long Size = SizeKt.Size(rect.width(), rect.height());
            L0 = kotlin.math.d.L0(Size.m3562getWidthimpl(Canvas.mo4277getSizeNHjbRc()));
            L02 = kotlin.math.d.L0(Size.m3559getHeightimpl(Canvas.mo4277getSizeNHjbRc()));
            long IntSize = IntSizeKt.IntSize(L0, L02);
            long mo4989computeScaleFactorH7hwNQA = contentScale.mo4989computeScaleFactorH7hwNQA(Size, Canvas.mo4277getSizeNHjbRc());
            long mo3370alignKFBX0sM = alignment.mo3370alignKFBX0sM(d.k(Size, mo4989computeScaleFactorH7hwNQA), IntSize, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(IntOffset.m6172getXimpl(mo3370alignKFBX0sM), IntOffset.m6173getYimpl(mo3370alignKFBX0sM));
            matrix.preScale(ScaleFactor.m5068getScaleXimpl(mo4989computeScaleFactorH7hwNQA), ScaleFactor.m5069getScaleYimpl(mo4989computeScaleFactorH7hwNQA));
            x0Var.H(z4);
            x0Var.x1(j1Var);
            x0Var.Y0(aVar);
            x0Var.b1(kVar);
            x0Var.e1(map);
            if (kVar2 != d.d(mutableState)) {
                k d5 = d.d(mutableState);
                if (d5 != null) {
                    d5.b(x0Var);
                }
                if (kVar2 != null) {
                    kVar2.a(x0Var);
                }
                d.e(mutableState, kVar2);
            }
            x0Var.u1(z5);
            x0Var.X0(z6);
            x0Var.j1(z7);
            x0Var.a1(z8);
            x0Var.Z0(z9);
            x0Var.w1(aVar2.invoke().floatValue());
            x0Var.setBounds(0, 0, rect.width(), rect.height());
            x0Var.F(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ com.airbnb.lottie.a $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ k $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ v3.a<Float> $progress;
        final /* synthetic */ j1 $renderMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(com.airbnb.lottie.k kVar, v3.a<Float> aVar, Modifier modifier, boolean z4, boolean z5, boolean z6, j1 j1Var, boolean z7, k kVar2, Alignment alignment, ContentScale contentScale, boolean z8, boolean z9, Map<String, ? extends Typeface> map, com.airbnb.lottie.a aVar2, int i5, int i6, int i7) {
            super(2);
            this.$composition = kVar;
            this.$progress = aVar;
            this.$modifier = modifier;
            this.$outlineMasksAndMattes = z4;
            this.$applyOpacityToLayers = z5;
            this.$enableMergePaths = z6;
            this.$renderMode = j1Var;
            this.$maintainOriginalImageBounds = z7;
            this.$dynamicProperties = kVar2;
            this.$alignment = alignment;
            this.$contentScale = contentScale;
            this.$clipToCompositionBounds = z8;
            this.$clipTextToBoundingBox = z9;
            this.$fontMap = map;
            this.$asyncUpdates = aVar2;
            this.$$changed = i5;
            this.$$changed1 = i6;
            this.$$default = i7;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.c(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0091d extends n0 implements v3.a<Float> {
        final /* synthetic */ float $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0091d(float f5) {
            super(0);
            this.$progress = f5;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Float invoke() {
            return Float.valueOf(this.$progress);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ com.airbnb.lottie.a $asyncUpdates;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ k $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ float $progress;
        final /* synthetic */ j1 $renderMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.airbnb.lottie.k kVar, float f5, Modifier modifier, boolean z4, boolean z5, boolean z6, j1 j1Var, boolean z7, k kVar2, Alignment alignment, ContentScale contentScale, boolean z8, com.airbnb.lottie.a aVar, int i5, int i6, int i7) {
            super(2);
            this.$composition = kVar;
            this.$progress = f5;
            this.$modifier = modifier;
            this.$outlineMasksAndMattes = z4;
            this.$applyOpacityToLayers = z5;
            this.$enableMergePaths = z6;
            this.$renderMode = j1Var;
            this.$maintainOriginalImageBounds = z7;
            this.$dynamicProperties = kVar2;
            this.$alignment = alignment;
            this.$contentScale = contentScale;
            this.$clipToCompositionBounds = z8;
            this.$asyncUpdates = aVar;
            this.$$changed = i5;
            this.$$changed1 = i6;
            this.$$default = i7;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.a(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends n0 implements v3.a<Float> {
        final /* synthetic */ LottieAnimationState $progress$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(LottieAnimationState lottieAnimationState) {
            super(0);
            this.$progress$delegate = lottieAnimationState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Float invoke() {
            return Float.valueOf(d.f(this.$progress$delegate));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ com.airbnb.lottie.a $asyncUpdates;
        final /* synthetic */ com.airbnb.lottie.compose.g $clipSpec;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ com.airbnb.lottie.k $composition;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ k $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ j1 $renderMode;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ float $speed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(com.airbnb.lottie.k kVar, Modifier modifier, boolean z4, boolean z5, com.airbnb.lottie.compose.g gVar, float f5, int i5, boolean z6, boolean z7, boolean z8, j1 j1Var, boolean z9, boolean z10, k kVar2, Alignment alignment, ContentScale contentScale, boolean z11, boolean z12, Map<String, ? extends Typeface> map, com.airbnb.lottie.a aVar, int i6, int i7, int i8) {
            super(2);
            this.$composition = kVar;
            this.$modifier = modifier;
            this.$isPlaying = z4;
            this.$restartOnPlay = z5;
            this.$clipSpec = gVar;
            this.$speed = f5;
            this.$iterations = i5;
            this.$outlineMasksAndMattes = z6;
            this.$applyOpacityToLayers = z7;
            this.$enableMergePaths = z8;
            this.$renderMode = j1Var;
            this.$reverseOnRepeat = z9;
            this.$maintainOriginalImageBounds = z10;
            this.$dynamicProperties = kVar2;
            this.$alignment = alignment;
            this.$contentScale = contentScale;
            this.$clipToCompositionBounds = z11;
            this.$clipTextToBoundingBox = z12;
            this.$fontMap = map;
            this.$asyncUpdates = aVar;
            this.$$changed = i6;
            this.$$changed1 = i7;
            this.$$default = i8;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.b(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$clipSpec, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @kotlin.k(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    public static final void a(@p4.m com.airbnb.lottie.k kVar, @FloatRange(from = 0.0d, to = 1.0d) float f5, @p4.m Modifier modifier, boolean z4, boolean z5, boolean z6, @p4.m j1 j1Var, boolean z7, @p4.m k kVar2, @p4.m Alignment alignment, @p4.m ContentScale contentScale, boolean z8, @p4.m com.airbnb.lottie.a aVar, @p4.m Composer composer, int i5, int i6, int i7) {
        Composer startRestartGroup = composer.startRestartGroup(627485782);
        Modifier modifier2 = (i7 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z9 = (i7 & 8) != 0 ? false : z4;
        boolean z10 = (i7 & 16) != 0 ? false : z5;
        boolean z11 = (i7 & 32) != 0 ? false : z6;
        j1 j1Var2 = (i7 & 64) != 0 ? j1.AUTOMATIC : j1Var;
        boolean z12 = (i7 & 128) != 0 ? false : z7;
        k kVar3 = (i7 & 256) != 0 ? null : kVar2;
        Alignment center = (i7 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i7 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z13 = (i7 & 2048) != 0 ? true : z8;
        com.airbnb.lottie.a aVar2 = (i7 & 4096) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627485782, i5, i6, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:155)");
        }
        Float valueOf = Float.valueOf(f5);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(valueOf);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0091d(f5);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        c(kVar, (v3.a) rememberedValue, modifier2, z9, z10, z11, j1Var2, z12, kVar3, center, fit, z13, false, null, aVar2, startRestartGroup, (i5 & 896) | 134217736 | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | ((i6 << 6) & 57344), 12288);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new e(kVar, f5, modifier2, z9, z10, z11, j1Var2, z12, kVar3, center, fit, z13, aVar2, i5, i6, i7));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @u3.i
    public static final void b(@p4.m com.airbnb.lottie.k kVar, @p4.m Modifier modifier, boolean z4, boolean z5, @p4.m com.airbnb.lottie.compose.g gVar, float f5, int i5, boolean z6, boolean z7, boolean z8, @p4.m j1 j1Var, boolean z9, boolean z10, @p4.m k kVar2, @p4.m Alignment alignment, @p4.m ContentScale contentScale, boolean z11, boolean z12, @p4.m Map<String, ? extends Typeface> map, @p4.m com.airbnb.lottie.a aVar, @p4.m Composer composer, int i6, int i7, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(281338933);
        Modifier modifier2 = (i8 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z13 = (i8 & 4) != 0 ? true : z4;
        boolean z14 = (i8 & 8) != 0 ? true : z5;
        com.airbnb.lottie.compose.g gVar2 = (i8 & 16) != 0 ? null : gVar;
        float f6 = (i8 & 32) != 0 ? 1.0f : f5;
        int i9 = (i8 & 64) != 0 ? 1 : i5;
        boolean z15 = (i8 & 128) != 0 ? false : z6;
        boolean z16 = (i8 & 256) != 0 ? false : z7;
        boolean z17 = (i8 & 512) != 0 ? false : z8;
        j1 j1Var2 = (i8 & 1024) != 0 ? j1.AUTOMATIC : j1Var;
        boolean z18 = (i8 & 2048) != 0 ? false : z9;
        boolean z19 = (i8 & 4096) != 0 ? false : z10;
        k kVar3 = (i8 & 8192) != 0 ? null : kVar2;
        Alignment center = (i8 & 16384) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (32768 & i8) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z20 = (65536 & i8) != 0 ? true : z11;
        boolean z21 = (131072 & i8) != 0 ? false : z12;
        Map<String, ? extends Typeface> map2 = (262144 & i8) != 0 ? null : map;
        com.airbnb.lottie.a aVar2 = (524288 & i8) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281338933, i6, i7, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:203)");
        }
        int i10 = i6 >> 3;
        LottieAnimationState c5 = com.airbnb.lottie.compose.a.c(kVar, z13, z14, z18, gVar2, f6, i9, null, false, false, startRestartGroup, ((i7 << 6) & 7168) | (i10 & 112) | 8 | (i10 & 896) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016), 896);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(c5);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(c5);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i11 = i6 >> 12;
        int i12 = ((i6 << 3) & 896) | 134217736 | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | ((i7 << 18) & 3670016);
        int i13 = i7 << 15;
        int i14 = i12 | (29360128 & i13) | (i13 & 1879048192);
        int i15 = i7 >> 15;
        c(kVar, (v3.a) rememberedValue, modifier2, z15, z16, z17, j1Var2, z19, kVar3, center, fit, z20, z21, map2, aVar2, startRestartGroup, i14, (i15 & 57344) | (i15 & 14) | 4096 | (i15 & 112) | (i15 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new g(kVar, modifier2, z13, z14, gVar2, f6, i9, z15, z16, z17, j1Var2, z18, z19, kVar3, center, fit, z20, z21, map2, aVar2, i6, i7, i8));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @u3.i
    public static final void c(@p4.m com.airbnb.lottie.k kVar, @p4.l v3.a<Float> progress, @p4.m Modifier modifier, boolean z4, boolean z5, boolean z6, @p4.m j1 j1Var, boolean z7, @p4.m k kVar2, @p4.m Alignment alignment, @p4.m ContentScale contentScale, boolean z8, boolean z9, @p4.m Map<String, ? extends Typeface> map, @p4.m com.airbnb.lottie.a aVar, @p4.m Composer composer, int i5, int i6, int i7) {
        l0.p(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(-904209850);
        Modifier modifier2 = (i7 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z10 = (i7 & 8) != 0 ? false : z4;
        boolean z11 = (i7 & 16) != 0 ? false : z5;
        boolean z12 = (i7 & 32) != 0 ? false : z6;
        j1 j1Var2 = (i7 & 64) != 0 ? j1.AUTOMATIC : j1Var;
        boolean z13 = (i7 & 128) != 0 ? false : z7;
        k kVar3 = (i7 & 256) != 0 ? null : kVar2;
        Alignment center = (i7 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i7 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z14 = (i7 & 2048) != 0 ? true : z8;
        boolean z15 = (i7 & 4096) != 0 ? false : z9;
        Map<String, ? extends Typeface> map2 = (i7 & 8192) != 0 ? null : map;
        com.airbnb.lottie.a aVar2 = (i7 & 16384) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904209850, i5, i6, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:90)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new x0();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        x0 x0Var = (x0) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Matrix();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Matrix matrix = (Matrix) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(kVar);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(185151897);
        if (kVar != null) {
            if (!(kVar.d() == 0.0f)) {
                startRestartGroup.endReplaceableGroup();
                Rect b5 = kVar.b();
                Modifier modifier3 = modifier2;
                CanvasKt.Canvas(com.airbnb.lottie.compose.e.a(modifier2, b5.width(), b5.height()), new b(b5, fit, center, matrix, x0Var, z12, j1Var2, aVar2, kVar, map2, kVar3, z10, z11, z13, z14, z15, progress, mutableState), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new c(kVar, progress, modifier3, z10, z11, z12, j1Var2, z13, kVar3, center, fit, z14, z15, map2, aVar2, i5, i6, i7));
                return;
            }
        }
        Modifier modifier4 = modifier2;
        BoxKt.Box(modifier4, startRestartGroup, (i5 >> 6) & 14);
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new a(kVar, progress, modifier4, z10, z11, z12, j1Var2, z13, kVar3, center, fit, z14, z15, map2, aVar2, i5, i6, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k d(MutableState<k> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<k> mutableState, k kVar) {
        mutableState.setValue(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j5, long j6) {
        return IntSizeKt.IntSize((int) (Size.m3562getWidthimpl(j5) * ScaleFactor.m5068getScaleXimpl(j6)), (int) (Size.m3559getHeightimpl(j5) * ScaleFactor.m5069getScaleYimpl(j6)));
    }
}
