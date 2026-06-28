.class public Lp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lp0/b;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lp0/b;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lp0/b;->c:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lp0/b;->d:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    iput-wide v0, p0, Lp0/b;->e:J

    .line 17
    .line 18
    iput-wide v0, p0, Lp0/b;->f:J

    .line 19
    .line 20
    return-void
    .line 21
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lp0/b;->e:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Lp0/b;->f:J

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lp0/b;->a:Ljava/lang/String;

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp0/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lp0/b;->e:J

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lp0/b;->b:Ljava/lang/String;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp0/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lp0/b;->c:Ljava/lang/String;

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp0/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lp0/b;->d:Ljava/lang/String;

    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp0/b;->b:Ljava/lang/String;

    return-object v0
.end method
