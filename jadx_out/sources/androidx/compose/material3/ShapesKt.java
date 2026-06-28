package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\u0014\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\f\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/Shapes;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", t0.b.f22420d, "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "bottom", "Landroidx/compose/foundation/shape/CornerBasedShape;", "end", "fromToken", "start", "top", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,197:1\n164#2:198\n164#2:199\n164#2:200\n164#2:201\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n*L\n145#1:198\n152#1:199\n157#1:200\n162#1:201\n*E\n"})
/* loaded from: classes.dex */
public final class ShapesKt {

    @p4.l
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(ShapesKt$LocalShapes$1.INSTANCE);

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @p4.l
    public static final CornerBasedShape bottom(@p4.l CornerBasedShape cornerBasedShape) {
        float f5 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), null, null, 12, null);
    }

    @p4.l
    public static final CornerBasedShape end(@p4.l CornerBasedShape cornerBasedShape) {
        float f5 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), null, null, CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), 6, null);
    }

    @p4.l
    public static final Shape fromToken(@p4.l Shapes shapes, @p4.l ShapeKeyTokens shapeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return top(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return top(shapes.getExtraSmall());
            case 5:
                return RoundedCornerShapeKt.getCircleShape();
            case 6:
                return shapes.getLarge();
            case 7:
                return end(shapes.getLarge());
            case 8:
                return top(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return RectangleShapeKt.getRectangleShape();
            case 11:
                return shapes.getSmall();
            default:
                throw new kotlin.j0();
        }
    }

    @p4.l
    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }

    @u3.h(name = "getValue")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public static final Shape getValue(@p4.l ShapeKeyTokens shapeKeyTokens, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629172543, i5, -1, "androidx.compose.material3.<get-value> (Shapes.kt:192)");
        }
        Shape fromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    @p4.l
    public static final CornerBasedShape start(@p4.l CornerBasedShape cornerBasedShape) {
        float f5 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, null, CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), null, 9, null);
    }

    @p4.l
    public static final CornerBasedShape top(@p4.l CornerBasedShape cornerBasedShape) {
        float f5 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), CornerSizeKt.m815CornerSize0680j_4(Dp.m6044constructorimpl(f5)), 3, null);
    }
}
