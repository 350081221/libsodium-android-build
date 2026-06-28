.class public Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$IsDeviceProvisioned;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetFactoryResetProtectionPolicy;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$SetPasswordQuality;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetProfileOwnerName;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerName;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$NotifyPendingSystemUpdate;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetStorageEncryptionStatus;,
        Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerComponent;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/app/admin/IDevicePolicyManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "device_policy"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetStorageEncryptionStatus;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetStorageEncryptionStatus;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerComponent;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerComponent;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$NotifyPendingSystemUpdate;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$NotifyPendingSystemUpdate;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerName;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerName;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetProfileOwnerName;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetProfileOwnerName;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$SetPasswordQuality;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$SetPasswordQuality;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetFactoryResetProtectionPolicy;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetFactoryResetProtectionPolicy;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$IsDeviceProvisioned;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$IsDeviceProvisioned;-><init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 67
    .line 68
    .line 69
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 70
    .line 71
    const-string v1, "isUsbDataSignalingEnabled"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 77
    .line 78
    .line 79
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 80
    .line 81
    const-string v1, "getAccountTypesWithManagementDisabled"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 87
    .line 88
    .line 89
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 90
    .line 91
    const-string v1, "getAccountTypesWithManagementDisabledAsUser"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 97
    .line 98
    .line 99
    return-void
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
