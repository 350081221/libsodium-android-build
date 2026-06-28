package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t0.b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] mNodeArray;

        PathDataEvaluator() {
        }

        PathDataEvaluator(PathParser.PathDataNode[] pathDataNodeArr) {
            this.mNodeArray = pathDataNodeArr;
        }

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f5, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.canMorph(this.mNodeArray, pathDataNodeArr)) {
                    this.mNodeArray = PathParser.deepCopyNodes(pathDataNodeArr);
                }
                for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
                    this.mNodeArray[i5].interpolatePathDataNode(pathDataNodeArr[i5], pathDataNodeArr2[i5], f5);
                }
                return this.mNodeArray;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private AnimatorInflaterCompat() {
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f5) throws XmlPullParserException, IOException {
        return createAnimatorFromXml(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f5);
    }

    private static Keyframe createNewKeyframe(Keyframe keyframe, float f5) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f5);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f5);
        }
        return Keyframe.ofObject(f5);
    }

    private static void distributeKeyframes(Keyframe[] keyframeArr, float f5, int i5, int i6) {
        float f6 = f5 / ((i6 - i5) + 2);
        while (i5 <= i6) {
            keyframeArr[i5].setFraction(keyframeArr[i5 - 1].getFraction() + f6);
            i5++;
        }
    }

    private static void dumpKeyframes(Object[] objArr, String str) {
        Object valueOf;
        if (objArr != null && objArr.length != 0) {
            Log.d(TAG, str);
            int length = objArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                Keyframe keyframe = (Keyframe) objArr[i5];
                StringBuilder sb = new StringBuilder();
                sb.append("Keyframe ");
                sb.append(i5);
                sb.append(": fraction ");
                Object obj = "null";
                if (keyframe.getFraction() < 0.0f) {
                    valueOf = "null";
                } else {
                    valueOf = Float.valueOf(keyframe.getFraction());
                }
                sb.append(valueOf);
                sb.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb.append(obj);
                Log.d(TAG, sb.toString());
            }
        }
    }

    private static PropertyValuesHolder getPVH(TypedArray typedArray, int i5, int i6, int i7, String str) {
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        ArgbEvaluator argbEvaluator;
        int i10;
        int i11;
        int i12;
        float f5;
        PropertyValuesHolder ofFloat;
        float f6;
        float f7;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i6);
        if (peekValue != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i8 = peekValue.type;
        } else {
            i8 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i7);
        if (peekValue2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i9 = peekValue2.type;
        } else {
            i9 = 0;
        }
        if (i5 == 4) {
            if ((z4 && isColorType(i8)) || (z5 && isColorType(i9))) {
                i5 = 3;
            } else {
                i5 = 0;
            }
        }
        if (i5 == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i5 == 2) {
            String string = typedArray.getString(i6);
            String string2 = typedArray.getString(i7);
            PathParser.PathDataNode[] createNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] createNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (createNodesFromPathData == null && createNodesFromPathData2 == null) {
                return null;
            }
            if (createNodesFromPathData != null) {
                PathDataEvaluator pathDataEvaluator = new PathDataEvaluator();
                if (createNodesFromPathData2 != null) {
                    if (PathParser.canMorph(createNodesFromPathData, createNodesFromPathData2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData, createNodesFromPathData2);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData);
                }
                return ofObject;
            }
            if (createNodesFromPathData2 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new PathDataEvaluator(), createNodesFromPathData2);
        }
        if (i5 == 3) {
            argbEvaluator = ArgbEvaluator.getInstance();
        } else {
            argbEvaluator = null;
        }
        if (z6) {
            if (z4) {
                if (i8 == 5) {
                    f6 = typedArray.getDimension(i6, 0.0f);
                } else {
                    f6 = typedArray.getFloat(i6, 0.0f);
                }
                if (z5) {
                    if (i9 == 5) {
                        f7 = typedArray.getDimension(i7, 0.0f);
                    } else {
                        f7 = typedArray.getFloat(i7, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f6, f7);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f6);
                }
            } else {
                if (i9 == 5) {
                    f5 = typedArray.getDimension(i7, 0.0f);
                } else {
                    f5 = typedArray.getFloat(i7, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f5);
            }
            propertyValuesHolder = ofFloat;
        } else if (z4) {
            if (i8 == 5) {
                i11 = (int) typedArray.getDimension(i6, 0.0f);
            } else if (isColorType(i8)) {
                i11 = typedArray.getColor(i6, 0);
            } else {
                i11 = typedArray.getInt(i6, 0);
            }
            if (z5) {
                if (i9 == 5) {
                    i12 = (int) typedArray.getDimension(i7, 0.0f);
                } else if (isColorType(i9)) {
                    i12 = typedArray.getColor(i7, 0);
                } else {
                    i12 = typedArray.getInt(i7, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11, i12);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11);
            }
        } else if (z5) {
            if (i9 == 5) {
                i10 = (int) typedArray.getDimension(i7, 0.0f);
            } else if (isColorType(i9)) {
                i10 = typedArray.getColor(i7, 0);
            } else {
                i10 = typedArray.getInt(i7, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i10);
        }
        if (propertyValuesHolder != null && argbEvaluator != null) {
            propertyValuesHolder.setEvaluator(argbEvaluator);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    private static int inferValueTypeFromValues(TypedArray typedArray, int i5, int i6) {
        boolean z4;
        int i7;
        int i8;
        TypedValue peekValue = typedArray.peekValue(i5);
        boolean z5 = true;
        if (peekValue != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i7 = peekValue.type;
        } else {
            i7 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i6);
        if (peekValue2 == null) {
            z5 = false;
        }
        if (z5) {
            i8 = peekValue2.type;
        } else {
            i8 = 0;
        }
        if ((!z4 || !isColorType(i7)) && (!z5 || !isColorType(i8))) {
            return 0;
        }
        return 3;
    }

    private static int inferValueTypeOfKeyframe(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z4;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        int i5 = 0;
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, b.f22420d, 0);
        if (peekNamedValue != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && isColorType(peekNamedValue.type)) {
            i5 = 3;
        }
        obtainAttributes.recycle();
        return i5;
    }

    private static boolean isColorType(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i5) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i5);
    }

    private static Keyframe loadKeyframe(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i5, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z4;
        Keyframe ofInt;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, b.f22420d, 0);
        if (peekNamedValue != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i5 == 4) {
            if (z4 && isColorType(peekNamedValue.type)) {
                i5 = 3;
            } else {
                i5 = 0;
            }
        }
        if (z4) {
            if (i5 != 0) {
                if (i5 != 1 && i5 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, b.f22420d, 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, b.f22420d, 0, 0.0f));
            }
        } else if (i5 == 0) {
            ofInt = Keyframe.ofFloat(namedFloat);
        } else {
            ofInt = Keyframe.ofInt(namedFloat);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            ofInt.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f5, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, resources, theme, attributeSet, objectAnimator, f5, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder loadPvh(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i5) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i5 == 4) {
                    i5 = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe loadKeyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i5, xmlPullParser);
                if (loadKeyframe != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(loadKeyframe);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), createNewKeyframe(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, createNewKeyframe(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i6 = 0; i6 < size; i6++) {
                Keyframe keyframe3 = keyframeArr[i6];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i6 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i7 = size - 1;
                        if (i6 == i7) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i8 = i6;
                            for (int i9 = i6 + 1; i9 < i7 && keyframeArr[i9].getFraction() < 0.0f; i9++) {
                                i8 = i9;
                            }
                            distributeKeyframes(keyframeArr, keyframeArr[i8 + 1].getFraction() - keyframeArr[i6 - 1].getFraction(), i6, i8);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i5 == 3) {
                propertyValuesHolder.setEvaluator(ArgbEvaluator.getInstance());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] loadValues(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i5;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
                    String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "propertyName", 3);
                    int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder loadPvh = loadPvh(context, resources, theme, xmlPullParser, namedString, namedInt);
                    if (loadPvh == null) {
                        loadPvh = getPVH(obtainAttributes, namedInt, 0, 1, namedString);
                    }
                    if (loadPvh != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(loadPvh);
                    }
                    obtainAttributes.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i5 = 0; i5 < size; i5++) {
                propertyValuesHolderArr[i5] = (PropertyValuesHolder) arrayList.get(i5);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void parseAnimatorFromTypeArray(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f5, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "duration", 1, 300);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                namedInt3 = inferValueTypeFromValues(typedArray, 5, 6);
            }
            PropertyValuesHolder pvh = getPVH(typedArray, namedInt3, 5, 6, "");
            if (pvh != null) {
                valueAnimator.setValues(pvh);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setupObjectAnimator(valueAnimator, typedArray2, namedInt3, f5, xmlPullParser);
        }
    }

    private static void setupObjectAnimator(ValueAnimator valueAnimator, TypedArray typedArray, int i5, float f5, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString != null) {
            String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
            String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
            if (i5 != 2) {
            }
            if (namedString2 == null && namedString3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            setupPathMotion(PathParser.createPathFromPathData(namedString), objectAnimator, f5 * 0.5f, namedString2, namedString3);
            return;
        }
        objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void setupPathMotion(Path path, ObjectAnimator objectAnimator, float f5, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f6 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f7 = 0.0f;
        do {
            f7 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f7));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f7 / f5)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f8 = f7 / (min - 1);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
            fArr[i5] = fArr3[0];
            fArr2[i5] = fArr3[1];
            f6 += f8;
            int i7 = i6 + 1;
            if (i7 < arrayList.size() && f6 > ((Float) arrayList.get(i7)).floatValue()) {
                pathMeasure2.nextContour();
                i6 = i7;
            }
            i5++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator createAnimatorFromXml(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.createAnimatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i5) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i5, 1.0f);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i5, float f5) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i5);
                    return createAnimatorFromXml(context, resources, theme, xmlResourceParser, f5);
                } catch (XmlPullParserException e5) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                    notFoundException.initCause(e5);
                    throw notFoundException;
                }
            } catch (IOException e6) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                notFoundException2.initCause(e6);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator loadAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f5, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        parseAnimatorFromTypeArray(valueAnimator, obtainAttributes, obtainAttributes2, f5, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }
}
