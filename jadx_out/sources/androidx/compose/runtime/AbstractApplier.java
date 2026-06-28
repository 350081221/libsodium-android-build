package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0012\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$J\"\u0010\u000e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004J*\u0010\u0011\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "node", "Lkotlin/r2;", "down", "(Ljava/lang/Object;)V", d.R, "clear", "onClear", "", "", "index", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "root", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "stack", "Ljava/util/List;", "<set-?>", "current", "getCurrent", "setCurrent", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;

    @l
    private final List<T> stack = new ArrayList();

    public AbstractApplier(T t5) {
        this.root = t5;
        this.current = t5;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t5) {
        this.stack.add(getCurrent());
        setCurrent(t5);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected final void move(@l List<T> list, int i5, int i6, int i7) {
        int i8;
        List V5;
        if (i5 > i6) {
            i8 = i6;
        } else {
            i8 = i6 - i7;
        }
        if (i7 == 1) {
            if (i5 != i6 + 1 && i5 != i6 - 1) {
                list.add(i8, list.remove(i5));
                return;
            } else {
                list.set(i5, list.set(i6, list.get(i5)));
                return;
            }
        }
        List<T> subList = list.subList(i5, i7 + i5);
        V5 = e0.V5(subList);
        subList.clear();
        list.addAll(i8, V5);
    }

    protected abstract void onClear();

    protected final void remove(@l List<T> list, int i5, int i6) {
        if (i6 == 1) {
            list.remove(i5);
        } else {
            list.subList(i5, i6 + i5).clear();
        }
    }

    protected void setCurrent(T t5) {
        this.current = t5;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!this.stack.isEmpty()) {
            setCurrent(this.stack.remove(r0.size() - 1));
            return;
        }
        throw new IllegalStateException("empty stack".toString());
    }
}
