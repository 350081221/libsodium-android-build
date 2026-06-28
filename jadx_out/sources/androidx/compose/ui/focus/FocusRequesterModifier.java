package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.k;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@k(message = "Use FocusRequesterModifierNode instead")
/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l FocusRequesterModifier focusRequesterModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return FocusRequesterModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l FocusRequesterModifier focusRequesterModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return FocusRequesterModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l FocusRequesterModifier focusRequesterModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) FocusRequesterModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l FocusRequesterModifier focusRequesterModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) FocusRequesterModifier.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l FocusRequesterModifier focusRequesterModifier, @l Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    @l
    FocusRequester getFocusRequester();
}
