package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l DrawModifier drawModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return DrawModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l DrawModifier drawModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return DrawModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l DrawModifier drawModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) DrawModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l DrawModifier drawModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) DrawModifier.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l DrawModifier drawModifier, @l Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(@l ContentDrawScope contentDrawScope);
}
