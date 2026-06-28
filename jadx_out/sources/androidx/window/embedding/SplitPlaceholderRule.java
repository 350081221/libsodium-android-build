package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "getFilters", "()Ljava/util/Set;", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public final class SplitPlaceholderRule extends SplitRule {

    @l
    private final Set<ActivityFilter> filters;

    @l
    private final Intent placeholderIntent;

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i5, int i6, float f5, int i7, int i8, w wVar) {
        this(set, intent, (i8 & 4) != 0 ? 0 : i5, (i8 & 8) != 0 ? 0 : i6, (i8 & 16) != 0 ? 0.5f : f5, (i8 & 32) != 0 ? 3 : i7);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        if (l0.g(this.filters, splitPlaceholderRule.filters) && l0.g(this.placeholderIntent, splitPlaceholderRule.placeholderIntent)) {
            return true;
        }
        return false;
    }

    @l
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @l
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    @l
    public final SplitPlaceholderRule plus$window_release(@l ActivityFilter filter) {
        Set X5;
        l0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        X5 = e0.X5(linkedHashSet);
        return new SplitPlaceholderRule(X5, this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(@l Set<ActivityFilter> filters, @l Intent placeholderIntent, int i5, int i6, float f5, int i7) {
        super(i5, i6, f5, i7);
        Set<ActivityFilter> X5;
        l0.p(filters, "filters");
        l0.p(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        X5 = e0.X5(filters);
        this.filters = X5;
    }
}
