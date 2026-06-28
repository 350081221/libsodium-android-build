package com.yuanqi.master.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import com.yqtech.multiapp.R;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 42\u00020\u0001:\u000245B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J0\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0014J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0014J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\"H\u0002J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\bJ\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\"H\u0016J\u000e\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0011J\u000e\u00103\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, d2 = {"Lcom/yuanqi/master/view/VerificationCodeText;", "Landroid/view/ViewGroup;", d.X, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "box", "", "boxBgFocus", "Landroid/graphics/drawable/Drawable;", "boxBgNormal", "boxHeight", "boxWidth", "childHPadding", "childVPadding", "inputType", "", "listener", "Lcom/yuanqi/master/view/VerificationCodeText$Listener;", "screenWidth", "getScreenWidth", "()I", "backFocus", "", "checkAndCommit", "focus", "generateLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "initViews", "onAttachedToWindow", "onDetachedFromWindow", "onLayout", "changed", "", "l", bi.aL, "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBg", "editText", "Landroid/widget/EditText;", "setBox", "boxNum", "setEnabled", "enabled", "setInputType", "type", "setOnCompleteListener", "Companion", "Listener", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerificationCodeText extends ViewGroup {

    /* renamed from: j, reason: collision with root package name */
    @l
    public static final a f15277j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f15278k = 8;

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final String f15279l = "number";

    /* renamed from: m, reason: collision with root package name */
    @l
    private static final String f15280m = "text";

    /* renamed from: n, reason: collision with root package name */
    @l
    private static final String f15281n = "password";

    /* renamed from: o, reason: collision with root package name */
    @l
    private static final String f15282o = "phone";

    /* renamed from: p, reason: collision with root package name */
    @l
    private static final String f15283p = "VerificationCodeInput";

    /* renamed from: a, reason: collision with root package name */
    private int f15284a;

    /* renamed from: b, reason: collision with root package name */
    private int f15285b;

    /* renamed from: c, reason: collision with root package name */
    private int f15286c;

    /* renamed from: d, reason: collision with root package name */
    private int f15287d;

    /* renamed from: e, reason: collision with root package name */
    private int f15288e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private String f15289f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private Drawable f15290g;

    /* renamed from: h, reason: collision with root package name */
    @m
    private Drawable f15291h;

    /* renamed from: i, reason: collision with root package name */
    @m
    private b f15292i;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/view/VerificationCodeText$Companion;", "", "()V", "TAG", "", "TYPE_NUMBER", "TYPE_PASSWORD", "TYPE_PHONE", "TYPE_TEXT", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/yuanqi/master/view/VerificationCodeText$Listener;", "", "onComplete", "", "content", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b {
        void a(@l String str);
    }

    @i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/yuanqi/master/view/VerificationCodeText$initViews$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", bi.aE, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l Editable s5) {
            l0.p(s5, "s");
            if (s5.length() != 0) {
                VerificationCodeText.this.f();
                VerificationCodeText.this.e();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l CharSequence s5, int i5, int i6, int i7) {
            l0.p(s5, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l CharSequence s5, int i5, int i6, int i7) {
            l0.p(s5, "s");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationCodeText(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        l0.p(context, "context");
        this.f15284a = 6;
        this.f15285b = 120;
        this.f15286c = 120;
        this.f15287d = 14;
        this.f15288e = 14;
        this.f15289f = f15279l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VerificationCodeText);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f15284a = obtainStyledAttributes.getInt(0, 6);
        this.f15287d = (int) obtainStyledAttributes.getDimension(3, 0.0f);
        this.f15288e = (int) obtainStyledAttributes.getDimension(5, 0.0f);
        this.f15290g = obtainStyledAttributes.getDrawable(1);
        this.f15291h = obtainStyledAttributes.getDrawable(2);
        String string = obtainStyledAttributes.getString(7);
        this.f15289f = string == null ? f15280m : string;
        this.f15285b = (int) obtainStyledAttributes.getDimension(6, this.f15285b);
        this.f15286c = (int) obtainStyledAttributes.getDimension(4, this.f15286c);
        g();
    }

    private final void d() {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            l0.n(childAt, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) childAt;
            if (editText.getText().length() == 1) {
                editText.requestFocus();
                editText.setSelection(1);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        boolean z4;
        b bVar;
        StringBuilder sb = new StringBuilder();
        int i5 = this.f15284a;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                View childAt = getChildAt(i6);
                l0.n(childAt, "null cannot be cast to non-null type android.widget.EditText");
                String obj = ((EditText) childAt).getText().toString();
                if (obj.length() == 0) {
                    z4 = false;
                    break;
                } else {
                    sb.append(obj);
                    i6++;
                }
            } else {
                z4 = true;
                break;
            }
        }
        Log.d(f15283p, "checkAndCommit:" + ((Object) sb));
        if (z4 && (bVar = this.f15292i) != null) {
            l0.m(bVar);
            String sb2 = sb.toString();
            l0.o(sb2, "toString(...)");
            bVar.a(sb2);
            setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            l0.n(childAt, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) childAt;
            if (editText.getText().length() < 1) {
                editText.requestFocus();
                return;
            }
        }
    }

    private final void g() {
        TextWatcher cVar = new c();
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: com.yuanqi.master.view.a
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
                boolean h5;
                h5 = VerificationCodeText.h(VerificationCodeText.this, view, i5, keyEvent);
                return h5;
            }
        };
        int i5 = this.f15284a;
        for (int i6 = 0; i6 < i5; i6++) {
            EditText editText = new EditText(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f15285b, this.f15286c);
            int i7 = this.f15288e;
            layoutParams.bottomMargin = i7;
            layoutParams.topMargin = i7;
            int i8 = this.f15287d;
            layoutParams.leftMargin = i8;
            layoutParams.rightMargin = i8;
            layoutParams.gravity = 17;
            editText.setOnKeyListener(onKeyListener);
            i(editText, false);
            editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            editText.setLayoutParams(layoutParams);
            editText.setGravity(17);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
            if (l0.g(f15279l, this.f15289f)) {
                editText.setInputType(2);
            } else if (l0.g("password", this.f15289f)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else if (l0.g(f15280m, this.f15289f)) {
                editText.setInputType(1);
            } else if (l0.g("phone", this.f15289f)) {
                editText.setInputType(3);
            }
            editText.setId(i6);
            editText.setEms(1);
            editText.addTextChangedListener(cVar);
            addView(editText, i6);
        }
    }

    private final int getScreenWidth() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(VerificationCodeText this$0, View view, int i5, KeyEvent keyEvent) {
        l0.p(this$0, "this$0");
        if (i5 == 67) {
            this$0.d();
            return false;
        }
        return false;
    }

    private final void i(EditText editText, boolean z4) {
        Drawable drawable = this.f15291h;
        if (drawable != null && !z4) {
            editText.setBackground(drawable);
            return;
        }
        Drawable drawable2 = this.f15290g;
        if (drawable2 != null && z4) {
            editText.setBackground(drawable2);
        }
    }

    @Override // android.view.ViewGroup
    @l
    public ViewGroup.LayoutParams generateLayoutParams(@l AttributeSet attrs) {
        l0.p(attrs, "attrs");
        return new LinearLayout.LayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        Log.d(VerificationCodeText.class.getName(), "onLayout width = " + getMeasuredWidth());
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.setVisibility(0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = this.f15287d;
            int i11 = i10 + ((measuredWidth + i10) * i9);
            int i12 = this.f15288e;
            childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth == -1) {
            measuredWidth = getScreenWidth();
        }
        Log.d(VerificationCodeText.class.getName(), "onMeasure width " + measuredWidth);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            measureChild(getChildAt(i7), i5, i6);
        }
        if (childCount > 0) {
            View childAt = getChildAt(0);
            int measuredWidth2 = childAt.getMeasuredWidth();
            if (measuredWidth != -2) {
                this.f15287d = (measuredWidth - (measuredWidth2 * childCount)) / (childCount + 1);
            }
            setMeasuredDimension(View.resolveSize((measuredWidth2 * childCount) + (this.f15287d * (childCount + 1)), i5), View.resolveSize(childAt.getMeasuredHeight() + (this.f15288e * 2), i6));
        }
    }

    public final void setBox(int i5) {
        this.f15284a = i5;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setEnabled(z4);
        }
    }

    public final void setInputType(@l String type) {
        l0.p(type, "type");
        this.f15289f = type;
    }

    public final void setOnCompleteListener(@l b listener) {
        l0.p(listener, "listener");
        this.f15292i = listener;
    }
}
