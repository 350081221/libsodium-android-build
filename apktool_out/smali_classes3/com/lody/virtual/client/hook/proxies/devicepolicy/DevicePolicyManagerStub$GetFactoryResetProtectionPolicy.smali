.class Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetFactoryResetProtectionPolicy;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GetFactoryResetProtectionPolicy"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetFactoryResetProtectionPolicy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getFactoryResetProtectionPolicy"

    return-object v0
.end method
