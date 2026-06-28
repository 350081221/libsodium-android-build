package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c5, float[] fArr) {
        arrayList.add(new PathDataNode(c5, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
            if (pathDataNodeArr[i5].mType != pathDataNodeArr2[i5].mType || pathDataNodeArr[i5].mParams.length != pathDataNodeArr2[i5].mParams.length) {
                return false;
            }
        }
        return true;
    }

    static float[] copyOfRange(float[] fArr, int i5, int i6) {
        if (i5 <= i6) {
            int length = fArr.length;
            if (i5 >= 0 && i5 <= length) {
                int i7 = i6 - i5;
                int min = Math.min(i7, length - i5);
                float[] fArr2 = new float[i7];
                System.arraycopy(fArr, i5, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static PathDataNode[] createNodesFromPathData(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 1;
        while (i6 < str.length()) {
            int nextStart = nextStart(str, i6);
            String trim = str.substring(i5, nextStart).trim();
            if (!trim.isEmpty()) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i5 = nextStart;
            i6 = nextStart + 1;
        }
        if (i6 - i5 == 1 && i5 < str.length()) {
            addNode(arrayList, str.charAt(i5), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    @NonNull
    public static Path createPathFromPathData(@NonNull String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing " + str, e5);
        }
    }

    @NonNull
    public static PathDataNode[] deepCopyNodes(@NonNull PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
            pathDataNodeArr2[i5] = new PathDataNode(pathDataNodeArr[i5]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:0: B:2:0x0007->B:14:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.mEndWithNegOrDot = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.mEndWithNegOrDot = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                ExtractFloatResult extractFloatResult = new ExtractFloatResult();
                int length = str.length();
                int i5 = 1;
                int i6 = 0;
                while (i5 < length) {
                    extract(str, i5, extractFloatResult);
                    int i7 = extractFloatResult.mEndPosition;
                    if (i5 < i7) {
                        fArr[i6] = Float.parseFloat(str.substring(i5, i7));
                        i6++;
                    }
                    if (extractFloatResult.mEndWithNegOrDot) {
                        i5 = i7;
                    } else {
                        i5 = i7 + 1;
                    }
                }
                return copyOfRange(fArr, 0, i6);
            } catch (NumberFormatException e5) {
                throw new RuntimeException("error in parsing \"" + str + "\"", e5);
            }
        }
        return new float[0];
    }

    public static void interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, float f5, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f5)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
        float[] fArr = new float[6];
        char c5 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c5, pathDataNode.mType, pathDataNode.mParams);
            c5 = pathDataNode.mType;
        }
    }

    public static void updateNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2) {
        for (int i5 = 0; i5 < pathDataNodeArr2.length; i5++) {
            pathDataNodeArr[i5].mType = pathDataNodeArr2[i5].mType;
            for (int i6 = 0; i6 < pathDataNodeArr2[i5].mParams.length; i6++) {
                pathDataNodeArr[i5].mParams[i6] = pathDataNodeArr2[i5].mParams[i6];
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        PathDataNode(char c5, float[] fArr) {
            this.mType = c5;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c5, char c6, float[] fArr2) {
            int i5;
            int i6;
            int i7;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            char c7 = c6;
            boolean z4 = false;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i5 = 7;
                    i6 = i5;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    i6 = i5;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i6 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i6 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i6 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    i6 = 2;
                    break;
            }
            float f19 = f13;
            float f20 = f14;
            float f21 = f17;
            float f22 = f18;
            int i8 = 0;
            char c8 = c5;
            while (i8 < fArr2.length) {
                if (c7 != 'A') {
                    if (c7 == 'C') {
                        i7 = i8;
                        int i9 = i7 + 2;
                        int i10 = i7 + 3;
                        int i11 = i7 + 4;
                        int i12 = i7 + 5;
                        path.cubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        f19 = fArr2[i11];
                        float f23 = fArr2[i12];
                        float f24 = fArr2[i9];
                        float f25 = fArr2[i10];
                        f20 = f23;
                        f16 = f25;
                        f15 = f24;
                    } else if (c7 == 'H') {
                        i7 = i8;
                        int i13 = i7 + 0;
                        path.lineTo(fArr2[i13], f20);
                        f19 = fArr2[i13];
                    } else if (c7 == 'Q') {
                        i7 = i8;
                        int i14 = i7 + 0;
                        int i15 = i7 + 1;
                        int i16 = i7 + 2;
                        int i17 = i7 + 3;
                        path.quadTo(fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        float f26 = fArr2[i14];
                        float f27 = fArr2[i15];
                        f19 = fArr2[i16];
                        f20 = fArr2[i17];
                        f15 = f26;
                        f16 = f27;
                    } else if (c7 == 'V') {
                        i7 = i8;
                        int i18 = i7 + 0;
                        path.lineTo(f19, fArr2[i18]);
                        f20 = fArr2[i18];
                    } else if (c7 != 'a') {
                        if (c7 != 'c') {
                            if (c7 == 'h') {
                                int i19 = i8 + 0;
                                path.rLineTo(fArr2[i19], 0.0f);
                                f19 += fArr2[i19];
                            } else if (c7 != 'q') {
                                if (c7 == 'v') {
                                    int i20 = i8 + 0;
                                    path.rLineTo(0.0f, fArr2[i20]);
                                    f8 = fArr2[i20];
                                } else if (c7 == 'L') {
                                    int i21 = i8 + 0;
                                    int i22 = i8 + 1;
                                    path.lineTo(fArr2[i21], fArr2[i22]);
                                    f19 = fArr2[i21];
                                    f20 = fArr2[i22];
                                } else if (c7 == 'M') {
                                    f19 = fArr2[i8 + 0];
                                    f20 = fArr2[i8 + 1];
                                    if (i8 > 0) {
                                        path.lineTo(f19, f20);
                                    } else {
                                        path.moveTo(f19, f20);
                                        i7 = i8;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 'S') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    float f28 = f20;
                                    int i23 = i8 + 0;
                                    int i24 = i8 + 1;
                                    int i25 = i8 + 2;
                                    int i26 = i8 + 3;
                                    path.cubicTo(f19, f28, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f5 = fArr2[i23];
                                    f6 = fArr2[i24];
                                    f19 = fArr2[i25];
                                    f20 = fArr2[i26];
                                    f15 = f5;
                                    f16 = f6;
                                } else if (c7 == 'T') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    int i27 = i8 + 0;
                                    int i28 = i8 + 1;
                                    path.quadTo(f19, f20, fArr2[i27], fArr2[i28]);
                                    float f29 = fArr2[i27];
                                    float f30 = fArr2[i28];
                                    i7 = i8;
                                    f16 = f20;
                                    f15 = f19;
                                    f19 = f29;
                                    f20 = f30;
                                } else if (c7 == 'l') {
                                    int i29 = i8 + 0;
                                    int i30 = i8 + 1;
                                    path.rLineTo(fArr2[i29], fArr2[i30]);
                                    f19 += fArr2[i29];
                                    f8 = fArr2[i30];
                                } else if (c7 == 'm') {
                                    float f31 = fArr2[i8 + 0];
                                    f19 += f31;
                                    float f32 = fArr2[i8 + 1];
                                    f20 += f32;
                                    if (i8 > 0) {
                                        path.rLineTo(f31, f32);
                                    } else {
                                        path.rMoveTo(f31, f32);
                                        i7 = i8;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 's') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        float f33 = f19 - f15;
                                        f9 = f20 - f16;
                                        f10 = f33;
                                    } else {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    }
                                    int i31 = i8 + 0;
                                    int i32 = i8 + 1;
                                    int i33 = i8 + 2;
                                    int i34 = i8 + 3;
                                    path.rCubicTo(f10, f9, fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f5 = fArr2[i31] + f19;
                                    f6 = fArr2[i32] + f20;
                                    f19 += fArr2[i33];
                                    f7 = fArr2[i34];
                                } else if (c7 == 't') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f11 = f19 - f15;
                                        f12 = f20 - f16;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i35 = i8 + 0;
                                    int i36 = i8 + 1;
                                    path.rQuadTo(f11, f12, fArr2[i35], fArr2[i36]);
                                    float f34 = f11 + f19;
                                    float f35 = f12 + f20;
                                    f19 += fArr2[i35];
                                    f20 += fArr2[i36];
                                    f16 = f35;
                                    f15 = f34;
                                }
                                f20 += f8;
                            } else {
                                int i37 = i8 + 0;
                                int i38 = i8 + 1;
                                int i39 = i8 + 2;
                                int i40 = i8 + 3;
                                path.rQuadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                f5 = fArr2[i37] + f19;
                                f6 = fArr2[i38] + f20;
                                f19 += fArr2[i39];
                                f7 = fArr2[i40];
                            }
                            i7 = i8;
                        } else {
                            int i41 = i8 + 2;
                            int i42 = i8 + 3;
                            int i43 = i8 + 4;
                            int i44 = i8 + 5;
                            path.rCubicTo(fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                            f5 = fArr2[i41] + f19;
                            f6 = fArr2[i42] + f20;
                            f19 += fArr2[i43];
                            f7 = fArr2[i44];
                        }
                        f20 += f7;
                        f15 = f5;
                        f16 = f6;
                        i7 = i8;
                    } else {
                        int i45 = i8 + 5;
                        int i46 = i8 + 6;
                        i7 = i8;
                        drawArc(path, f19, f20, fArr2[i45] + f19, fArr2[i46] + f20, fArr2[i8 + 0], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f, fArr2[i8 + 4] != 0.0f);
                        f19 += fArr2[i45];
                        f20 += fArr2[i46];
                    }
                    i8 = i7 + i6;
                    c8 = c6;
                    c7 = c8;
                    z4 = false;
                } else {
                    i7 = i8;
                    int i47 = i7 + 5;
                    int i48 = i7 + 6;
                    drawArc(path, f19, f20, fArr2[i47], fArr2[i48], fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                    f19 = fArr2[i47];
                    f20 = fArr2[i48];
                }
                f16 = f20;
                f15 = f19;
                i8 = i7 + i6;
                c8 = c6;
                c7 = c8;
                z4 = false;
            }
            fArr[z4 ? 1 : 0] = f19;
            fArr[1] = f20;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f21;
            fArr[5] = f22;
        }

        private static void arcToBezier(Path path, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
            double d14 = d7;
            int ceil = (int) Math.ceil(Math.abs((d13 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d11);
            double sin = Math.sin(d11);
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double d15 = -d14;
            double d16 = d15 * cos;
            double d17 = d8 * sin;
            double d18 = (d16 * sin2) - (d17 * cos2);
            double d19 = d15 * sin;
            double d20 = d8 * cos;
            double d21 = (sin2 * d19) + (cos2 * d20);
            double d22 = d13 / ceil;
            double d23 = d21;
            double d24 = d18;
            int i5 = 0;
            double d25 = d9;
            double d26 = d10;
            double d27 = d12;
            while (i5 < ceil) {
                double d28 = d27 + d22;
                double sin3 = Math.sin(d28);
                double cos3 = Math.cos(d28);
                double d29 = (d5 + ((d14 * cos) * cos3)) - (d17 * sin3);
                double d30 = d6 + (d14 * sin * cos3) + (d20 * sin3);
                double d31 = (d16 * sin3) - (d17 * cos3);
                double d32 = (sin3 * d19) + (cos3 * d20);
                double d33 = d28 - d27;
                double tan = Math.tan(d33 / 2.0d);
                double sin4 = (Math.sin(d33) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d34 = d25 + (d24 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d34, (float) (d26 + (d23 * sin4)), (float) (d29 - (sin4 * d31)), (float) (d30 - (sin4 * d32)), (float) d29, (float) d30);
                i5++;
                d22 = d22;
                sin = sin;
                d25 = d29;
                d19 = d19;
                cos = cos;
                d27 = d28;
                d23 = d32;
                d24 = d31;
                ceil = ceil;
                d26 = d30;
                d14 = d7;
            }
        }

        private static void drawArc(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z4, boolean z5) {
            double d5;
            double d6;
            boolean z6;
            double radians = Math.toRadians(f11);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d7 = f5;
            double d8 = d7 * cos;
            double d9 = f6;
            double d10 = f9;
            double d11 = (d8 + (d9 * sin)) / d10;
            double d12 = ((-f5) * sin) + (d9 * cos);
            double d13 = f10;
            double d14 = d12 / d13;
            double d15 = f8;
            double d16 = ((f7 * cos) + (d15 * sin)) / d10;
            double d17 = (((-f7) * sin) + (d15 * cos)) / d13;
            double d18 = d11 - d16;
            double d19 = d14 - d17;
            double d20 = (d11 + d16) / 2.0d;
            double d21 = (d14 + d17) / 2.0d;
            double d22 = (d18 * d18) + (d19 * d19);
            if (d22 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d22);
                float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
                drawArc(path, f5, f6, f7, f8, f9 * sqrt, f10 * sqrt, f11, z4, z5);
                return;
            }
            double sqrt2 = Math.sqrt(d23);
            double d24 = d18 * sqrt2;
            double d25 = sqrt2 * d19;
            if (z4 == z5) {
                d5 = d20 - d25;
                d6 = d21 + d24;
            } else {
                d5 = d20 + d25;
                d6 = d21 - d24;
            }
            double atan2 = Math.atan2(d14 - d6, d11 - d5);
            double atan22 = Math.atan2(d17 - d6, d16 - d5) - atan2;
            if (atan22 >= 0.0d) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z5 != z6) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d26 = d5 * d10;
            double d27 = d6 * d13;
            arcToBezier(path, (d26 * cos) - (d27 * sin), (d26 * sin) + (d27 * cos), d10, d13, d7, d9, radians, atan2, atan22);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(@NonNull PathDataNode[] pathDataNodeArr, @NonNull Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        @NonNull
        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(@NonNull PathDataNode pathDataNode, @NonNull PathDataNode pathDataNode2, float f5) {
            this.mType = pathDataNode.mType;
            int i5 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i5 < fArr.length) {
                    this.mParams[i5] = (fArr[i5] * (1.0f - f5)) + (pathDataNode2.mParams[i5] * f5);
                    i5++;
                } else {
                    return;
                }
            }
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(@NonNull PathDataNode[] pathDataNodeArr, @NonNull PathDataNode[] pathDataNodeArr2, @NonNull PathDataNode[] pathDataNodeArr3, float f5) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
                pathDataNodeArr[i5].interpolatePathDataNode(pathDataNodeArr2[i5], pathDataNodeArr3[i5], f5);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
