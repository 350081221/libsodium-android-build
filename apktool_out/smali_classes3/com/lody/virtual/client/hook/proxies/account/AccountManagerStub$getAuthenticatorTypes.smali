.class Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthenticatorTypes;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "getAuthenticatorTypes"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$getAuthenticatorTypes;-><init>()V

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

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->access$4500()Lcom/lody/virtual/client/ipc/VAccountManager;

    move-result-object p1

    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/lody/virtual/client/ipc/VAccountManager;->getAuthenticatorTypes(I)[Landroid/accounts/AuthenticatorDescription;

    move-result-object p1

    return-object p1
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getAuthenticatorTypes"

    return-object v0
.end method
