package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import p4.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB\u001b\b\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010/\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0017\u00101\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u0017\u00103\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u0017\u00105\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u0017\u00107\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u0017\u00109\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u0017\u0010;\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u0017\u0010=\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006M"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroid/view/View;", "view", "Lkotlin/r2;", "incrementAccessors", "decrementAccessors", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "types", "update", "updateImeAnimationSource", "updateImeAnimationTarget", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "displayCutout", "getDisplayCutout", "ime", "getIme", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "statusBars", "getStatusBars", "systemBars", "getSystemBars", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/ValueInsets;", "getWaterfall", "()Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeDrawing", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeGestures", "getSafeGestures", "safeContent", "getSafeContent", "captionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility", "imeAnimationTarget", "getImeAnimationTarget", "imeAnimationSource", "getImeAnimationSource", "", "consumes", "Z", "getConsumes", "()Z", "accessCount", "I", "Landroidx/compose/foundation/layout/InsetsListener;", "insetsListener", "Landroidx/compose/foundation/layout/InsetsListener;", "insets", "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;

    @l
    private final AndroidWindowInsets captionBar;

    @l
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;

    @l
    private final AndroidWindowInsets displayCutout;

    @l
    private final AndroidWindowInsets ime;

    @l
    private final ValueInsets imeAnimationSource;

    @l
    private final ValueInsets imeAnimationTarget;

    @l
    private final InsetsListener insetsListener;

    @l
    private final AndroidWindowInsets mandatorySystemGestures;

    @l
    private final AndroidWindowInsets navigationBars;

    @l
    private final ValueInsets navigationBarsIgnoringVisibility;

    @l
    private final WindowInsets safeContent;

    @l
    private final WindowInsets safeDrawing;

    @l
    private final WindowInsets safeGestures;

    @l
    private final AndroidWindowInsets statusBars;

    @l
    private final ValueInsets statusBarsIgnoringVisibility;

    @l
    private final AndroidWindowInsets systemBars;

    @l
    private final ValueInsets systemBarsIgnoringVisibility;

    @l
    private final AndroidWindowInsets systemGestures;

    @l
    private final AndroidWindowInsets tappableElement;

    @l
    private final ValueInsets tappableElementIgnoringVisibility;

    @l
    private final ValueInsets waterfall;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    @i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getOrCreateFor", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "type", "", "name", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "systemInsets", "Landroidx/compose/foundation/layout/ValueInsets;", "valueInsetsIgnoringVisibility", "", "testInsets", "Lkotlin/r2;", "setUseTestInsets", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,785:1\n74#2:786\n361#3,7:787\n1#4:794\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n628#1:786\n646#1:787,7\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i5, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i5, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i5);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i5, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i5)) == null) {
                insets = Insets.NONE;
            }
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @l
        @Composable
        public final WindowInsetsHolder current(@m Composer composer, int i5) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i5, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect(orCreateFor, new WindowInsetsHolder$Companion$current$1(orCreateFor, view), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        @p
        public final void setUseTestInsets(boolean z4) {
            WindowInsetsHolder.testInsets = z4;
        }
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        View view2;
        Object obj;
        boolean z4;
        DisplayCutoutCompat displayCutout;
        Insets waterfallInsets;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = true;
        }
        this.consumes = z4;
        this.insetsListener = new InsetsListener(this);
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, w wVar) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i5);
    }

    public final void decrementAccessors(@l View view) {
        int i5 = this.accessCount - 1;
        this.accessCount = i5;
        if (i5 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @l
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    @l
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    @l
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    @l
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    @l
    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    @l
    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    @l
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @l
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    @l
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @l
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    @l
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    @l
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    @l
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    @l
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @l
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    @l
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @l
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    @l
    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    @l
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @l
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(@l View view) {
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(@l WindowInsetsCompat windowInsetsCompat, int i5) {
        if (testInsets) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            l0.m(windowInsets);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        this.captionBar.update$foundation_layout_release(windowInsetsCompat, i5);
        this.ime.update$foundation_layout_release(windowInsetsCompat, i5);
        this.displayCutout.update$foundation_layout_release(windowInsetsCompat, i5);
        this.navigationBars.update$foundation_layout_release(windowInsetsCompat, i5);
        this.statusBars.update$foundation_layout_release(windowInsetsCompat, i5);
        this.systemBars.update$foundation_layout_release(windowInsetsCompat, i5);
        this.systemGestures.update$foundation_layout_release(windowInsetsCompat, i5);
        this.tappableElement.update$foundation_layout_release(windowInsetsCompat, i5);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsetsCompat, i5);
        if (i5 == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement())));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null) {
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@l WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(@l WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }
}
