.class Lcom/lody/virtual/server/accounts/VAccountManagerService$4;
.super Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;->updateCredentials(ILandroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

.field final synthetic val$account:Landroid/accounts/Account;

.field final synthetic val$authTokenType:Ljava/lang/String;

.field final synthetic val$loginOptions:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    iput-object p8, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$account:Landroid/accounts/Account;

    iput-object p9, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$authTokenType:Ljava/lang/String;

    iput-object p10, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$loginOptions:Landroid/os/Bundle;

    invoke-direct/range {p0 .. p7}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;-><init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$account:Landroid/accounts/Account;

    iget-object v2, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$authTokenType:Ljava/lang/String;

    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$loginOptions:Landroid/os/Bundle;

    invoke-interface {v0, p0, v1, v2, v3}, Landroid/accounts/IAccountAuthenticator;->updateCredentials(Landroid/accounts/IAccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected toDebugString(J)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$loginOptions:Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->toDebugString(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, ", updateCredentials, "

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$account:Landroid/accounts/Account;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, ", authTokenType "

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$authTokenType:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ", loginOptions "

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$4;->val$loginOptions:Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
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
.end method
