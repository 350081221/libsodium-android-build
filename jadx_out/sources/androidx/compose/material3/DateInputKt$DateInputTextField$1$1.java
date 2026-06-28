package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "input", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1064#2,2:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1$1\n*L\n138#1:378,2\n*E\n"})
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$1$1 extends kotlin.jvm.internal.n0 implements v3.l<TextFieldValue, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ MutableState<String> $errorText;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateInputKt$DateInputTextField$1$1(DateInputFormat dateInputFormat, MutableState<String> mutableState, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, DateInputValidator dateInputValidator, int i5, Locale locale, MutableState<TextFieldValue> mutableState2) {
        super(1);
        this.$dateInputFormat = dateInputFormat;
        this.$errorText = mutableState;
        this.$onDateSelectionChange = lVar;
        this.$calendarModel = calendarModel;
        this.$dateInputValidator = dateInputValidator;
        this.$inputIdentifier = i5;
        this.$locale = locale;
        this.$text$delegate = mutableState2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextFieldValue textFieldValue) {
        boolean z4;
        CharSequence C5;
        if (textFieldValue.getText().length() <= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
            String text = textFieldValue.getText();
            int i5 = 0;
            while (true) {
                if (i5 >= text.length()) {
                    z4 = true;
                    break;
                } else {
                    if (!Character.isDigit(text.charAt(i5))) {
                        z4 = false;
                        break;
                    }
                    i5++;
                }
            }
            if (z4) {
                this.$text$delegate.setValue(textFieldValue);
                C5 = kotlin.text.f0.C5(textFieldValue.getText());
                String obj = C5.toString();
                Long l5 = null;
                if (!(obj.length() == 0) && obj.length() >= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
                    CalendarDate parse = this.$calendarModel.parse(obj, this.$dateInputFormat.getPatternWithoutDelimiters());
                    this.$errorText.setValue(this.$dateInputValidator.m1774validateXivgLIo(parse, this.$inputIdentifier, this.$locale));
                    v3.l<Long, r2> lVar = this.$onDateSelectionChange;
                    if ((this.$errorText.getValue().length() == 0) && parse != null) {
                        l5 = Long.valueOf(parse.getUtcTimeMillis());
                    }
                    lVar.invoke(l5);
                    return;
                }
                this.$errorText.setValue("");
                this.$onDateSelectionChange.invoke(null);
            }
        }
    }
}
