.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiverWithFeature;
.super Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RegisterReceiverWithFeature"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x5

    .line 9
    const/4 v2, 0x4

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput v2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_IIntentReceiver:I

    .line 13
    .line 14
    iput v1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_IntentFilter:I

    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    iput v0, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_RequiredPermission:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x3

    .line 21
    iput v0, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_IIntentReceiver:I

    .line 22
    .line 23
    iput v2, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_IntentFilter:I

    .line 24
    .line 25
    iput v1, p0, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$RegisterReceiver;->IDX_RequiredPermission:I

    .line 26
    .line 27
    :goto_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "registerReceiverWithFeature"

    return-object v0
.end method
