.class Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerComponent;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GetDeviceOwnerComponent"
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
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/devicepolicy/DevicePolicyManagerStub$GetDeviceOwnerComponent;-><init>()V

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

    new-instance p1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    move-result-object p2

    const-string p3, ""

    invoke-direct {p1, p2, p3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getDeviceOwnerComponent"

    return-object v0
.end method
