package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

@RequiresApi(22)
/* loaded from: classes.dex */
class PlaybackStateCompatApi22 {
    private PlaybackStateCompatApi22() {
    }

    public static Bundle getExtras(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }

    public static Object newInstance(int i5, long j5, long j6, float f5, long j7, CharSequence charSequence, long j8, List<Object> list, long j9, Bundle bundle) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i5, j5, f5, j8);
        builder.setBufferedPosition(j6);
        builder.setActions(j7);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j9);
        builder.setExtras(bundle);
        return builder.build();
    }
}
