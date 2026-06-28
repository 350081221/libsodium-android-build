package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundRectKt {
    @l
    public static final RoundRect RoundRect(float f5, float f6, float f7, float f8, float f9, float f10) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f9, f10);
        return new RoundRect(f5, f6, f7, f8, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    @l
    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m3545RoundRectZAM2FJo(@l Rect rect, long j5, long j6, long j7, long j8) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j5, j6, j7, j8, null);
    }

    /* renamed from: RoundRect-ZAM2FJo$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m3546RoundRectZAM2FJo$default(Rect rect, long j5, long j6, long j7, long j8, int i5, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i5 & 2) != 0) {
            j9 = CornerRadius.Companion.m3478getZerokKHJgLs();
        } else {
            j9 = j5;
        }
        if ((i5 & 4) != 0) {
            j10 = CornerRadius.Companion.m3478getZerokKHJgLs();
        } else {
            j10 = j6;
        }
        if ((i5 & 8) != 0) {
            j11 = CornerRadius.Companion.m3478getZerokKHJgLs();
        } else {
            j11 = j7;
        }
        if ((i5 & 16) != 0) {
            j12 = CornerRadius.Companion.m3478getZerokKHJgLs();
        } else {
            j12 = j8;
        }
        return m3545RoundRectZAM2FJo(rect, j9, j10, j11, j12);
    }

    @l
    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m3547RoundRectgG7oq9Y(float f5, float f6, float f7, float f8, long j5) {
        return RoundRect(f5, f6, f7, f8, CornerRadius.m3468getXimpl(j5), CornerRadius.m3469getYimpl(j5));
    }

    @l
    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m3548RoundRectsniSvfs(@l Rect rect, long j5) {
        return RoundRect(rect, CornerRadius.m3468getXimpl(j5), CornerRadius.m3469getYimpl(j5));
    }

    @l
    public static final Rect getBoundingRect(@l RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@l RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@l RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@l RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @l
    public static final Rect getSafeInnerRect(@l RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()), CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@l RoundRect roundRect) {
        return ((roundRect.getWidth() > roundRect.getHeight() ? 1 : (roundRect.getWidth() == roundRect.getHeight() ? 0 : -1)) == 0) && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@l RoundRect roundRect) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs())) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs())) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            if (CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs())) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9 && roundRect.getWidth() <= CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) * 2.0d && roundRect.getHeight() <= CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@l RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@l RoundRect roundRect) {
        float left = roundRect.getLeft();
        if ((Float.isInfinite(left) || Float.isNaN(left)) ? false : true) {
            float top = roundRect.getTop();
            if ((Float.isInfinite(top) || Float.isNaN(top)) ? false : true) {
                float right = roundRect.getRight();
                if ((Float.isInfinite(right) || Float.isNaN(right)) ? false : true) {
                    float bottom = roundRect.getBottom();
                    if ((Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isRect(@p4.l androidx.compose.ui.geometry.RoundRect r6) {
        /*
            long r0 = r6.m3543getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r3
        L12:
            if (r0 != 0) goto L25
            long r4 = r6.m3543getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            r0 = r2
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L8c
        L25:
            long r4 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L47
            long r4 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 == 0) goto L8c
        L47:
            long r4 = r6.m3541getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L55
            r0 = r2
            goto L56
        L55:
            r0 = r3
        L56:
            if (r0 != 0) goto L69
            long r4 = r6.m3541getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r3
        L67:
            if (r0 == 0) goto L8c
        L69:
            long r4 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L77
            r0 = r2
            goto L78
        L77:
            r0 = r3
        L78:
            if (r0 != 0) goto L8d
            long r4 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r6 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L88
            r6 = r2
            goto L89
        L88:
            r6 = r3
        L89:
            if (r6 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r3
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isSimple(@l RoundRect roundRect) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs())) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs())) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs())) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @l
    public static final RoundRect lerp(@l RoundRect roundRect, @l RoundRect roundRect2, float f5) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f5), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f5), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f5), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f5), CornerRadiusKt.m3479lerp3Ry4LBc(roundRect.m3543getTopLeftCornerRadiuskKHJgLs(), roundRect2.m3543getTopLeftCornerRadiuskKHJgLs(), f5), CornerRadiusKt.m3479lerp3Ry4LBc(roundRect.m3544getTopRightCornerRadiuskKHJgLs(), roundRect2.m3544getTopRightCornerRadiuskKHJgLs(), f5), CornerRadiusKt.m3479lerp3Ry4LBc(roundRect.m3542getBottomRightCornerRadiuskKHJgLs(), roundRect2.m3542getBottomRightCornerRadiuskKHJgLs(), f5), CornerRadiusKt.m3479lerp3Ry4LBc(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m3541getBottomLeftCornerRadiuskKHJgLs(), f5), null);
    }

    @l
    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m3549translateUv8p0NA(@l RoundRect roundRect, long j5) {
        return new RoundRect(Offset.m3493getXimpl(j5) + roundRect.getLeft(), Offset.m3494getYimpl(j5) + roundRect.getTop(), Offset.m3493getXimpl(j5) + roundRect.getRight(), Offset.m3494getYimpl(j5) + roundRect.getBottom(), roundRect.m3543getTopLeftCornerRadiuskKHJgLs(), roundRect.m3544getTopRightCornerRadiuskKHJgLs(), roundRect.m3542getBottomRightCornerRadiuskKHJgLs(), roundRect.m3541getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @l
    public static final RoundRect RoundRect(@l Rect rect, float f5, float f6) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f5, f6);
    }
}
