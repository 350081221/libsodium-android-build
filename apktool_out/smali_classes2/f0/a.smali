.class public Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lf0/a;->d:I

    return-void
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Lf0/a;->a:J

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf0/a;->b:Ljava/lang/String;

    return-void
.end method

.method public d()Z
    .locals 4

    iget-wide v0, p0, Lf0/a;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lf0/a;->a:J

    return-void
.end method
