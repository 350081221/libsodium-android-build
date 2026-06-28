package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J\b\u0010\u0015\u001a\u00020\u0003H&R\u0014\u0010\u0018\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "Lkotlin/r2;", "onBeginChanges", "onEndChanges", "node", "down", "(Ljava/lang/Object;)V", d.R, "", "index", "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "clear", "getCurrent", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Applier<N> {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void onBeginChanges(@l Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(@l Applier<N> applier) {
            Applier.super.onEndChanges();
        }
    }

    void clear();

    void down(N n5);

    N getCurrent();

    void insertBottomUp(int i5, N n5);

    void insertTopDown(int i5, N n5);

    void move(int i5, int i6, int i7);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i5, int i6);

    void up();
}
