.class Lcom/lody/virtual/client/hook/proxies/telephony/HwTelephonyStub$GetUniqueDeviceId;
.super Lcom/lody/virtual/client/hook/proxies/telephony/MethodProxies$GetDeviceId;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/telephony/HwTelephonyStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GetUniqueDeviceId"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/telephony/MethodProxies$GetDeviceId;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/telephony/HwTelephonyStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/telephony/HwTelephonyStub$GetUniqueDeviceId;-><init>()V

    return-void
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getUniqueDeviceId"

    return-object v0
.end method
