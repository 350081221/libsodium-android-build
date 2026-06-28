.class public Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$unregisterAccountListener;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$registerAccountListener;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startUpdateCredentialsSession;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startAddAccountSession;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAccountVisibility;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPackagesAndVisibilityForAccount;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAndVisibilityForPackage;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitlyWithVisibility;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountVisibility;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$finishSessionAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$isCredentialsUpdateSuggested;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameSharedAccountAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPreviousName;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameAccount;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeSharedAccountAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getSharedAccountsAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addSharedAccountAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthTokenLabel;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$accountAuthenticated;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$confirmCredentialsAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$editProperties;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateCredentials;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccount;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthToken;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateAppPermission;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setUserData;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$clearPassword;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setPassword;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAuthToken;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$peekAuthToken;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$invalidateAuthToken;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$copyAccountToUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountExplicitly;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccount;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitly;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByFeatures;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$hasFeatures;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAsUser;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountByTypeAndFeatures;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByTypeForPackage;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsForPackage;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccounts;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthenticatorTypes;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getUserData;,
        Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPassword;
    }
.end annotation


# static fields
.field private static Mgr:Lcom/lody/virtual/client/ipc/VAccountManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/ipc/VAccountManager;->get()Lcom/lody/virtual/client/ipc/VAccountManager;

    move-result-object v0

    sput-object v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->Mgr:Lcom/lody/virtual/client/ipc/VAccountManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/accounts/IAccountManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "account"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$4500()Lcom/lody/virtual/client/ipc/VAccountManager;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->Mgr:Lcom/lody/virtual/client/ipc/VAccountManager;

    return-object v0
.end method


# virtual methods
.method public inject()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->inject()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "account"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/accounts/AccountManager;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "mService"

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPassword;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPassword;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getUserData;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getUserData;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthenticatorTypes;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthenticatorTypes;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccounts;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccounts;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsForPackage;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsForPackage;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByTypeForPackage;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByTypeForPackage;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAsUser;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$hasFeatures;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$hasFeatures;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 67
    .line 68
    .line 69
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByFeatures;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsByFeatures;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 75
    .line 76
    .line 77
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitly;

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitly;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccount;

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccount;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 91
    .line 92
    .line 93
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountAsUser;

    .line 94
    .line 95
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 99
    .line 100
    .line 101
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountExplicitly;

    .line 102
    .line 103
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeAccountExplicitly;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$copyAccountToUser;

    .line 110
    .line 111
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$copyAccountToUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 115
    .line 116
    .line 117
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$invalidateAuthToken;

    .line 118
    .line 119
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$invalidateAuthToken;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 123
    .line 124
    .line 125
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$peekAuthToken;

    .line 126
    .line 127
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$peekAuthToken;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 131
    .line 132
    .line 133
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAuthToken;

    .line 134
    .line 135
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAuthToken;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 139
    .line 140
    .line 141
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setPassword;

    .line 142
    .line 143
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setPassword;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 147
    .line 148
    .line 149
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$clearPassword;

    .line 150
    .line 151
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$clearPassword;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 155
    .line 156
    .line 157
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setUserData;

    .line 158
    .line 159
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setUserData;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 163
    .line 164
    .line 165
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateAppPermission;

    .line 166
    .line 167
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateAppPermission;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 171
    .line 172
    .line 173
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthToken;

    .line 174
    .line 175
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthToken;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 179
    .line 180
    .line 181
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccount;

    .line 182
    .line 183
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccount;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 187
    .line 188
    .line 189
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountAsUser;

    .line 190
    .line 191
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 195
    .line 196
    .line 197
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateCredentials;

    .line 198
    .line 199
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$updateCredentials;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$editProperties;

    .line 206
    .line 207
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$editProperties;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 211
    .line 212
    .line 213
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$confirmCredentialsAsUser;

    .line 214
    .line 215
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$confirmCredentialsAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 219
    .line 220
    .line 221
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$accountAuthenticated;

    .line 222
    .line 223
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$accountAuthenticated;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 227
    .line 228
    .line 229
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthTokenLabel;

    .line 230
    .line 231
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthTokenLabel;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 235
    .line 236
    .line 237
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addSharedAccountAsUser;

    .line 238
    .line 239
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addSharedAccountAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 243
    .line 244
    .line 245
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getSharedAccountsAsUser;

    .line 246
    .line 247
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getSharedAccountsAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 251
    .line 252
    .line 253
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeSharedAccountAsUser;

    .line 254
    .line 255
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$removeSharedAccountAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 259
    .line 260
    .line 261
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameAccount;

    .line 262
    .line 263
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameAccount;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 267
    .line 268
    .line 269
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPreviousName;

    .line 270
    .line 271
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPreviousName;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 275
    .line 276
    .line 277
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameSharedAccountAsUser;

    .line 278
    .line 279
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$renameSharedAccountAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_0

    .line 290
    .line 291
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$finishSessionAsUser;

    .line 292
    .line 293
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$finishSessionAsUser;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 297
    .line 298
    .line 299
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountVisibility;

    .line 300
    .line 301
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountVisibility;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 305
    .line 306
    .line 307
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitlyWithVisibility;

    .line 308
    .line 309
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccountExplicitlyWithVisibility;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 313
    .line 314
    .line 315
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAndVisibilityForPackage;

    .line 316
    .line 317
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAccountsAndVisibilityForPackage;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 321
    .line 322
    .line 323
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPackagesAndVisibilityForAccount;

    .line 324
    .line 325
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getPackagesAndVisibilityForAccount;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 329
    .line 330
    .line 331
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAccountVisibility;

    .line 332
    .line 333
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAccountVisibility;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 337
    .line 338
    .line 339
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startAddAccountSession;

    .line 340
    .line 341
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startAddAccountSession;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 345
    .line 346
    .line 347
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startUpdateCredentialsSession;

    .line 348
    .line 349
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startUpdateCredentialsSession;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 353
    .line 354
    .line 355
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$registerAccountListener;

    .line 356
    .line 357
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$registerAccountListener;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 361
    .line 362
    .line 363
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$unregisterAccountListener;

    .line 364
    .line 365
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$unregisterAccountListener;-><init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 369
    .line 370
    .line 371
    :cond_0
    return-void
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
