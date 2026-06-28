package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/KeyboardActionScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SearchBar_androidKt$SearchBarInputField$4$1 extends kotlin.jvm.internal.n0 implements v3.l<KeyboardActionScope, r2> {
    final /* synthetic */ v3.l<String, r2> $onSearch;
    final /* synthetic */ String $query;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$SearchBarInputField$4$1(v3.l<? super String, r2> lVar, String str) {
        super(1);
        this.$onSearch = lVar;
        this.$query = str;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l KeyboardActionScope keyboardActionScope) {
        this.$onSearch.invoke(this.$query);
    }
}
