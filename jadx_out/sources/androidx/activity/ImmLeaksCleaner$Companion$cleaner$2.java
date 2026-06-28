package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import java.lang.reflect.Field;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ImmLeaksCleaner$Companion$cleaner$2 extends n0 implements v3.a<ImmLeaksCleaner.Cleaner> {
    public static final ImmLeaksCleaner$Companion$cleaner$2 INSTANCE = new ImmLeaksCleaner$Companion$cleaner$2();

    ImmLeaksCleaner$Companion$cleaner$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final ImmLeaksCleaner.Cleaner invoke() {
        try {
            Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
            servedViewField.setAccessible(true);
            Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
            nextServedViewField.setAccessible(true);
            Field hField = InputMethodManager.class.getDeclaredField("mH");
            hField.setAccessible(true);
            l0.o(hField, "hField");
            l0.o(servedViewField, "servedViewField");
            l0.o(nextServedViewField, "nextServedViewField");
            return new ImmLeaksCleaner.ValidCleaner(hField, servedViewField, nextServedViewField);
        } catch (NoSuchFieldException unused) {
            return ImmLeaksCleaner.FailedInitialization.INSTANCE;
        }
    }
}
