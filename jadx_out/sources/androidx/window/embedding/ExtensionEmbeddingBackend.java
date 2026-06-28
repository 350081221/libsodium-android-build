package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0013\b\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rules", "Lkotlin/r2;", "setSplitRules", "rule", "registerRule", "unregisterRule", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "consumer", "unregisterSplitListenerForActivity", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "<init>", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {

    @l
    private static final String TAG = "EmbeddingBackend";

    @m
    private static volatile ExtensionEmbeddingBackend globalInstance;

    @GuardedBy("globalLock")
    @VisibleForTesting
    @m
    private EmbeddingInterfaceCompat embeddingExtension;

    @l
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;

    @l
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;

    @l
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ReentrantLock globalLock = new ReentrantLock();

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            EmbeddingCompat embeddingCompat = null;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    embeddingCompat = new EmbeddingCompat();
                }
            } catch (Throwable th) {
                Log.d(ExtensionEmbeddingBackend.TAG, l0.C("Failed to load embedding extension: ", th));
            }
            if (embeddingCompat == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        @l
        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    r2 r2Var = r2.f19517a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            l0.m(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(@m Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Lkotlin/r2;", "onSplitInfoChanged", "lastInfo", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {

        @m
        private List<SplitInfo> lastInfo;
        final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend this$0) {
            l0.p(this$0, "this$0");
            this.this$0 = this$0;
        }

        @m
        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(@l List<SplitInfo> splitInfo) {
            l0.p(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(@m List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "Lkotlin/r2;", "accept", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "callback", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "lastValue", "Ljava/util/List;", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class SplitListenerWrapper {

        @l
        private final Activity activity;

        @l
        private final Consumer<List<SplitInfo>> callback;

        @l
        private final Executor executor;

        @m
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(@l Activity activity, @l Executor executor, @l Consumer<List<SplitInfo>> callback) {
            l0.p(activity, "activity");
            l0.p(executor, "executor");
            l0.p(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m6425accept$lambda1(SplitListenerWrapper this$0, List splitsWithActivity) {
            l0.p(this$0, "this$0");
            l0.p(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void accept(@l List<SplitInfo> splitInfoList) {
            l0.p(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (l0.g(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.f
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.m6425accept$lambda1(ExtensionEmbeddingBackend.SplitListenerWrapper.this, arrayList);
                }
            });
        }

        @l
        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@m EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    @m
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @l
    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @l
    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(@l EmbeddingRule rule) {
        l0.p(rule, "rule");
        if (!this.splitRules.contains(rule)) {
            this.splitRules.add(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(@l Activity activity, @l Executor executor, @l Consumer<List<SplitInfo>> callback) {
        List<SplitInfo> E;
        List<SplitInfo> E2;
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                E2 = kotlin.collections.w.E();
                callback.accept(E2);
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                l0.m(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                E = kotlin.collections.w.E();
                splitListenerWrapper.accept(E);
            }
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(@m EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(@l Set<? extends EmbeddingRule> rules) {
        l0.p(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(@l EmbeddingRule rule) {
        l0.p(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(@l Consumer<List<SplitInfo>> consumer) {
        l0.p(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (l0.g(next.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
