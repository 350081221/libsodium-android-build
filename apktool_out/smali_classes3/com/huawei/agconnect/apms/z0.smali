.class public Lcom/huawei/agconnect/apms/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    iput v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const-string v0, "com.huawei.agc.apms"

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    const-string v0, "com.huawei.agc.apms"

    .line 2
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 3
    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    const-string v0, "com.huawei.agc.apms"

    .line 4
    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public getLevel()I
    .locals 1

    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    return v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    const-string v0, "com.huawei.agc.apms"

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setLevel(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "Log level is not between DEBUG and ERROR"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
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
.end method

.method public warn(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/huawei/agconnect/apms/z0;->abc:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    const-string v0, "com.huawei.agc.apms"

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
