package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a2\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0000¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/selection/OffsetProvider;", "offsetProvider", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "handlesCrossed", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/r2;", "SelectionHandle", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "SelectionHandleIcon", "(Landroidx/compose/ui/Modifier;Lv3/a;ZLandroidx/compose/runtime/Composer;I)V", "drawSelectionHandle", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "radius", "Landroidx/compose/ui/graphics/ImageBitmap;", "createHandleImage", "positionProvider", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "Landroidx/compose/runtime/Composable;", "content", "HandlePopup", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/foundation/text/selection/HandleReferencePoint;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "areHandlesCrossed", "isHandleLtrDirection", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,327:1\n74#2:328\n542#3,17:329\n50#4:346\n49#4:347\n1116#5,6:348\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n73#1:328\n189#1:329,17\n225#1:346\n225#1:347\n225#1:348,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HandlePopup(@l OffsetProvider offsetProvider, @l HandleReferencePoint handleReferencePoint, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(345017889);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(offsetProvider)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(handleReferencePoint)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345017889, i6, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            int i10 = i6 << 3;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(handleReferencePoint) | startRestartGroup.changed(offsetProvider);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new HandlePositionProvider(handleReferencePoint, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), pVar, startRestartGroup, (i10 & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$HandlePopup$1(offsetProvider, handleReferencePoint, pVar, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionHandle(@l OffsetProvider offsetProvider, boolean z4, @l ResolvedTextDirection resolvedTextDirection, boolean z5, @l Modifier modifier, @m Composer composer, int i5) {
        int i6;
        HandleReferencePoint handleReferencePoint;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-626955031);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(offsetProvider)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i6 = i11 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(resolvedTextDirection)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(z5)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        int i12 = i6;
        if ((46811 & i12) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-626955031, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:66)");
            }
            boolean isLeft = isLeft(z4, resolvedTextDirection, z5);
            if (isLeft) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            HandlePopup(offsetProvider, handleReferencePoint, ComposableLambdaKt.composableLambda(startRestartGroup, 1868300064, true, new AndroidSelectionHandles_androidKt$SelectionHandle$1((ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration()), modifier, isLeft, offsetProvider, z4)), startRestartGroup, (i12 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$SelectionHandle$2(offsetProvider, z4, resolvedTextDirection, z5, modifier, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionHandleIcon(@l Modifier modifier, @l v3.a<Boolean> aVar, boolean z4, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(2111672474);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:98)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m604sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), aVar, z4), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$SelectionHandleIcon$1(modifier, aVar, z4, i5));
        }
    }

    @l
    public static final ImageBitmap createHandleImage(@l CacheDrawScope cacheDrawScope, float f5) {
        int ceil = ((int) Math.ceil(f5)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m3959ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m3953getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m4198component4NHjbRc = drawParams.m4198component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m4201setSizeuvyYCjk(Size);
        canvas2.save();
        DrawScope.m4272drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m3760getBlack0d7_KjU(), 0L, canvasDrawScope2.mo4277getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m3649getClear0nO6VwU(), 58, null);
        DrawScope.m4272drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m3509getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), 0.0f, null, null, 0, 120, null);
        DrawScope.m4259drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f5, OffsetKt.Offset(f5, f5), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m4201setSizeuvyYCjk(m4198component4NHjbRc);
        return imageBitmap2;
    }

    @l
    public static final Modifier drawSelectionHandle(@l Modifier modifier, @l v3.a<Boolean> aVar, boolean z4) {
        return ComposedModifierKt.composed$default(modifier, null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(aVar, z4), 1, null);
    }

    public static final boolean isHandleLtrDirection(@l ResolvedTextDirection resolvedTextDirection, boolean z4) {
        if ((resolvedTextDirection == ResolvedTextDirection.Ltr && !z4) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z4)) {
            return true;
        }
        return false;
    }

    public static final boolean isLeft(boolean z4, @l ResolvedTextDirection resolvedTextDirection, boolean z5) {
        if (z4) {
            return isHandleLtrDirection(resolvedTextDirection, z5);
        }
        if (!isHandleLtrDirection(resolvedTextDirection, z5)) {
            return true;
        }
        return false;
    }
}
