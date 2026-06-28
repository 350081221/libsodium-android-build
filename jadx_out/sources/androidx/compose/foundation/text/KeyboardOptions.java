package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B;\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b'\u0010(B1\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b'\u0010)J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "I", "getCapitalization-IUNYP9k", "()I", "Z", "getAutoCorrect", "()Z", "getKeyboardType-PjHm6EE", "getImeAction-eUduSuo", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "<init>", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/w;)V", "(IZIILkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, null, 31, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    @m
    private final PlatformImeOptions platformImeOptions;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @l
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }
    }

    private KeyboardOptions(int i5, boolean z4, int i6, int i7, PlatformImeOptions platformImeOptions) {
        this.capitalization = i5;
        this.autoCorrect = z4;
        this.keyboardType = i6;
        this.imeAction = i7;
        this.platformImeOptions = platformImeOptions;
    }

    public /* synthetic */ KeyboardOptions(int i5, boolean z4, int i6, int i7, PlatformImeOptions platformImeOptions, w wVar) {
        this(i5, z4, i6, i7, platformImeOptions);
    }

    @k(level = kotlin.m.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i5, boolean z4, int i6, int i7, w wVar) {
        this(i5, z4, i6, i7);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m854copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i5, boolean z4, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i5 = keyboardOptions.capitalization;
        }
        if ((i8 & 2) != 0) {
            z4 = keyboardOptions.autoCorrect;
        }
        if ((i8 & 4) != 0) {
            i6 = keyboardOptions.keyboardType;
        }
        if ((i8 & 8) != 0) {
            i7 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m856copy3m2b7yw(i5, z4, i6, i7);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m855copyij11fho$default(KeyboardOptions keyboardOptions, int i5, boolean z4, int i6, int i7, PlatformImeOptions platformImeOptions, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i5 = keyboardOptions.capitalization;
        }
        if ((i8 & 2) != 0) {
            z4 = keyboardOptions.autoCorrect;
        }
        boolean z5 = z4;
        if ((i8 & 4) != 0) {
            i6 = keyboardOptions.keyboardType;
        }
        int i9 = i6;
        if ((i8 & 8) != 0) {
            i7 = keyboardOptions.imeAction;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        return keyboardOptions.m857copyij11fho(i5, z5, i9, i10, platformImeOptions);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z4);
    }

    @k(level = kotlin.m.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m856copy3m2b7yw(int i5, boolean z4, int i6, int i7) {
        return new KeyboardOptions(i5, z4, i6, i7, this.platformImeOptions, (w) null);
    }

    @l
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final KeyboardOptions m857copyij11fho(int i5, boolean z4, int i6, int i7, @m PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i5, z4, i6, i7, platformImeOptions, (w) null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        if (KeyboardCapitalization.m5741equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m5756equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m5709equalsimpl0(this.imeAction, keyboardOptions.imeAction) && l0.g(this.platformImeOptions, keyboardOptions.platformImeOptions)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m858getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m859getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m860getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    @m
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public int hashCode() {
        int i5;
        int m5742hashCodeimpl = ((((((KeyboardCapitalization.m5742hashCodeimpl(this.capitalization) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m5757hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m5710hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions != null) {
            i5 = platformImeOptions.hashCode();
        } else {
            i5 = 0;
        }
        return m5742hashCodeimpl + i5;
    }

    @l
    public final ImeOptions toImeOptions$foundation_release(boolean z4) {
        return new ImeOptions(z4, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, this.platformImeOptions, (w) null);
    }

    @l
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m5743toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m5758toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m5711toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ')';
    }

    public /* synthetic */ KeyboardOptions(int i5, boolean z4, int i6, int i7, PlatformImeOptions platformImeOptions, int i8, w wVar) {
        this((i8 & 1) != 0 ? KeyboardCapitalization.Companion.m5750getNoneIUNYP9k() : i5, (i8 & 2) != 0 ? true : z4, (i8 & 4) != 0 ? KeyboardType.Companion.m5776getTextPjHm6EE() : i6, (i8 & 8) != 0 ? ImeAction.Companion.m5721getDefaulteUduSuo() : i7, (i8 & 16) != 0 ? null : platformImeOptions, (w) null);
    }

    public /* synthetic */ KeyboardOptions(int i5, boolean z4, int i6, int i7, int i8, w wVar) {
        this((i8 & 1) != 0 ? KeyboardCapitalization.Companion.m5750getNoneIUNYP9k() : i5, (i8 & 2) != 0 ? true : z4, (i8 & 4) != 0 ? KeyboardType.Companion.m5776getTextPjHm6EE() : i6, (i8 & 8) != 0 ? ImeAction.Companion.m5721getDefaulteUduSuo() : i7, (w) null);
    }

    private KeyboardOptions(int i5, boolean z4, int i6, int i7) {
        this(i5, z4, i6, i7, (PlatformImeOptions) null, (w) null);
    }
}
