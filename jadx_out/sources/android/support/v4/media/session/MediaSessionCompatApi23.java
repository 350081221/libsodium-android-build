package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompatApi21;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes.dex */
class MediaSessionCompatApi23 {

    /* loaded from: classes.dex */
    public interface Callback extends MediaSessionCompatApi21.Callback {
        void onPlayFromUri(Uri uri, Bundle bundle);
    }

    /* loaded from: classes.dex */
    static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi21.CallbackProxy<T> {
        public CallbackProxy(T t5) {
            super(t5);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((Callback) this.mCallback).onPlayFromUri(uri, bundle);
        }
    }

    private MediaSessionCompatApi23() {
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }
}
