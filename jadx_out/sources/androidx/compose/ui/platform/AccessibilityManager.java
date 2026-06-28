package androidx.compose.ui.platform;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityManager;", "", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AccessibilityManager {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j5, boolean z4, boolean z5, boolean z6, int i5, Object obj) {
        if (obj == null) {
            return accessibilityManager.calculateRecommendedTimeoutMillis(j5, (i5 & 2) != 0 ? false : z4, (i5 & 4) != 0 ? false : z5, (i5 & 8) != 0 ? false : z6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }

    long calculateRecommendedTimeoutMillis(long j5, boolean z4, boolean z5, boolean z6);
}
