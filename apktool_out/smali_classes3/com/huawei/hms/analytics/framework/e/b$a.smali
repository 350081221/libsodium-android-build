.class final Lcom/huawei/hms/analytics/framework/e/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/framework/e/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Z

.field final synthetic c:Lcom/huawei/hms/analytics/framework/e/b;

.field private d:J


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/framework/e/b;J)V
    .locals 3

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->d:J

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->b:Z

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    return-void
.end method

.method private a(J)V
    .locals 3

    const-string v0, "SessionKeeper"

    const-string v1, "getNewSession() session is flush!"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->a:Ljava/lang/String;

    iput-wide p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->d:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->b:Z

    return-void
.end method

.method private static a(JJ)Z
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p3

    if-ne p2, p3, :cond_1

    const/4 p2, 0x6

    invoke-virtual {v0, p2}, Ljava/util/Calendar;->get(I)I

    move-result p3

    invoke-virtual {p0, p2}, Ljava/util/Calendar;->get(I)I

    move-result p0

    if-eq p3, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return p1
.end method

.method private b(JJ)Z
    .locals 0

    sub-long/2addr p3, p1

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    iget-wide p1, p1, Lcom/huawei/hms/analytics/framework/e/b;->a:J

    cmp-long p1, p3, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method final a(Ljava/lang/String;J)V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/framework/b/b;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/b/c;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean v1, p1, Lcom/huawei/hms/analytics/framework/b/c;->a:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p1, Lcom/huawei/hms/analytics/framework/b/c;->a:Z

    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->a(J)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    iget-boolean p1, p1, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    iget-wide v1, p1, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    sub-long v1, p2, v1

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    iget-wide v3, p1, Lcom/huawei/hms/analytics/framework/e/b;->b:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    iput-boolean v0, p1, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->c:Lcom/huawei/hms/analytics/framework/e/b;

    const-wide/16 v0, 0x0

    iput-wide v0, p1, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->a(J)V

    return-void

    :cond_1
    iget-wide v1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->d:J

    invoke-direct {p0, v1, v2, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->b(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    iget-wide v1, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->d:J

    invoke-static {v1, v2, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iput-wide p2, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->d:J

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/framework/e/b$a;->b:Z

    return-void

    :cond_3
    :goto_0
    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/analytics/framework/e/b$a;->a(J)V

    return-void
.end method
