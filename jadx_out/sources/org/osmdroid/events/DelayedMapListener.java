package org.osmdroid.events;

import android.os.Handler;
import android.util.Log;
import org.osmdroid.api.IMapView;

/* loaded from: classes4.dex */
public class DelayedMapListener implements MapListener {
    protected static final int DEFAULT_DELAY = 100;
    protected CallbackTask callback;
    protected long delay;
    protected Handler handler;
    MapListener wrappedListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class CallbackTask implements Runnable {
        private final MapEvent event;

        public CallbackTask(MapEvent mapEvent) {
            this.event = mapEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapEvent mapEvent = this.event;
            if (mapEvent instanceof ScrollEvent) {
                DelayedMapListener.this.wrappedListener.onScroll((ScrollEvent) mapEvent);
                return;
            }
            if (mapEvent instanceof ZoomEvent) {
                DelayedMapListener.this.wrappedListener.onZoom((ZoomEvent) mapEvent);
                return;
            }
            Log.d(IMapView.LOGTAG, "Unknown event received: " + this.event);
        }
    }

    public DelayedMapListener(MapListener mapListener, long j5) {
        this.wrappedListener = mapListener;
        this.delay = j5;
        this.handler = new Handler();
        this.callback = null;
    }

    protected void dispatch(MapEvent mapEvent) {
        CallbackTask callbackTask = this.callback;
        if (callbackTask != null) {
            this.handler.removeCallbacks(callbackTask);
        }
        CallbackTask callbackTask2 = new CallbackTask(mapEvent);
        this.callback = callbackTask2;
        this.handler.postDelayed(callbackTask2, this.delay);
    }

    @Override // org.osmdroid.events.MapListener
    public boolean onScroll(ScrollEvent scrollEvent) {
        dispatch(scrollEvent);
        return true;
    }

    @Override // org.osmdroid.events.MapListener
    public boolean onZoom(ZoomEvent zoomEvent) {
        dispatch(zoomEvent);
        return true;
    }

    public DelayedMapListener(MapListener mapListener) {
        this(mapListener, 100L);
    }
}
