package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/BundleApi21ImplKt;", "", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, "Landroid/util/Size;", t0.b.f22420d, "Lkotlin/r2;", "putSize", "Landroid/util/SizeF;", "putSizeF", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(21)
/* loaded from: classes2.dex */
final class BundleApi21ImplKt {

    @l
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @DoNotInline
    @m
    public static final void putSize(@l Bundle bundle, @l String str, @p4.m Size size) {
        bundle.putSize(str, size);
    }

    @DoNotInline
    @m
    public static final void putSizeF(@l Bundle bundle, @l String str, @p4.m SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
