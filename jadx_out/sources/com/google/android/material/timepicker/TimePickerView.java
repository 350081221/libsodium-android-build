package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout implements TimePickerControls {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    /* loaded from: classes2.dex */
    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface OnPeriodChangeListener {
        void onPeriodChange(int i5);
    }

    /* loaded from: classes2.dex */
    interface OnSelectionChange {
        void onSelectionChanged(int i5);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z4) {
        OnPeriodChangeListener onPeriodChangeListener;
        int i6;
        if (z4 && (onPeriodChangeListener = this.onPeriodChangeListener) != null) {
            if (i5 == R.id.material_clock_period_pm_button) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            onPeriodChangeListener.onPeriodChange(i6);
        }
    }

    private void setUpDisplay() {
        Chip chip = this.minuteView;
        int i5 = R.id.selection_type;
        chip.setTag(i5, 12);
        this.hourView.setTag(i5, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName("android.view.View");
        this.hourView.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener onDoubleTapListener = TimePickerView.this.onDoubleTapListener;
                if (onDoubleTapListener != null) {
                    onDoubleTapListener.onDoubleTap();
                    return true;
                }
                return false;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.minuteView.setOnTouchListener(onTouchListener);
        this.hourView.setOnTouchListener(onTouchListener);
    }

    private void updateSelection(Chip chip, boolean z4) {
        int i5;
        chip.setChecked(z4);
        if (z4) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        ViewCompat.setAccessibilityLiveRegion(chip, i5);
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
        this.clockHandView.addOnRotateListener(onRotateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurrentLevel() {
        return this.clockFace.getCurrentLevel();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (view == this && i5 == 0) {
            this.hourView.sendAccessibilityEvent(8);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i5) {
        boolean z4;
        Chip chip = this.minuteView;
        boolean z5 = true;
        if (i5 == 12) {
            z4 = true;
        } else {
            z4 = false;
        }
        updateSelection(chip, z4);
        Chip chip2 = this.hourView;
        if (i5 != 10) {
            z5 = false;
        }
        updateSelection(chip2, z5);
    }

    public void setAnimateOnTouchUp(boolean z4) {
        this.clockHandView.setAnimateOnTouchUp(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCurrentLevel(int i5) {
        this.clockFace.setCurrentLevel(i5);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f5) {
        this.clockHandView.setHandRotation(f5);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.minuteView, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.hourView, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnDoubleTapListener(@Nullable OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
        this.onPeriodChangeListener = onPeriodChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
        this.onSelectionChangeListener = onSelectionChange;
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, @StringRes int i5) {
        this.clockFace.setValues(strArr, i5);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i5, int i6, int i7) {
        int i8;
        if (i5 == 1) {
            i8 = R.id.material_clock_period_pm_button;
        } else {
            i8 = R.id.material_clock_period_am_button;
        }
        this.toggle.check(i8);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i7));
        String format2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i6));
        if (!TextUtils.equals(this.minuteView.getText(), format)) {
            this.minuteView.setText(format);
        }
        if (!TextUtils.equals(this.hourView.getText(), format2)) {
            this.hourView.setText(format2);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f5, boolean z4) {
        this.clockHandView.setHandRotation(f5, z4);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.selectionListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimePickerView.this.onSelectionChangeListener != null) {
                    TimePickerView.this.onSelectionChangeListener.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.clockFace = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i6, boolean z4) {
                TimePickerView.this.lambda$new$0(materialButtonToggleGroup2, i6, z4);
            }
        });
        this.minuteView = (Chip) findViewById(R.id.material_minute_tv);
        this.hourView = (Chip) findViewById(R.id.material_hour_tv);
        this.clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        setupDoubleTap();
        setUpDisplay();
    }
}
