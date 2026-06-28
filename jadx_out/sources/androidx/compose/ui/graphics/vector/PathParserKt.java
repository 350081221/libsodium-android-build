package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aX\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u001aX\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002\u001a\r\u0010\u001a\u001a\u00020\u0006*\u00020\u0006H\u0082\b\"\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", bi.aA, "", "x0", "y0", "x1", "y1", bi.ay, "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Lkotlin/r2;", "drawArc", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "toRadians", "", "EmptyArray", "[F", "getEmptyArray", "()[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,555:1\n554#1:562\n33#2,6:556\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n407#1:562\n176#1:556,6\n*E\n"})
/* loaded from: classes.dex */
public final class PathParserKt {

    @l
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d7;
        double d15 = 4;
        int ceil = (int) Math.ceil(Math.abs((d13 * d15) / 3.141592653589793d));
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double cos2 = Math.cos(d12);
        double sin2 = Math.sin(d12);
        double d16 = -d14;
        double d17 = d16 * cos;
        double d18 = d8 * sin;
        double d19 = (d17 * sin2) - (d18 * cos2);
        double d20 = d16 * sin;
        double d21 = d8 * cos;
        double d22 = (sin2 * d20) + (cos2 * d21);
        double d23 = d13 / ceil;
        double d24 = d9;
        double d25 = d22;
        double d26 = d19;
        int i5 = 0;
        double d27 = d10;
        double d28 = d12;
        while (i5 < ceil) {
            double d29 = d28 + d23;
            double sin3 = Math.sin(d29);
            double cos3 = Math.cos(d29);
            int i6 = ceil;
            double d30 = (d5 + ((d14 * cos) * cos3)) - (d18 * sin3);
            double d31 = d6 + (d14 * sin * cos3) + (d21 * sin3);
            double d32 = (d17 * sin3) - (d18 * cos3);
            double d33 = (sin3 * d20) + (cos3 * d21);
            double d34 = d29 - d28;
            double tan = Math.tan(d34 / 2);
            double sin4 = (Math.sin(d34) * (Math.sqrt(d15 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d24 + (d26 * sin4)), (float) (d27 + (d25 * sin4)), (float) (d30 - (sin4 * d32)), (float) (d31 - (sin4 * d33)), (float) d30, (float) d31);
            i5++;
            d23 = d23;
            sin = sin;
            d24 = d30;
            d20 = d20;
            d28 = d29;
            d25 = d33;
            d15 = d15;
            d26 = d32;
            cos = cos;
            ceil = i6;
            d27 = d31;
            d14 = d7;
        }
    }

    private static final void drawArc(Path path, double d5, double d6, double d7, double d8, double d9, double d10, double d11, boolean z4, boolean z5) {
        boolean z6;
        double d12;
        double d13;
        boolean z7;
        double d14 = (d11 / 180) * 3.141592653589793d;
        double cos = Math.cos(d14);
        double sin = Math.sin(d14);
        double d15 = ((d5 * cos) + (d6 * sin)) / d9;
        double d16 = (((-d5) * sin) + (d6 * cos)) / d10;
        double d17 = ((d7 * cos) + (d8 * sin)) / d9;
        double d18 = (((-d7) * sin) + (d8 * cos)) / d10;
        double d19 = d15 - d17;
        double d20 = d16 - d18;
        double d21 = 2;
        double d22 = (d15 + d17) / d21;
        double d23 = (d16 + d18) / d21;
        double d24 = (d19 * d19) + (d20 * d20);
        if (d24 == 0.0d) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            drawArc(path, d5, d6, d7, d8, d9 * sqrt, d10 * sqrt, d11, z4, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = d19 * sqrt2;
        double d27 = sqrt2 * d20;
        if (z4 == z5) {
            d12 = d22 - d27;
            d13 = d23 + d26;
        } else {
            d12 = d22 + d27;
            d13 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d13, d15 - d12);
        double atan22 = Math.atan2(d18 - d13, d17 - d12) - atan2;
        if (atan22 >= 0.0d) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z5 != z7) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d28 = d12 * d9;
        double d29 = d13 * d10;
        arcToBezier(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d9, d10, d5, d6, d14, atan2, atan22);
    }

