package com.lody.virtual.server.notification;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lody.virtual.helper.compat.BuildCompat;

/* loaded from: classes3.dex */
class WidthCompat {
    private static final String TAG = "WidthCompat";
    private volatile int mWidth = 0;

    private ViewGroup createViewGroup(Context context, int i5) {
        try {
            return (ViewGroup) LayoutInflater.from(context).inflate(i5, (ViewGroup) null);
        } catch (Throwable unused) {
            return new FrameLayout(context);
        }
    }

    private int getDefaultWidth(int i5, int i6) {
        return i5 - (i6 * 2);
    }

    private int getEMUINotificationWidth(Context context, int i5, int i6) {
        try {
            Context createPackageContext = context.createPackageContext("com.android.systemui", 3);
            int systemId = getSystemId(createPackageContext, "time_axis", "layout");
            if (systemId != 0) {
                ViewGroup createViewGroup = createViewGroup(createPackageContext, systemId);
                layout(createViewGroup, i5, i6);
                int systemId2 = getSystemId(createPackageContext, "content_view_group", "id");
                if (systemId2 != 0) {
                    View findViewById = createViewGroup.findViewById(systemId2);
                    return ((i5 - findViewById.getLeft()) - findViewById.getPaddingLeft()) - findViewById.getPaddingRight();
                }
                int childCount = createViewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = createViewGroup.getChildAt(i7);
                    if (LinearLayout.class.isInstance(childAt)) {
                        return ((i5 - childAt.getLeft()) - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i5;
    }

    private int getMIUINotificationWidth(Context context, int i5, int i6) {
        try {
            Context createPackageContext = context.createPackageContext("com.android.systemui", 3);
            int systemId = getSystemId(createPackageContext, "status_bar_notification_row", "layout");
            if (systemId != 0) {
                ViewGroup createViewGroup = createViewGroup(createPackageContext, systemId);
                int systemId2 = getSystemId(createPackageContext, "adaptive", "id");
                if (systemId2 == 0) {
                    systemId2 = getSystemId(createPackageContext, "content", "id");
                } else {
                    View findViewById = createViewGroup.findViewById(systemId2);
                    if (findViewById != null && (findViewById instanceof ViewGroup)) {
                        ((ViewGroup) findViewById).addView(new View(createPackageContext));
                    }
                }
                layout(createViewGroup, i5, i6);
                if (systemId2 != 0) {
                    View findViewById2 = createViewGroup.findViewById(systemId2);
                    if (findViewById2 != null) {
                        return ((i5 - findViewById2.getLeft()) - findViewById2.getPaddingLeft()) - findViewById2.getPaddingRight();
                    }
                } else {
                    int childCount = createViewGroup.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = createViewGroup.getChildAt(i7);
                        if (!FrameLayout.class.isInstance(childAt) && !"LatestItemView".equals(childAt.getClass().getName()) && !"SizeAdaptiveLayout".equals(childAt.getClass().getName())) {
                        }
                        return ((i5 - childAt.getLeft()) - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i5;
    }

    private int getSystemId(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, "com.android.systemui");
    }

    private void layout(View view, int i5, int i6) {
        view.layout(0, 0, i5, i6);
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        view.layout(0, 0, i5, i6);
    }

    public int getNotificationWidth(Context context, int i5, int i6, int i7) {
        if (this.mWidth > 0) {
            return this.mWidth;
        }
        int defaultWidth = getDefaultWidth(i5, i7);
        if (BuildCompat.isEMUI()) {
            defaultWidth = getEMUINotificationWidth(context, i5, i6);
        } else if (BuildCompat.isMIUI()) {
            defaultWidth = getMIUINotificationWidth(context, i5 - (Math.round(TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics())) * 2), i6);
        }
        this.mWidth = defaultWidth;
        return defaultWidth;
    }
}
