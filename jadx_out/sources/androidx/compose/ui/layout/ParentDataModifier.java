package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@l ParentDataModifier parentDataModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@l ParentDataModifier parentDataModifier, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ParentDataModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@l ParentDataModifier parentDataModifier, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ParentDataModifier.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@l ParentDataModifier parentDataModifier, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ParentDataModifier.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static Modifier then(@l ParentDataModifier parentDataModifier, @l Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    @m
    Object modifyParentData(@l Density density, @m Object obj);
}
