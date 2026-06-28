package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* loaded from: classes2.dex */
    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i5, double d5, double d6, double d7, double d8, double d9, double d10) {
            int i6;
            double d11;
            double d12;
            this.linear = false;
            this.mVertical = i5 == 1;
            this.mTime1 = d5;
            this.mTime2 = d6;
            this.mOneOverDeltaTime = 1.0d / (d6 - d5);
            if (3 == i5) {
                this.linear = true;
            }
            double d13 = d9 - d7;
            double d14 = d10 - d8;
            if (!this.linear && Math.abs(d13) >= EPSILON && Math.abs(d14) >= EPSILON) {
                this.mLut = new double[101];
                boolean z4 = this.mVertical;
                if (z4) {
                    i6 = -1;
                } else {
                    i6 = 1;
                }
                this.mEllipseA = d13 * i6;
                this.mEllipseB = d14 * (z4 ? 1 : -1);
                if (z4) {
                    d11 = d9;
                } else {
                    d11 = d7;
                }
                this.mEllipseCenterX = d11;
                if (z4) {
                    d12 = d8;
                } else {
                    d12 = d10;
                }
                this.mEllipseCenterY = d12;
                buildTable(d7, d8, d9, d10);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d7;
            this.mX2 = d9;
            this.mY1 = d8;
            this.mY2 = d10;
            double hypot = Math.hypot(d14, d13);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d15 = this.mTime2;
            double d16 = this.mTime1;
            this.mEllipseCenterX = d13 / (d15 - d16);
            this.mEllipseCenterY = d14 / (d15 - d16);
        }

        private void buildTable(double d5, double d6, double d7, double d8) {
            double d9;
            double d10 = d7 - d5;
            double d11 = d6 - d8;
            int i5 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                if (i5 >= ourPercent.length) {
                    break;
                }
                double d15 = d12;
                double radians = Math.toRadians((i5 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d10;
                double cos = Math.cos(radians) * d11;
                if (i5 > 0) {
                    d9 = Math.hypot(sin - d13, cos - d14) + d15;
                    ourPercent[i5] = d9;
                } else {
                    d9 = d15;
                }
                i5++;
                d14 = cos;
                d12 = d9;
                d13 = sin;
            }
            double d16 = d12;
            this.mArcDistance = d16;
            int i6 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i6 >= dArr.length) {
                    break;
                }
                dArr[i6] = dArr[i6] / d16;
                i6++;
            }
            int i7 = 0;
            while (true) {
                if (i7 < this.mLut.length) {
                    double length = i7 / (r1.length - 1);
                    int binarySearch = Arrays.binarySearch(ourPercent, length);
                    if (binarySearch >= 0) {
                        this.mLut[i7] = binarySearch / (ourPercent.length - 1);
                    } else if (binarySearch == -1) {
                        this.mLut[i7] = 0.0d;
                    } else {
                        int i8 = -binarySearch;
                        int i9 = i8 - 2;
                        double[] dArr2 = ourPercent;
                        double d17 = dArr2[i9];
                        this.mLut[i7] = (i9 + ((length - d17) / (dArr2[i8 - 1] - d17))) / (dArr2.length - 1);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }

        double getDX() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d5 = -d5;
            }
            return d5 * hypot;
        }

        double getDY() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double d6 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, d6);
            if (this.mVertical) {
                return (-d6) * hypot;
            }
            return d6 * hypot;
        }

        public double getLinearDX(double d5) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d5) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mX1;
            return d7 + (d6 * (this.mX2 - d7));
        }

        public double getLinearY(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mY1;
            return d7 + (d6 * (this.mY2 - d7));
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double lookup(double d5) {
            if (d5 <= 0.0d) {
                return 0.0d;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d5 * (dArr.length - 1);
            int i5 = (int) length;
            double d6 = length - i5;
            double d7 = dArr[i5];
            return d7 + (d6 * (dArr[i5 + 1] - d7));
        }

        void setPoint(double d5) {
            double d6;
            if (this.mVertical) {
                d6 = this.mTime2 - d5;
            } else {
                d6 = d5 - this.mTime1;
            }
            double lookup = lookup(d6 * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L4f
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            r10 = 2
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d6 = arc.mTime1;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (arc.linear) {
                    dArr[0] = arc.getLinearX(d6) + (this.mArcs[0].getLinearDX(d6) * d7);
                    dArr[1] = this.mArcs[0].getLinearY(d6) + (d7 * this.mArcs[0].getLinearDY(d6));
                    return;
                } else {
                    arc.setPoint(d6);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d7);
                    dArr[1] = this.mArcs[0].getY() + (d7 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.linear) {
                    dArr[0] = arc2.getLinearX(d8) + (this.mArcs[length].getLinearDX(d8) * d9);
                    dArr[1] = this.mArcs[length].getLinearY(d8) + (d9 * this.mArcs[length].getLinearDY(d8));
                    return;
                } else {
                    arc2.setPoint(d5);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d9);
                    dArr[1] = this.mArcs[length].getY() + (d9 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d10 = arcArr2[0].mTime1;
            if (d5 < d10) {
                d5 = d10;
            }
            if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i5 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i5];
            if (d5 <= arc3.mTime2) {
                if (arc3.linear) {
                    dArr[0] = arc3.getLinearX(d5);
                    dArr[1] = this.mArcs[i5].getLinearY(d5);
                    return;
                } else {
                    arc3.setPoint(d5);
                    dArr[0] = this.mArcs[i5].getX();
                    dArr[1] = this.mArcs[i5].getY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d6 = arcArr[0].mTime1;
        if (d5 < d6) {
            d5 = d6;
        } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i5 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i5];
            if (d5 <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearDX(d5);
                    dArr[1] = this.mArcs[i5].getLinearDY(d5);
                    return;
                } else {
                    arc.setPoint(d5);
                    dArr[0] = this.mArcs[i5].getDX();
                    dArr[1] = this.mArcs[i5].getDY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i5) {
        Arc[] arcArr = this.mArcs;
        int i6 = 0;
        double d6 = arcArr[0].mTime1;
        if (d5 < d6) {
            d5 = d6;
        }
        if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i6 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i6];
            if (d5 <= arc.mTime2) {
                if (arc.linear) {
                    if (i5 == 0) {
                        return arc.getLinearDX(d5);
                    }
                    return arc.getLinearDY(d5);
                }
                arc.setPoint(d5);
                if (i5 == 0) {
                    return this.mArcs[i6].getDX();
                }
                return this.mArcs[i6].getDY();
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d6 = arc.mTime1;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (arc.linear) {
                    fArr[0] = (float) (arc.getLinearX(d6) + (this.mArcs[0].getLinearDX(d6) * d7));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d6) + (d7 * this.mArcs[0].getLinearDY(d6)));
                    return;
                } else {
                    arc.setPoint(d6);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d7));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d7 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.linear) {
                    fArr[0] = (float) (arc2.getLinearX(d8) + (this.mArcs[length].getLinearDX(d8) * d9));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d8) + (d9 * this.mArcs[length].getLinearDY(d8)));
                    return;
                } else {
                    arc2.setPoint(d5);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d10 = arcArr2[0].mTime1;
            if (d5 < d10) {
                d5 = d10;
            } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i5 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i5];
            if (d5 <= arc3.mTime2) {
                if (arc3.linear) {
                    fArr[0] = (float) arc3.getLinearX(d5);
                    fArr[1] = (float) this.mArcs[i5].getLinearY(d5);
                    return;
                } else {
                    arc3.setPoint(d5);
                    fArr[0] = (float) this.mArcs[i5].getX();
                    fArr[1] = (float) this.mArcs[i5].getY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d5, int i5) {
        double linearY;
        double linearDY;
        double y4;
        double dy;
        double linearY2;
        double linearDY2;
        int i6 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d6 = arc.mTime1;
            if (d5 < d6) {
                double d7 = d5 - d6;
                if (arc.linear) {
                    if (i5 == 0) {
                        linearY2 = arc.getLinearX(d6);
                        linearDY2 = this.mArcs[0].getLinearDX(d6);
                    } else {
                        linearY2 = arc.getLinearY(d6);
                        linearDY2 = this.mArcs[0].getLinearDY(d6);
                    }
                    return linearY2 + (d7 * linearDY2);
                }
                arc.setPoint(d6);
                if (i5 == 0) {
                    y4 = this.mArcs[0].getX();
                    dy = this.mArcs[0].getDX();
                } else {
                    y4 = this.mArcs[0].getY();
                    dy = this.mArcs[0].getDY();
                }
                return y4 + (d7 * dy);
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (i5 == 0) {
                    linearY = arcArr[length].getLinearX(d8);
                    linearDY = this.mArcs[length].getLinearDX(d8);
                } else {
                    linearY = arcArr[length].getLinearY(d8);
                    linearDY = this.mArcs[length].getLinearDY(d8);
                }
                return linearY + (d9 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d10 = arcArr2[0].mTime1;
            if (d5 < d10) {
                d5 = d10;
            } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i6 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i6];
            if (d5 <= arc2.mTime2) {
                if (arc2.linear) {
                    if (i5 == 0) {
                        return arc2.getLinearX(d5);
                    }
                    return arc2.getLinearY(d5);
                }
                arc2.setPoint(d5);
                if (i5 == 0) {
                    return this.mArcs[i6].getX();
                }
                return this.mArcs[i6].getY();
            }
            i6++;
        }
    }
}
