package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008f\u0001\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0097\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009d\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010 \u001a8\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surface", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,493:1\n154#2:494\n154#2:495\n154#2:498\n154#2:499\n154#2:508\n154#2:509\n154#2:518\n154#2:519\n74#3:496\n74#3:506\n74#3:516\n74#3:526\n51#4:497\n51#4:507\n51#4:517\n51#4:527\n1116#5,6:500\n1116#5,6:510\n1116#5,6:520\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n106#1:494\n107#1:495\n211#1:498\n212#1:499\n321#1:508\n322#1:509\n432#1:518\n433#1:519\n111#1:496\n217#1:506\n327#1:516\n438#1:526\n111#1:497\n217#1:507\n327#1:517\n438#1:527\n214#1:500,6\n324#1:510,6\n435#1:520,6\n*E\n"})
/* loaded from: classes.dex */
public final class SurfaceKt {

    @p4.l
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, SurfaceKt$LocalAbsoluteTonalElevation$1.INSTANCE, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m2304SurfaceT9BRK9s(@p4.m Modifier modifier, @p4.m Shape shape, long j5, long j6, float f5, float f6, @p4.m BorderStroke borderStroke, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        Shape shape2;
        long j7;
        long j8;
        float f7;
        float f8;
        BorderStroke borderStroke2;
        composer.startReplaceableGroup(-513881741);
        if ((i6 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i6 & 4) != 0) {
            j7 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i6 & 8) != 0) {
            j8 = ColorSchemeKt.m1720contentColorForek8zF_U(j7, composer, (i5 >> 6) & 14);
        } else {
            j8 = j6;
        }
        if ((i6 & 16) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        } else {
            f7 = f5;
        }
        if ((i6 & 32) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        } else {
            f8 = f6;
        }
        if ((i6 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i5, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m6044constructorimpl = Dp.m6044constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6058unboximpl() + f7);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j8)), providableCompositionLocal.provides(Dp.m6042boximpl(m6044constructorimpl))}, ComposableLambdaKt.composableLambda(composer, -70914509, true, new SurfaceKt$Surface$1(modifier2, shape2, j7, m6044constructorimpl, borderStroke2, f8, pVar)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2305Surfaced85dljk(boolean z4, @p4.l v3.a<r2> aVar, @p4.m Modifier modifier, boolean z5, @p4.m Shape shape, long j5, long j6, float f5, float f6, @p4.m BorderStroke borderStroke, @p4.m MutableInteractionSource mutableInteractionSource, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6, int i7) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(540296512);
        Modifier modifier2 = (i7 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i7 & 8) != 0 ? true : z5;
        Shape rectangleShape = (i7 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1706getSurface0d7_KjU = (i7 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU() : j5;
        long m1720contentColorForek8zF_U = (i7 & 64) != 0 ? ColorSchemeKt.m1720contentColorForek8zF_U(m1706getSurface0d7_KjU, composer, (i5 >> 15) & 14) : j6;
        float m6044constructorimpl = (i7 & 128) != 0 ? Dp.m6044constructorimpl(0) : f5;
        float m6044constructorimpl2 = (i7 & 256) != 0 ? Dp.m6044constructorimpl(0) : f6;
        BorderStroke borderStroke2 = (i7 & 512) != 0 ? null : borderStroke;
        if ((i7 & 1024) != 0) {
            composer.startReplaceableGroup(-746935250);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i5, i6, "androidx.compose.material3.Surface (Surface.kt:325)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m6044constructorimpl3 = Dp.m6044constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6058unboximpl() + m6044constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(m1720contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6042boximpl(m6044constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new SurfaceKt$Surface$5(modifier2, rectangleShape, m1706getSurface0d7_KjU, m6044constructorimpl3, borderStroke2, z4, mutableInteractionSource2, z6, aVar, m6044constructorimpl2, pVar)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m2307Surfaceo_FOJdg(@p4.l v3.a<r2> aVar, @p4.m Modifier modifier, boolean z4, @p4.m Shape shape, long j5, long j6, float f5, float f6, @p4.m BorderStroke borderStroke, @p4.m MutableInteractionSource mutableInteractionSource, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6, int i7) {
        Modifier modifier2;
        boolean z5;
        Shape shape2;
        long j7;
        long j8;
        float f7;
        float f8;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(-789752804);
        if ((i7 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i7 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i7 & 8) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i7 & 16) != 0) {
            j7 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i7 & 32) != 0) {
            j8 = ColorSchemeKt.m1720contentColorForek8zF_U(j7, composer, (i5 >> 12) & 14);
        } else {
            j8 = j6;
        }
        if ((i7 & 64) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        } else {
            f7 = f5;
        }
        if ((i7 & 128) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        } else {
            f8 = f6;
        }
        if ((i7 & 256) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i7 & 512) != 0) {
            composer.startReplaceableGroup(-746940902);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            composer.endReplaceableGroup();
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i5, i6, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m6044constructorimpl = Dp.m6044constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6058unboximpl() + f7);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j8)), providableCompositionLocal.provides(Dp.m6042boximpl(m6044constructorimpl))}, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new SurfaceKt$Surface$3(modifier2, shape2, j7, m6044constructorimpl, borderStroke2, mutableInteractionSource2, z5, aVar, f8, pVar)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @p4.l
    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m2310surfaceXOJAsU(Modifier modifier, Shape shape, long j5, BorderStroke borderStroke, float f5) {
        Shape shape2;
        Modifier modifier2;
        Modifier m3894graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, false, null, 0L, 0L, 0, 124895, null);
        if (borderStroke != null) {
            shape2 = shape;
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape2);
        } else {
            shape2 = shape;
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m200backgroundbw27NRU(m3894graphicsLayerAp8cVGQ$default.then(modifier2), j5, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m2311surfaceColorAtElevationCLU3JFs(long j5, float f5, Composer composer, int i5) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i5, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        int i6 = i5 << 3;
        long m1718applyTonalElevationRFCenO8 = ColorSchemeKt.m1718applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j5, f5, composer, (i6 & 112) | (i6 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1718applyTonalElevationRFCenO8;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2306Surfaced85dljk(boolean z4, @p4.l v3.l<? super Boolean, r2> lVar, @p4.m Modifier modifier, boolean z5, @p4.m Shape shape, long j5, long j6, float f5, float f6, @p4.m BorderStroke borderStroke, @p4.m MutableInteractionSource mutableInteractionSource, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6, int i7) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i7 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i7 & 8) != 0 ? true : z5;
        Shape rectangleShape = (i7 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1706getSurface0d7_KjU = (i7 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU() : j5;
        long m1720contentColorForek8zF_U = (i7 & 64) != 0 ? ColorSchemeKt.m1720contentColorForek8zF_U(m1706getSurface0d7_KjU, composer, (i5 >> 15) & 14) : j6;
        float m6044constructorimpl = (i7 & 128) != 0 ? Dp.m6044constructorimpl(0) : f5;
        float m6044constructorimpl2 = (i7 & 256) != 0 ? Dp.m6044constructorimpl(0) : f6;
        BorderStroke borderStroke2 = (i7 & 512) != 0 ? null : borderStroke;
        if ((i7 & 1024) != 0) {
            composer.startReplaceableGroup(-746929488);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i5, i6, "androidx.compose.material3.Surface (Surface.kt:436)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m6044constructorimpl3 = Dp.m6044constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6058unboximpl() + m6044constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(m1720contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6042boximpl(m6044constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 712720927, true, new SurfaceKt$Surface$7(modifier2, rectangleShape, m1706getSurface0d7_KjU, m6044constructorimpl3, borderStroke2, z4, mutableInteractionSource2, z6, lVar, m6044constructorimpl2, pVar)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
