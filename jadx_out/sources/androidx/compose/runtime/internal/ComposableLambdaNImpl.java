package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.x;

@Stable
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\r\"\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "Lkotlin/r2;", "trackWrite", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "", "params", "realParamCount", "", "block", "update", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", DatabaseFileArchive.COLUMN_KEY, "I", "getKey", "()I", "", "tracked", "Z", "arity", "getArity", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "<init>", "(IZI)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n111#1:180,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;

    @m
    private Object _block;
    private final int arity;
    private final int key;

    @m
    private RecomposeScope scope;

    @m
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i5, boolean z4, int i6) {
        this.key = i5;
        this.tracked = z4;
        this.arity = i6;
    }

    private final int realParamCount(int i5) {
        int i6 = (i5 - 1) - 1;
        for (int i7 = 1; i7 * 10 < i6; i7++) {
            i6--;
        }
        return i6;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (ComposableLambdaKt.replacableWith(list.get(i5), recomposeScope)) {
                    list.set(i5, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list.get(i5).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // v3.x, kotlin.jvm.internal.e0
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // v3.x
    @m
    public Object invoke(@l Object... objArr) {
        kotlin.ranges.l W1;
        List Rt;
        int sameBits;
        int realParamCount = realParamCount(objArr.length);
        Object obj = objArr[realParamCount];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        W1 = u.W1(0, objArr.length - 1);
        Rt = p.Rt(objArr, W1);
        Object[] array = Rt.toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Composer startRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(startRestartGroup);
        if (startRestartGroup.changed(this)) {
            sameBits = ComposableLambdaKt.differentBits(realParamCount);
        } else {
            sameBits = ComposableLambdaKt.sameBits(realParamCount);
        }
        int i5 = intValue | sameBits;
        Object obj3 = this._block;
        l0.n(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        s1 s1Var = new s1(2);
        s1Var.b(array);
        s1Var.a(Integer.valueOf(i5));
        Object invoke = ((x) obj3).invoke(s1Var.d(new Object[s1Var.c()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaNImpl$invoke$1(objArr, realParamCount, this));
        }
        return invoke;
    }

    public final void update(@l Object obj) {
        boolean z4;
        if (!l0.g(obj, this._block)) {
            if (this._block == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            l0.n(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
            this._block = (x) obj;
            if (!z4) {
                trackWrite();
            }
        }
    }
}
