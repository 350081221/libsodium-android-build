package org.osmdroid.tileprovider.modules;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.osmdroid.tileprovider.IRegisterReceiver;

/* loaded from: classes4.dex */
public abstract class MapTileFileStorageProviderBase extends MapTileModuleProviderBase {
    private MyBroadcastReceiver mBroadcastReceiver;
    private final IRegisterReceiver mRegisterReceiver;

    /* loaded from: classes4.dex */
    private class MyBroadcastReceiver extends BroadcastReceiver {
        private MyBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                MapTileFileStorageProviderBase.this.onMediaMounted();
            } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
                MapTileFileStorageProviderBase.this.onMediaUnmounted();
            }
        }
    }

    public MapTileFileStorageProviderBase(IRegisterReceiver iRegisterReceiver, int i5, int i6) {
        super(i5, i6);
        this.mRegisterReceiver = iRegisterReceiver;
        this.mBroadcastReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        iRegisterReceiver.registerReceiver(this.mBroadcastReceiver, intentFilter);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        MyBroadcastReceiver myBroadcastReceiver = this.mBroadcastReceiver;
        if (myBroadcastReceiver != null) {
            this.mRegisterReceiver.unregisterReceiver(myBroadcastReceiver);
            this.mBroadcastReceiver = null;
        }
        super.detach();
    }

    protected void onMediaMounted() {
    }

    protected void onMediaUnmounted() {
    }
}
