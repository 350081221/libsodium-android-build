.class public Lcom/bytedance/sdk/openadsdk/api/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z = false

.field private static b:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static varargs a([Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_3

    .line 15
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_2

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_1

    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, " null "

    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, " "

    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    const-string p0, ""

    return-object p0
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    const/4 v0, 0x3

    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/c;->a(I)V

    return-void
.end method

.method public static a(I)V
    .locals 0

    .line 1
    sput p0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 13
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "TTLogger"

    .line 14
    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 4
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 5
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_2

    .line 6
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 7
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    return-void

    .line 8
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_2

    .line 9
    invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 10
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 11
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_2

    .line 12
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/c;->a([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_2

    .line 3
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 4
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    return-void

    .line 5
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_2

    .line 6
    invoke-static {p0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 7
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 8
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_2

    .line 9
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/c;->a([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_2

    .line 3
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 4
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    return-void

    .line 5
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_2

    .line 6
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_2
    return-void
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
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/c;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez p1, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/api/c;->b:I

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_2
    return-void
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
.end method
