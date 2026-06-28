package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J*\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0082\u0002¢\u0006\u0002\u0010 J*\u0010!\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0082\u0002¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "()V", "translate", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "translateActivityIntentPredicates", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "Landroid/content/Intent;", "splitPairFilters", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateIntentPredicates", "translateParentMetricsPredicate", "Landroid/view/WindowMetrics;", "splitRule", "Landroidx/window/embedding/SplitRule;", "component1", "F", "S", "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (S) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3, reason: not valid java name */
    public static final boolean m6420translateActivityIntentPredicates$lambda3(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        l0.p(this$0, "this$0");
        l0.p(splitPairFilters, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Intent intent = (Intent) this$0.component2(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1, reason: not valid java name */
    public static final boolean m6421translateActivityPairPredicates$lambda1(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        l0.p(this$0, "this$0");
        l0.p(splitPairFilters, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Activity activity2 = (Activity) this$0.component2(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6, reason: not valid java name */
    public static final boolean m6422translateActivityPredicates$lambda6(Set activityFilters, Activity activity) {
        l0.p(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            l0.o(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8, reason: not valid java name */
    public static final boolean m6423translateIntentPredicates$lambda8(Set activityFilters, Intent intent) {
        l0.p(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            l0.o(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4, reason: not valid java name */
    public static final boolean m6424translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        l0.p(splitRule, "$splitRule");
        l0.o(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    @l
    public final List<SplitInfo> translate(@l List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        int Y;
        l0.p(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        Y = x.Y(list, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    @l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@l final Set<SplitPairFilter> splitPairFilters) {
        l0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m6420translateActivityIntentPredicates$lambda3;
                m6420translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m6420translateActivityIntentPredicates$lambda3(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m6420translateActivityIntentPredicates$lambda3;
            }
        };
    }

    @l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@l final Set<SplitPairFilter> splitPairFilters) {
        l0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m6421translateActivityPairPredicates$lambda1;
                m6421translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m6421translateActivityPairPredicates$lambda1(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m6421translateActivityPairPredicates$lambda1;
            }
        };
    }

    @l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> translateActivityPredicates(@l final Set<ActivityFilter> activityFilters) {
        l0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m6422translateActivityPredicates$lambda6;
                m6422translateActivityPredicates$lambda6 = EmbeddingAdapter.m6422translateActivityPredicates$lambda6(activityFilters, (Activity) obj);
                return m6422translateActivityPredicates$lambda6;
            }
        };
    }

    @l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> translateIntentPredicates(@l final Set<ActivityFilter> activityFilters) {
        l0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m6423translateIntentPredicates$lambda8;
                m6423translateIntentPredicates$lambda8 = EmbeddingAdapter.m6423translateIntentPredicates$lambda8(activityFilters, (Intent) obj);
                return m6423translateIntentPredicates$lambda8;
            }
        };
    }

    @l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(@l final SplitRule splitRule) {
        l0.p(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m6424translateParentMetricsPredicate$lambda4;
                m6424translateParentMetricsPredicate$lambda4 = EmbeddingAdapter.m6424translateParentMetricsPredicate$lambda4(SplitRule.this, (WindowMetrics) obj);
                return m6424translateParentMetricsPredicate$lambda4;
            }
        };
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z4;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        l0.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z5 = false;
        try {
            z4 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z4 = false;
        }
        List activities = primaryActivityStack.getActivities();
        l0.o(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z4);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        l0.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z5 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        l0.o(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z5), splitInfo.getSplitRatio());
    }

    @l
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@l Set<? extends EmbeddingRule> rules) {
        int Y;
        Set<androidx.window.extensions.embedding.EmbeddingRule> X5;
        androidx.window.extensions.embedding.SplitPairRule build;
        l0.p(rules, "rules");
        Set<? extends EmbeddingRule> set = rules;
        Y = x.Y(set, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                build = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                l0.o(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                l0.o(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                build = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                l0.o(build, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) build);
        }
        X5 = e0.X5(arrayList);
        return X5;
    }
}
