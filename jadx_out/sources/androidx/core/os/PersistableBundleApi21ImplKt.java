package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.k0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "", "capacity", "Landroid/os/PersistableBundle;", "createPersistableBundle", "persistableBundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "putValue", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(21)
/* loaded from: classes2.dex */
final class PersistableBundleApi21ImplKt {

    @l
    public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @l
    @DoNotInline
    @m
    public static final PersistableBundle createPersistableBundle(int i5) {
        return new PersistableBundle(i5);
    }

    @DoNotInline
    @m
    public static final void putValue(@l PersistableBundle persistableBundle, @p4.m String str, @p4.m Object obj) {
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            PersistableBundleApi22ImplKt.putBoolean(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            l0.m(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + k0.f19765b);
        }
        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + k0.f19765b);
    }
}
