.class Lcom/lody/virtual/client/hook/proxies/phonesubinfo/MethodProxies$GetDeviceIdForPhone;
.super Lcom/lody/virtual/client/hook/proxies/phonesubinfo/MethodProxies$GetDeviceId;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/phonesubinfo/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GetDeviceIdForPhone"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/phonesubinfo/MethodProxies$GetDeviceId;-><init>()V

    return-void
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getDeviceIdForPhone"

    return-object v0
.end method
