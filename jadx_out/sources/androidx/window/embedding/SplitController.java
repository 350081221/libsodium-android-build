package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.e0;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRules", "Lkotlin/r2;", "setStaticSplitRules", "getSplitRules", "rule", "registerRule", "unregisterRule", "clearRegisteredRules", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "removeSplitListener", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "staticSplitRules", "Ljava/util/Set;", "<init>", "()V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public final class SplitController {

    @m
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;

    @l
    private final EmbeddingBackend embeddingBackend;

    @l
    private Set<? extends EmbeddingRule> staticSplitRules;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ReentrantLock globalLock = new ReentrantLock();

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "getInstance", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "", "staticRuleResourceId", "Lkotlin/r2;", "initialize", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        Companion companion = SplitController.Companion;
                        SplitController.globalInstance = new SplitController(null);
                    }
                    r2 r2Var = r2.f19517a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            SplitController splitController = SplitController.globalInstance;
            l0.m(splitController);
            return splitController;
        }

        @u3.m
        public final void initialize(@l Context context, int i5) {
            l0.p(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i5);
            SplitController companion = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = l1.k();
            }
            companion.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        Set<? extends EmbeddingRule> k5;
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        k5 = l1.k();
        this.staticSplitRules = k5;
    }

    public /* synthetic */ SplitController(w wVar) {
        this();
    }

    @l
    @u3.m
    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    @u3.m
    public static final void initialize(@l Context context, int i5) {
        Companion.initialize(context, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(@l Activity activity, @l Executor executor, @l Consumer<List<SplitInfo>> consumer) {
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    @l
    public final Set<EmbeddingRule> getSplitRules() {
        Set<EmbeddingRule> X5;
        X5 = e0.X5(this.embeddingBackend.getSplitRules());
        return X5;
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(@l EmbeddingRule rule) {
        l0.p(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(@l Consumer<List<SplitInfo>> consumer) {
        l0.p(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(@l EmbeddingRule rule) {
        l0.p(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }
}
