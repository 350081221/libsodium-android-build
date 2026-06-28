package androidx.compose.material3;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExposedDropdownMenu_androidKt$expandable$2 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ String $collapsedDescription;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $expandedDescription;
    final /* synthetic */ v3.a<r2> $onExpandedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<Boolean> {
        final /* synthetic */ v3.a<r2> $onExpandedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(v3.a<r2> aVar) {
            super(0);
            this.$onExpandedChange = aVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            this.$onExpandedChange.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$2(boolean z4, String str, String str2, v3.a<r2> aVar) {
        super(1);
        this.$expanded = z4;
        this.$expandedDescription = str;
        this.$collapsedDescription = str2;
        this.$onExpandedChange = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, this.$expanded ? this.$expandedDescription : this.$collapsedDescription);
        SemanticsPropertiesKt.m5389setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5375getDropdownListo7Vup1c());
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$onExpandedChange), 1, null);
    }
}
