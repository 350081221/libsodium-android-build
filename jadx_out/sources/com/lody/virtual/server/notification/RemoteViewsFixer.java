package com.lody.virtual.server.notification;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.lody.virtual.R;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.VLog;
import mirror.RefConstructor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class RemoteViewsFixer {
    private static final boolean DEBUG = false;
    private static final String TAG = NotificationCompat.TAG;
    private NotificationCompat mNotificationCompat;
    private int notification_max_height;
    private int notification_mid_height;
    private int notification_min_height;
    private int notification_padding;
    private int notification_panel_width;
    private int notification_side_padding;
    private boolean init = false;
    private final WidthCompat mWidthCompat = new WidthCompat();

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteViewsFixer(NotificationCompat notificationCompat) {
        this.mNotificationCompat = notificationCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View apply(android.content.Context r10, android.widget.RemoteViews r11) {
        /*
            r9 = this;
            java.lang.String r0 = "setTagInternal"
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)     // Catch: java.lang.Exception -> L41
            int r5 = r11.getLayoutId()     // Catch: java.lang.Exception -> L41
            android.view.View r10 = r10.inflate(r5, r4, r3)     // Catch: java.lang.Exception -> L41
            com.lody.virtual.helper.utils.Reflect r5 = com.lody.virtual.helper.utils.Reflect.on(r10)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L34
            java.lang.String r7 = "com.android.internal.R$id"
            com.lody.virtual.helper.utils.Reflect r7 = com.lody.virtual.helper.utils.Reflect.on(r7)     // Catch: java.lang.Exception -> L34
            java.lang.String r8 = "widget_frame"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L34
            r6[r3] = r7     // Catch: java.lang.Exception -> L34
            int r7 = r11.getLayoutId()     // Catch: java.lang.Exception -> L34
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L34
            r6[r2] = r7     // Catch: java.lang.Exception -> L34
            r5.call(r0, r6)     // Catch: java.lang.Exception -> L34
            goto L4e
        L34:
            r5 = move-exception
            java.lang.String r6 = com.lody.virtual.server.notification.RemoteViewsFixer.TAG     // Catch: java.lang.Exception -> L3f
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3f
            r7[r3] = r5     // Catch: java.lang.Exception -> L3f
            com.lody.virtual.helper.utils.VLog.w(r6, r0, r7)     // Catch: java.lang.Exception -> L3f
            goto L4e
        L3f:
            r0 = move-exception
            goto L43
        L41:
            r0 = move-exception
            r10 = r4
        L43:
            java.lang.String r5 = com.lody.virtual.server.notification.RemoteViewsFixer.TAG
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r0
            java.lang.String r0 = "inflate"
            com.lody.virtual.helper.utils.VLog.w(r5, r0, r6)
        L4e:
            if (r10 == 0) goto La8
            com.lody.virtual.helper.utils.Reflect r11 = com.lody.virtual.helper.utils.Reflect.on(r11)
            java.lang.String r0 = "mActions"
            java.lang.Object r11 = r11.get(r0)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 == 0) goto La8
            java.lang.String r0 = com.lody.virtual.server.notification.RemoteViewsFixer.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "apply actions:"
            r5.append(r6)
            int r6 = r11.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.lody.virtual.helper.utils.VLog.d(r0, r5, r6)
            java.util.Iterator r11 = r11.iterator()
        L7e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r11.next()
            com.lody.virtual.helper.utils.Reflect r0 = com.lody.virtual.helper.utils.Reflect.on(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = "apply"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L9b
            r6[r3] = r10     // Catch: java.lang.Exception -> L9b
            r6[r2] = r4     // Catch: java.lang.Exception -> L9b
            r6[r1] = r4     // Catch: java.lang.Exception -> L9b
            r0.call(r5, r6)     // Catch: java.lang.Exception -> L9b
            goto L7e
        L9b:
            r0 = move-exception
            java.lang.String r5 = com.lody.virtual.server.notification.RemoteViewsFixer.TAG
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r0
            java.lang.String r0 = "apply action"
            com.lody.virtual.helper.utils.VLog.w(r5, r0, r6)
            goto L7e
        La8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.notification.RemoteViewsFixer.apply(android.content.Context, android.widget.RemoteViews):android.view.View");
    }

    private View createView(Context context, RemoteViews remoteViews, boolean z4) {
        int i5;
        if (remoteViews == null) {
            return null;
        }
        Context hostContext = this.mNotificationCompat.getHostContext();
        init(hostContext);
        if (z4) {
            i5 = this.notification_max_height;
        } else {
            i5 = this.notification_min_height;
        }
        int notificationWidth = this.mWidthCompat.getNotificationWidth(hostContext, this.notification_panel_width, i5, this.notification_side_padding);
        FrameLayout frameLayout = new FrameLayout(context);
        View apply = apply(context, remoteViews);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        frameLayout.addView(apply, layoutParams);
        if (apply instanceof ViewGroup) {
            VLog.v(TAG, "createView:fixTextView");
            fixTextView((ViewGroup) apply);
        }
        frameLayout.layout(0, 0, notificationWidth, i5);
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(notificationWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        frameLayout.layout(0, 0, notificationWidth, frameLayout.getMeasuredHeight());
        return frameLayout;
    }

    private void fixTextView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (isSingleLine(textView)) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(1);
                }
            } else if (childAt instanceof ViewGroup) {
                fixTextView((ViewGroup) childAt);
            }
        }
    }

    private int getDimem(Context context, Context context2, String str, int i5) {
        int identifier;
        if (context2 != null && (identifier = context2.getResources().getIdentifier(str, "dimen", "com.android.systemui")) != 0) {
            try {
                return Math.round(context2.getResources().getDimension(identifier));
            } catch (Exception unused) {
            }
        }
        if (i5 == 0) {
            return 0;
        }
        return Math.round(context.getResources().getDimension(i5));
    }

    private void init(Context context) {
        Context context2;
        if (this.init) {
            return;
        }
        this.init = true;
        if (this.notification_panel_width == 0) {
            try {
                context2 = context.createPackageContext("com.android.systemui", 2);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            this.notification_side_padding = getDimem(context, context2, "notification_side_padding", R.dimen.notification_side_padding);
            int dimem = getDimem(context, context2, "notification_panel_width", R.dimen.notification_panel_width);
            this.notification_panel_width = dimem;
            if (dimem <= 0) {
                this.notification_panel_width = context.getResources().getDisplayMetrics().widthPixels;
            }
            this.notification_min_height = getDimem(context, context2, "notification_min_height", R.dimen.notification_min_height);
            this.notification_max_height = getDimem(context, context2, "notification_max_height", R.dimen.notification_max_height);
            this.notification_mid_height = getDimem(context, context2, "notification_mid_height", R.dimen.notification_mid_height);
            this.notification_padding = getDimem(context, context2, "notification_padding", R.dimen.notification_padding);
        }
    }

    private boolean isSingleLine(TextView textView) {
        try {
            return ((Boolean) Reflect.on(textView).get("mSingleLine")).booleanValue();
        } catch (Exception unused) {
            if ((textView.getInputType() & 131072) != 0) {
                return true;
            }
            return false;
        }
    }

    Bitmap createBitmap(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public RemoteViews makeRemoteViews(String str, Context context, RemoteViews remoteViews, boolean z4, boolean z5) {
        int i5;
        RemoteViews remoteViews2;
        if (remoteViews == null) {
            return null;
        }
        PendIntentCompat pendIntentCompat = new PendIntentCompat(remoteViews);
        if (z5 && pendIntentCompat.findPendIntents() > 0) {
            i5 = R.layout.custom_notification;
        } else {
            i5 = R.layout.custom_notification_lite;
        }
        RefConstructor<RemoteViews> refConstructor = mirror.android.widget.RemoteViews.ctor;
        if (refConstructor != null) {
            remoteViews2 = refConstructor.newInstance(this.mNotificationCompat.getHostContext().getApplicationInfo(), Integer.valueOf(i5));
        } else {
            remoteViews2 = new RemoteViews(this.mNotificationCompat.getHostContext().getPackageName(), i5);
        }
        View view = toView(context, remoteViews, z4);
        remoteViews2.setImageViewBitmap(R.id.im_main, createBitmap(view));
        if (z5 && i5 == R.layout.custom_notification) {
            try {
                pendIntentCompat.setPendIntent(remoteViews2, toView(this.mNotificationCompat.getHostContext(), remoteViews2, z4), view);
            } catch (Exception e5) {
                VLog.e(TAG, "setPendIntent error", e5);
            }
        }
        return remoteViews2;
    }

    View toView(Context context, RemoteViews remoteViews, boolean z4) {
        try {
            return createView(context, remoteViews, z4);
        } catch (Throwable unused) {
            try {
                return LayoutInflater.from(context).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            } catch (Throwable unused2) {
                return null;
            }
        }
    }
}
