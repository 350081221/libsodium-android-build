.class public Lcom/umeng/analytics/pro/cj$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/cs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/cj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/umeng/analytics/pro/cj$a;-><init>(ZZ)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/umeng/analytics/pro/cj$a;-><init>(ZZI)V

    return-void
.end method

.method public constructor <init>(ZZI)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/cj$a;->a:Z

    .line 5
    iput-boolean p2, p0, Lcom/umeng/analytics/pro/cj$a;->b:Z

    .line 6
    iput p3, p0, Lcom/umeng/analytics/pro/cj$a;->c:I

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/de;)Lcom/umeng/analytics/pro/cq;
    .locals 3

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cj;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/umeng/analytics/pro/cj$a;->a:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/umeng/analytics/pro/cj$a;->b:Z

    .line 6
    .line 7
    invoke-direct {v0, p1, v1, v2}, Lcom/umeng/analytics/pro/cj;-><init>(Lcom/umeng/analytics/pro/de;ZZ)V

    .line 8
    .line 9
    .line 10
    iget p1, p0, Lcom/umeng/analytics/pro/cj$a;->c:I

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/cj;->c(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object v0
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
