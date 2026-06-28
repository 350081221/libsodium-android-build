package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Lkotlin/r2;", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "EmbeddingCallbackInterface", "window_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalWindowApi
/* loaded from: classes2.dex */
public interface EmbeddingInterfaceCompat {

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Lkotlin/r2;", "onSplitInfoChanged", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(@l List<SplitInfo> list);
    }

    void setEmbeddingCallback(@l EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(@l Set<? extends EmbeddingRule> set);
}
