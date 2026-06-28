package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import p4.l;
import v3.p;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J&\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l LayoutModifier layoutModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return LayoutModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l LayoutModifier layoutModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return LayoutModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l LayoutModifier layoutModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) LayoutModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l LayoutModifier layoutModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) LayoutModifier.super.foldOut(r5, pVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@l LayoutModifier layoutModifier, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@l LayoutModifier layoutModifier, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
        }

        @Deprecated
        public static int minIntrinsicHeight(@l LayoutModifier layoutModifier, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i5);
        }

        @Deprecated
        public static int minIntrinsicWidth(@l LayoutModifier layoutModifier, @l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
            return LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i5);
        }

        @l
        @Deprecated
        public static Modifier then(@l LayoutModifier layoutModifier, @l Modifier modifier) {
            return LayoutModifier.super.then(modifier);
        }
    }

    default int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return MeasuringIntrinsics.INSTANCE.maxHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    default int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return MeasuringIntrinsics.INSTANCE.maxWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @l
    /* renamed from: measure-3p2s80s */
    MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5);

    default int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return MeasuringIntrinsics.INSTANCE.minHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    default int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return MeasuringIntrinsics.INSTANCE.minWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }
}
