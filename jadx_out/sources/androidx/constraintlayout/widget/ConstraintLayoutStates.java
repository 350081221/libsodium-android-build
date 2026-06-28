package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f5, float f6) {
            for (int i5 = 0; i5 < this.mVariants.size(); i5++) {
                if (this.mVariants.get(i5).match(f5, f6)) {
                    return i5;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Variant {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean match(float f5, float f6) {
            if (!Float.isNaN(this.mMinWidth) && f5 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f6 < this.mMinHeight) {
                return false;
            }
            if (!Float.isNaN(this.mMaxWidth) && f5 > this.mMaxWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMaxHeight) && f6 > this.mMaxHeight) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i5) {
        this.mConstraintLayout = constraintLayout;
        load(context, i5);
    }

    private void load(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            int eventType = xml.getEventType();
            State state = null;
            while (true) {
                char c5 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c5 = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c5 = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c5 = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c5 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c5 = 65535;
                            if (c5 != 2) {
                                if (c5 != 3) {
                                    if (c5 == 4) {
                                        parseConstraintSet(context, xml);
                                    }
                                } else {
                                    Variant variant = new Variant(context, xml);
                                    if (state != null) {
                                        state.add(variant);
                                    }
                                }
                            } else {
                                state = new State(context, xml);
                                this.mStateList.put(state.mId, state);
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        int i5;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeName = xmlPullParser.getAttributeName(i6);
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i5 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i5 = -1;
                }
                if (i5 == -1) {
                    if (attributeValue.length() > 1) {
                        i5 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(i5, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i5, float f5, float f6) {
        State state;
        int i6 = this.mCurrentStateId;
        if (i6 != i5) {
            return true;
        }
        if (i5 == -1) {
            state = this.mStateList.valueAt(0);
        } else {
            state = this.mStateList.get(i6);
        }
        State state2 = state;
        int i7 = this.mCurrentConstraintNumber;
        if ((i7 == -1 || !state2.mVariants.get(i7).match(f5, f6)) && this.mCurrentConstraintNumber != state2.findMatch(f5, f6)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public void updateConstraints(int i5, float f5, float f6) {
        ConstraintSet constraintSet;
        int i6;
        State state;
        int findMatch;
        ConstraintSet constraintSet2;
        int i7;
        int i8 = this.mCurrentStateId;
        if (i8 == i5) {
            if (i5 == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(i8);
            }
            int i9 = this.mCurrentConstraintNumber;
            if ((i9 != -1 && state.mVariants.get(i9).match(f5, f6)) || this.mCurrentConstraintNumber == (findMatch = state.findMatch(f5, f6))) {
                return;
            }
            if (findMatch == -1) {
                constraintSet2 = this.mDefaultConstraintSet;
            } else {
                constraintSet2 = state.mVariants.get(findMatch).mConstraintSet;
            }
            if (findMatch == -1) {
                i7 = state.mConstraintID;
            } else {
                i7 = state.mVariants.get(findMatch).mConstraintID;
            }
            if (constraintSet2 == null) {
                return;
            }
            this.mCurrentConstraintNumber = findMatch;
            ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
            if (constraintsChangedListener != null) {
                constraintsChangedListener.preLayoutChange(-1, i7);
            }
            constraintSet2.applyTo(this.mConstraintLayout);
            ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
            if (constraintsChangedListener2 != null) {
                constraintsChangedListener2.postLayoutChange(-1, i7);
                return;
            }
            return;
        }
        this.mCurrentStateId = i5;
        State state2 = this.mStateList.get(i5);
        int findMatch2 = state2.findMatch(f5, f6);
        if (findMatch2 == -1) {
            constraintSet = state2.mConstraintSet;
        } else {
            constraintSet = state2.mVariants.get(findMatch2).mConstraintSet;
        }
        if (findMatch2 == -1) {
            i6 = state2.mConstraintID;
        } else {
            i6 = state2.mVariants.get(findMatch2).mConstraintID;
        }
        if (constraintSet == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i5 + ", dim =" + f5 + ", " + f6);
            return;
        }
        this.mCurrentConstraintNumber = findMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i5, i6);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i5, i6);
        }
    }
}
