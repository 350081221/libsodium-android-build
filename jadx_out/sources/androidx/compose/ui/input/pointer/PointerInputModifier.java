package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerInputModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l PointerInputModifier pointerInputModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return PointerInputModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l PointerInputModifier pointerInputModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return PointerInputModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l PointerInputModifier pointerInputModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) PointerInputModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l PointerInputModifier pointerInputModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) PointerInputModifier.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l PointerInputModifier pointerInputModifier, @l Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    @l
    PointerInputFilter getPointerInputFilter();
}
