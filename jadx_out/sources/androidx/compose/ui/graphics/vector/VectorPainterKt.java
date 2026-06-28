package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0096\u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001c\u001a&\u0010!\u001a\u00020\u000e*\u00020\u001d2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001e¢\u0006\u0002\b\u001fH\u0082\b\u001a&\u0010&\u001a\u00020#*\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a*\u0010*\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a$\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aD\u00103\u001a\u00020\u0012*\u00020\u00122\u0006\u0010'\u001a\u00020#2\u0006\u0010/\u001a\u00020#2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a \u00108\u001a\u00020\u00122\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u001a2\u0006\u00107\u001a\u000206H\u0000\u001a\u0014\u0010;\u001a\u000206*\u0002062\u0006\u0010:\u001a\u000209H\u0000\u001a-\u0010@\u001a\u00020\u000e2\u0006\u0010<\u001a\u0002092\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020>0=H\u0007¢\u0006\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/v0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILv3/r;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "", "autoMirror", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLv3/r;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "Lkotlin/u;", "block", "mirror", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "obtainSizePx-VpY3zN4", "(Landroidx/compose/ui/unit/Density;FF)J", "obtainSizePx", "defaultSize", "obtainViewportSize-Pq9zytI", "(JFF)J", "obtainViewportSize", "Landroidx/compose/ui/graphics/ColorFilter;", "createColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "createColorFilter", "viewportSize", "intrinsicColorFilter", "configureVectorPainter-T4PVSW8", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "configureVectorPainter", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "createVectorPainterFromImageVector", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "currentGroup", "createGroupComponent", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "configs", "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,516:1\n74#2:517\n74#2:543\n50#3:518\n49#3:519\n25#3:526\n67#3,3:533\n66#3:536\n50#3:544\n49#3:545\n1116#4,6:520\n1116#4,6:527\n1116#4,6:537\n1116#4,6:546\n174#5,6:552\n262#5,11:558\n646#6:569\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n129#1:517\n170#1:543\n132#1:518\n132#1:519\n135#1:526\n144#1:533,3\n144#1:536\n171#1:544\n171#1:545\n132#1:520,6\n135#1:527,6\n144#1:537,6\n171#1:546,6\n266#1:552,6\n266#1:558,11\n326#1:569\n*E\n"})
/* loaded from: classes.dex */
public final class VectorPainterKt {

