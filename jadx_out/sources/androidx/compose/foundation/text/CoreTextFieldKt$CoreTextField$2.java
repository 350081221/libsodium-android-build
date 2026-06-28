package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<Boolean> {
        final /* synthetic */ State<Boolean> $writeable$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<Boolean> state) {
            super(0);
            this.$writeable$delegate = state;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final Boolean invoke() {
            boolean CoreTextField$lambda$8;
            CoreTextField$lambda$8 = CoreTextFieldKt.CoreTextField$lambda$8(this.$writeable$delegate);
            return Boolean.valueOf(CoreTextField$lambda$8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, d<? super CoreTextFieldKt$CoreTextField$2> dVar) {
        super(2, dVar);
        this.$state = textFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new CoreTextFieldKt$CoreTextField$2(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((CoreTextFieldKt$CoreTextField$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$writeable$delegate));
                final TextFieldState textFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final ImeOptions imeOptions = this.$imeOptions;
                j jVar = new j() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (d<? super r2>) dVar);
                    }

                    @m
                    public final Object emit(boolean z4, @l d<? super r2> dVar) {
                        if (z4 && TextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldSelectionManager.getValue$foundation_release(), imeOptions, textFieldSelectionManager.getOffsetMapping$foundation_release());
                        } else {
                            CoreTextFieldKt.endInputSession(TextFieldState.this);
                        }
                        return r2.f19517a;
                    }
                };
                this.label = 1;
                if (snapshotFlow.collect(jVar, this) == l5) {
                    return l5;
                }
            }
            CoreTextFieldKt.endInputSession(this.$state);
            return r2.f19517a;
        } catch (Throwable th) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }
}
