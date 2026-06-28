package androidx.compose.ui.autofill;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.HashMap;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\"2\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidAutofillTypes", "Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidType", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "getAndroidType", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {

    @l
    private static final HashMap<AutofillType, String> androidAutofillTypes;

    static {
        HashMap<AutofillType, String> M;
        M = a1.M(q1.a(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), q1.a(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), q1.a(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), q1.a(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), q1.a(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), q1.a(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), q1.a(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), q1.a(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), q1.a(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), q1.a(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), q1.a(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), q1.a(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), q1.a(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), q1.a(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), q1.a(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), q1.a(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), q1.a(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), q1.a(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), q1.a(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), q1.a(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), q1.a(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), q1.a(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), q1.a(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), q1.a(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), q1.a(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), q1.a(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), q1.a(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), q1.a(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), q1.a(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), q1.a(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), q1.a(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), q1.a(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), q1.a(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), q1.a(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), q1.a(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), q1.a(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));
        androidAutofillTypes = M;
    }

    @ExperimentalComposeUiApi
    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    @l
    public static final String getAndroidType(@l AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