    @l
    public static final String RootGroupName = "VectorRootGroup";

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void RenderVectorGroup(@l VectorGroup vectorGroup, @m Map<String, ? extends VectorConfig> map, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        Map<String, ? extends VectorConfig> map2;
        Map<String, ? extends VectorConfig> map3;
        Composer composer2;
        Map<String, ? extends VectorConfig> map4;
        Map<String, ? extends VectorConfig> z4;
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(vectorGroup)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i9 = i6 & 2;
        if (i9 != 0) {
            i7 |= 16;
        }
        if (i9 == 2 && (i7 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            map3 = map;
            composer2 = startRestartGroup;
        } else {
            if (i9 != 0) {
                z4 = a1.z();
                map2 = z4;
            } else {
                map2 = map;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i7, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:426)");
            }
            Iterator<VectorNode> it = vectorGroup.iterator();
            while (it.hasNext()) {
                VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    startRestartGroup.startReplaceableGroup(-326282007);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = map2.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                        };
                    }
                    VectorConfig vectorConfig2 = vectorConfig;
                    Composer composer3 = startRestartGroup;
                    VectorComposeKt.m4374Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m4392getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m4393getStrokeLineCapKaPHkGw(), vectorPath.m4394getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer3, 8, 0, 0);
                    composer3.endReplaceableGroup();
                    it = it;
                    map2 = map2;
                    startRestartGroup = composer3;
                } else {
                    Iterator<VectorNode> it2 = it;
                    Map<String, ? extends VectorConfig> map5 = map2;
                    Composer composer4 = startRestartGroup;
                    if (next instanceof VectorGroup) {
                        composer4.startReplaceableGroup(-326280149);
                        VectorGroup vectorGroup2 = (VectorGroup) next;
                        map4 = map5;
                        VectorConfig vectorConfig3 = map4.get(vectorGroup2.getName());
                        if (vectorConfig3 == null) {
                            vectorConfig3 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                            };
                        }
                        VectorComposeKt.Group(vectorGroup2.getName(), ((Number) vectorConfig3.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup2.getRotation()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup2.getScaleX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup2.getScaleY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue(), (List) vectorConfig3.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup2.getClipPathData()), ComposableLambdaKt.composableLambda(composer4, 1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map4)), composer4, 939524096, 0);
                        composer4.endReplaceableGroup();
                    } else {
                        map4 = map5;
                        composer4.startReplaceableGroup(-326278679);
                        composer4.endReplaceableGroup();
                    }
                    startRestartGroup = composer4;
                    map2 = map4;
                    it = it2;
                }
            }
            map3 = map2;
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map3, i5, i6));
        }
    }

    @l
    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m4385configureVectorPainterT4PVSW8(@l VectorPainter vectorPainter, long j5, long j6, @l String str, @m ColorFilter colorFilter, boolean z4) {
        vectorPainter.m4382setSizeuvyYCjk$ui_release(j5);
        vectorPainter.setAutoMirror$ui_release(z4);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m4383setViewportSizeuvyYCjk$ui_release(j6);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m4386configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j5, long j6, String str, ColorFilter colorFilter, boolean z4, int i5, Object obj) {
        String str2;
        boolean z5;
        if ((i5 & 4) != 0) {
            str2 = RootGroupName;
        } else {
            str2 = str;
        }
        if ((i5 & 16) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        return m4385configureVectorPainterT4PVSW8(vectorPainter, j5, j6, str2, colorFilter, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m4387createColorFilterxETnrds(long j5, int i5) {
        boolean z4;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return ColorFilter.Companion.m3778tintxETnrds(j5, i5);
        }
        return null;
    }

    @l
    public static final GroupComponent createGroupComponent(@l GroupComponent groupComponent, @l VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i5 = 0; i5 < size; i5++) {
            VectorNode vectorNode = vectorGroup.get(i5);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m4368setPathFillTypeoQ8Xj4U(vectorPath.m4392getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m4369setStrokeLineCapBeK7IIE(vectorPath.m4393getStrokeLineCapKaPHkGw());
                pathComponent.m4370setStrokeLineJoinWw9F2mQ(vectorPath.m4394getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i5, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i5, groupComponent2);
            }
        }
        return groupComponent;
    }

    @l
    public static final VectorPainter createVectorPainterFromImageVector(@l Density density, @l ImageVector imageVector, @l GroupComponent groupComponent) {
        long m4388obtainSizePxVpY3zN4 = m4388obtainSizePxVpY3zN4(density, imageVector.m4358getDefaultWidthD9Ej5fM(), imageVector.m4357getDefaultHeightD9Ej5fM());
        return m4385configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), m4388obtainSizePxVpY3zN4, m4389obtainViewportSizePq9zytI(m4388obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m4387createColorFilterxETnrds(imageVector.m4360getTintColor0d7_KjU(), imageVector.m4359getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, v3.l<? super DrawScope, r2> lVar) {
        long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4209scale0AR0LA0(-1.0f, 1.0f, mo4276getCenterF1C5BW0);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m4388obtainSizePxVpY3zN4(Density density, float f5, float f6) {
        return SizeKt.Size(density.mo304toPx0680j_4(f5), density.mo304toPx0680j_4(f6));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m4389obtainViewportSizePq9zytI(long j5, float f5, float f6) {
        if (Float.isNaN(f5)) {
            f5 = Size.m3562getWidthimpl(j5);
        }
        if (Float.isNaN(f6)) {
            f6 = Size.m3559getHeightimpl(j5);
        }
        return SizeKt.Size(f5, f6);
    }

    @l
    @Composable
    public static final VectorPainter rememberVectorPainter(@l ImageVector imageVector, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object valueOf = Integer.valueOf(imageVector.getGenId$ui_release());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            r2 r2Var = r2.f19517a;
            rememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }

    @k(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @b1(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @ComposableOpenTarget(index = -1)
    @l
    @Composable
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m4390rememberVectorPaintermlNsNFs(float f5, float f6, float f7, float f8, @m String str, long j5, int i5, @l r<? super Float, ? super Float, ? super Composer, ? super Integer, r2> rVar, @m Composer composer, int i6, int i7) {
        float f9;
        float f10;
        String str2;
        long j6;
        int i8;
        composer.startReplaceableGroup(-964365210);
        if ((i7 & 4) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f7;
        }
        if ((i7 & 8) != 0) {
            f10 = Float.NaN;
        } else {
            f10 = f8;
        }
        if ((i7 & 16) != 0) {
            str2 = RootGroupName;
        } else {
            str2 = str;
        }
        if ((i7 & 32) != 0) {
            j6 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j6 = j5;
        }
        if ((i7 & 64) != 0) {
            i8 = BlendMode.Companion.m3674getSrcIn0nO6VwU();
        } else {
            i8 = i5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i6, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter m4391rememberVectorPaintervIP8VLU = m4391rememberVectorPaintervIP8VLU(f5, f6, f9, f10, str2, j6, i8, false, rVar, composer, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | ((i6 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m4391rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if (r4 == r8.getEmpty()) goto L41;
     */
    @p4.l
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.VectorPainter m4391rememberVectorPaintervIP8VLU(float r16, float r17, float r18, float r19, @p4.m java.lang.String r20, long r21, int r23, boolean r24, @p4.l v3.r<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.m4391rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, v3.r, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }
}
