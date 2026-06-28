package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import p4.l;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a©\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLv3/p;Landroidx/compose/runtime/Composer;II)V", "Card", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Card-LPr_se0", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/Indication;", "indication", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Card-9VG74zQ", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1116#4,6:216\n1116#4,6:224\n74#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
/* loaded from: classes.dex */
public final class CardKt {
    @k(level = m.ERROR, message = "This API is deprecated with the introduction a newer Card function overload that accepts an onClick().", replaceWith = @b1(expression = "Card(onClick, modifier, enabled, shape, backgroundColor, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m1250Card9VG74zQ(@l a<r2> aVar, @p4.m Modifier modifier, @p4.m Shape shape, long j5, long j6, @p4.m BorderStroke borderStroke, float f5, @p4.m MutableInteractionSource mutableInteractionSource, @p4.m Indication indication, boolean z4, @p4.m String str, @p4.m Role role, @l p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6, int i7) {
        Modifier modifier2;
        Shape shape2;
        long j7;
        long j8;
        BorderStroke borderStroke2;
        float f6;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        boolean z5;
        String str2;
        Role role2;
        composer.startReplaceableGroup(1353606722);
        if ((i7 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i7 & 4) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i7 & 8) != 0) {
            j7 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i7 & 16) != 0) {
            j8 = ColorsKt.m1293contentColorForek8zF_U(j7, composer, (i5 >> 9) & 14);
        } else {
            j8 = j6;
        }
        if ((i7 & 32) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i7 & 64) != 0) {
            f6 = Dp.m6044constructorimpl(1);
        } else {
            f6 = f5;
        }
        if ((i7 & 128) != 0) {
            composer.startReplaceableGroup(-492369756);
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
        if ((i7 & 256) != 0) {
            indication2 = (Indication) composer.consume(IndicationKt.getLocalIndication());
        } else {
            indication2 = indication;
        }
        if ((i7 & 512) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i7 & 1024) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i7 & 2048) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1353606722, i5, i6, "androidx.compose.material.Card (Card.kt:193)");
        }
        SurfaceKt.m1453Surface9VG74zQ(aVar, modifier2, shape2, j7, j8, borderStroke2, f6, mutableInteractionSource2, indication2, z5, str2, role2, pVar, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m1251CardFjzlyU(@p4.m Modifier modifier, @p4.m Shape shape, long j5, long j6, @p4.m BorderStroke borderStroke, float f5, @l p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        Shape shape2;
        long j7;
        long j8;
        BorderStroke borderStroke2;
        float f6;
        composer.startReplaceableGroup(1956755640);
        if ((i6 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 2) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i6 & 4) != 0) {
            j7 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i6 & 8) != 0) {
            j8 = ColorsKt.m1293contentColorForek8zF_U(j7, composer, (i5 >> 6) & 14);
        } else {
            j8 = j6;
        }
        if ((i6 & 16) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i6 & 32) != 0) {
            f6 = Dp.m6044constructorimpl(1);
        } else {
            f6 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i5, -1, "androidx.compose.material.Card (Card.kt:66)");
        }
        SurfaceKt.m1454SurfaceFjzlyU(modifier2, shape2, j7, j8, borderStroke2, f6, pVar, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m1252CardLPr_se0(@l a<r2> aVar, @p4.m Modifier modifier, boolean z4, @p4.m Shape shape, long j5, long j6, @p4.m BorderStroke borderStroke, float f5, @p4.m MutableInteractionSource mutableInteractionSource, @l p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        boolean z5;
        Shape shape2;
        long j7;
        long j8;
        BorderStroke borderStroke2;
        float f6;
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(778538979);
        if ((i6 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i6 & 8) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i6 & 16) != 0) {
            j7 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i6 & 32) != 0) {
            j8 = ColorsKt.m1293contentColorForek8zF_U(j7, composer, (i5 >> 12) & 14);
        } else {
            j8 = j6;
        }
        if ((i6 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i6 & 128) != 0) {
            f6 = Dp.m6044constructorimpl(1);
        } else {
            f6 = f5;
        }
        if ((i6 & 256) != 0) {
            composer.startReplaceableGroup(-492369756);
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
            ComposerKt.traceEventStart(778538979, i5, -1, "androidx.compose.material.Card (Card.kt:118)");
        }
        SurfaceKt.m1455SurfaceLPr_se0(aVar, modifier2, z5, shape2, j7, j8, borderStroke2, f6, mutableInteractionSource2, pVar, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
