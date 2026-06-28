package com.bytedance.sdk.openadsdk.live;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.base.api.ILiveHostContextParam;
import com.bytedance.android.live.base.api.ILiveInitCallback;
import com.bytedance.android.live.base.api.IOuterLiveService;
import com.bytedance.android.openliveplugin.LivePluginHelper;

/* loaded from: classes2.dex */
public class b {
    public static boolean a(Context context, String str, ILiveHostContextParam.Builder builder, ILiveInitCallback iLiveInitCallback, boolean z4) {
        try {
            LivePluginHelper.initLive((Application) context, str, builder, iLiveInitCallback, z4);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean a() {
        try {
            com.bytedance.sdk.openadsdk.e.a.a().b(new Runnable() { // from class: com.bytedance.sdk.openadsdk.live.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LivePluginHelper.initLiveCommerce();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, Bundle bundle) {
        if (context != null && bundle != null && bundle.containsKey("room_id")) {
            long j5 = bundle.getLong("room_id");
            try {
                IOuterLiveService liveRoomService = LivePluginHelper.getLiveRoomService();
                if (liveRoomService == null) {
                    return false;
                }
                liveRoomService.enterLiveRoom(context, j5, bundle);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(Context context, Uri uri) {
        if (context != null && uri != null) {
            try {
                IOuterLiveService liveRoomService = LivePluginHelper.getLiveRoomService();
                if (liveRoomService != null) {
                    return liveRoomService.handleSchema(context, uri);
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
