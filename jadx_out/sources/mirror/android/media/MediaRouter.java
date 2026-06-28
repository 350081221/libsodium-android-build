package mirror.android.media;

import android.os.IInterface;
import mirror.RefClass;
import mirror.RefObject;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class MediaRouter {
    public static Class<?> TYPE = RefClass.load(MediaRouter.class, (Class<?>) android.media.MediaRouter.class);
    public static RefStaticObject sStatic;

    /* loaded from: classes4.dex */
    public static class Static {
        public static Class<?> TYPE = RefClass.load((Class<?>) Static.class, "android.media.MediaRouter$Static");
        public static RefObject<IInterface> mAudioService;
    }

    /* loaded from: classes4.dex */
    public static class StaticKitkat {
        public static Class<?> TYPE = RefClass.load((Class<?>) StaticKitkat.class, "android.media.MediaRouter$Static");
        public static RefObject<IInterface> mMediaRouterService;
    }
}
