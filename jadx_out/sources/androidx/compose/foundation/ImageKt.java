package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ab\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0017\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Lkotlin/r2;", "Image", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n36#2:269\n286#2,8:287\n294#2,2:307\n1116#3,6:270\n1116#3,6:276\n124#4,5:282\n130#4,5:295\n135#4:306\n137#4:309\n3737#5,6:300\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:269\n256#1:287,8\n256#1:307,2\n154#1:270,6\n246#1:276,6\n256#1:282,5\n256#1:295,5\n256#1:306\n256#1:309\n256#1:300,6\n*E\n"})
/* loaded from: classes.dex */
public final class ImageKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @b1(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f5, ColorFilter colorFilter, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-2123228673);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i6 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i6 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f6 = (i6 & 32) != 0 ? 1.0f : f5;
        ColorFilter colorFilter2 = (i6 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i5, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        m257Image5hnEew(imageBitmap, str, modifier2, center, fit, f6, colorFilter2, FilterQuality.Companion.m3833getLowfv9h1I(), composer, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m257Image5hnEew(@p4.l ImageBitmap imageBitmap, @p4.m String str, @p4.m Modifier modifier, @p4.m Alignment alignment, @p4.m ContentScale contentScale, float f5, @p4.m ColorFilter colorFilter, int i5, @p4.m Composer composer, int i6, int i7) {
        Modifier modifier2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f6;
        ColorFilter colorFilter2;
        int i8;
        composer.startReplaceableGroup(-1396260732);
        if ((i7 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i7 & 8) != 0) {
            alignment2 = Alignment.Companion.getCenter();
        } else {
            alignment2 = alignment;
        }
        if ((i7 & 16) != 0) {
            contentScale2 = ContentScale.Companion.getFit();
        } else {
            contentScale2 = contentScale;
        }
        if ((i7 & 32) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        if ((i7 & 64) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i7 & 128) != 0) {
            i8 = DrawScope.Companion.m4279getDefaultFilterQualityfv9h1I();
        } else {
            i8 = i5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i6, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BitmapPainterKt.m4350BitmapPainterQZhYCtY$default(imageBitmap, 0L, 0L, i8, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Image((BitmapPainter) rememberedValue, str, modifier2, alignment2, contentScale2, f6, colorFilter2, composer, (i6 & 112) | 8 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@p4.l ImageVector imageVector, @p4.m String str, @p4.m Modifier modifier, @p4.m Alignment alignment, @p4.m ContentScale contentScale, float f5, @p4.m ColorFilter colorFilter, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1595907091);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i6 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i6 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f6 = (i6 & 32) != 0 ? 1.0f : f5;
        ColorFilter colorFilter2 = (i6 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i5, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i5 & 14), str, modifier2, center, fit, f6, colorFilter2, composer, VectorPainter.$stable | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@p4.l Painter painter, @p4.m String str, @p4.m Modifier modifier, @p4.m Alignment alignment, @p4.m ContentScale contentScale, float f5, @p4.m ColorFilter colorFilter, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(1142754848);
        Modifier modifier3 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i6 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i6 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f6 = (i6 & 32) != 0 ? 1.0f : f5;
        ColorFilter colorFilter2 = (i6 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142754848, i5, -1, "androidx.compose.foundation.Image (Image.kt:243)");
        }
        if (str != null) {
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-175855396);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ImageKt$Image$semantics$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier paint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier3.then(modifier2)), painter, false, center, fit, f6, colorFilter2, 2, null);
        ImageKt$Image$1 imageKt$Image$1 = new MeasurePolicy() { // from class: androidx.compose.foundation.ImageKt$Image$1

            @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.ImageKt$Image$1$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1);
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                }
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @p4.l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, AnonymousClass1.INSTANCE, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(544976794);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, paint$default);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new ImageKt$Image$$inlined$Layout$1(constructor));
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl, imageKt$Image$1, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Updater.m3271setimpl(m3264constructorimpl, materializeModifier, companion2.getSetModifier());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ImageKt$Image$2(painter, str, modifier3, center, fit, f6, colorFilter2, i5, i6));
        }
    }
}
