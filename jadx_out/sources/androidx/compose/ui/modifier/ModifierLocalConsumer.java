package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import p4.l;
import v3.p;

@Stable
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l ModifierLocalConsumer modifierLocalConsumer, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalConsumer.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l ModifierLocalConsumer modifierLocalConsumer, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalConsumer.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l ModifierLocalConsumer modifierLocalConsumer, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ModifierLocalConsumer.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l ModifierLocalConsumer modifierLocalConsumer, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ModifierLocalConsumer.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l ModifierLocalConsumer modifierLocalConsumer, @l Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope);
}
