.class public Lcom/lody/virtual/client/hook/proxies/telephony/HonorTelephonyStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/telephony/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/telephony/HonorTelephonyStub$GetUniqueDeviceId;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/com/android/internal/telephony/IHwTelephony$Stub;->TYPE:Ljava/lang/Class;

    const-string v1, "phone_honor"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 2

    new-instance v0, Lcom/lody/virtual/client/hook/proxies/telephony/HonorTelephonyStub$GetUniqueDeviceId;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/telephony/HonorTelephonyStub$GetUniqueDeviceId;-><init>(Lcom/lody/virtual/client/hook/proxies/telephony/HonorTelephonyStub$1;)V

    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    return-void
.end method
