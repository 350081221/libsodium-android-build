package androidx.compose.material3;

import androidx.compose.runtime.State;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBar_androidKt$SearchBar$useFullScreenShape$2$1 extends kotlin.jvm.internal.n0 implements v3.a<Boolean> {
    final /* synthetic */ State<Float> $animationProgress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$useFullScreenShape$2$1(State<Float> state) {
        super(0);
        this.$animationProgress = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Boolean invoke() {
        return Boolean.valueOf(this.$animationProgress.getValue().floatValue() == 1.0f);
    }
}
