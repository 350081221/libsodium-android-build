package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "Landroid/os/PersistableBundle;", "persistableBundle", "", DatabaseFileArchive.COLUMN_KEY, "", t0.b.f22420d, "Lkotlin/r2;", "putBoolean", "", "putBooleanArray", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(22)
/* loaded from: classes2.dex */
final class PersistableBundleApi22ImplKt {

    @l
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    @m
    public static final void putBoolean(@l PersistableBundle persistableBundle, @p4.m String str, boolean z4) {
        persistableBundle.putBoolean(str, z4);
    }

    @DoNotInline
    @m
    public static final void putBooleanArray(@l PersistableBundle persistableBundle, @p4.m String str, @l boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
