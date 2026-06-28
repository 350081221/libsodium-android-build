package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/r2;", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l OnRemeasuredModifier onRemeasuredModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return OnRemeasuredModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l OnRemeasuredModifier onRemeasuredModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return OnRemeasuredModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l OnRemeasuredModifier onRemeasuredModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) OnRemeasuredModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l OnRemeasuredModifier onRemeasuredModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) OnRemeasuredModifier.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l OnRemeasuredModifier onRemeasuredModifier, @l Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void mo5041onRemeasuredozmzZPI(long j5);
}
