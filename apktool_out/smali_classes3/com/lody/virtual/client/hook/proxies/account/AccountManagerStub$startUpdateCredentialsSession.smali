.class Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startUpdateCredentialsSession;
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
    name = "startUpdateCredentialsSession"
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
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$startUpdateCredentialsSession;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->access$4500()Lcom/lody/virtual/client/ipc/VAccountManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 p1, 0x0

    .line 6
    aget-object p2, p3, p1

    .line 7
    .line 8
    move-object v1, p2

    .line 9
    check-cast v1, Landroid/accounts/IAccountManagerResponse;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    aget-object p2, p3, p2

    .line 13
    .line 14
    move-object v2, p2

    .line 15
    check-cast v2, Landroid/accounts/Account;

    .line 16
    .line 17
    const/4 p2, 0x2

    .line 18
    aget-object p2, p3, p2

    .line 19
    .line 20
    move-object v3, p2

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    const/4 p2, 0x3

    .line 24
    aget-object p2, p3, p2

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 p2, 0x4

    .line 33
    aget-object p2, p3, p2

    .line 34
    .line 35
    move-object v5, p2

    .line 36
    check-cast v5, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/client/ipc/VAccountManager;->startUpdateCredentialsSession(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;ZLandroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
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
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "startUpdateCredentialsSession"

    return-object v0
.end method
