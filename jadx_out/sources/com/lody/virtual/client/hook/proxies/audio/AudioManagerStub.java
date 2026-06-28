package com.lody.virtual.client.hook.proxies.audio;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import java.lang.reflect.Method;
import mirror.android.media.IAudioService;

/* loaded from: classes3.dex */
public class AudioManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    static class ReplacePkgAndUid extends MethodProxy {
        private String mMethodName;

        public ReplacePkgAndUid(String str) {
            this.mMethodName = str;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int index = MethodParameterUtils.getIndex(objArr, String.class);
            objArr[index] = VirtualCore.get().getHostPkg();
            objArr[index + 1] = Integer.valueOf(MethodProxy.getRealUid());
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return this.mMethodName;
        }
    }

    public AudioManagerStub() {
        super(IAudioService.Stub.asInterface, "audio");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustStreamVolume"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("adjustStreamVolumeWithAttributio"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setStreamVolume"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("setStreamVolumeWithAttribution"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setDeviceVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getDeviceVolume"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("handleVolumeKey"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("setMasterMute"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("setVolumeGroupVolumeIndex"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustVolumeGroupVolume"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("setMicrophoneMute"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setRingerModeExternal"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setRingerModeInternal"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setMode"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("playSoundEffect"));
        addMethodProxy(new ReplaceSequencePkgMethodProxy("requestAudioFocus", 2));
        addMethodProxy(new ReplaceLastPkgMethodProxy("abandonAudioFocus"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setWiredDeviceConnectionState"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("disableSafeMediaVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("lowerVolumeToRs1"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("setUidDeviceAffinity"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("removeUidDeviceAffinity"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("setUserIdDeviceAffinity"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("removeUserIdDeviceAffinity"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setDeviceVolumeBehavior"));
        addMethodProxy(new ReplacePkgAndUid("adjustStreamVolumeForUid"));
        addMethodProxy(new ReplacePkgAndUid("adjustSuggestedStreamVolumeForUid"));
        addMethodProxy(new ReplacePkgAndUid("setStreamVolumeForUid"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("registerDeviceVolumeDispatcherForAbsoluteVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustLocalOrRemoteStreamVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustSuggestedStreamVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("adjustMasterVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setMasterVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("avrcpSupportsAbsoluteVolume"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setSpeakerphoneOn"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setBluetoothScoOn"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("stopBluetoothSco"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("startBluetoothSco"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("registerRemoteControlClient"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("unregisterAudioFocusClient"));
    }
}
