package com.lody.virtual.client.hook.proxies.slice;

import android.app.slice.SliceSpec;
import android.net.Uri;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.com.android.internal.app.ISliceManager;

/* loaded from: classes3.dex */
public class SliceManagerStub extends BinderInvocationProxy {
    public SliceManagerStub() {
        super(ISliceManager.Stub.TYPE, "slice");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("pinSlice", null));
        addMethodProxy(new ResultStaticMethodProxy("unpinSlice", null));
        addMethodProxy(new ResultStaticMethodProxy("hasSliceAccess", Boolean.FALSE));
        addMethodProxy(new ResultStaticMethodProxy("grantSlicePermission", null));
        addMethodProxy(new ResultStaticMethodProxy("revokeSlicePermission", null));
        addMethodProxy(new ResultStaticMethodProxy("checkSlicePermission", 0));
        addMethodProxy(new ResultStaticMethodProxy("grantPermissionFromUser", null));
        addMethodProxy(new ResultStaticMethodProxy("getPinnedSpecs", new SliceSpec[0]));
        addMethodProxy(new ResultStaticMethodProxy("getPinnedSlices", new Uri[0]));
    }
}
