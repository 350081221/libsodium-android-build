package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlinx.coroutines.flow.i;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/i;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface WindowInfoTracker {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "Lkotlin/r2;", "overrideDecorator", "reset", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m
        private static final String TAG = l1.d(WindowInfoTracker.class).t();

        @l
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        @l
        @h(name = "getOrCreate")
        @u3.m
        public final WindowInfoTracker getOrCreate(@l Context context) {
            l0.p(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final void overrideDecorator(@l WindowInfoTrackerDecorator overridingDecorator) {
            l0.p(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        @l
        public final WindowBackend windowBackend$window_release(@l Context context) {
            l0.p(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            if (extensionWindowLayoutInfoBackend == null) {
                return SidecarWindowBackend.Companion.getInstance(context);
            }
            return extensionWindowLayoutInfoBackend;
        }
    }

    @l
    @h(name = "getOrCreate")
    @u3.m
    static WindowInfoTracker getOrCreate(@l Context context) {
        return Companion.getOrCreate(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    static void overrideDecorator(@l WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    static void reset() {
        Companion.reset();
    }

    @l
    i<WindowLayoutInfo> windowLayoutInfo(@l Activity activity);
}
