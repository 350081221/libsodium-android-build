package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.r2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class WindowInfoKt$WindowFocusObserver$1$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ State<v3.l<Boolean, r2>> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<Boolean> {
        final /* synthetic */ WindowInfo $windowInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WindowInfo windowInfo) {
            super(0);
            this.$windowInfo = windowInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf(this.$windowInfo.isWindowFocused());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends v3.l<? super Boolean, r2>> state, kotlin.coroutines.d<? super WindowInfoKt$WindowFocusObserver$1$1> dVar) {
        super(2, dVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                kotlin.e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.e1.n(obj);
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$windowInfo));
            final State<v3.l<Boolean, r2>> state = this.$callback;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), (kotlin.coroutines.d<? super r2>) dVar);
                }

                @p4.m
                public final Object emit(boolean z4, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                    state.getValue().invoke(kotlin.coroutines.jvm.internal.b.a(z4));
                    return r2.f19517a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(jVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
