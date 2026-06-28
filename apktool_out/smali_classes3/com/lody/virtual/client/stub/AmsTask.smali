.class public abstract Lcom/lody/virtual/client/stub/AmsTask;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Landroid/accounts/AccountManagerFuture;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/stub/AmsTask$Response;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Landroid/os/Bundle;",
        ">;",
        "Landroid/accounts/AccountManagerFuture<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field final mActivity:Landroid/app/Activity;

.field final mCallback:Landroid/accounts/AccountManagerCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/accounts/AccountManagerCallback<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field final mHandler:Landroid/os/Handler;

.field protected final mResponse:Landroid/accounts/IAccountManagerResponse;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Landroid/accounts/AccountManagerCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/os/Handler;",
            "Landroid/accounts/AccountManagerCallback<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/lody/virtual/client/stub/AmsTask$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/client/stub/AmsTask$1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/lody/virtual/client/stub/AmsTask;->mHandler:Landroid/os/Handler;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/lody/virtual/client/stub/AmsTask;->mCallback:Landroid/accounts/AccountManagerCallback;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/lody/virtual/client/stub/AmsTask;->mActivity:Landroid/app/Activity;

    .line 14
    .line 15
    new-instance p1, Lcom/lody/virtual/client/stub/AmsTask$Response;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p0, p2}, Lcom/lody/virtual/client/stub/AmsTask$Response;-><init>(Lcom/lody/virtual/client/stub/AmsTask;Lcom/lody/virtual/client/stub/AmsTask$1;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/lody/virtual/client/stub/AmsTask;->mResponse:Landroid/accounts/IAccountManagerResponse;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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

.method static synthetic access$100(Lcom/lody/virtual/client/stub/AmsTask;ILjava/lang/String;)Ljava/lang/Exception;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/client/stub/AmsTask;->convertErrorToException(ILjava/lang/String;)Ljava/lang/Exception;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/lody/virtual/client/stub/AmsTask;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private convertErrorToException(ILjava/lang/String;)Ljava/lang/Exception;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 v0, 0x6

    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    const/4 v0, 0x5

    .line 20
    if-ne p1, v0, :cond_2

    .line 21
    .line 22
    new-instance p1, Landroid/accounts/AuthenticatorException;

    .line 23
    .line 24
    invoke-direct {p1, p2}, Landroid/accounts/AuthenticatorException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    const/4 v0, 0x7

    .line 29
    if-ne p1, v0, :cond_3

    .line 30
    .line 31
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    new-instance p1, Landroid/accounts/AuthenticatorException;

    .line 38
    .line 39
    invoke-direct {p1, p2}, Landroid/accounts/AuthenticatorException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private internalGetResult(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Landroid/os/Bundle;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/OperationCanceledException;,
            Ljava/io/IOException;,
            Landroid/accounts/AuthenticatorException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {p0, v1, v2, p2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Landroid/os/Bundle;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    instance-of p2, p1, Ljava/io/IOException;

    .line 36
    .line 37
    if-nez p2, :cond_5

    .line 38
    .line 39
    instance-of p2, p1, Ljava/lang/UnsupportedOperationException;

    .line 40
    .line 41
    if-nez p2, :cond_4

    .line 42
    .line 43
    instance-of p2, p1, Landroid/accounts/AuthenticatorException;

    .line 44
    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    instance-of p2, p1, Ljava/lang/RuntimeException;

    .line 48
    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    instance-of p2, p1, Ljava/lang/Error;

    .line 52
    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Error;

    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :cond_2
    check-cast p1, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    check-cast p1, Landroid/accounts/AuthenticatorException;

    .line 68
    .line 69
    throw p1

    .line 70
    :cond_4
    new-instance p2, Landroid/accounts/AuthenticatorException;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Landroid/accounts/AuthenticatorException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_5
    check-cast p1, Ljava/io/IOException;

    .line 77
    .line 78
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    :catch_1
    invoke-virtual {p0, v0}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 80
    .line 81
    .line 82
    new-instance p1, Landroid/accounts/OperationCanceledException;

    .line 83
    .line 84
    invoke-direct {p1}, Landroid/accounts/OperationCanceledException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :catch_2
    :try_start_3
    new-instance p1, Landroid/accounts/OperationCanceledException;

    .line 89
    .line 90
    invoke-direct {p1}, Landroid/accounts/OperationCanceledException;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    :goto_0
    invoke-virtual {p0, v0}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 95
    .line 96
    .line 97
    throw p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private postToHandler(Landroid/os/Handler;Landroid/accounts/AccountManagerCallback;Landroid/accounts/AccountManagerFuture;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Landroid/accounts/AccountManagerCallback<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/accounts/AccountManagerFuture<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->getUIHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    new-instance v0, Lcom/lody/virtual/client/stub/AmsTask$2;

    .line 8
    .line 9
    invoke-direct {v0, p0, p2, p3}, Lcom/lody/virtual/client/stub/AmsTask$2;-><init>(Lcom/lody/virtual/client/stub/AmsTask;Landroid/accounts/AccountManagerCallback;Landroid/accounts/AccountManagerFuture;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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


# virtual methods
.method public abstract doWork()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method protected done()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/AmsTask;->mCallback:Landroid/accounts/AccountManagerCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lody/virtual/client/stub/AmsTask;->mHandler:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-direct {p0, v1, v0, p0}, Lcom/lody/virtual/client/stub/AmsTask;->postToHandler(Landroid/os/Handler;Landroid/accounts/AccountManagerCallback;Landroid/accounts/AccountManagerFuture;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getResult()Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/OperationCanceledException;,
            Ljava/io/IOException;,
            Landroid/accounts/AuthenticatorException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, v0}, Lcom/lody/virtual/client/stub/AmsTask;->internalGetResult(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getResult(JLjava/util/concurrent/TimeUnit;)Landroid/os/Bundle;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/OperationCanceledException;,
            Ljava/io/IOException;,
            Landroid/accounts/AuthenticatorException;
        }
    .end annotation

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/lody/virtual/client/stub/AmsTask;->internalGetResult(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getResult()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/AuthenticatorException;,
            Ljava/io/IOException;,
            Landroid/accounts/OperationCanceledException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/client/stub/AmsTask;->getResult()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getResult(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/AuthenticatorException;,
            Ljava/io/IOException;,
            Landroid/accounts/OperationCanceledException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/lody/virtual/client/stub/AmsTask;->getResult(JLjava/util/concurrent/TimeUnit;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method protected set(Landroid/os/Bundle;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "AccountManager"

    const-string v2, "the bundle must not be null\n%s"

    invoke-static {v1, v2, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->set(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/stub/AmsTask;->set(Landroid/os/Bundle;)V

    return-void
.end method

.method public final start()Landroid/accounts/AccountManagerFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/accounts/AccountManagerFuture<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/stub/AmsTask;->doWork()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {p0, v0}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
