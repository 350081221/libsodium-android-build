package androidx.activity;

import android.content.res.Resources;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "resources", "Landroid/content/res/Resources;", "invoke", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemBarStyle$Companion$auto$1 extends n0 implements v3.l<Resources, Boolean> {
    public static final SystemBarStyle$Companion$auto$1 INSTANCE = new SystemBarStyle$Companion$auto$1();

    SystemBarStyle$Companion$auto$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l Resources resources) {
        l0.p(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
