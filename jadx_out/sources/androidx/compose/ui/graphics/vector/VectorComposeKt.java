package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a¦\u0001\u0010'\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "name", "", Key.ROTATION, "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Group", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "Path", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    @androidx.compose.ui.graphics.vector.VectorComposable
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Group(@p4.m java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, @p4.m java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r28, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @VectorComposable
    @Composable
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m4374Path9cdaXJ4(@l List<? extends PathNode> list, int i5, @m String str, @m Brush brush, float f5, @m Brush brush2, float f6, float f7, int i6, int i7, float f8, float f9, float f10, float f11, @m Composer composer, int i8, int i9, int i10) {
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i10 & 2) != 0 ? VectorKt.getDefaultFillType() : i5;
        String str2 = (i10 & 4) != 0 ? "" : str;
        Brush brush3 = (i10 & 8) != 0 ? null : brush;
        float f12 = (i10 & 16) != 0 ? 1.0f : f5;
        Brush brush4 = (i10 & 32) != 0 ? null : brush2;
        float f13 = (i10 & 64) != 0 ? 1.0f : f6;
        float f14 = (i10 & 128) != 0 ? 0.0f : f7;
        int defaultStrokeLineCap = (i10 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i6;
        int defaultStrokeLineJoin = (i10 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i7;
        float f15 = (i10 & 1024) != 0 ? 4.0f : f8;
        float f16 = (i10 & 2048) != 0 ? 0.0f : f9;
        float f17 = (i10 & 4096) != 0 ? 1.0f : f10;
        float f18 = (i10 & 8192) != 0 ? 0.0f : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i8, i9, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
        }
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl, str2, VectorComposeKt$Path$2$1.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, list, VectorComposeKt$Path$2$2.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, PathFillType.m4008boximpl(defaultFillType), VectorComposeKt$Path$2$3.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, brush3, VectorComposeKt$Path$2$4.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f12), VectorComposeKt$Path$2$5.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, brush4, VectorComposeKt$Path$2$6.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f13), VectorComposeKt$Path$2$7.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f14), VectorComposeKt$Path$2$8.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, StrokeJoin.m4088boximpl(defaultStrokeLineJoin), VectorComposeKt$Path$2$9.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, StrokeCap.m4078boximpl(defaultStrokeLineCap), VectorComposeKt$Path$2$10.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f15), VectorComposeKt$Path$2$11.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f16), VectorComposeKt$Path$2$12.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f17), VectorComposeKt$Path$2$13.INSTANCE);
        Updater.m3271setimpl(m3264constructorimpl, Float.valueOf(f18), VectorComposeKt$Path$2$14.INSTANCE);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorComposeKt$Path$3(list, defaultFillType, str2, brush3, f12, brush4, f13, f14, defaultStrokeLineCap, defaultStrokeLineJoin, f15, f16, f17, f18, i8, i9, i10));
        }
    }
}
