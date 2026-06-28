.class Lcom/lody/virtual/server/accounts/VAccountManagerService$8;
.super Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;->addAccount(ILandroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

.field final synthetic val$accountType:Ljava/lang/String;

.field final synthetic val$authTokenType:Ljava/lang/String;

.field final synthetic val$optionsIn:Landroid/os/Bundle;

.field final synthetic val$requiredFeatures:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;ZZLjava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->this$0:Lcom/lody/virtual/server/accounts/VAccountManagerService;

    iput-object p10, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$authTokenType:Ljava/lang/String;

    iput-object p11, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$requiredFeatures:[Ljava/lang/String;

    iput-object p12, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$optionsIn:Landroid/os/Bundle;

    iput-object p13, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$accountType:Ljava/lang/String;

    invoke-direct/range {p0 .. p9}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;-><init>(Lcom/lody/virtual/server/accounts/VAccountManagerService;Landroid/accounts/IAccountManagerResponse;ILcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;ZZLjava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    iget-object v1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->mAuthenticatorInfo:Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;

    iget-object v1, v1, Lcom/lody/virtual/server/accounts/VAccountManagerService$AuthenticatorInfo;->desc:Landroid/accounts/AuthenticatorDescription;

    iget-object v2, v1, Landroid/accounts/AuthenticatorDescription;->type:Ljava/lang/String;

    iget-object v3, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$authTokenType:Ljava/lang/String;

    iget-object v4, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$requiredFeatures:[Ljava/lang/String;

    iget-object v5, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$optionsIn:Landroid/os/Bundle;

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Landroid/accounts/IAccountAuthenticator;->addAccount(Landroid/accounts/IAccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method protected toDebugString(J)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lcom/lody/virtual/server/accounts/VAccountManagerService$Session;->toDebugString(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, ", addAccount, accountType "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$accountType:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, ", requiredFeatures "

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/lody/virtual/server/accounts/VAccountManagerService$8;->val$requiredFeatures:[Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const-string p2, ","

    .line 33
    .line 34
    invoke-static {p2, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
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
.end method
