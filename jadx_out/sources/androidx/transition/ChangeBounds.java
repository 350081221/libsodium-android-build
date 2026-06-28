package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY;
    private static final Property<View, PointF> POSITION_PROPERTY;
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY;
    private boolean mResizeClip;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private static final RectEvaluator sRectEvaluator = new RectEvaluator();

    /* loaded from: classes2.dex */
    private static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        ClipListener(View view, Rect rect, boolean z4, Rect rect2, boolean z5, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z4;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z5;
            this.mStartLeft = i5;
            this.mStartTop = i6;
            this.mStartRight = i7;
            this.mStartBottom = i8;
            this.mEndLeft = i9;
            this.mEndTop = i10;
            this.mEndRight = i11;
            this.mEndBottom = i12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            Rect rect;
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            if (this.mEndClipIsNull) {
                rect = null;
            } else {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            View view = this.mView;
            int i5 = R.id.transition_clip;
            Rect rect = (Rect) view.getTag(i5);
            this.mView.setTag(i5, null);
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z4) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z4) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
            if (z4) {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
            } else {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z4) {
            int max = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int max2 = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            int i5 = z4 ? this.mEndLeft : this.mStartLeft;
            int i6 = z4 ? this.mEndTop : this.mStartTop;
            ViewUtils.setLeftTopRightBottom(this.mView, i5, i6, max + i5, max2 + i6);
            this.mView.setClipBounds(z4 ? this.mEndClip : this.mStartClip);
        }
    }

    /* loaded from: classes2.dex */
    private static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean mCanceled = false;
        final ViewGroup mParent;

        SuppressLayoutListener(@NonNull ViewGroup viewGroup) {
            this.mParent = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
            this.mCanceled = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            if (!this.mCanceled) {
                ViewGroupUtils.suppressLayout(this.mParent, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final View mView;

        ViewBounds(View view) {
            this.mView = view;
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }

        void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            int i5 = this.mBottomRightCalls + 1;
            this.mBottomRightCalls = i5;
            if (this.mTopLeftCalls == i5) {
                setLeftTopRightBottom();
            }
        }

        void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            int i5 = this.mTopLeftCalls + 1;
            this.mTopLeftCalls = i5;
            if (i5 == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setTopLeft(pointF);
            }
        };
        String str2 = "bottomRight";
        BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setBottomRight(pointF);
            }
        };
        BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
        POSITION_PROPERTY = new Property<View, PointF>(cls, "position") { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                ViewUtils.setLeftTopRightBottom(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
            }
        };
    }

    public ChangeBounds() {
        this.mResizeClip = false;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
            if (this.mResizeClip) {
                transitionValues.values.put(PROPNAME_CLIP, view.getClipBounds());
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        Rect rect;
        captureValues(transitionValues);
        if (this.mResizeClip && (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) != null) {
            transitionValues.values.put(PROPNAME_CLIP, rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i5;
        int i6;
        int i7;
        int i8;
        ObjectAnimator ofPointF;
        boolean z4;
        int i9;
        Rect rect;
        boolean z5;
        Rect rect2;
        View view;
        ObjectAnimator objectAnimator;
        Animator mergeAnimators;
        if (transitionValues != null && transitionValues2 != null) {
            Map<String, Object> map = transitionValues.values;
            Map<String, Object> map2 = transitionValues2.values;
            ViewGroup viewGroup2 = (ViewGroup) map.get(PROPNAME_PARENT);
            ViewGroup viewGroup3 = (ViewGroup) map2.get(PROPNAME_PARENT);
            if (viewGroup2 != null && viewGroup3 != null) {
                View view2 = transitionValues2.view;
                Rect rect3 = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
                Rect rect4 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
                int i10 = rect3.left;
                int i11 = rect4.left;
                int i12 = rect3.top;
                int i13 = rect4.top;
                int i14 = rect3.right;
                int i15 = rect4.right;
                int i16 = rect3.bottom;
                int i17 = rect4.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                Rect rect5 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
                Rect rect6 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
                if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
                    if (i10 == i11 && i12 == i13) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    if (i14 != i15 || i16 != i17) {
                        i5++;
                    }
                } else {
                    i5 = 0;
                }
                if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                    i5++;
                }
                int i22 = i5;
                if (i22 > 0) {
                    if (!this.mResizeClip) {
                        ViewUtils.setLeftTopRightBottom(view2, i10, i12, i14, i16);
                        if (i22 == 2) {
                            if (i18 == i20 && i19 == i21) {
                                mergeAnimators = ObjectAnimatorUtils.ofPointF(view2, POSITION_PROPERTY, getPathMotion().getPath(i10, i12, i11, i13));
                            } else {
                                ViewBounds viewBounds = new ViewBounds(view2);
                                ObjectAnimator ofPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath(i10, i12, i11, i13));
                                ObjectAnimator ofPointF3 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath(i14, i16, i15, i17));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofPointF2, ofPointF3);
                                animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                                    private final ViewBounds mViewBounds;
                                    final /* synthetic */ ViewBounds val$viewBounds;

                                    {
                                        this.val$viewBounds = viewBounds;
                                        this.mViewBounds = viewBounds;
                                    }
                                });
                                view = view2;
                                mergeAnimators = animatorSet;
                            }
                        } else if (i10 == i11 && i12 == i13) {
                            mergeAnimators = ObjectAnimatorUtils.ofPointF(view2, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath(i14, i16, i15, i17));
                        } else {
                            mergeAnimators = ObjectAnimatorUtils.ofPointF(view2, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath(i10, i12, i11, i13));
                        }
                        view = view2;
                    } else {
                        ViewUtils.setLeftTopRightBottom(view2, i10, i12, Math.max(i18, i20) + i10, i12 + Math.max(i19, i21));
                        if (i10 == i11 && i12 == i13) {
                            i6 = i17;
                            i7 = i15;
                            i8 = i14;
                            ofPointF = null;
                        } else {
                            i6 = i17;
                            i7 = i15;
                            i8 = i14;
                            ofPointF = ObjectAnimatorUtils.ofPointF(view2, POSITION_PROPERTY, getPathMotion().getPath(i10, i12, i11, i13));
                        }
                        if (rect5 == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i9 = 0;
                            rect = new Rect(0, 0, i18, i19);
                        } else {
                            i9 = 0;
                            rect = rect5;
                        }
                        if (rect6 == null) {
                            z5 = 1;
                        } else {
                            z5 = i9;
                        }
                        if (z5 != 0) {
                            rect2 = new Rect(i9, i9, i20, i21);
                        } else {
                            rect2 = rect6;
                        }
                        if (!rect.equals(rect2)) {
                            view2.setClipBounds(rect);
                            RectEvaluator rectEvaluator = sRectEvaluator;
                            Object[] objArr = new Object[2];
                            objArr[i9] = rect;
                            objArr[1] = rect2;
                            ObjectAnimator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", rectEvaluator, objArr);
                            view = view2;
                            ClipListener clipListener = new ClipListener(view2, rect, z4, rect2, z5, i10, i12, i8, i16, i11, i13, i7, i6);
                            ofObject.addListener(clipListener);
                            addListener(clipListener);
                            objectAnimator = ofObject;
                            ofPointF = ofPointF;
                        } else {
                            view = view2;
                            objectAnimator = null;
                        }
                        mergeAnimators = TransitionUtils.mergeAnimators(ofPointF, objectAnimator);
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        ViewGroupUtils.suppressLayout(viewGroup4, true);
                        getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
                    }
                    return mergeAnimators;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public void setResizeClip(boolean z4) {
        this.mResizeClip = z4;
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mResizeClip = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}
