package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BF\u0012\u0006\u0010\u000f\u001a\u00028\u0000\u00125\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\r\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJY\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u000f\u001a\u00028\u000027\b\u0002\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004RF\u0010\u0010\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006 "}, d2 = {"Landroidx/compose/material3/FadeInFadeOutAnimationItem;", "T", "", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/v0;", "name", "content", "Landroidx/compose/material3/FadeInFadeOutTransition;", "component2", "()Lv3/q;", DatabaseFileArchive.COLUMN_KEY, "transition", "copy", "(Ljava/lang/Object;Lv3/q;)Landroidx/compose/material3/FadeInFadeOutAnimationItem;", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Ljava/lang/Object;", "getKey", "Lv3/q;", "getTransition", "<init>", "(Ljava/lang/Object;Lv3/q;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;

    @p4.l
    private final v3.q<v3.p<? super Composer, ? super Integer, r2>, Composer, Integer, r2> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t5, @p4.l v3.q<? super v3.p<? super Composer, ? super Integer, r2>, ? super Composer, ? super Integer, r2> qVar) {
        this.key = t5;
        this.transition = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, v3.q qVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i5 & 2) != 0) {
            qVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, qVar);
    }

    public final T component1() {
        return this.key;
    }

    @p4.l
    public final v3.q<v3.p<? super Composer, ? super Integer, r2>, Composer, Integer, r2> component2() {
        return this.transition;
    }

    @p4.l
    public final FadeInFadeOutAnimationItem<T> copy(T t5, @p4.l v3.q<? super v3.p<? super Composer, ? super Integer, r2>, ? super Composer, ? super Integer, r2> qVar) {
        return new FadeInFadeOutAnimationItem<>(t5, qVar);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return kotlin.jvm.internal.l0.g(this.key, fadeInFadeOutAnimationItem.key) && kotlin.jvm.internal.l0.g(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    @p4.l
    public final v3.q<v3.p<? super Composer, ? super Integer, r2>, Composer, Integer, r2> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t5 = this.key;
        return ((t5 == null ? 0 : t5.hashCode()) * 31) + this.transition.hashCode();
    }

    @p4.l
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
