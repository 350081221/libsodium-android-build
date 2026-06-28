package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\t\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bH\u0007¨\u0006\n"}, d2 = {"", "Lkotlin/u0;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([Lkotlin/u0;)Landroid/os/PersistableBundle;", "", "toPersistableBundle", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PersistableBundleKt {
    @l
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(@l u0<String, ? extends Object>... u0VarArr) {
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(u0VarArr.length);
        for (u0<String, ? extends Object> u0Var : u0VarArr) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, u0Var.component1(), u0Var.component2());
        }
        return createPersistableBundle;
    }

    @l
    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(@l Map<String, ? extends Object> map) {
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, entry.getKey(), entry.getValue());
        }
        return createPersistableBundle;
    }

    @l
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
