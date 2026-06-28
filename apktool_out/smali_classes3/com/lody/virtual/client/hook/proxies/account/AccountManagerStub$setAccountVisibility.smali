.class Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAccountVisibility;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "setAccountVisibility"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$setAccountVisibility;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->access$4500()Lcom/lody/virtual/client/ipc/VAccountManager;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p2, p3, p2

    check-cast p2, Landroid/accounts/Account;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    aget-object p3, p3, v1

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, v0, p3}, Lcom/lody/virtual/client/ipc/VAccountManager;->setAccountVisibility(Landroid/accounts/Account;Ljava/lang/String;I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "setAccountVisibility"

    return-object v0
.end method
