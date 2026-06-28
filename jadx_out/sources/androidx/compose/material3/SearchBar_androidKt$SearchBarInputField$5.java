package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n1#2:742\n*E\n"})
/* loaded from: classes.dex */
final class SearchBar_androidKt$SearchBarInputField$5 extends kotlin.jvm.internal.n0 implements v3.q<v3.p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$SearchBarInputField$5(String str, boolean z4, MutableInteractionSource mutableInteractionSource, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TextFieldColors textFieldColors) {
        super(3);
        this.$query = str;
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$colors = textFieldColors;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(v3.p<? super Composer, ? super Integer, ? extends r2> pVar, Composer composer, Integer num) {
        invoke((v3.p<? super Composer, ? super Integer, r2>) pVar, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(@p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        if ((i5 & 6) == 0) {
            i6 = i5 | (composer.changedInstance(pVar) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-951844929, i6, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.android.kt:478)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        String str = this.$query;
        boolean z4 = this.$enabled;
        VisualTransformation none = VisualTransformation.Companion.getNone();
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        v3.p<Composer, Integer, r2> pVar2 = this.$placeholder;
        v3.p<Composer, Integer, r2> pVar3 = this.$leadingIcon;
        ComposableLambda composableLambda = pVar3 != null ? ComposableLambdaKt.composableLambda(composer, -1030845367, true, new SearchBar_androidKt$SearchBarInputField$5$1$1(pVar3)) : null;
        v3.p<Composer, Integer, r2> pVar4 = this.$trailingIcon;
        textFieldDefaults.DecorationBox(str, pVar, z4, true, none, mutableInteractionSource, false, null, pVar2, composableLambda, pVar4 != null ? ComposableLambdaKt.composableLambda(composer, -1558904811, true, new SearchBar_androidKt$SearchBarInputField$5$2$1(pVar4)) : null, null, null, null, SearchBarDefaults.INSTANCE.getInputFieldShape(composer, 6), this.$colors, TextFieldDefaults.m2413contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.INSTANCE.m1759getLambda1$material3_release(), composer, ((i6 << 3) & 112) | 27648, 113246208, 14528);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
