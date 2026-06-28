package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", bi.ay, "Landroidx/compose/ui/semantics/SemanticsNode;", "kotlin.jvm.PlatformType", "b", "invoke", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n1#1,3790:1\n3590#2:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2\n*L\n667#1:3791\n*E\n"})
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 extends kotlin.jvm.internal.n0 implements v3.p<SemanticsNode, SemanticsNode, Integer> {
    public static final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2();

    AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2() {
        super(2);
    }

    @Override // v3.p
    @p4.l
    public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        SemanticsPropertyKey<Float> traversalIndex = semanticsProperties.getTraversalIndex();
        AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE;
        return Integer.valueOf(Float.compare(((Number) config.getOrElse(traversalIndex, androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue(), ((Number) semanticsNode2.getConfig().getOrElse(semanticsProperties.getTraversalIndex(), androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue()));
    }
}
