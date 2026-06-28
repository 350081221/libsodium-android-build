package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@f
/* loaded from: classes.dex */
public final class Role {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Button = m5367constructorimpl(0);
    private static final int Checkbox = m5367constructorimpl(1);
    private static final int Switch = m5367constructorimpl(2);
    private static final int RadioButton = m5367constructorimpl(3);
    private static final int Tab = m5367constructorimpl(4);
    private static final int Image = m5367constructorimpl(5);
    private static final int DropdownList = m5367constructorimpl(6);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m5373getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m5374getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m5375getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m5376getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m5377getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m5378getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m5379getTabo7Vup1c() {
            return Role.Tab;
        }
    }

    private /* synthetic */ Role(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m5366boximpl(int i5) {
        return new Role(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5367constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5368equalsimpl(int i5, Object obj) {
        return (obj instanceof Role) && i5 == ((Role) obj).m5372unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5369equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5370hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5371toStringimpl(int i5) {
        if (m5369equalsimpl0(i5, Button)) {
            return "Button";
        }
        if (m5369equalsimpl0(i5, Checkbox)) {
            return "Checkbox";
        }
        if (m5369equalsimpl0(i5, Switch)) {
            return "Switch";
        }
        if (m5369equalsimpl0(i5, RadioButton)) {
            return "RadioButton";
        }
        if (m5369equalsimpl0(i5, Tab)) {
            return "Tab";
        }
        if (m5369equalsimpl0(i5, Image)) {
            return "Image";
        }
        if (m5369equalsimpl0(i5, DropdownList)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m5368equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5370hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5371toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5372unboximpl() {
        return this.value;
    }
}
