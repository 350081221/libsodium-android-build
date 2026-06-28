.class Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccount;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "addAccount"
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
    invoke-direct {p0}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub$addAccount;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    aget-object p2, p3, p1

    .line 3
    .line 4
    move-object v1, p2

    .line 5
    check-cast v1, Landroid/accounts/IAccountManagerResponse;

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    aget-object p2, p3, p2

    .line 9
    .line 10
    move-object v2, p2

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    aget-object p2, p3, p2

    .line 15
    .line 16
    move-object v3, p2

    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    aget-object p2, p3, p2

    .line 21
    .line 22
    move-object v4, p2

    .line 23
    check-cast v4, [Ljava/lang/String;

    .line 24
    .line 25
    const/4 p2, 0x4

    .line 26
    aget-object p2, p3, p2

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/4 p2, 0x5

    .line 35
    aget-object p2, p3, p2

    .line 36
    .line 37
    move-object v6, p2

    .line 38
    check-cast v6, Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/account/AccountManagerStub;->access$4500()Lcom/lody/virtual/client/ipc/VAccountManager;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual/range {v0 .. v6}, Lcom/lody/virtual/client/ipc/VAccountManager;->addAccount(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
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

    const-string v0, "addAccount"

    return-object v0
.end method
