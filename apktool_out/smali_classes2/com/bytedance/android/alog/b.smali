.class public Lcom/bytedance/android/alog/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/bytedance/android/alog/Alog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()V
    .locals 1

    .line 8
    sget-object v0, Lcom/bytedance/android/alog/b;->a:Lcom/bytedance/android/alog/Alog;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog;->b()V

    :cond_0
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 4
    sget-object v0, Lcom/bytedance/android/alog/b;->a:Lcom/bytedance/android/alog/Alog;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;JJ)V
    .locals 8

    .line 6
    sget-object v0, Lcom/bytedance/android/alog/b;->a:Lcom/bytedance/android/alog/Alog;

    if-eqz v0, :cond_0

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    .line 7
    invoke-virtual/range {v0 .. v7}, Lcom/bytedance/android/alog/Alog;->a(ILjava/lang/String;Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/bytedance/android/alog/Alog;)V
    .locals 2

    .line 1
    sput-object p0, Lcom/bytedance/android/alog/b;->a:Lcom/bytedance/android/alog/Alog;

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/android/alog/Alog;->d()J

    move-result-wide v0

    .line 3
    :goto_0
    invoke-static {v0, v1}, Lcom/bytedance/android/alog/Alog;->nativeSetDefaultInstance(J)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-static {v0, p0, p1}, Lcom/bytedance/android/alog/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()J
    .locals 2

    .line 2
    sget-object v0, Lcom/bytedance/android/alog/b;->a:Lcom/bytedance/android/alog/Alog;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/android/alog/Alog;->c()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0, p0, p1}, Lcom/bytedance/android/alog/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p0, p1}, Lcom/bytedance/android/alog/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0, p0, p1}, Lcom/bytedance/android/alog/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p0, p1}, Lcom/bytedance/android/alog/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
