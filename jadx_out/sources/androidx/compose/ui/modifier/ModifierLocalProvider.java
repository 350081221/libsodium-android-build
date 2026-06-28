package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;

@Stable
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProvider;", "T", "Landroidx/compose/ui/Modifier$Element;", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", b.f22420d, "getValue", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(@l ModifierLocalProvider<T> modifierLocalProvider, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalProvider.super.all(lVar);
        }

        @Deprecated
        public static <T> boolean any(@l ModifierLocalProvider<T> modifierLocalProvider, @l v3.l<? super Modifier.Element, Boolean> lVar) {
            return ModifierLocalProvider.super.any(lVar);
        }

        @Deprecated
        public static <T, R> R foldIn(@l ModifierLocalProvider<T> modifierLocalProvider, R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) ModifierLocalProvider.super.foldIn(r5, pVar);
        }

        @Deprecated
        public static <T, R> R foldOut(@l ModifierLocalProvider<T> modifierLocalProvider, R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) ModifierLocalProvider.super.foldOut(r5, pVar);
        }

        @l
        @Deprecated
        public static <T> Modifier then(@l ModifierLocalProvider<T> modifierLocalProvider, @l Modifier modifier) {
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    @l
    ProvidableModifierLocal<T> getKey();

    T getValue();
}
