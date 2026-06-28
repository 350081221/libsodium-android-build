package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

@i0(d1 = {"\u00006\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\u001a4\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001ai\u0010\u0013\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000728\b\u0004\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00020\rH\u0082\b\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0015\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0015\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0015\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0015\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0015\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0015\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0015\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0015\"\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*\"\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010*\"\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010*\"\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010*\"\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010*\"\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010*\"\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010*\"\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010*¨\u00063"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Lkotlin/r2;", "addPathNodes", "", "numArgs", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "subArray", "start", "nodeFor", "pathNodesFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,400:1\n347#1,15:401\n347#1,15:416\n347#1,15:431\n347#1,15:446\n347#1,15:461\n347#1,15:476\n347#1,15:491\n347#1,15:506\n347#1,15:521\n347#1,15:536\n347#1,15:551\n347#1,15:566\n347#1,15:581\n347#1,15:596\n347#1,15:611\n347#1,15:626\n347#1,15:641\n347#1,15:656\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n154#1:401,15\n163#1:416,15\n167#1:431,15\n176#1:446,15\n180#1:461,15\n189#1:476,15\n198#1:491,15\n207#1:506,15\n216#1:521,15\n232#1:536,15\n243#1:551,15\n257#1:566,15\n271#1:581,15\n285#1:596,15\n294#1:611,15\n303#1:626,15\n312#1:641,15\n324#1:656,15\n*E\n"})
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c5, @l ArrayList<PathNode> arrayList, @l float[] fArr, int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6 = 0;
        if (c5 == 'z' || c5 == 'Z') {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            arrayList.add(PathNode.Close.INSTANCE);
            return;
        }
        if (c5 == 'm') {
            int i7 = i5 - 2;
            while (i6 <= i7) {
                int i8 = i6 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArr[i6], fArr[i8]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArr[i6], fArr[i8]);
                } else if (i6 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i8]);
                }
                arrayList.add(relativeMoveTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'M') {
            int i9 = i5 - 2;
            while (i6 <= i9) {
                int i10 = i6 + 1;
                PathNode moveTo = new PathNode.MoveTo(fArr[i6], fArr[i10]);
                if (i6 > 0) {
                    moveTo = new PathNode.LineTo(fArr[i6], fArr[i10]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i10]);
                }
                arrayList.add(moveTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'l') {
            int i11 = i5 - 2;
            while (i6 <= i11) {
                int i12 = i6 + 1;
                PathNode relativeLineTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i12]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeLineTo = new PathNode.LineTo(fArr[i6], fArr[i12]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i12]);
                }
                arrayList.add(relativeLineTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'L') {
            int i13 = i5 - 2;
            while (i6 <= i13) {
                int i14 = i6 + 1;
                PathNode lineTo = new PathNode.LineTo(fArr[i6], fArr[i14]);
                if ((lineTo instanceof PathNode.MoveTo) && i6 > 0) {
                    lineTo = new PathNode.LineTo(fArr[i6], fArr[i14]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i14]);
                }
                arrayList.add(lineTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'h') {
            int i15 = i5 - 1;
            while (i6 <= i15) {
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArr[i6]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArr[i6], fArr[i6 + 1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i6 + 1]);
                }
                arrayList.add(relativeHorizontalTo);
                i6++;
            }
            return;
        }
        if (c5 == 'H') {
            int i16 = i5 - 1;
            while (i6 <= i16) {
                PathNode horizontalTo = new PathNode.HorizontalTo(fArr[i6]);
                if ((horizontalTo instanceof PathNode.MoveTo) && i6 > 0) {
                    horizontalTo = new PathNode.LineTo(fArr[i6], fArr[i6 + 1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i6 + 1]);
                }
                arrayList.add(horizontalTo);
                i6++;
            }
            return;
        }
        if (c5 == 'v') {
            int i17 = i5 - 1;
            while (i6 <= i17) {
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArr[i6]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArr[i6], fArr[i6 + 1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i6 + 1]);
                }
                arrayList.add(relativeVerticalTo);
                i6++;
            }
            return;
        }
        if (c5 == 'V') {
            int i18 = i5 - 1;
            while (i6 <= i18) {
                PathNode verticalTo = new PathNode.VerticalTo(fArr[i6]);
                if ((verticalTo instanceof PathNode.MoveTo) && i6 > 0) {
                    verticalTo = new PathNode.LineTo(fArr[i6], fArr[i6 + 1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i6 + 1]);
                }
                arrayList.add(verticalTo);
                i6++;
            }
            return;
        }
        if (c5 == 'c') {
            int i19 = i5 - 6;
            while (i6 <= i19) {
                int i20 = i6 + 1;
                PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArr[i6], fArr[i20], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
                if ((relativeCurveTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeCurveTo = new PathNode.LineTo(fArr[i6], fArr[i20]);
                } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeCurveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i20]);
                }
                arrayList.add(relativeCurveTo);
                i6 += 6;
            }
            return;
        }
        if (c5 == 'C') {
            int i21 = i5 - 6;
            while (i6 <= i21) {
                int i22 = i6 + 1;
                PathNode curveTo = new PathNode.CurveTo(fArr[i6], fArr[i22], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
                if ((curveTo instanceof PathNode.MoveTo) && i6 > 0) {
                    curveTo = new PathNode.LineTo(fArr[i6], fArr[i22]);
                } else if ((curveTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    curveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i22]);
                }
                arrayList.add(curveTo);
                i6 += 6;
            }
            return;
        }
        if (c5 == 's') {
            int i23 = i5 - 4;
            while (i6 <= i23) {
                int i24 = i6 + 1;
                PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArr[i6], fArr[i24], fArr[i6 + 2], fArr[i6 + 3]);
                if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeReflectiveCurveTo = new PathNode.LineTo(fArr[i6], fArr[i24]);
                } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i24]);
                }
                arrayList.add(relativeReflectiveCurveTo);
                i6 += 4;
            }
            return;
        }
        if (c5 == 'S') {
            int i25 = i5 - 4;
            while (i6 <= i25) {
                int i26 = i6 + 1;
                PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArr[i6], fArr[i26], fArr[i6 + 2], fArr[i6 + 3]);
                if ((reflectiveCurveTo instanceof PathNode.MoveTo) && i6 > 0) {
                    reflectiveCurveTo = new PathNode.LineTo(fArr[i6], fArr[i26]);
                } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    reflectiveCurveTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i26]);
                }
                arrayList.add(reflectiveCurveTo);
                i6 += 4;
            }
            return;
        }
        if (c5 == 'q') {
            int i27 = i5 - 4;
            while (i6 <= i27) {
                int i28 = i6 + 1;
                PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArr[i6], fArr[i28], fArr[i6 + 2], fArr[i6 + 3]);
                if ((relativeQuadTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeQuadTo = new PathNode.LineTo(fArr[i6], fArr[i28]);
                } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeQuadTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i28]);
                }
                arrayList.add(relativeQuadTo);
                i6 += 4;
            }
            return;
        }
        if (c5 == 'Q') {
            int i29 = i5 - 4;
            while (i6 <= i29) {
                int i30 = i6 + 1;
                PathNode quadTo = new PathNode.QuadTo(fArr[i6], fArr[i30], fArr[i6 + 2], fArr[i6 + 3]);
                if ((quadTo instanceof PathNode.MoveTo) && i6 > 0) {
                    quadTo = new PathNode.LineTo(fArr[i6], fArr[i30]);
                } else if ((quadTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    quadTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i30]);
                }
                arrayList.add(quadTo);
                i6 += 4;
            }
            return;
        }
        if (c5 == 't') {
            int i31 = i5 - 2;
            while (i6 <= i31) {
                int i32 = i6 + 1;
                PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArr[i6], fArr[i32]);
                if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && i6 > 0) {
                    relativeReflectiveQuadTo = new PathNode.LineTo(fArr[i6], fArr[i32]);
                } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i32]);
                }
                arrayList.add(relativeReflectiveQuadTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'T') {
            int i33 = i5 - 2;
            while (i6 <= i33) {
                int i34 = i6 + 1;
                PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArr[i6], fArr[i34]);
                if ((reflectiveQuadTo instanceof PathNode.MoveTo) && i6 > 0) {
                    reflectiveQuadTo = new PathNode.LineTo(fArr[i6], fArr[i34]);
                } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i6 > 0) {
                    reflectiveQuadTo = new PathNode.RelativeLineTo(fArr[i6], fArr[i34]);
                }
                arrayList.add(reflectiveQuadTo);
                i6 += 2;
            }
            return;
        }
        if (c5 == 'a') {
            int i35 = i5 - 7;
            for (int i36 = 0; i36 <= i35; i36 += 7) {
                float f5 = fArr[i36];
                int i37 = i36 + 1;
                float f6 = fArr[i37];
                float f7 = fArr[i36 + 2];
                if (Float.compare(fArr[i36 + 3], 0.0f) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (Float.compare(fArr[i36 + 4], 0.0f) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                PathNode relativeArcTo = new PathNode.RelativeArcTo(f5, f6, f7, z7, z8, fArr[i36 + 5], fArr[i36 + 6]);
                if ((relativeArcTo instanceof PathNode.MoveTo) && i36 > 0) {
                    relativeArcTo = new PathNode.LineTo(fArr[i36], fArr[i37]);
                } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && i36 > 0) {
                    relativeArcTo = new PathNode.RelativeLineTo(fArr[i36], fArr[i37]);
                }
                arrayList.add(relativeArcTo);
            }
            return;
        }
        if (c5 == 'A') {
            int i38 = i5 - 7;
            for (int i39 = 0; i39 <= i38; i39 += 7) {
                float f8 = fArr[i39];
                int i40 = i39 + 1;
                float f9 = fArr[i40];
                float f10 = fArr[i39 + 2];
                if (Float.compare(fArr[i39 + 3], 0.0f) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (Float.compare(fArr[i39 + 4], 0.0f) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                PathNode arcTo = new PathNode.ArcTo(f8, f9, f10, z5, z6, fArr[i39 + 5], fArr[i39 + 6]);
                if ((arcTo instanceof PathNode.MoveTo) && i39 > 0) {
                    arcTo = new PathNode.LineTo(fArr[i39], fArr[i40]);
                } else if ((arcTo instanceof PathNode.RelativeMoveTo) && i39 > 0) {
                    arcTo = new PathNode.RelativeLineTo(fArr[i39], fArr[i40]);
                }
                arrayList.add(arcTo);
            }
            return;
        }
        throw new IllegalArgumentException("Unknown command for: " + c5);
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i5, int i6, p<? super float[], ? super Integer, ? extends PathNode> pVar) {
        int i7 = i5 - i6;
        int i8 = 0;
        while (i8 <= i7) {
            PathNode invoke = pVar.invoke(fArr, Integer.valueOf(i8));
            if ((invoke instanceof PathNode.MoveTo) && i8 > 0) {
                invoke = new PathNode.LineTo(fArr[i8], fArr[i8 + 1]);
            } else if ((invoke instanceof PathNode.RelativeMoveTo) && i8 > 0) {
                invoke = new PathNode.RelativeLineTo(fArr[i8], fArr[i8 + 1]);
            }
            list.add(invoke);
            i8 += i6;
        }
    }
}