    @l
    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    @l
    public static final Path toPath(@l List<? extends PathNode> list, @l Path path) {
        PathNode pathNode;
        PathNode pathNode2;
        float f5;
        int i5;
        int i6;
        PathNode pathNode3;
        float f6;
        float f7;
        float f8;
        float f9;
        float dy;
        float y12;
        float x22;
        float y22;
        float f10;
        float f11;
        float f12;
        float f13;
        float dy2;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int mo3625getFillTypeRgk1Os = path.mo3625getFillTypeRgk1Os();
        path.rewind();
        path2.mo3627setFillTypeoQ8Xj4U(mo3625getFillTypeRgk1Os);
        if (list.isEmpty()) {
            pathNode = PathNode.Close.INSTANCE;
        } else {
            pathNode = list2.get(0);
        }
        int size = list.size();
        float f14 = 0.0f;
        int i7 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (i7 < size) {
            PathNode pathNode4 = list2.get(i7);
            if (pathNode4 instanceof PathNode.Close) {
                path.close();
                path2.moveTo(f19, f20);
                pathNode3 = pathNode4;
                f15 = f19;
                f17 = f15;
                f16 = f20;
                f18 = f16;
            } else if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                f17 += relativeMoveTo.getDx();
                f18 += relativeMoveTo.getDy();
                path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                pathNode3 = pathNode4;
                f19 = f17;
                f20 = f18;
            } else {
                if (pathNode4 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                    float x4 = moveTo.getX();
                    float y4 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                    f17 = x4;
                    f19 = f17;
                    f18 = y4;
                    f20 = f18;
                } else {
                    if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f17 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        path2.lineTo(lineTo.getX(), lineTo.getY());
                        float x5 = lineTo.getX();
                        f18 = lineTo.getY();
                        f17 = x5;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                        path2.relativeLineTo(relativeHorizontalTo.getDx(), f14);
                        f17 += relativeHorizontalTo.getDx();
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                        path2.lineTo(horizontalTo.getX(), f18);
                        f17 = horizontalTo.getX();
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                        path2.relativeLineTo(f14, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                        path2.lineTo(f17, verticalTo.getY());
                        f18 = verticalTo.getY();
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            pathNode2 = pathNode4;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            f8 = relativeCurveTo.getDx2() + f17;
                            f9 = relativeCurveTo.getDy2() + f18;
                            f17 += relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else {
                            pathNode2 = pathNode4;
                            if (pathNode2 instanceof PathNode.CurveTo) {
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode2;
                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                f8 = curveTo.getX2();
                                y12 = curveTo.getY2();
                                x22 = curveTo.getX3();
                                y22 = curveTo.getY3();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    f13 = f18 - f16;
                                    f12 = f17 - f15;
                                } else {
                                    f12 = f14;
                                    f13 = f12;
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                                path.relativeCubicTo(f12, f13, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                f8 = relativeReflectiveCurveTo.getDx1() + f17;
                                f9 = relativeReflectiveCurveTo.getDy1() + f18;
                                f17 += relativeReflectiveCurveTo.getDx2();
                                dy = relativeReflectiveCurveTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    float f21 = 2;
                                    f11 = (f21 * f18) - f16;
                                    f10 = (f17 * f21) - f15;
                                } else {
                                    f10 = f17;
                                    f11 = f18;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode2;
                                path.cubicTo(f10, f11, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                f8 = reflectiveCurveTo.getX1();
                                y12 = reflectiveCurveTo.getY1();
                                x22 = reflectiveCurveTo.getX2();
                                y22 = reflectiveCurveTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode2;
                                path2.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                f8 = relativeQuadTo.getDx1() + f17;
                                f9 = relativeQuadTo.getDy1() + f18;
                                f17 += relativeQuadTo.getDx2();
                                dy = relativeQuadTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode2;
                                path2.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                f8 = quadTo.getX1();
                                y12 = quadTo.getY1();
                                x22 = quadTo.getX2();
                                y22 = quadTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode.isQuad()) {
                                    f6 = f17 - f15;
                                    f7 = f18 - f16;
                                } else {
                                    f6 = f14;
                                    f7 = f6;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                                path2.relativeQuadraticBezierTo(f6, f7, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                f8 = f6 + f17;
                                f9 = f7 + f18;
                                f17 += relativeReflectiveQuadTo.getDx();
                                dy = relativeReflectiveQuadTo.getDy();
                            } else {
                                if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode.isQuad()) {
                                        float f22 = 2;
                                        f17 = (f17 * f22) - f15;
                                        f18 = (f22 * f18) - f16;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode2;
                                    path2.quadraticBezierTo(f17, f18, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                    float x6 = reflectiveQuadTo.getX();
                                    pathNode3 = pathNode2;
                                    f16 = f18;
                                    f5 = f14;
                                    i5 = i7;
                                    i6 = size;
                                    f18 = reflectiveQuadTo.getY();
                                    f15 = f17;
                                    f17 = x6;
                                } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                                    PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode2;
                                    float arcStartDx = relativeArcTo.getArcStartDx() + f17;
                                    float arcStartDy = relativeArcTo.getArcStartDy() + f18;
                                    pathNode3 = pathNode2;
                                    i5 = i7;
                                    f5 = 0.0f;
                                    i6 = size;
                                    drawArc(path, f17, f18, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                    f15 = arcStartDx;
                                    f17 = f15;
                                    f19 = f19;
                                    f20 = f20;
                                    f16 = arcStartDy;
                                    f18 = f16;
                                } else {
                                    float f23 = f19;
                                    float f24 = f20;
                                    f5 = f14;
                                    i5 = i7;
                                    i6 = size;
                                    if (pathNode2 instanceof PathNode.ArcTo) {
                                        PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode2;
                                        pathNode3 = pathNode2;
                                        drawArc(path, f17, f18, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        f17 = arcTo.getArcStartX();
                                        f16 = arcTo.getArcStartY();
                                        f18 = f16;
                                        f19 = f23;
                                        f20 = f24;
                                        f15 = f17;
                                    } else {
                                        pathNode3 = pathNode2;
                                        f19 = f23;
                                        f20 = f24;
                                    }
                                }
                                i7 = i5 + 1;
                                path2 = path;
                                size = i6;
                                pathNode = pathNode3;
                                f14 = f5;
                                list2 = list;
                            }
                            pathNode3 = pathNode2;
                            f17 = x22;
                            f18 = y22;
                            f5 = f14;
                            i5 = i7;
                            i6 = size;
                            f16 = y12;
                            f15 = f8;
                            i7 = i5 + 1;
                            path2 = path;
                            size = i6;
                            pathNode = pathNode3;
                            f14 = f5;
                            list2 = list;
                        }
                        f18 += dy;
                        pathNode3 = pathNode2;
                        f16 = f9;
                        f5 = f14;
                        i5 = i7;
                        i6 = size;
                        f15 = f8;
                        i7 = i5 + 1;
                        path2 = path;
                        size = i6;
                        pathNode = pathNode3;
                        f14 = f5;
                        list2 = list;
                    }
                    f18 += dy2;
                }
                pathNode3 = pathNode4;
            }
            f5 = f14;
            i5 = i7;
            i6 = size;
            i7 = i5 + 1;
            path2 = path;
            size = i6;
            pathNode = pathNode3;
            f14 = f5;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d5) {
        return (d5 / 180) * 3.141592653589793d;
    }
}
