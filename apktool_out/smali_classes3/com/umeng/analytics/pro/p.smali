.class public Lcom/umeng/analytics/pro/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private b:Lcom/umeng/analytics/pro/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-ne v0, p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/umeng/analytics/pro/p;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    sget-boolean v0, Lcom/umeng/analytics/AnalyticsConfig;->CATCH_EXCEPTION:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/umeng/analytics/pro/p;->b:Lcom/umeng/analytics/pro/t;

    invoke-interface {v0, p1}, Lcom/umeng/analytics/pro/t;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/p;->b:Lcom/umeng/analytics/pro/t;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/t;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/p;->b:Lcom/umeng/analytics/pro/t;

    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/p;->a(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/umeng/analytics/pro/p;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/umeng/analytics/pro/p;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
