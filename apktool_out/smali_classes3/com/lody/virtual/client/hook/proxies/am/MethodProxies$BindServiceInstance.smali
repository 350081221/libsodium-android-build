.class Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindServiceInstance;
.super Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindIsolatedService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BindServiceInstance"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$BindIsolatedService;-><init>()V

    return-void
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "bindServiceInstance"

    return-object v0
.end method
