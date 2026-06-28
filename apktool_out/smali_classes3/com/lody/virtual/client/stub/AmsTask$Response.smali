.class Lcom/lody/virtual/client/stub/AmsTask$Response;
.super Landroid/accounts/IAccountManagerResponse$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/stub/AmsTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Response"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/stub/AmsTask;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/client/stub/AmsTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    invoke-direct {p0}, Landroid/accounts/IAccountManagerResponse$Stub;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/client/stub/AmsTask;Lcom/lody/virtual/client/stub/AmsTask$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/stub/AmsTask$Response;-><init>(Lcom/lody/virtual/client/stub/AmsTask;)V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/16 v0, 0x64

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x65

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    .line 14
    .line 15
    invoke-static {v0, p1, p2}, Lcom/lody/virtual/client/stub/AmsTask;->access$100(Lcom/lody/virtual/client/stub/AmsTask;ILjava/lang/String;)Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v0, p1}, Lcom/lody/virtual/client/stub/AmsTask;->access$200(Lcom/lody/virtual/client/stub/AmsTask;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-virtual {p1, p2}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Intent;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/lody/virtual/client/stub/AmsTask;->mActivity:Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "retry"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    :try_start_0
    iget-object p1, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/lody/virtual/client/stub/AmsTask;->doWork()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance v0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/AmsTask$Response;->this$0:Lcom/lody/virtual/client/stub/AmsTask;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/stub/AmsTask;->set(Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
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
