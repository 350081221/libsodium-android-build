.class public Lcom/lody/virtual/client/core/OemInjectManager;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static injectVivo(Lcom/lody/virtual/client/core/InvocationStubManager;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/oem/vivo/IPhysicalFlingManagerStub;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/vivo/PhysicalFlingManagerStub;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/vivo/PhysicalFlingManagerStub;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object v0, Lmirror/oem/vivo/IPopupCameraManager;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/vivo/PopupCameraManagerStub;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/vivo/PopupCameraManagerStub;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object v0, Lmirror/oem/vivo/ISuperResolutionManager;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/vivo/SuperResolutionManagerStub;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/vivo/SuperResolutionManagerStub;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v0, Lmirror/oem/vivo/ISystemDefenceManager;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/vivo/SystemDefenceManagerStub;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/vivo/SystemDefenceManagerStub;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    sget-object v0, Lmirror/oem/vivo/IVivoPermissonService;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/vivo/VivoPermissionServiceStub;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/vivo/VivoPermissionServiceStub;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    sget-object v0, Lmirror/oem/huawei/IHwMagicWindow;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/oem/huawei/HwMagicWindowManagerStub;

    .line 66
    .line 67
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/oem/huawei/HwMagicWindowManagerStub;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/core/InvocationStubManager;->addInjector(Lcom/lody/virtual/client/interfaces/IInjector;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    return-void
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
.end method

.method public static oemInject(Lcom/lody/virtual/client/core/InvocationStubManager;)V
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/core/OemInjectManager;->injectVivo(Lcom/lody/virtual/client/core/InvocationStubManager;)V

    return-void
.end method
