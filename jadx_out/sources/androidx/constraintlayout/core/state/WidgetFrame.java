package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public class WidgetFrame {
    private static final boolean OLD_SYSTEM = true;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final HashMap<String, CustomVariable> mCustom;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
    }

    private static void add(StringBuilder sb, String str, int i5) {
        sb.append(str);
        sb.append(": ");
        sb.append(i5);
        sb.append(",\n");
    }

    public static void interpolate(int i5, int i6, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f5) {
        int i7;
        float f6;
        int i8;
        int i9;
        float f7;
        float f8;
        int i10;
        float f9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10 = 100.0f * f5;
        int i17 = (int) f10;
        int i18 = widgetFrame2.left;
        int i19 = widgetFrame2.top;
        int i20 = widgetFrame3.left;
        int i21 = widgetFrame3.top;
        int i22 = widgetFrame2.right - i18;
        int i23 = widgetFrame2.bottom - i19;
        int i24 = widgetFrame3.right - i20;
        int i25 = widgetFrame3.bottom - i21;
        float f11 = widgetFrame2.alpha;
        float f12 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i19 = (int) (i19 - (i25 / 2.0f));
            i9 = (int) (i18 - (i24 / 2.0f));
            if (Float.isNaN(f11)) {
                i8 = i25;
                i7 = i24;
                f6 = 0.0f;
            } else {
                f6 = f11;
                i7 = i24;
                i8 = i25;
            }
        } else {
            i7 = i22;
            f6 = f11;
            i8 = i23;
            i9 = i18;
        }
        if (widgetFrame3.visibility == 8) {
            i20 = (int) (i20 - (i7 / 2.0f));
            i21 = (int) (i21 - (i8 / 2.0f));
            i24 = i7;
            i25 = i8;
            if (Float.isNaN(f12)) {
                f12 = 0.0f;
            }
        }
        if (Float.isNaN(f6) && !Float.isNaN(f12)) {
            f6 = 1.0f;
        }
        if (!Float.isNaN(f6) && Float.isNaN(f12)) {
            f12 = 1.0f;
        }
        if (widgetFrame2.visibility == 4) {
            f8 = f12;
            f7 = 0.0f;
        } else {
            f7 = f6;
            f8 = f12;
        }
        float f13 = widgetFrame3.visibility == 4 ? 0.0f : f8;
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            i10 = i19;
            f9 = f5;
            i11 = i9;
            i12 = i20;
        } else {
            Transition.KeyPosition findPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i17);
            i10 = i19;
            Transition.KeyPosition findNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i17);
            if (findPreviousPosition == findNextPosition) {
                findNextPosition = null;
            }
            if (findPreviousPosition != null) {
                i9 = (int) (findPreviousPosition.f341x * i5);
                i14 = i20;
                i13 = i6;
                i10 = (int) (findPreviousPosition.f342y * i13);
                i15 = findPreviousPosition.frame;
            } else {
                i13 = i6;
                i14 = i20;
                i15 = 0;
            }
            i11 = i9;
            if (findNextPosition != null) {
                int i26 = (int) (findNextPosition.f341x * i5);
                int i27 = (int) (findNextPosition.f342y * i13);
                i16 = findNextPosition.frame;
                i12 = i26;
                i21 = i27;
            } else {
                i16 = 100;
                i12 = i14;
            }
            f9 = (f10 - i15) / (i16 - i15);
        }
        widgetFrame.widget = widgetFrame2.widget;
        int i28 = (int) (i11 + ((i12 - i11) * f9));
        widgetFrame.left = i28;
        int i29 = (int) (i10 + (f9 * (i21 - r10)));
        widgetFrame.top = i29;
        float f14 = 1.0f - f5;
        widgetFrame.right = i28 + ((int) ((i7 * f14) + (i24 * f5)));
        widgetFrame.bottom = i29 + ((int) ((f14 * i8) + (i25 * f5)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f5);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f5);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f5);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f5);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f5);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f5);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f5);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f5);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f5);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f5);
        widgetFrame.alpha = interpolate(f7, f13, 1.0f, f5);
        Set<String> keySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (String str : keySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f5)));
                } else {
                    int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[numberOfInterpolatedValues];
                    float[] fArr2 = new float[numberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i30 = 0; i30 < numberOfInterpolatedValues; i30++) {
                        fArr[i30] = interpolate(fArr[i30], fArr2[i30], 0.0f, f5);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private void serializeAnchor(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor != null && anchor.mTarget != null) {
            sb.append("Anchor");
            sb.append(type.name());
            sb.append(": ['");
            String str = anchor.mTarget.getOwner().stringId;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(anchor.mTarget.getType().name());
            sb.append("', '");
            sb.append(anchor.mMargin);
            sb.append("'],\n");
        }
    }

    public void addCustomColor(String str, int i5) {
        setCustomAttribute(str, TypedValues.Custom.TYPE_COLOR, i5);
    }

    public void addCustomFloat(String str, float f5) {
        setCustomAttribute(str, TypedValues.Custom.TYPE_FLOAT, f5);
    }

    public float centerX() {
        return this.left + ((this.right - r0) / 2.0f);
    }

    public float centerY() {
        return this.top + ((this.bottom - r0) / 2.0f);
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mCustom.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    public int getCustomColor(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget == null) {
            return "unknown";
        }
        return constraintWidget.stringId;
    }

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public boolean isDefaultTransform() {
        if (Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha)) {
            return true;
        }
        return false;
    }

    void logv(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str2 = str3 + "/" + (this.widget.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    void parseCustom(CLElement cLElement) throws CLParsingException {
        CLObject cLObject = (CLObject) cLElement;
        int size = cLObject.size();
        for (int i5 = 0; i5 < size; i5++) {
            CLKey cLKey = (CLKey) cLObject.get(i5);
            cLKey.content();
            CLElement value = cLKey.getValue();
            String content = value.content();
            if (content.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(cLKey.content(), TypedValues.Custom.TYPE_COLOR, Integer.parseInt(content.substring(1), 16));
            } else if (value instanceof CLNumber) {
                setCustomAttribute(cLKey.content(), TypedValues.Custom.TYPE_FLOAT, value.getFloat());
            } else {
                setCustomAttribute(cLKey.content(), TypedValues.Custom.TYPE_STRING, content);
            }
        }
    }

    void printCustomAttributes() {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str = str2 + "/" + (this.widget.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, CustomVariable> hashMap = this.mCustom;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str + this.mCustom.get(str3).toString());
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb) {
        return serialize(sb, false);
    }

    public void setCustomAttribute(String str, int i5, float f5) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setFloatValue(f5);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i5, f5));
        }
    }

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
    }

    public boolean setValue(String str, CLElement cLElement) throws CLParsingException {
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c5 = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c5 = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c5 = external.org.apache.commons.lang3.c.f15956c;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c5 = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c5 = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c5 = 17;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                phone_orientation = cLElement.getFloat();
                return true;
            case 1:
                this.bottom = cLElement.getInt();
                return true;
            case 2:
                parseCustom(cLElement);
                return true;
            case 3:
                this.rotationX = cLElement.getFloat();
                return true;
            case 4:
                this.rotationY = cLElement.getFloat();
                return true;
            case 5:
                this.rotationZ = cLElement.getFloat();
                return true;
            case 6:
                this.translationX = cLElement.getFloat();
                return true;
            case 7:
                this.translationY = cLElement.getFloat();
                return true;
            case '\b':
                this.translationZ = cLElement.getFloat();
                return true;
            case '\t':
                this.pivotX = cLElement.getFloat();
                return true;
            case '\n':
                this.pivotY = cLElement.getFloat();
                return true;
            case 11:
                this.scaleX = cLElement.getFloat();
                return true;
            case '\f':
                this.scaleY = cLElement.getFloat();
                return true;
            case '\r':
                this.top = cLElement.getInt();
                return true;
            case 14:
                this.left = cLElement.getInt();
                return true;
            case 15:
                this.alpha = cLElement.getFloat();
                return true;
            case 16:
                this.right = cLElement.getInt();
                return true;
            case 17:
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        this.mCustom.clear();
        for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
            this.mCustom.put(customVariable.getName(), customVariable.copy());
        }
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }

    public StringBuilder serialize(StringBuilder sb, boolean z4) {
        sb.append("{\n");
        add(sb, "left", this.left);
        add(sb, "top", this.top);
        add(sb, "right", this.right);
        add(sb, "bottom", this.bottom);
        add(sb, "pivotX", this.pivotX);
        add(sb, "pivotY", this.pivotY);
        add(sb, "rotationX", this.rotationX);
        add(sb, "rotationY", this.rotationY);
        add(sb, "rotationZ", this.rotationZ);
        add(sb, "translationX", this.translationX);
        add(sb, "translationY", this.translationY);
        add(sb, "translationZ", this.translationZ);
        add(sb, "scaleX", this.scaleX);
        add(sb, "scaleY", this.scaleY);
        add(sb, "alpha", this.alpha);
        add(sb, "visibility", this.visibility);
        add(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                serializeAnchor(sb, type);
            }
        }
        if (z4) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (z4) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.mCustom.keySet()) {
                CustomVariable customVariable = this.mCustom.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case TypedValues.Custom.TYPE_INT /* 900 */:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                    case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case TypedValues.Custom.TYPE_COLOR /* 902 */:
                        sb.append("'");
                        sb.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_STRING /* 903 */:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void setCustomAttribute(String str, int i5, int i6) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setIntValue(i6);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i5, i6));
        }
    }

    private static void add(StringBuilder sb, String str, float f5) {
        if (Float.isNaN(f5)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f5);
        sb.append(",\n");
    }

    public void setCustomAttribute(String str, int i5, boolean z4) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setBooleanValue(z4);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i5, z4));
        }
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i5, String str2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setStringValue(str2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i5, str2));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    private static float interpolate(float f5, float f6, float f7, float f8) {
        boolean isNaN = Float.isNaN(f5);
        boolean isNaN2 = Float.isNaN(f6);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f5 = f7;
        }
        if (isNaN2) {
            f6 = f7;
        }
        return f5 + (f8 * (f6 - f5));
    }
}
