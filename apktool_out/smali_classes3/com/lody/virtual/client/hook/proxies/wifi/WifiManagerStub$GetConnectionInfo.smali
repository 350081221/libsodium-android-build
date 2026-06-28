.class final Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "GetConnectionInfo"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;->this$0:Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub$GetConnectionInfo;-><init>(Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->replaceFirstAppPkg([Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->getFakeWifiStatus()Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/wifi/WifiManagerStub;->access$300(Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;)Landroid/net/wifi/WifiInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/net/wifi/WifiInfo;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isFakeLocationEnable()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    sget-object p2, Lmirror/android/net/wifi/WifiInfo;->mBSSID:Lmirror/RefObject;

    .line 34
    .line 35
    const-string p3, "00:00:00:00:00:00"

    .line 36
    .line 37
    invoke-virtual {p2, p1, p3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    sget-object p2, Lmirror/android/net/wifi/WifiInfo;->mMacAddress:Lmirror/RefObject;

    .line 41
    .line 42
    invoke-virtual {p2, p1, p3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-boolean p2, p2, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget-object p2, p2, Lcom/lody/virtual/remote/VDeviceConfig;->wifiMac:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-nez p3, :cond_2

    .line 65
    .line 66
    sget-object p3, Lmirror/android/net/wifi/WifiInfo;->mMacAddress:Lmirror/RefObject;

    .line 67
    .line 68
    invoke-virtual {p3, p1, p2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_0
    return-object p1
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
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getConnectionInfo"

    return-object v0
.end method
