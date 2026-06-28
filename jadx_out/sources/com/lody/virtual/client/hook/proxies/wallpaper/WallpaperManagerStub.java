package com.lody.virtual.client.hook.proxies.wallpaper;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.app.IWallpaperManager;

/* loaded from: classes3.dex */
public class WallpaperManagerStub extends BinderInvocationProxy {
    public WallpaperManagerStub() {
        super(IWallpaperManager.Stub.asInterface, "wallpaper");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getWallpaper"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setWallpaper"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setDimensionHints"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setDisplayPadding"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("clearWallpaper"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setWallpaperComponentChecked"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isWallpaperSupported"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isSetWallpaperAllowed"));
    }
}
