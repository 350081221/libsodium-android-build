package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "id", "", "getId$annotations", "()V", "getId", "()I", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l SemanticsModifier semanticsModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return SemanticsModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l SemanticsModifier semanticsModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return SemanticsModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l SemanticsModifier semanticsModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) SemanticsModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l SemanticsModifier semanticsModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) SemanticsModifier.super.foldOut(r5, pVar);
        }

        @Deprecated
        public static int getId(@l SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @k(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @b1(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }

        @l
        @Deprecated
        public static Modifier then(@l SemanticsModifier semanticsModifier, @l Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }
    }

    default int getId() {
        return -1;
    }

    @l
    SemanticsConfiguration getSemanticsConfiguration();
}
