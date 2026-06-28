package com.lody.virtual.client.hook.proxies.user;

import com.lody.virtual.client.VClient;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import java.lang.reflect.Method;
import java.util.Collections;
import mirror.android.content.pm.UserInfo;
import mirror.android.os.IUserManager;

/* loaded from: classes3.dex */
public class UserManagerStub extends BinderInvocationProxy {
    public UserManagerStub() {
        super(IUserManager.Stub.asInterface, "user");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setApplicationRestrictions"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getApplicationRestrictions"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getApplicationRestrictionsForUser"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isUserUnlocked"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isUserUnlockingOrUnlocked"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isProfile"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("isManagedProfile"));
        addMethodProxy(new ResultStaticMethodProxy("getProfileParent", null));
        addMethodProxy(new ResultStaticMethodProxy("getUserIcon", null));
        addMethodProxy(new ResultStaticMethodProxy("getUserInfo", UserInfo.ctor.newInstance(0, "Admin", Integer.valueOf(UserInfo.FLAG_PRIMARY.get()))));
        addMethodProxy(new ResultStaticMethodProxy("getDefaultGuestRestrictions", null));
        addMethodProxy(new ResultStaticMethodProxy("setDefaultGuestRestrictions", null));
        addMethodProxy(new ResultStaticMethodProxy("removeRestrictions", null));
        addMethodProxy(new ResultStaticMethodProxy("getUsers", Collections.singletonList(UserInfo.ctor.newInstance(0, "Admin", Integer.valueOf(UserInfo.FLAG_PRIMARY.get())))));
        addMethodProxy(new ResultStaticMethodProxy("createUser", null));
        addMethodProxy(new ResultStaticMethodProxy("createProfileForUser", null));
        addMethodProxy(new ResultStaticMethodProxy("getProfiles", Collections.EMPTY_LIST));
        addMethodProxy(new ResultStaticMethodProxy("setUserEnabled", null));
        Boolean bool = Boolean.FALSE;
        addMethodProxy(new ResultStaticMethodProxy("removeUser", bool));
        addMethodProxy(new ResultStaticMethodProxy("setUserName", null));
        addMethodProxy(new ResultStaticMethodProxy("setUserIcon", null));
        addMethodProxy(new ResultStaticMethodProxy("canAddMoreManagedProfiles", bool));
        addMethodProxy(new ResultStaticMethodProxy("setUserRestrictions", null));
        addMethodProxy(new ResultStaticMethodProxy("setUserRestriction", null));
        addMethodProxy(new ResultStaticMethodProxy("markGuestForDeletion", Boolean.TRUE));
        addMethodProxy(new ResultStaticMethodProxy("createRestrictedProfile", null));
        addMethodProxy(new ResultStaticMethodProxy("getPrimaryUser", null));
        addMethodProxy(new ResultStaticMethodProxy("hasBaseUserRestriction", bool));
        addMethodProxy(new ResultStaticMethodProxy("getUserName", ""));
        addMethodProxy(new ResultStaticMethodProxy("getSeedAccountOptions", null));
        addMethodProxy(new ResultStaticMethodProxy("getMainUserId", Integer.valueOf(VClient.get().getVUid())));
        addMethodProxy(new StaticMethodProxy("isUserOfType") { // from class: com.lody.virtual.client.hook.proxies.user.UserManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (((String) objArr[1]).equals("android.os.usertype.full.SYSTEM")) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }
}
