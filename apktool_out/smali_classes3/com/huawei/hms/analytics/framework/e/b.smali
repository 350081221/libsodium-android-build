.class public final Lcom/huawei/hms/analytics/framework/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/framework/e/b$a;
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public volatile c:Z

.field public volatile d:J

.field private e:Lcom/huawei/hms/analytics/framework/e/b$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x1b7740

    iput-wide v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->a:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->b:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->e:Lcom/huawei/hms/analytics/framework/e/b$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->e:Lcom/huawei/hms/analytics/framework/e/b$a;

    if-nez v0, :cond_0

    const-string v0, "SessionKeeper"

    const-string v1, "getSessionName(): session not prepared. onEvent() must be called first."

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method final a(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->e:Lcom/huawei/hms/analytics/framework/e/b$a;

    if-nez v0, :cond_0

    const-string p1, "SessionKeeper"

    const-string v0, "Session is first flush"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/framework/e/b$a;

    invoke-direct {p1, p0, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;-><init>(Lcom/huawei/hms/analytics/framework/e/b;J)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b;->e:Lcom/huawei/hms/analytics/framework/e/b$a;

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b;->e:Lcom/huawei/hms/analytics/framework/e/b$a;

    if-nez v0, :cond_0

    const-string v0, "SessionKeeper"

    const-string v1, "isFirstEvent(): session not prepared. onEvent() must be called first."

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Lcom/huawei/hms/analytics/framework/e/b$a;->b:Z

    return v0
.end method
