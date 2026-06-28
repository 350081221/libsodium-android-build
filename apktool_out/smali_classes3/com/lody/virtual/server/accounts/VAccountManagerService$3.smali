.class Lcom/lody/virtual/server/accounts/VAccountManagerService$3;
.super Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;->hasFeatures(ILandroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

.field final synthetic val$account:Landroid/accounts/Account;

.field final synthetic val$features:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;Landroid/accounts/Account;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$3;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    iput-object p8, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$3;->val$account:Landroid/accounts/Account;

    iput-object p9, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$3;->val$features:[Ljava/lang/String;

    invoke-direct/range {p0 .. p7}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;-><init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onResult(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const-string v0, "booleanResult"

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->getResponseAndClose()Landroid/accounts/IAccountManagerResponse;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string p1, "null bundle"

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    invoke-interface {v1, v0, p1}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v4, " calling onResult() on response "

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    new-instance v2, Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v2, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v2}, Landroid/accounts/IAccountManagerResponse;->onResult(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->access$500()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "failure while notifying response"

    .line 76
    .line 77
    invoke-static {v0, v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public run()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$3;->val$account:Landroid/accounts/Account;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$3;->val$features:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, p0, v1, v2}, Landroid/accounts/IAccountAuthenticator;->hasFeatures(Landroid/accounts/IAccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    const/4 v0, 0x1

    .line 12
    const-string v1, "remote exception"

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->onError(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
