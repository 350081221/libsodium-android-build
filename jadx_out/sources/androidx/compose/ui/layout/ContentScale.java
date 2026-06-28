package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import kotlin.i0;
import p4.l;

@Stable
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentScale {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "()V", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "FillBounds", "getFillBounds$annotations", "getFillBounds", "FillHeight", "getFillHeight$annotations", "getFillHeight", "FillWidth", "getFillWidth$annotations", "getFillWidth", "Fit", "getFit$annotations", "getFit", "Inside", "getInside$annotations", "getInside", "None", "Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                float m4991access$computeFillMaxDimensioniLBOSCw = ContentScaleKt.m4991access$computeFillMaxDimensioniLBOSCw(j5, j6);
                return ScaleFactorKt.ScaleFactor(m4991access$computeFillMaxDimensioniLBOSCw, m4991access$computeFillMaxDimensioniLBOSCw);
            }
        };

        @l
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                float m4992access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m4992access$computeFillMinDimensioniLBOSCw(j5, j6);
                return ScaleFactorKt.ScaleFactor(m4992access$computeFillMinDimensioniLBOSCw, m4992access$computeFillMinDimensioniLBOSCw);
            }
        };

        @l
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                float m4990access$computeFillHeightiLBOSCw = ContentScaleKt.m4990access$computeFillHeightiLBOSCw(j5, j6);
                return ScaleFactorKt.ScaleFactor(m4990access$computeFillHeightiLBOSCw, m4990access$computeFillHeightiLBOSCw);
            }
        };

        @l
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                float m4993access$computeFillWidthiLBOSCw = ContentScaleKt.m4993access$computeFillWidthiLBOSCw(j5, j6);
                return ScaleFactorKt.ScaleFactor(m4993access$computeFillWidthiLBOSCw, m4993access$computeFillWidthiLBOSCw);
            }
        };

        @l
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                if (Size.m3562getWidthimpl(j5) <= Size.m3562getWidthimpl(j6) && Size.m3559getHeightimpl(j5) <= Size.m3559getHeightimpl(j6)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float m4992access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m4992access$computeFillMinDimensioniLBOSCw(j5, j6);
                return ScaleFactorKt.ScaleFactor(m4992access$computeFillMinDimensioniLBOSCw, m4992access$computeFillMinDimensioniLBOSCw);
            }
        };

        @l
        private static final FixedScale None = new FixedScale(1.0f);

        @l
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4989computeScaleFactorH7hwNQA(long j5, long j6) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m4993access$computeFillWidthiLBOSCw(j5, j6), ContentScaleKt.m4990access$computeFillHeightiLBOSCw(j5, j6));
            }
        };

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @l
        public final ContentScale getCrop() {
            return Crop;
        }

        @l
        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        @l
        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        @l
        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        @l
        public final ContentScale getFit() {
            return Fit;
        }

        @l
        public final ContentScale getInside() {
            return Inside;
        }

        @l
        public final FixedScale getNone() {
            return None;
        }
    }

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo4989computeScaleFactorH7hwNQA(long j5, long j6);
}
