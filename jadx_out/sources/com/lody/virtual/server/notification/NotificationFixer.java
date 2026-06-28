package com.lody.virtual.server.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.widget.RemoteViews;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.BitmapUtils;
import com.lody.virtual.helper.utils.Reflect;
import java.util.ArrayList;
import mirror.com.android.internal.R_Hide;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class NotificationFixer {
    private static final String TAG = NotificationCompat.TAG;
    private NotificationCompat mNotificationCompat;

    /* loaded from: classes3.dex */
    private static class BitmapReflectionAction {
        Bitmap bitmap;
        String methodName;
        int viewId;

        BitmapReflectionAction(int i5, String str, Bitmap bitmap) {
            this.viewId = i5;
            this.methodName = str;
            this.bitmap = bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationFixer(NotificationCompat notificationCompat) {
        this.mNotificationCompat = notificationCompat;
    }

    private static void fixNotificationIcon(Context context, Notification notification, Notification.Builder builder) {
        Bitmap drawableToBitmap;
        Bitmap drawableToBitmap2;
        Icon smallIcon = notification.getSmallIcon();
        if (smallIcon != null && (drawableToBitmap2 = BitmapUtils.drawableToBitmap(smallIcon.loadDrawable(context))) != null) {
            builder.setSmallIcon(Icon.createWithBitmap(drawableToBitmap2));
        }
        Icon largeIcon = notification.getLargeIcon();
        if (largeIcon != null && (drawableToBitmap = BitmapUtils.drawableToBitmap(largeIcon.loadDrawable(context))) != null) {
            builder.setLargeIcon(Icon.createWithBitmap(drawableToBitmap));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(23)
    public void fixIcon(Icon icon, Context context, boolean z4) {
        if (icon != null && mirror.android.graphics.drawable.Icon.mType.get(icon).intValue() == 2) {
            if (z4) {
                mirror.android.graphics.drawable.Icon.mObj1.set(icon, context.getResources());
                mirror.android.graphics.drawable.Icon.mString1.set(icon, context.getPackageName());
            } else {
                mirror.android.graphics.drawable.Icon.mObj1.set(icon, BitmapUtils.drawableToBitmap(icon.loadDrawable(context)));
                mirror.android.graphics.drawable.Icon.mString1.set(icon, null);
                mirror.android.graphics.drawable.Icon.mType.set(icon, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fixIconImage(Resources resources, RemoteViews remoteViews, boolean z4, Notification notification) {
        Bitmap bitmap;
        if (remoteViews == null || notification.icon == 0 || !this.mNotificationCompat.isSystemLayout(remoteViews)) {
            return;
        }
        try {
            int i5 = R_Hide.id.icon.get();
            if (!z4 && notification.largeIcon == null) {
                try {
                    Drawable drawable = resources.getDrawable(notification.icon);
                    drawable.setLevel(notification.iconLevel);
                    bitmap = BitmapUtils.drawableToBitmap(drawable);
                } catch (Throwable unused) {
                    bitmap = null;
                }
                remoteViews.setImageViewBitmap(i5, bitmap);
                if (BuildCompat.isEMUI() && notification.largeIcon == null) {
                    notification.largeIcon = bitmap;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public void fixNotificationRemoteViews(Context context, Notification notification) {
        Notification.Builder builder;
        try {
            builder = (Notification.Builder) Reflect.on((Class<?>) Notification.Builder.class).create(context, notification).get();
        } catch (Exception unused) {
            builder = null;
        }
        if (builder != null) {
            Notification build = builder.build();
            if (notification.tickerView == null) {
                notification.tickerView = build.tickerView;
            }
            if (notification.contentView == null) {
                notification.contentView = build.contentView;
            }
            if (notification.bigContentView == null) {
                notification.bigContentView = build.bigContentView;
            }
            if (notification.headsUpContentView == null) {
                notification.headsUpContentView = build.headsUpContentView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean fixRemoteViewActions(Context context, boolean z4, RemoteViews remoteViews) {
        if (remoteViews != null) {
            int i5 = R_Hide.id.icon.get();
            ArrayList<BitmapReflectionAction> arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) Reflect.on(remoteViews).get("mActions");
            if (arrayList2 != null) {
                boolean z5 = false;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    Object obj = arrayList2.get(size);
                    if (obj != null) {
                        if (obj.getClass().getSimpleName().endsWith("TextViewDrawableAction")) {
                            arrayList2.remove(obj);
                        } else if (ReflectionActionCompat.isInstance(obj)) {
                            int intValue = ((Integer) Reflect.on(obj).get("viewId")).intValue();
                            String str = (String) Reflect.on(obj).get("methodName");
                            int intValue2 = ((Integer) Reflect.on(obj).get("type")).intValue();
                            Object obj2 = Reflect.on(obj).get(b.f22420d);
                            if (!z5) {
                                if (intValue == i5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5 && intValue2 == 4 && ((Integer) obj2).intValue() == 0) {
                                    z5 = false;
                                }
                            }
                            if (str.equals("setImageResource")) {
                                arrayList.add(new BitmapReflectionAction(intValue, "setImageBitmap", BitmapUtils.drawableToBitmap(context.getResources().getDrawable(((Integer) obj2).intValue()))));
                                arrayList2.remove(obj);
                            } else if (str.equals("setText") && intValue2 == 4) {
                                Reflect.on(obj).set("type", 9);
                                Reflect.on(obj).set(b.f22420d, context.getResources().getString(((Integer) obj2).intValue()));
                            } else if (str.equals("setLabelFor")) {
                                arrayList2.remove(obj);
                            } else if (str.equals("setBackgroundResource")) {
                                arrayList2.remove(obj);
                            } else if (str.equals("setImageURI")) {
                                if (!((Uri) obj2).getScheme().startsWith("http")) {
                                    arrayList2.remove(obj);
                                }
                            } else if (obj2 instanceof Icon) {
                                fixIcon((Icon) obj2, context, z4);
                            }
                        }
                    }
                }
                for (BitmapReflectionAction bitmapReflectionAction : arrayList) {
                    remoteViews.setBitmap(bitmapReflectionAction.viewId, bitmapReflectionAction.methodName, bitmapReflectionAction.bitmap);
                }
                return z5;
            }
        }
        return false;
    }
}
