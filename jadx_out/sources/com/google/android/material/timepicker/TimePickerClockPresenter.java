package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* loaded from: classes2.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    private String[] getHourClockValues() {
        return this.time.format == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    private int getHourRotation() {
        return (this.time.getHourForDisplay() * 30) % 360;
    }

    private void performHapticFeedback(int i5, int i6) {
        TimeModel timeModel = this.time;
        if (timeModel.minute != i6 || timeModel.hour != i5) {
            this.timePickerView.performHapticFeedback(4);
        }
    }

    private void updateCurrentLevel() {
        TimeModel timeModel = this.time;
        int i5 = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            i5 = 2;
        }
        this.timePickerView.setCurrentLevel(i5);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f5, boolean z4) {
        boolean z5;
        this.broadcasting = true;
        TimeModel timeModel = this.time;
        int i5 = timeModel.minute;
        int i6 = timeModel.hour;
        if (timeModel.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.timePickerView.getContext(), AccessibilityManager.class);
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                setSelection(12, true);
            }
        } else {
            int round = Math.round(f5);
            if (!z4) {
                this.time.setMinute(((round + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z4);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i6, i5);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i5) {
        this.time.setPeriod(i5);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f5, boolean z4) {
        if (this.broadcasting) {
            return;
        }
        TimeModel timeModel = this.time;
        int i5 = timeModel.hour;
        int i6 = timeModel.minute;
        int round = Math.round(f5);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            timeModel2.setMinute((round + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            int i7 = (round + 15) / 30;
            if (timeModel2.format == 1) {
                i7 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    i7 += 12;
                }
            }
            this.time.setHour(i7);
            this.hourRotation = getHourRotation();
        }
        if (!z4) {
            updateTime();
            performHapticFeedback(i5, i6);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i5) {
        setSelection(i5, true);
    }

    void setSelection(int i5, boolean z4) {
        boolean z5;
        String[] hourClockValues;
        int hourContentDescriptionResId;
        float f5;
        if (i5 == 12) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.timePickerView.setAnimateOnTouchUp(z5);
        this.time.selection = i5;
        TimePickerView timePickerView = this.timePickerView;
        if (z5) {
            hourClockValues = MINUTE_CLOCK_VALUES;
        } else {
            hourClockValues = getHourClockValues();
        }
        if (z5) {
            hourContentDescriptionResId = R.string.material_minute_suffix;
        } else {
            hourContentDescriptionResId = this.time.getHourContentDescriptionResId();
        }
        timePickerView.setValues(hourClockValues, hourContentDescriptionResId);
        updateCurrentLevel();
        TimePickerView timePickerView2 = this.timePickerView;
        if (z5) {
            f5 = this.minuteRotation;
        } else {
            f5 = this.hourRotation;
        }
        timePickerView2.setHandRotation(f5, z4);
        this.timePickerView.setActiveSelection(i5);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(TimePickerClockPresenter.this.time.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    private void updateValues(String[] strArr, String str) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i5], str);
        }
    }
}
