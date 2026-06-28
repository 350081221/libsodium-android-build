package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u001d\u001e\u001f\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "()V", "Setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "name", "", t0.b.f22420d, "", "Settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "settings", "", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "grade", "", "italic", "opticalSizing", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "slant", "width", "SettingFloat", "SettingInt", "SettingTextUnit", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontVariation {
    public static final int $stable = 0;

    @l
    public static final FontVariation INSTANCE = new FontVariation();

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "axisName", "", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public interface Setting {
        @l
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@m Density density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", t0.b.f22420d, "", "(Ljava/lang/String;F)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()F", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "toVariationValue", "density", "Landroidx/compose/ui/unit/Density;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class SettingFloat implements Setting {

        @l
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(@l String str, float f5) {
            this.axisName = str;
            this.value = f5;
        }

        public boolean equals(@m Object obj) {
            boolean z4;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            if (!l0.g(getAxisName(), settingFloat.getAxisName())) {
                return false;
            }
            if (this.value == settingFloat.value) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @l
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        @l
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@m Density density) {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", t0.b.f22420d, "", "(Ljava/lang/String;I)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()I", "equals", "other", "", TTDownloadField.TT_HASHCODE, "toString", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class SettingInt implements Setting {

        @l
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(@l String str, int i5) {
            this.axisName = str;
            this.value = i5;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            if (l0.g(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @l
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        @l
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@m Density density) {
            return this.value;
        }
    }

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "Landroidx/compose/ui/unit/Density;", "density", "", "toVariationValue", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "axisName", "Ljava/lang/String;", "getAxisName", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/TextUnit;", t0.b.f22420d, "J", "getValue-XSAIIZE", "()J", "needsDensity", "Z", "getNeedsDensity", "()Z", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @r1({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    /* loaded from: classes.dex */
    private static final class SettingTextUnit implements Setting {

        @l
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        private SettingTextUnit(String str, long j5) {
            this.axisName = str;
            this.value = j5;
            this.needsDensity = true;
        }

        public /* synthetic */ SettingTextUnit(String str, long j5, w wVar) {
            this(str, j5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            if (l0.g(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m6232equalsimpl0(this.value, settingTextUnit.value)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @l
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m5678getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m6236hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m6242toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(@m Density density) {
            if (density != null) {
                return TextUnit.m6235getValueimpl(this.value) * density.getFontScale();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "settings", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "needsDensity", "", "getNeedsDensity$ui_text_release", "()Z", "", "getSettings", "()Ljava/util/List;", "equals", "other", TTDownloadField.TT_HASHCODE, "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    @r1({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10783#2:374\n11008#2,3:375\n11011#2,3:385\n361#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;

        @l
        private final List<Setting> settings;

        public Settings(@l Setting... settingArr) {
            String j32;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z4 = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() == 1) {
                        b0.n0(arrayList, list);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append('\'');
                        sb.append(str);
                        sb.append("' must be unique. Actual [ [");
                        j32 = e0.j3(list, null, null, null, 0, null, null, 63, null);
                        sb.append(j32);
                        sb.append(']');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    this.settings = arrayList2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        if (((Setting) arrayList2.get(i5)).getNeedsDensity()) {
                            z4 = true;
                            break;
                        }
                        i5++;
                    }
                    this.needsDensity = z4;
                    return;
                }
            }
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Settings) && l0.g(this.settings, ((Settings) obj).settings)) {
                return true;
            }
            return false;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        @l
        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    @l
    public final Setting Setting(@l String str, float f5) {
        boolean z4;
        if (str.length() == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new SettingFloat(str, f5);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    @l
    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m5676Settings6EWAqTQ(@l FontWeight fontWeight, int i5, @l Setting... settingArr) {
        s1 s1Var = new s1(3);
        s1Var.a(weight(fontWeight.getWeight()));
        s1Var.a(italic(i5));
        s1Var.b(settingArr);
        return new Settings((Setting[]) s1Var.d(new Setting[s1Var.c()]));
    }

    @l
    public final Setting grade(int i5) {
        boolean z4 = false;
        if (-1000 <= i5 && i5 < 1001) {
            z4 = true;
        }
        if (z4) {
            return new SettingInt("GRAD", i5);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    @l
    public final Setting italic(float f5) {
        boolean z4 = false;
        if (0.0f <= f5 && f5 <= 1.0f) {
            z4 = true;
        }
        if (z4) {
            return new SettingFloat("ital", f5);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f5).toString());
    }

    @l
    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m5677opticalSizingR2X_6o(long j5) {
        if (TextUnit.m6238isSpimpl(j5)) {
            return new SettingTextUnit("opsz", j5, null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    @l
    public final Setting slant(float f5) {
        boolean z4 = false;
        if (-90.0f <= f5 && f5 <= 90.0f) {
            z4 = true;
        }
        if (z4) {
            return new SettingFloat("slnt", f5);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f5).toString());
    }

    @l
    public final Setting weight(int i5) {
        boolean z4 = false;
        if (1 <= i5 && i5 < 1001) {
            z4 = true;
        }
        if (z4) {
            return new SettingInt("wght", i5);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i5).toString());
    }

    @l
    public final Setting width(float f5) {
        boolean z4;
        if (f5 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new SettingFloat("wdth", f5);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f5).toString());
    }
}
