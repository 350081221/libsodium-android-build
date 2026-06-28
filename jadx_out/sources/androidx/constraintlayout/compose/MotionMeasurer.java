package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import android.net.http.Headers;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011Je\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010'\u001a\u00020\u000b2\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002H\u0002JI\u00104\u001a\u00020\u000b*\u00020(2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J1\u00108\u001a\u00020\u000b*\u00020(2\u0006\u00105\u001a\u00020+2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0006\u00109\u001a\u00020\u0019Jc\u0010?\u001a\u00020<2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010;\u001a\u00020:ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0012\u0010@\u001a\u00020\u000b2\n\u0010!\u001a\u00060\u001fj\u0002` J\b\u0010A\u001a\u00020\u000bH\u0016J\u0013\u0010C\u001a\u00020\u000b*\u00020BH\u0007¢\u0006\u0004\bC\u0010DJ&\u0010J\u001a\u0002002\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020Eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bH\u0010IJ\u0016\u0010K\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020EJ\u0006\u0010L\u001a\u00020\u000bJ(\u0010O\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019R\u0016\u0010P\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0017\u0010\u0018\u001a\u00020R8\u0006¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\bT\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer;", "", "optimizationLevel", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/r2;", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "measureConstraintSet", "", "needsRemeasure-BRTryo0", "(J)Z", "needsRemeasure", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/Transition;", "transition", "", "progress", "remeasure", "recalculateInterpolation-36Wf7g4", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFZ)V", "recalculateInterpolation", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", Headers.LOCATION, "", "types", "count", "encodeKeyFrames", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "parentWidth", "parentHeight", "Landroidx/constraintlayout/core/state/WidgetFrame;", "startFrame", "endFrame", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawFrameDebug-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrameDebug", TypedValues.AttributesType.S_FRAME, "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrame", "getProgress", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performInterpolationMeasure-OQbXsTc", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J", "performInterpolationMeasure", "encodeRoot", "computeLayoutResult", "Landroidx/compose/foundation/layout/BoxScope;", "drawDebug", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "", "id", "name", "getCustomColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "getCustomColor", "getCustomFloat", "clearConstraintSets", "start", "end", "initWith", Key.MOTIONPROGRESS, "F", "Landroidx/constraintlayout/core/state/Transition;", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
@a1
/* loaded from: classes2.dex */
public final class MotionMeasurer extends Measurer {
    private float motionProgress;

    @l
    private final androidx.constraintlayout.core.state.Transition transition = new androidx.constraintlayout.core.state.Transition();

    /* renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m6385drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j5) {
        float f5;
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.m4272drawRectnJ9OG0$default(drawScope, j5, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        float f6 = 1.0f;
        if (Float.isNaN(widgetFrame.scaleX)) {
            f5 = 1.0f;
        } else {
            f5 = widgetFrame.scaleX;
        }
        if (!Float.isNaN(widgetFrame.scaleY)) {
            f6 = widgetFrame.scaleY;
        }
        matrix.preScale(f5, f6, widgetFrame.centerX(), widgetFrame.centerY());
        int i5 = widgetFrame.left;
        int i6 = widgetFrame.top;
        int i7 = widgetFrame.right;
        int i8 = widgetFrame.bottom;
        float[] fArr = {i5, i6, i7, i6, i7, i8, i5, i8};
        matrix.mapPoints(fArr);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawFrameDebug-PE3pjmc, reason: not valid java name */
    public final void m6386drawFrameDebugPE3pjmc(DrawScope drawScope, float f5, float f6, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j5) {
        m6385drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j5);
        m6385drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j5);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f5, (int) f6);
        if (numberKeyPositions != 0) {
            float[] fArr = new float[numberKeyPositions];
            float[] fArr2 = new float[numberKeyPositions];
            float[] fArr3 = new float[numberKeyPositions];
            this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
            widgetFrame.centerX();
            widgetFrame.centerY();
            int i5 = numberKeyPositions - 1;
            if (i5 >= 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    float f7 = fArr3[i6] / 100.0f;
                    float f8 = 1 - f7;
                    float width = (widgetFrame.width() * f8) + (widgetFrame2.width() * f7);
                    float height = (f8 * widgetFrame.height()) + (f7 * widgetFrame2.height());
                    float f9 = (fArr[i6] * f5) + (width / 2.0f);
                    float f10 = (fArr2[i6] * f6) + (height / 2.0f);
                    Path Path = AndroidPath_androidKt.Path();
                    Path.moveTo(f9 - 20.0f, f10);
                    Path.lineTo(f9, f10 + 20.0f);
                    Path.lineTo(f9 + 20.0f, f10);
                    Path.lineTo(f9, f10 - 20.0f);
                    Path.close();
                    DrawScope.m4268drawPathLG529CI$default(drawScope, Path, j5, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
                    if (i6 != i5) {
                        i6 = i7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void encodeKeyFrames(StringBuilder sb, float[] fArr, int[] iArr, int[] iArr2, int i5) {
        if (i5 == 0) {
            return;
        }
        sb.append("keyTypes : [");
        int i6 = 0;
        if (i5 > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                int i9 = iArr[i7];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                sb2.append(i9);
                sb2.append(',');
                sb.append(sb2.toString());
                if (i8 >= i5) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        sb.append("],\n");
        sb.append("keyPos : [");
        int i10 = i5 * 2;
        if (i10 > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                float f5 = fArr[i11];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(' ');
                sb3.append(f5);
                sb3.append(',');
                sb.append(sb3.toString());
                if (i12 >= i10) {
                    break;
                } else {
                    i11 = i12;
                }
            }
        }
        sb.append("],\n ");
        sb.append("keyFrames : [");
        if (i5 > 0) {
            while (true) {
                int i13 = i6 + 1;
                int i14 = iArr2[i6];
                StringBuilder sb4 = new StringBuilder();
                sb4.append(' ');
                sb4.append(i14);
                sb4.append(',');
                sb.append(sb4.toString());
                if (i13 >= i5) {
                    break;
                } else {
                    i6 = i13;
                }
            }
        }
        sb.append("],\n ");
    }

    /* renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m6387measureConstraintSethBUhpc(int i5, ConstraintSet constraintSet, List<? extends Measurable> list, long j5) {
        Measurable measurable;
        Object layoutId;
        String obj;
        Measurable measurable2;
        Object layoutId2;
        String obj2;
        getState().reset();
        constraintSet.applyTo(getState(), list);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        l0.o(children, "root.children");
        int size = children.size() - 1;
        if (size >= 0) {
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                children.get(i6).setAnimated(true);
                if (i7 > size) {
                    break;
                } else {
                    i6 = i7;
                }
            }
        }
        m6358applyRootSizeBRTryo0(j5);
        getRoot().updateHierarchy();
        if (MotionLayoutKt.access$getDEBUG$p()) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            l0.o(children2, "root.children");
            for (ConstraintWidget constraintWidget : children2) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    measurable2 = (Measurable) companionWidget;
                } else {
                    measurable2 = null;
                }
                if (measurable2 == null) {
                    layoutId2 = null;
                } else {
                    layoutId2 = LayoutIdKt.getLayoutId(measurable2);
                }
                String str = "NOTAG";
                if (layoutId2 != null && (obj2 = layoutId2.toString()) != null) {
                    str = obj2;
                }
                constraintWidget.setDebugName(str);
            }
        }
        ArrayList<ConstraintWidget> children3 = getRoot().getChildren();
        l0.o(children3, "root.children");
        for (ConstraintWidget constraintWidget2 : children3) {
            Object companionWidget2 = constraintWidget2.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                measurable = (Measurable) companionWidget2;
            } else {
                measurable = null;
            }
            if (measurable == null) {
                layoutId = null;
            } else {
                layoutId = LayoutIdKt.getLayoutId(measurable);
            }
            if (layoutId == null) {
                if (measurable == null) {
                    layoutId = null;
                } else {
                    layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                }
            }
            if (layoutId == null) {
                obj = null;
            } else {
                obj = layoutId.toString();
            }
            constraintWidget2.stringId = obj;
        }
        getRoot().setOptimizationLevel(i5);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[SYNTHETIC] */
    /* renamed from: needsRemeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m6388needsRemeasureBRTryo0(long r8) {
        /*
            r7 = this;
            androidx.constraintlayout.core.state.Transition r0 = r7.transition
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto La3
            java.util.Map r0 = r7.getFrameCache()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto La3
        L15:
            boolean r0 = androidx.compose.ui.unit.Constraints.m5997getHasFixedHeightimpl(r8)
            if (r0 == 0) goto L29
            androidx.constraintlayout.compose.State r0 = r7.getState()
            int r2 = androidx.compose.ui.unit.Constraints.m5999getMaxHeightimpl(r8)
            boolean r0 = r0.sameFixedHeight(r2)
            if (r0 == 0) goto L3d
        L29:
            boolean r0 = androidx.compose.ui.unit.Constraints.m5998getHasFixedWidthimpl(r8)
            if (r0 == 0) goto L3e
            androidx.constraintlayout.compose.State r0 = r7.getState()
            int r8 = androidx.compose.ui.unit.Constraints.m6000getMaxWidthimpl(r8)
            boolean r8 = r0.sameFixedWidth(r8)
            if (r8 != 0) goto L3e
        L3d:
            return r1
        L3e:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8 = r7.getRoot()
            java.util.ArrayList r8 = r8.getChildren()
            java.lang.String r9 = "root.children"
            kotlin.jvm.internal.l0.o(r8, r9)
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r0 = 0
            if (r9 < 0) goto La2
            r2 = r0
        L55:
            int r3 = r2 + 1
            java.lang.Object r2 = r8.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            java.lang.Object r4 = r2.getCompanionWidget()
            boolean r5 = r4 instanceof androidx.compose.ui.layout.Measurable
            if (r5 == 0) goto L68
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.ui.layout.Measurable) r4
            goto L69
        L68:
            r4 = 0
        L69:
            if (r4 != 0) goto L6d
        L6b:
            r2 = r0
            goto L9a
        L6d:
            androidx.constraintlayout.core.state.Transition r5 = r7.getTransition()
            androidx.constraintlayout.core.state.WidgetFrame r2 = r5.getInterpolated(r2)
            if (r2 != 0) goto L78
            goto L6b
        L78:
            java.util.Map r5 = r7.getPlaceables()
            java.lang.Object r4 = r5.get(r4)
            androidx.compose.ui.layout.Placeable r4 = (androidx.compose.ui.layout.Placeable) r4
            if (r4 != 0) goto L85
            goto L6b
        L85:
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            int r6 = r2.width()
            if (r5 != r6) goto L99
            int r2 = r2.height()
            if (r4 == r2) goto L6b
        L99:
            r2 = r1
        L9a:
            if (r2 == 0) goto L9d
            goto La3
        L9d:
            if (r3 <= r9) goto La0
            goto La2
        La0:
            r2 = r3
            goto L55
        La2:
            r1 = r0
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.m6388needsRemeasureBRTryo0(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        if (r9.intValue() != r7) goto L45;
     */
    /* renamed from: recalculateInterpolation-36Wf7g4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m6389recalculateInterpolation36Wf7g4(long r13, androidx.compose.ui.unit.LayoutDirection r15, androidx.constraintlayout.compose.ConstraintSet r16, androidx.constraintlayout.compose.ConstraintSet r17, androidx.constraintlayout.compose.Transition r18, java.util.List<? extends androidx.compose.ui.layout.Measurable> r19, int r20, float r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.m6389recalculateInterpolation36Wf7g4(long, androidx.compose.ui.unit.LayoutDirection, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.Transition, java.util.List, int, float, boolean):void");
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    @Override // androidx.constraintlayout.compose.Measurer
    public void computeLayoutResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        Iterator<ConstraintWidget> it = getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            WidgetFrame start = this.transition.getStart(next.stringId);
            WidgetFrame end = this.transition.getEnd(next.stringId);
            WidgetFrame interpolated = this.transition.getInterpolated(next.stringId);
            float[] path = this.transition.getPath(next.stringId);
            int keyFrames = this.transition.getKeyFrames(next.stringId, fArr, iArr, iArr2);
            sb.append(' ' + ((Object) next.stringId) + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            l0.o(path, "path");
            int length = path.length;
            int i5 = 0;
            while (i5 < length) {
                float f5 = path[i5];
                i5++;
                sb.append(' ' + f5 + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            String sb2 = sb.toString();
            l0.o(sb2, "json.toString()");
            layoutInformationReceiver.setLayoutInformation(sb2);
        }
    }

    @Composable
    public final void drawDebug(@l BoxScope boxScope, @m Composer composer, int i5) {
        l0.p(boxScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(436942847);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.Companion), new MotionMeasurer$drawDebug$1(this), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MotionMeasurer$drawDebug$2(this, boxScope, i5));
        }
    }

    public final void encodeRoot(@l StringBuilder json) {
        l0.p(json, "json");
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    /* renamed from: getCustomColor-WaAFU9c, reason: not valid java name */
    public final long m6390getCustomColorWaAFU9c(@l String id, @l String name) {
        l0.p(id, "id");
        l0.p(name, "name");
        if (!this.transition.contains(id)) {
            return Color.Companion.m3760getBlack0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), this.motionProgress);
        return ColorKt.Color(this.transition.getInterpolated(id).getCustomColor(name));
    }

    public final float getCustomFloat(@l String id, @l String name) {
        l0.p(id, "id");
        l0.p(name, "name");
        if (!this.transition.contains(id)) {
            return 0.0f;
        }
        WidgetFrame start = this.transition.getStart(id);
        WidgetFrame end = this.transition.getEnd(id);
        float customFloat = start.getCustomFloat(name);
        float customFloat2 = end.getCustomFloat(name);
        float f5 = this.motionProgress;
        return ((1.0f - f5) * customFloat) + (f5 * customFloat2);
    }

    public final float getProgress() {
        return this.motionProgress;
    }

    @l
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final void initWith(@l ConstraintSet start, @l ConstraintSet end, @m Transition transition, float f5) {
        l0.p(start, "start");
        l0.p(end, "end");
        clearConstraintSets();
        start.applyTo(this.transition, 0);
        end.applyTo(this.transition, 1);
        this.transition.interpolate(0, 0, f5);
        if (transition != null) {
            transition.applyTo(this.transition, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (r10 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r1.intValue() != Integer.MIN_VALUE) goto L25;
     */
    /* renamed from: performInterpolationMeasure-OQbXsTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m6391performInterpolationMeasureOQbXsTc(long r13, @p4.l androidx.compose.ui.unit.LayoutDirection r15, @p4.l androidx.constraintlayout.compose.ConstraintSet r16, @p4.l androidx.constraintlayout.compose.ConstraintSet r17, @p4.m androidx.constraintlayout.compose.Transition r18, @p4.l java.util.List<? extends androidx.compose.ui.layout.Measurable> r19, int r20, float r21, @p4.l androidx.compose.ui.layout.MeasureScope r22) {
        /*
            r12 = this;
            r11 = r12
            r0 = r22
            java.lang.String r1 = "layoutDirection"
            r3 = r15
            kotlin.jvm.internal.l0.p(r15, r1)
            java.lang.String r1 = "constraintSetStart"
            r4 = r16
            kotlin.jvm.internal.l0.p(r4, r1)
            java.lang.String r1 = "constraintSetEnd"
            r5 = r17
            kotlin.jvm.internal.l0.p(r5, r1)
            java.lang.String r1 = "measurables"
            r7 = r19
            kotlin.jvm.internal.l0.p(r7, r1)
            java.lang.String r1 = "measureScope"
            kotlin.jvm.internal.l0.p(r0, r1)
            r12.setDensity(r0)
            r12.setMeasureScope(r0)
            boolean r10 = r12.m6388needsRemeasureBRTryo0(r13)
            float r0 = r11.motionProgress
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 == 0) goto L6e
            androidx.constraintlayout.compose.LayoutInformationReceiver r0 = r12.getLayoutInformationReceiver()
            r1 = 0
            if (r0 != 0) goto L41
            r0 = r1
            goto L49
        L41:
            int r0 = r0.getForcedWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L49:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L4e
            goto L54
        L4e:
            int r0 = r0.intValue()
            if (r0 == r2) goto L6c
        L54:
            androidx.constraintlayout.compose.LayoutInformationReceiver r0 = r12.getLayoutInformationReceiver()
            if (r0 != 0) goto L5b
            goto L63
        L5b:
            int r0 = r0.getForcedHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L63:
            if (r1 != 0) goto L66
            goto L6e
        L66:
            int r0 = r1.intValue()
            if (r0 != r2) goto L6e
        L6c:
            if (r10 == 0) goto L80
        L6e:
            r0 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.m6389recalculateInterpolation36Wf7g4(r1, r3, r4, r5, r6, r7, r8, r9, r10)
        L80:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r12.getRoot()
            int r0 = r0.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r12.getRoot()
            int r1 = r1.getHeight()
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionMeasurer.m6391performInterpolationMeasureOQbXsTc(long, androidx.compose.ui.unit.LayoutDirection, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.Transition, java.util.List, int, float, androidx.compose.ui.layout.MeasureScope):long");
    }
}
